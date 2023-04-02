package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.Date;

public final class signout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
 session.invalidate(); 
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<title>Monwar's Menu</title>\r\n");
      out.write("<STYLE>\r\n");
      out.write(".fontface {font-family:Arial}\r\n");
      out.write("</STYLE>\r\n");
      out.write("<META HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=iso-8859-1\">\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY BGCOLOR=\"#FFFFFF\" TEXT=\"#000000\" link=\"#0c5449\" vlink=\"#009933\" alink=\"#009933\" CLASS=fontface>\r\n");
      out.write("<TABLE WIDTH=\"100%\" BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"0\">\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD width=\"1%\" bgcolor=\"#0c5449\">&nbsp;</TD>\r\n");
      out.write("\t<TD bgcolor=\"#0c5449\">\r\n");
      out.write("      <p align=\"center\"><B><FONT COLOR=\"#FFFFFF\" SIZE=\"4\"><U><BR>\r\n");
      out.write("        Signing off...</U></FONT></B>\r\n");
      out.write("      <p align=\"center\">&nbsp; \r\n");
      out.write("    </TD>\r\n");
      out.write("   </TR>\r\n");
      out.write("  <TR>\r\n");
      out.write("  <TD width=\"1%\">&nbsp;</TD>\r\n");
      out.write("  <TD>\r\n");
      out.write("      <p>&nbsp;</p><br /=\"\"><br /=\"\"><br /=\"\"><br /=\"\"><br /=\"\">\r\n");
      out.write("\r\n");
      out.write("<center><font  face =\"times new roman\"  size=\"4pt\">\r\n");
      out.write("\r\n");
      out.write("  Thank you very much for visiting the My Web Site.<br /> Hope you have had it so helpfull and to your expectation.\r\n");
      out.write("\r\n");
      out.write("</font> \r\n");
      out.write("<br /=\"\"><br /=\"\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<font  face =\"times new roman\"  size=\"4pt\">Very Shortly the system would back to the Same Page</font><br /=\"\"><br /=\"\"><br /=\"\">\r\n");
      out.write("\r\n");
      out.write("<br /=\"\"><br /=\"\"><br /=\"\"><br /=\"\"><br /=\"\"><br /=\"\"><br /=\"\">\r\n");


response.setHeader("Refresh", "3; url =http://localhost/norms/Check-it/CaseSubmit.jsp");



      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("  <p>&nbsp;</p>\r\n");
      out.write("    </TD>\r\n");
      out.write("  </TR>  \r\n");
      out.write("</TABLE>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/norms/Menu/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
      out.write("\r\n");
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
