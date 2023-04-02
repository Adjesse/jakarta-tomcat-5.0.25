package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class oracletest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    java.sql.Connection con=null;
	java.sql.Statement state4 = null;   
    String url ="jdbc:oracle:thin:@site1.us.oracle.com:1521:americanshieldsecurity";
    String driver = "oracle.jdbc.driver.OracleDriver";
   ResultSet result = null;
  String  qury = "SELECT  *  FROM supervisors" ;
    String  uid = "";
    HttpSession session = null ;

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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Frameset//EN\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("   <title>shipinfo1</title>\r\n");
      out.write("<meta http-equiv=\"Page-Enter\" content=\"revealTrans(Duration=\"5\",Transition=\"30\")\">\r\n");
      out.write("<meta http-equiv=\"Page-Exit\" content=\"revealTrans(Duration=\"10\",Transition=\"40\")\">\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("    \r\n");
      out.write("\t<body background =\"images/Durgantt.gif\" link=\"#0000AA\" vlink=\"0000AA\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<center>\r\n");
      out.write("\t<table border=\"2\">\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

 
  
 try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver()); 
      
     }
                catch(Exception e){
		System.err.println("Exception while loading  driver");		
              }
   
try {
  con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "americanshieldsecurity", "mohammed");
	       System.out.println("Congratulations! You are connected successfully.");
} 
              catch (SQLException e) {
	System.err.println("SQLException while connecting to the database");
	}



	try {
     
   state4 = con.createStatement();
} 
	catch (SQLException e) {
		System.err.println("SQLException while creating statement");
	}
 
 
try { 
result=state4.executeQuery(qury);
} 
	catch (SQLException e) {
		System.err.println("SQLException while executing SQL Statement2.");
	}

	
	
	
	try { 
       
             while(result.next()){ 
				 
				 
      out.write("\r\n");
      out.write("\r\n");
      out.write("           \r\n");
      out.write("\t\t\t<tr> \r\n");
      out.write("                           <td align = \"justify\"><font face =\"times new roman\"  size=\"4pt\">");
      out.print( result.getString(1));
      out.write("</td>\r\n");
      out.write("\t\t\t   <td align = \"justify\"><font face =\"times new roman\"  size=\"4pt\">");
      out.print( result.getString(2));
      out.write("</td>\r\n");
      out.write("\t\t\t   <td align = \"justify\"><font face =\"times new roman\"  size=\"4pt\">");
      out.print( result.getString(3));
      out.write("</td>\r\n");
      out.write("\t\t\t   <td align = \"justify\"><font face =\"times new roman\"  size=\"4pt\">");
      out.print( result.getString(4));
      out.write("</td>\r\n");
      out.write("\t\t\t   <td align = \"justify\"><font face =\"times new roman\"  size=\"4pt\">");
      out.print( result.getString(5));
      out.write("</td>\r\n");
      out.write("                           <td align = \"justify\"><font face =\"times new roman\"  size=\"4pt\">");
      out.print( result.getString(6));
      out.write("</td>\r\n");
      out.write("\t\t\t   <td align = \"justify\"><font face =\"times new roman\"  size=\"4pt\">");
      out.print( result.getString(7));
      out.write("</td>\r\n");
      out.write("\t\t\t   <td align = \"justify\"><font face =\"times new roman\"  size=\"4pt\">");
      out.print( result.getString(8));
      out.write("</td>\r\n");
      out.write("\t\t\t   <td align = \"justify\"><font face =\"times new roman\"  size=\"4pt\">");
      out.print( result.getString(9));
      out.write("</td>\r\n");
      out.write("\t\t\t   <td align = \"justify\"><font face =\"times new roman\"  size=\"4pt\">");
      out.print( result.getString(10));
      out.write("</td>\r\n");
      out.write("                           <td align = \"justify\"><font face =\"times new roman\"  size=\"4pt\">");
      out.print( result.getString(11));
      out.write("</td>\r\n");
      out.write("                       </tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("                        \r\n");
      out.write("            ");
 } 
}
 catch (SQLException e) 
	{
		System.out.println("Resutset is not connected");
	}
        
try { 
   result.close();
    state4.close();
    con.close();
	System.out.println("Connection is closed successfully.");
   
    }
     catch (SQLException e) 
	{
		e.printStackTrace();
	}
	



      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<a href=\"/americanshieldsecurity/oracletest\"> Test Oracle</a>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("   </html>  \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\t\t");
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
