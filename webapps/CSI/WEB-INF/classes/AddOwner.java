import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class AddPersonAndOwner extends HttpServlet {
  private PreparedStatement personStmt;
  private PreparedStatement ownerStmt;

  public void init() throws ServletException {
    initializeJdbc();
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    String name = request.getParameter("NAME");
    String ssn = request.getParameter("SSN");
    String driversLicenseNr = request.getParameter("DRIVERSLICENSENR");
    String birthDate = request.getParameter("BIRTHDATE");
    String birthPlace = request.getParameter("BIRTHPLACE");
    String profession = request.getParameter("PROFESSION");
    String income = request.getParameter("INCOME");

    try {
      if (name.length() == 0 || ssn.length() == 0 || driversLicenseNr.length() == 0 || birthDate.length() == 0 || birthPlace.length() == 0) {
        out.println("Please fill out all required fields");
        return;
      }

      Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "CSIPROJECT", "mohammed");

      // Check if person already exists
      PreparedStatement checkPersonStmt = conn.prepareStatement("SELECT * FROM person WHERE ssn = ?");
      checkPersonStmt.setString(1, ssn);
      ResultSet checkPersonResult = checkPersonStmt.executeQuery();

      if (!checkPersonResult.next()) {
        // Insert new person
        personStmt.setString(1, name);
        personStmt.setString(2, ssn);
        personStmt.setString(3, driversLicenseNr);
        personStmt.setDate(4, Date.valueOf(birthDate));
        personStmt.setString(5, birthPlace);
        personStmt.executeUpdate();
      }

      // Get person ID
      PreparedStatement getPersonIdStmt = conn.prepareStatement("SELECT personId FROM person WHERE ssn = ?");
      getPersonIdStmt.setString(1, ssn);
      ResultSet getPersonIdResult = getPersonIdStmt.executeQuery();
      getPersonIdResult.next();
      int personId = getPersonIdResult.getInt("personId");

      // Insert new owner
      ownerStmt.setInt(1, personId);
      ownerStmt.setString(2, profession);
      ownerStmt.setBigDecimal(3, new BigDecimal(income));
      ownerStmt.executeUpdate();

      out.println("<html><head><title>Owner Registration Report</title>");
      out.print("<br /><b><center><font color=\"RED\"><H2>Owner Registration Report</H2></font>");
      out.println("</center><br />");

      out.println(name + " is now added to the Owners table");
      out.println("</body></html>");
    } catch (Exception ex) {
      out.println("\n Error: " + ex.getMessage());
    } finally {
      out.close();
    }
  }

  private void initializeJdbc() {
    try {
      String driver = "oracle.jdbc.driver.OracleDriver";
      Class.forName(driver);

      Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "CSIPROJECT", "mohammed");

      personStmt = conn.prepareStatement("INSERT INTO person (Name, SSN, DriversLicenseNr, BirthDate, BirthPlace) VALUES (?, ?, ?, ?, ?)");
      ownerStmt = conn.prepareStatement("INSERT INTO owners (PersonId, Profession, Income) VALUES (?, ?, ?)");
    } catch (
      EOFException ex) {
        ex.printStackTrace();
      }
    }
  }