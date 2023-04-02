package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

 
	String strLocation = (String) session.getAttribute("LastLocation");

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>Please Log In</title>\r\n");
      out.write("   \r\n");
      out.write("  </head>\r\n");
      out.write("  <body bgcolor=\"#ccccff\">\r\n");
      out.write("    <form method=\"POST\" action=\"/day/servlet/AuthorizeServlet?status=old\">\r\n");
      out.write("    <br /><br /><br />\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("<p align=\"justify\">\r\n");
      out.write(" <table border=\"0\" align=\"center\" width=\"80%\" bgcolor=\"#b4b394\" cellpadding=\"2\" cellspacing=\"6\">\r\n");
      out.write("  <font face =\"arial\" size=\"2pt\">\r\n");
      out.write("  <tr align=\"center\">\r\n");
      out.write("   <td>\r\n");
      out.write("    <table border=\"0\" width=\"90%\" bgcolor=\"#ebe2d5\">\r\n");
      out.write("     <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("          UserName:\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("          <input type=\"text\" name=\"UserName\">\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("          Password:\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("          <input type=\"password\" name=\"Password\">\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      \r\n");
      out.write("       \r\n");
      out.write("    </table> <input type=\"submit\" value=\"Log In\">\r\n");
      out.write("   </td>\r\n");
      out.write("   </tr></font>     \r\n");
      out.write("  </table>\r\n");
      out.write(" </p>\r\n");
      out.write("\r\n");
      out.write("<br><font color=red><b>Insertion is successful!</b></font>\r\n");
      out.write("\r\n");
      out.write("    <font face =\"verdana\" size=\"2pt\"><br />\t\r\n");
      out.write("    <b>If you are not registered yet<br />\r\n");
      out.write("    Please <a href = \"apply.jsp\">Click Here </a>for registration</b>\r\n");
      out.write("    </font>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("\t \r\n");
      out.write("</center> \r\n");
      out.write("\r\n");
      out.write(" </body>\r\n");
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
