package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class apply_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
 
	String strLocation = (String) session.getAttribute("LastLocation");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("     <head>\r\n");
      out.write("           <title>Application Form</title>\r\n");
      out.write("       \r\n");
      out.write("\t</head>\r\n");
      out.write("       <body bgcolor=\"#ccccff\">\r\n");
      out.write("         <br />\r\n");
      out.write("\t\t  <center>\r\n");
      out.write("           <h4><font=\"arial\">\r\n");
      out.write("\t\t           <p>For applying, Please fill your information below. \r\n");
      out.write("                   </p>\r\n");
      out.write("\t\t\t    </font>\r\n");
      out.write("\t\t   </h4> \r\n");
      out.write("          <br /> <br /> <br />\r\n");
      out.write("            <form action=\"/day/servlet/AuthorizeServlet?status=new\" method=\"POST\"> \r\n");
      out.write("\t\t\t\t<p align=\"justify\">\r\n");
      out.write("        \t\t<table border=\"0\" align=\"center\" width=\"80%\" bgcolor=\"#b4b394\" cellpadding=\"2\" cellspacing=\"6\">\r\n");
      out.write("           \t\t     <tr align=\"center\">\r\n");
      out.write("               \t       <td>\r\n");
      out.write("                          <table border=\"0\" width=\"90%\" bgcolor=\"#ebe2d5\"> \r\n");
      out.write("\t                      <tr><td align=\"right\"><font=\"arial\" size=\"2\"><b>Full Name: </b></font></td><td><input type=\"text\" name=\"name\" size=\"30\"> </td></tr>                     \r\n");
      out.write("                          <tr><td align=\"right\"><font=\"arial\" size=\"2\"><b>E-mail:</b></font></td><td><input type=\"text\" name=\"email\" size=\"30\"></td></tr> \r\n");
      out.write("                          <tr><td align=\"right\"><font=\"arial\" size=\"2\"><b>Phone #</b></font></td><td><input type=\"text\" name=\"phone\" size=\"12\"></td></tr>\r\n");
      out.write("                          <tr><td align=\"right\"><font=\"arial\" size=\"2\"><b>User Name: </b></font></td><td><input type=\"text\" name=\"UserName\" size=\"10\"> </td></tr>\r\n");
      out.write("                          <tr><td align=\"right\"><font=\"arial\" size=\"2\"><b>Password: </b></font></td><td><input type=\"password\" name=\"Password\" size=\"10\"> </td></tr>\r\n");
      out.write("                          </font>\r\n");
      out.write("\t\t\t              </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                  \t\t  </table>\r\n");
      out.write("\t  \t\t\t\t      <br />\r\n");
      out.write("\t\t\t\t\t      <input type=\"submit\" value=\"Submit\">\r\n");
      out.write("                      </td>\r\n");
      out.write("   \t\t\t\t   </tr>\r\n");
      out.write("  \t\t\t</table>\r\n");
      out.write("            </p>     \r\n");
      out.write("         </form>\r\n");
      out.write("\t\t</center>              \r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("                 \r\n");
      out.write("                 \r\n");
      out.write("                     \r\n");
      out.write("                      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("       \r\n");
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
