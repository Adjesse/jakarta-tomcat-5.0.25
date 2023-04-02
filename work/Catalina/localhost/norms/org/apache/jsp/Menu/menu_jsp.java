package org.apache.jsp.Menu;

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

      out.write('\r');
      out.write('\n');

	
	String menuItemJs = "menu_items.js";
	
	    System.out.println("You are an Sys Adminstrator");
		menuItemJs = "/norms/Menu/menu_items_sys_admin.js";
		

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/norms/Menu/menu.css\">\r\n");
      out.write("<style>\r\n");
      out.write("\ta, A:link, a:visited, a:active\r\n");
      out.write("\t\t{color: #0000aa; text-decoration: none; font-family: Tahoma, Verdana; font-size: 11px;}\r\n");
      out.write("\tA:hover\r\n");
      out.write("\t\t{color: #ff0000; text-decoration: none; font-family: Tahoma, Verdana; font-size: 11px;}\r\n");
      out.write("\tp, tr, td, ul, li\r\n");
      out.write("\t\t{color: #000000; font-family: Tahoma, Verdana; font-size: 11px;}\r\n");
      out.write("\t.header1, h1\r\n");
      out.write("\t\t{color: #ffffff; background: #4682B4; font-weight: bold; font-family: Tahoma, Verdana; font-size: 13px; margin: 0px; padding: 2px;}\r\n");
      out.write("\t.header2, h2\r\n");
      out.write("\t\t{color: #000000; background: #DBEAF5; font-weight: bold; font-family: Tahoma, Verdana; font-size: 12px;}\r\n");
      out.write("\t.intd\r\n");
      out.write("\t\t{color: #000000; font-family: Tahoma, Verdana; font-size: 11px; padding-left: 15px;}\r\n");
      out.write("    body {\r\n");
      out.write("\tbackground-image: url(back-025.gif);\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<!-- styles for demo menu #1-->\r\n");
      out.write("\r\n");
      out.write("<body>   \r\n");
      out.write("     <script language=\"JavaScript\" src=\"/norms/Menu/menu.js\"></script>\r\n");
      out.write("     <script language=\"JavaScript\" src=\"");
      out.print( menuItemJs );
      out.write("\"></script>\r\n");
      out.write("     <script language=\"JavaScript\" src=\"/norms/Menu/menu_tpl.js\"></script>\r\n");
      out.write("     <script language=\"JavaScript\">\r\n");
      out.write("\t<!--//\r\n");
      out.write("\t// Note where menu initialization block is located inHTML document.\r\n");
      out.write("\t// Don't try to position menu locating menu initialization block in\r\n");
      out.write("\t// some table cell or otherHTML element. Always put it before </body>\r\n");
      out.write("\r\n");
      out.write("\t// each menu gets two parameters (see demo files)\r\n");
      out.write("\t// 1. items structure\r\n");
      out.write("\t// 2. geometry structure\r\n");
      out.write("    \r\n");
      out.write("\tnew menu (MENU_ITEMS, MENU_POS);\r\n");
      out.write("\t// make sure files containing definitions for these variables are linked to the document\r\n");
      out.write("\t// if you got some javascript error like \"MENU_POS is not defined\", then you've made syntax\r\n");
      out.write("\t// error in menu_tpl.js file or that file isn't linked properly.\r\n");
      out.write("\t\r\n");
      out.write("\t// also take a look at stylesheets loaded in header in order to set styles\r\n");
      out.write("\t//-->\r\n");
      out.write("  </script>\r\n");
      out.write("  <p>&nbsp;</p><BR><BR>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
