import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class DeleteHome extends HttpServlet {
    private PreparedStatement pstmt;

    public void init() throws ServletException {
        initializeJdbc();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String HOMEID = request.getParameter("HOMEID");
<<<<<<< HEAD
		
=======
>>>>>>> 55fd180facfd71becccb527358efd1ba9bdc24e7

        try {
            if (HOMEID.length() == 0) {
                out.println("Please: Home ID is required");
                return;
            }
<<<<<<< HEAD
			deleteHome(HOMEID);
=======
            deleteHome(HOMEID);
>>>>>>> 55fd180facfd71becccb527358efd1ba9bdc24e7
            out.println("<html><head><title>Record has deleted</title>");
            out.println("</head><body>");
            out.print("<br /><b><center><font color=\"RED\"><H2>The following record has been deleted from the database:</H2></font>");
            out.print(HOMEID);
            out.println("</center><br />");

            out.println("</body></html>");
        } catch (Exception ex) {
            out.println("\n Error: " + ex.getMessage());
<<<<<<< HEAD
    		ex.printStackTrace(); // Add this line to print the stack trace
=======
>>>>>>> 55fd180facfd71becccb527358efd1ba9bdc24e7
        } finally {
            out.close();
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
<<<<<<< HEAD

    private void initializeJdbc() {
        try {
            String driver = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driver);
            String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
            String user = "CSIPROJECT";
            String password = "mohammed";
            Connection conn = DriverManager.getConnection(url, user, password);
            pstmt = conn.prepareStatement("DELETE FROM homes WHERE (HOMEID) = (?)");
        } catch (Exception ex) {
            ex.printStackTrace();
			
        }
    }

=======

    private void initializeJdbc() {
        try {
            String driver = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driver);
            String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
            String user = "CSIPROJECT";
            String password = "mohammed";
            Connection conn = DriverManager.getConnection(url, user, password);
            pstmt = conn.prepareStatement("DELETE FROM homes WHERE HOMEID = ?");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

>>>>>>> 55fd180facfd71becccb527358efd1ba9bdc24e7
    private void deleteHome(String HOMEID) throws SQLException {
        pstmt.setString(1, HOMEID);
        pstmt.executeUpdate();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 55fd180facfd71becccb527358efd1ba9bdc24e7
