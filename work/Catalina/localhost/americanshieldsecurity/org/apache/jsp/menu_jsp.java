package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- some header data -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"menu.css\">\r\n");
      out.write("<script language=\"JavaScript\" src=\"menu.js\"></script>\r\n");
      out.write("<script language=\"JavaScript\" src=\"menu_items.js\"></script>\r\n");
      out.write("<script language=\"JavaScript\" src=\"menu_tpl.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body background =\"images/Durgantt.gif\" link=\"#0000AA\" vlink=\"0000AA\">\r\n");
      out.write("<img src=images/americanshieldsecuritylogo.bmp alt=\"American Shield Security Logo\" width=\"110\" height=\"110\" align=\"left\"> \r\n");
      out.write("     \t\t\t   </img>\r\n");
      out.write("  \r\n");
      out.write("       <script language=\"JavaScript\">\r\n");
      out.write("\t\tnew menu (MENU_ITEMS, MENU_POS); \r\n");
      out.write("       </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
