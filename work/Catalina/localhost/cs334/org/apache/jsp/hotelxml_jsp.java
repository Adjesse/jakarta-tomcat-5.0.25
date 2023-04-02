package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class hotelxml_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<?xml version=\"1.0\" ?>\r\n");
      out.write("\r\n");
      out.write("<hotelinfo>\r\n");
 java.sql.Statement statement = null;
	Connection connection = null;
	try {
          Class.forName("oracle.jdbc.driver.OracleDriver");
         
        String query = "SELECT * FROM hotelinfo"; 
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";

	  //String url = "jdbc:oracle:thin:@goedel.newcs.uwindsor.ca:1521:CS01";
   	
          connection = DriverManager.getConnection(url,"scott","mohammed");

	    //connection = DriverManager.getConnection(url,"zelani","zelani");
	    statement = connection.createStatement();
	    ResultSet results = statement.executeQuery(query);
	    while(results.next()) { 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<hotel name=\"");
      out.print( results.getString("hotel_name") );
      out.write(" \">\r\n");
      out.write("\t\t\t<address>");
      out.print( results.getString("address") );
      out.write("</address>\r\n");
      out.write("\t\t\t<city>");
      out.print( results.getString("city") );
      out.write("</city> \r\n");
      out.write("\t\t\t</hotel>    \r\n");
      out.write("\r\n");
      out.write("\t\t");
 } 	    
	    statement.close();
	    connection.close();
	    } catch (SQLException e) 
		{
		e.printStackTrace();
		}
		catch(ClassNotFoundException cnfex)
		{
			cnfex.printStackTrace();
			System.out.println("Connection unsucessful"+cnfex.toString());
		}
		
      out.write("\t\r\n");
      out.write("</hotelinfo>\r\n");
      out.write("\t\r\n");
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
