import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class AddOwner extends HttpServlet {
  private PreparedStatement pstmt;

  public void init() throws ServletException {
    initializeJdbc();
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    String personId = request.getParameter("personId");
    String profession = request.getParameter("profession");
    String income = request.getParameter("income");

    try {
      if (personId.length() == 0) {
        out.println("Please: Person ID is required");
        return;
      }
      storeOwner(personId, profession, income);
      out.println("<html><head><title>Owner Registration Report</title>");
      out.print("<br /><b><center><font color=\"RED\"><H2>Owner Registration Report</H2></font>");
      out.println("</center><br />");

      out.println(personId + " is now added to the Owners table");
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

      String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
      String user = "CSIPROJECT";
      String password = "mohammed";
      Connection conn = DriverManager.getConnection(url, user, password);

      pstmt = conn.prepareStatement("insert into owners (PersonId, Profession, Income) values (?, ?, ?)");
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  private void storeOwner(String personId, String profession, String income) throws SQLException {
    pstmt.setString(1, personId);
    pstmt.setString(2, profession);
    pstmt.setString(3, income);
    pstmt.executeUpdate();
  }
}
