package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import javax.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import javax.naming.*;

public final class hotelinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    java.sql.Connection connection;
    
    java.sql.Statement statement = null;
    String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    //String url = "jdbc:oracle:thin:@goedel.newcs.uwindsor.ca:1521:CS01";
    String query;
    String driver = "oracle.jdbc.driver.OracleDriver";
    
 
  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("\r\n");
      out.write("   <title>hotelinfo</title>\r\n");
      out.write("  \r\n");
      out.write(" </head>\r\n");
      out.write("<body bgcolor=\"#ccccff\">\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" <p align=\"justify\">\r\n");
      out.write(" <table border=\"0\" align=\"center\" width=\"80%\" bgcolor=\"#b4b394\" cellpadding=\"2\" cellspacing=\"6\">\r\n");
      out.write("  <tr align=\"center\">\r\n");
      out.write("   <td>\r\n");
      out.write("    <table border=\"0\" width=\"90%\" bgcolor=\"#ebe2d5\">\r\n");
      out.write("     <font face =\"verdana\" size=\"2pt\"><br />\r\n");
      out.write("\r\n");
      out.write("     <tr>\r\n");
      out.write("      \r\n");
      out.write("  \t <td>Hotel Name</td>\r\n");
      out.write("\t <td>City</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
String Hname = request.getParameter("catagory");
    try {
    
    
    Class.forName(driver);
    connection = DriverManager.getConnection(url,"scott","mohammed");
    statement = connection.createStatement();
		
    query = "SELECT hotel_name,city "+
     		"FROM hotelinfo "+
     		"WHERE hotel_name = '"+Hname+"'";

    ResultSet results = statement.executeQuery(query);
	
    while(results.next()) {

    //String hotel_name = results.getString("hotel_name");
    //String city = results.getString("city");

    System.out.println("im here to test while loop");


      out.write("\r\n");
      out.write(" <tr>\r\n");
      out.write("  <td><a href=\"/cs334/servlet/HotelInfoServlet?catagory=");
      out.print( results.getString("hotel_name"));
      out.write('"');
      out.write('>');
      out.print( results.getString("hotel_name"));
      out.write("</a></td>\r\n");
      out.write("  <td>");
      out.print( results.getString("city") );
      out.write("</td>\r\n");
      out.write(" </tr>\r\n");

    }
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("<p>Visit Other \r\n");
      out.write(" <a href=\"/cs334/reservation.jsp\">Hotels</a>\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");

   
    statement.close();
 connection.close();

    }
     catch (SQLException e) 
	{
		e.printStackTrace();
	}
	catch(ClassNotFoundException cnfex)
	{
		cnfex.printStackTrace();
		System.out.println("Connection unsucessful"+cnfex.toString());
	}



      out.write("    \r\n");
      out.write("       </font>\r\n");
      out.write("      \r\n");
      out.write("    </table>\r\n");
      out.write("   </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("  </table>\r\n");
      out.write(" </p>\t\r\n");
      out.write(" \r\n");
      out.write(" </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
