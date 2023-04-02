package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class New_005fS_005fLoc_005fRev_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    java.sql.Connection con=null;
    java.sql.Statement state1 = null; 
    java.sql.Statement state2 = null; 
    java.sql.Statement state3 = null; 
    //String url ="jdbc:oracle:thin:@site1.us.oracle.com:1521:americanshieldsecurity";
    //String driver = "oracle.jdbc.driver.OracleDriver";
    ResultSet result1 = null;
    ResultSet result2 = null;
    ResultSet result3 = null;
    String  query1 = "SELECT  distinct SUPERVISORS FROM TB_NEWSUPERVISORS" ;
    String  query2 = "SELECT  distinct LOCATIONS FROM TB_NEWJOBSITES" ;
    String  query3 = "SELECT  distinct OFFICERS FROM TB_NEWOFFICERS" ;
    String  uid = "";
    HttpSession session = null ;
    String s1="";
    String s2="" ;
    String s3="" ;

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
      out.write('\r');
      out.write('\n');

   try 
   {
      //DriverManager.registerDriver(new com.mysql.jdbc.Driver());     
      //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
      DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());     
   }
   catch(Exception e)
   {
      System.err.println("Exception while loading  driver");		
   }
   try
   {
      //con = DriverManager.getConnection("jdbc:mysql://localhost/wazedmydb", "wazed", "wazed123");
    //   con = DriverManager.getConnection("jdbc:odbc:Dalim","","");
      con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "americanshieldsecurity", "mohammed");
      System.out.println("Congratulations! You are connected successfully.");
   } 
   catch (SQLException e) 
   {
      System.err.println("SQLException while connecting to the database");
   }
   try 
   {
       state1 = con.createStatement();
   } 
   catch (SQLException e) 
   {
      System.err.println("SQLException while creating statement");
   }
   try 
   { 
       result1=state1.executeQuery(query1);
   } 
   catch (SQLException e) 
   {
      System.err.println("SQLException while executing SQL Statement2.");
   }

   try 
   {
       state2 = con.createStatement();
   } 
   catch (SQLException e) 
   {
      System.err.println("SQLException while creating statement");
   }
   try 
   { 
       result2=state2.executeQuery(query2);
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
      System.err.println("SQLException while creating statement5");
   }
   try 
   { 
       result3=state3.executeQuery(query3);
   } 
   catch (SQLException e) 
   {
      System.err.println("SQLException while executing SQL Statement5.");
   }

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("   <title>Supervisor New Daily Activity</title>\r\n");
      out.write("         <meta http-equiv=\"Page-Enter\" content=\"revealTrans(Duration=\"5\",Transition=\"30\")\">\r\n");
      out.write("         <meta http-equiv=\"Page-Exit\" content=\"revealTrans(Duration=\"10\",Transition=\"40\")\">\r\n");
      out.write("  </head>    \r\n");
      out.write("\t<body background =\"images/Durgantt.gif\" link=\"#0000AA\" vlink=\"0000AA\">\r\n");
      out.write("          \r\n");
      out.write("              <center><H2><font color=red>Supervisor - New Daily Activity</font></H2></center>\r\n");
      out.write("\r\n");
      out.write("              <center>Please enter date, time in, time out, and select supervisor, job site and officer:</center><BR>\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("<script language=JavaScript src=\"validation.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script language=\"JavaScript\" src=\"Fps.js\" type=\"text/javascript\"> </script>    <!-- ************ -->\r\n");
      out.write("\r\n");
      out.write("   <form action=\"S_New_Daily_Activity_Servlet\" name=test method=\"get\" onSubmit=\"return validateCompleteForNew(this, '')\">\r\n");
      out.write("         <input type=\"hidden\" name=\"testChanged\" value=\"false\">\r\n");
      out.write("                    <center>\r\n");
      out.write("                           <table border=0>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                        <td><b>Date:</b></td>\r\n");
      out.write("\t\t\t\t\t<td align=center ><INPUT TYPE=\"text\" size=10 maxlength=10 name=\"date\">\r\n");
      out.write("         \t\t\t        </td>\r\n");
      out.write("         \t\t\t\t<td valign=\"middle\"><font  size=\"1\"><b>(mm/dd/yyyy)</b></font>\r\n");
      out.write("         \t\t\t\t</td>\r\n");
      out.write("       \t\t\t\t\t\t\r\n");
      out.write("                                        <td><b>Time In:</b></td>\r\n");
      out.write(" \t\t\t\t        <td align=center ><INPUT TYPE=\"text\" size=8 maxlength=8 name=\"timeIn\" setChange(document.test)>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td valign=\"middle\"><font  size=\"1\"><b>(hh:mm:ss)</b></font>\r\n");
      out.write("            \t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("                                        <td><b>Time Out:</b></td>\r\n");
      out.write(" \t\t\t\t        <td align=center ><INPUT TYPE=\"text\" size=8 maxlength=8 name=\"timeOut\" >\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td valign=\"middle\"><font  size=\"1\"><b>(hh:mm:ss)</b></font>\r\n");
      out.write("            \t\t\t\t</td>\r\n");
      out.write("         \t\t\t   </tr>\r\n");
      out.write("     \t\t\t   </table>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                    </center>\r\n");
      out.write("                    <P>\r\n");
      out.write("                    \r\n");
      out.write("\t\t    <center>\r\n");
      out.write("                           <table border=0>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                       <td><b>Supervisors:</b></td><td></td><td><b>Job Sites:</b></td><td></td><td><b>Officers:</b></td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                       <td rowspan=6>\r\n");
      out.write("                                                    <select name=supervisors size=1 setChange(document.test)>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\">\r\n");
      out.write("                                                            \r\n");
      out.write("                                                       ");

                                                          try 
                                                          {   
                                                             while(result1.next())
                                                             { s1= result1.getString(1) ;
                                                        
      out.write("\r\n");
      out.write("                                                                   <option value=\"");
      out.print(s1);
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(s1);
      out.write("</option>\r\n");
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
      out.write("                                                     <select name=locations size=1 setChange(document.test)>\r\n");
      out.write("\t\t\t\t\t\t\t    <option value=\"\">\t\t\t\t\t\t   \r\n");
      out.write("                                                            \r\n");
      out.write("                                                         ");

                                                            try 
                                                            {   
                                                                while(result2.next())
                                                                {  s2= result2.getString(1) ;
                                                        
      out.write("\r\n");
      out.write("                                                                   <option value=\"");
      out.print(s2);
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(s2);
      out.write("</option>\r\n");
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
      out.write("                                        <td></td>\r\n");
      out.write("                                        <td rowspan=6>\r\n");
      out.write("                                                     <select name=officers size=1 setChange(document.test)>\r\n");
      out.write("\t\t\t\t\t\t\t    <option value=\"\">\t\t\t\t\t\t   \r\n");
      out.write("                                                            \r\n");
      out.write("                                                         ");

                                                            try 
                                                            {   
                                                                while(result3.next())
                                                                {  s3= result3.getString(1) ;
                                                        
      out.write("\r\n");
      out.write("                                                                   <option value=\"");
      out.print(s3);
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(s3);
      out.write("</option>\r\n");
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
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("     <table>   \r\n");
      out.write("        <tr>\r\n");
      out.write("           <td colspan=4><b>Comments</b><BR>\r\n");
      out.write("               <textarea name=comments rows=5 cols=70 onChange=\"validateTextLength(this, 1000, 'Comments'); setChange(document.test)\">\r\n");
      out.write("               </textarea>\r\n");
      out.write("           </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("       <p></p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t  <P>\r\n");
      out.write("                    <center>\r\n");
      out.write("                            <table>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                       <td width=110 align=center><input type=submit value=\"Submit\"></td>\r\n");
      out.write("                                       <td width=110 align=center><input type=reset value=\"Clear Screen\"></td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                            </table>\r\n");
      out.write("                    </center>\r\n");
      out.write("                   <P>\r\n");
      out.write("              </form>\r\n");
      out.write("\t      <P>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    try 
    { 
        result1.close();
        result2.close();
        result3.close();
        state1.close();
        state2.close();
        state3.close();
        con.close();
        System.out.println("Connection is closed successfully.");
    }
    catch (SQLException e) 
    {
         e.printStackTrace();
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write(" \r\n");
      out.write("var frmval = new print_footer(document.lastModified);\r\n");
      out.write("\r\n");
      out.write("</script>  <!-- ************ -->\r\n");
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
