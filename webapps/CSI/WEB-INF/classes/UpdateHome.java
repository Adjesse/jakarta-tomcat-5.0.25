import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class UpdateHome extends HttpServlet {
    private PreparedStatement pstmt;

    public void init() throws ServletException {
        initializeJdbc();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String HOMEID = request.getParameter("HOMEID");
        String ADDRESS = request.getParameter("ADDRESS");
        String FLOORSPACE = request.getParameter("FLOORSPACE");
        String FLOORS = request.getParameter("FLOORS");
        String BEDROOMS = request.getParameter("BEDROOMS");
        String FULLBATHROOMS = request.getParameter("FULLBATHROOMS");
        String HALFBATHROOMS = request.getParameter("HALFBATHROOMS");
        String LANDSIZE = request.getParameter("LANDSIZE");
        String YEARCONSTRUCTED = request.getParameter("YEARCONSTRUCTED");

        try {
            if (HOMEID.length() == 0 || ADDRESS.length() == 0) {
                out.println("Please: Home ID and Address are required");
                return;
            }
            updateHome(HOMEID, ADDRESS, FLOORSPACE, FLOORS, BEDROOMS, FULLBATHROOMS, HALFBATHROOMS, LANDSIZE, YEARCONSTRUCTED);
            out.println("<html><head><title>Home Update Report</title>");
            out.print("<br /><b><center><font color=\"RED\"><H2>Home Update Report</H2></font>");
            out.println("</center><br />");
            out.println(HOMEID + " " + ADDRESS + " has been updated in the Homes table");
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
            pstmt = conn.prepareStatement("UPDATE homes SET ADDRESS = ?, FLOORSPACE = ?, FLOORS = ?, BEDROOMS = ?, FULLBATHROOMS = ?, HALFBATHROOMS = ?, LANDSIZE = ?, YEARCONSTRUCTED = ? WHERE HOMEID = ?");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void updateHome(String HOMEID, String ADDRESS, String FLOORSPACE, String FLOORS, String BEDROOMS, String FULLBATHROOMS, String HALFBATHROOMS, String LANDSIZE, String YEARCONSTRUCTED) throws SQLException {
        pstmt.setString(1, ADDRESS);
        pstmt.setString(2, FLOORSPACE);
        pstmt.setString(3, FLOORS);
        pstmt.setString(4, BEDROOMS);
        pstmt.setString(5, FULLBATHROOMS);
        pstmt.setString(6, HALFBATHROOMS);
        pstmt.setString(7, LANDSIZE);
        pstmt.setString(8, YEARCONSTRUCTED);
        pstmt.setString(9, HOMEID);
        pstmt.executeUpdate();
    }
}