package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class S_005fLoc_005fRev_005fTest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    java.sql.Connection con=null;
    java.sql.Statement state4 = null; 
    java.sql.Statement state3 = null; 
    String url ="jdbc:oracle:thin:@site1.us.oracle.com:1521:americanshieldsecurity";
    String driver = "oracle.jdbc.driver.OracleDriver";
    ResultSet result = null;
    ResultSet result1 = null;
    String  qury = "SELECT  distinct S_Name FROM S_Daily_Activity" ;
    String  query = "SELECT  distinct J_Site FROM S_Daily_Activity" ;
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
      out.write("<script language=JavaScript src=\"scripts/Durgantt.js\"></script>\r\n");
      out.write("<script language=JavaScript src=\"scripts/valid.js\"></script>\r\n");
      out.write("<script language=JavaScript src=\"scripts/date.js\"></script>\r\n");
      out.write("<script language=JavaScript>\r\n");
      out.write("<!--\r\n");
      out.write("<<end_of_js\r\n");
      out.write("function validateForm(formObj)\r\n");
      out.write("{\r\n");
      out.write("  var msg = ''\r\n");
      out.write("  formObj.start.value = removeLTWhiteSpace(formObj.start.value)\r\n");
      out.write("  if (formObj.start.value.length == 0 || !isDate(formObj.start))\r\n");
      out.write("  {\r\n");
      out.write("    msg += 'Please enter a valid start date in the format MM/DD/YYYY\\\\n'\r\n");
      out.write("  }\r\n");
      out.write("  formObj.end.value = removeLTWhiteSpace(formObj.end.value)\r\n");
      out.write("  if (formObj.end.value.length == 0 || !isDate(formObj.end))\r\n");
      out.write("  {\r\n");
      out.write("    msg += 'Please enter a valid end date in the format MM/DD/YYYY\\\\n'\r\n");
      out.write("  }\r\n");
      out.write("  if (msg != '')\r\n");
      out.write("  {\r\n");
      out.write("    alert(msg)\r\n");
      out.write("    return false\r\n");
      out.write("  }\r\n");
      out.write("  var startYYYYMMDD = new String(formObj.start.value.substr(6, 4) + formObj.start.value.substr(0, 2) + formObj.start.value.substr(3, 2))\r\n");
      out.write("  var endYYYYMMDD = new String(formObj.end.value.substr(6, 4) + formObj.end.value.substr(0, 2) + formObj.end.value.substr(3, 2))\r\n");
      out.write("  if (startYYYYMMDD > endYYYYMMDD)\r\n");
      out.write("  {\r\n");
      out.write("    alert('Start must be less than or equal to End')\r\n");
      out.write("    return false\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  //return true\r\n");
      out.write("}\r\n");
      out.write("end_of_js\r\n");
      out.write(";\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

   try 
   {
      DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());     
   }
   catch(Exception e)
   {
      System.err.println("Exception while loading  driver");		
   }
   try
   {
      con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "americanshieldsecurity", "mohammed");
      System.out.println("Congratulations! You are connected successfully.");
   } 
   catch (SQLException e) 
   {
      System.err.println("SQLException while connecting to the database");
   }
   try 
   {
       state4 = con.createStatement();
   } 
   catch (SQLException e) 
   {
      System.err.println("SQLException while creating statement");
   }
   try 
   { 
       result=state4.executeQuery(qury);
   } 
   catch (SQLException e) 
   {
      System.err.println("SQLException while executing SQL Statement2.");
   }

try 
   {
       state3 = con.createStatement();
   } 
   catch (SQLException e) 
   {
      System.err.println("SQLException while creating statement");
   }
   try 
   { 
       result1=state3.executeQuery(query);
   } 
   catch (SQLException e) 
   {
      System.err.println("SQLException while executing SQL Statement2.");
   }


      out.write("\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("   <title>Supervisor Job Sites Review</title>\r\n");
      out.write("         <meta http-equiv=\"Page-Enter\" content=\"revealTrans(Duration=\"5\",Transition=\"30\")\">\r\n");
      out.write("         <meta http-equiv=\"Page-Exit\" content=\"revealTrans(Duration=\"10\",Transition=\"40\")\">\r\n");
      out.write("  </head>    \r\n");
      out.write("\t<body background =\"images/Durgantt.gif\" link=\"#0000AA\" vlink=\"0000AA\">\r\n");
      out.write("          \r\n");
      out.write("              <center><H2>Supervisor - Job Sites Review Parameters</H2></center>\r\n");
      out.write("\r\n");
      out.write("              <center>Please select supervisor(s), job site(s) and date range for the report:</center><BR>\r\n");
      out.write("              <form method=\"get\" action=\"/americanshieldsecurity/S_Loc_Rev_Servlet_Test\" name=proj_work onSubmit=return validateForm(this)>\r\n");
      out.write("                    <center>\r\n");
      out.write("                           <table border=0>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                       <td><b>Start:</b></td>\r\n");
      out.write("                                       <td align=center><input type=text name=start onChange=\\\"validateDate(this)\\\" size=10 maxlength=10></td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                       <td><b>End:</b></td>\r\n");
      out.write("                                       <td align=center><input type=text name=end onChange=\\\"validateDate(this)\\\" size=10 maxlength=10></td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                            </table>\r\n");
      out.write("                    </center>\r\n");
      out.write("                    <P>\r\n");
      out.write("                    <center>\r\n");
      out.write("                           <table border=0>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                       <td><b>Supervisors:</b></td><td></td><td><b>Job Sites</b></td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                       <td rowspan=6>\r\n");
      out.write("                                                    <select name=supervisors size=10 multiple>\r\n");
      out.write("                                                            <option> All Supervisors</option>\r\n");
      out.write("                                                       ");

                                                          try 
                                                          {   
                                                             while(result.next())
                                                             { 
                                                        
      out.write("\r\n");
      out.write("                                                                <option> ");
      out.print( result.getString(1));
      out.write("\r\n");
      out.write("                                                        ");

                                                              } 
                                                           }
                                                           catch (SQLException e) 
                                                           {
                                                               System.out.println("Resutset is not connected");
                                                           }
                                                         
      out.write("\r\n");
      out.write("                                                         \r\n");
      out.write("                                                    </select>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td></td>\r\n");
      out.write("                                        <td rowspan=6>\r\n");
      out.write("                                                     <select name=locations size=10 multiple>\r\n");
      out.write("                                                            <option> All Locations</option>\r\n");
      out.write("                                                         ");

                                                            try 
                                                            {   
                                                                while(result1.next())
                                                                { 
                                                        
      out.write("\r\n");
      out.write("                                                                   <option> ");
      out.print( result1.getString(1));
      out.write("\r\n");
      out.write("                                                        ");

                                                                } 
                                                            }
                                                            catch (SQLException e) 
                                                            {
                                                                System.out.println("Resutset is not connected");
                                                            }
                                                         
      out.write("\r\n");
      out.write("                                                    </select>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   \r\n");
      out.write("                            </table>\r\n");
      out.write("                    </center>\r\n");
      out.write("                    <P>\r\n");
      out.write("                    <center>\r\n");
      out.write("                            <table>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                       <td width=110 align=center><input type=submit value=\"Display Search Results\"></td>\r\n");
      out.write("                                       <td width=110 align=center><input type=reset value=\"Clear Screen\"></td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                            </table>\r\n");
      out.write("                    </center>\r\n");
      out.write("                   <P>\r\n");
      out.write("              </form>\r\n");
      out.write("\t      <P>\r\n");

    try 
    { 
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
      out.write("   </body>\r\n");
      out.write("</html>  \r\n");
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
