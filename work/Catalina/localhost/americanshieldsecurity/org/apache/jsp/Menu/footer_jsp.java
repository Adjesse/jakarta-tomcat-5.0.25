package org.apache.jsp.Menu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<HTML>\r\n");
      out.write("<HEAD></HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<br>\r\n");
      out.write("   <TABLE WIDTH=\"100%\" BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"0\">\r\n");
      out.write("       <TR>\r\n");
      out.write("    <TD  valign=\"bottom\" align=\"center\" height=\"3\" bgcolor=\"#0C5449\"></TD>\r\n");
      out.write("  </TR>\r\n");
      out.write(" \t  \r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD  valign=\"top\" align=\"center\" height=\"3\" bgcolor=\"#FFCC00\"></TD>\r\n");
      out.write("  </TR>\r\n");
      out.write("\r\n");
      out.write("  <TR> \r\n");
      out.write("    <TD  align=\"center\"><br><FONT SIZE=\"-1\">\r\n");
      out.write("        <A HREF=\"http://141.217.52.151/MySQLProj/main.html\" TARGET=\"_top\">American Shield Security Services Home</A></FONT><br>By<br>\r\n");
      out.write("     Naser El-Bathy<br>Java Engineer</TD>\r\n");
      out.write("  </TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
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
