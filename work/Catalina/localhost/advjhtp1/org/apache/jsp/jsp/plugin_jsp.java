package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class plugin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!-- Fig. 10.15: plugin.jsp -->\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("   <head>\r\n");
      out.write("      <title>Using jsp:plugin to load an applet</title>\r\n");
      out.write("   </head>\r\n");
      out.write("\r\n");
      out.write("   <body>\r\n");
      out.write("      ");
      out.write("<OBJECT classid=\"clsid:8AD9C840-044E-11D1-B3E9-00805F499D93\"" + " width=\"" + "400" + "\"" + " height=\"" + "400" + "\"" + " codebase=\"http://java.sun.com/products/plugin/1.2.2/jinstall-1_2_2-win.cab#Version=1,2,2,0\">");
      out.write("\n");
      out.write("<PARAM name=\"java_code\" value=\"ShapesApplet\">");
      out.write("\n");
      out.write("<PARAM name=\"java_codebase\" value=\"/advjhtp1/jsp\">");
      out.write("\n");
      out.write("<PARAM name=\"type\" value=\"application/x-java-applet;\">");
      out.write("\n");
      out.write( "<PARAM name=\"red\" value=\"" + "255" + "\">" );
      out.write("\n");
      out.write( "<PARAM name=\"green\" value=\"" + "255" + "\">" );
      out.write("\n");
      out.write( "<PARAM name=\"blue\" value=\"" + "0" + "\">" );
      out.write("\n");
      out.write("<COMMENT>");
      out.write("\n");
      out.write("<EMBED type=\"application/x-java-applet;\"" + " width=\"" + "400" + "\"" + " height=\"" + "400" + "\"" + " pluginspage=\"http://java.sun.com/products/plugin/\" java_code=\"ShapesApplet\" java_codebase=\"/advjhtp1/jsp\"");
      out.write( " red=\"" + "255" + "\"" );
      out.write( " green=\"" + "255" + "\"" );
      out.write( " blue=\"" + "0" + "\"" );
      out.write("/>");
      out.write("\n");
      out.write("<NOEMBED>");
      out.write("\n");
      out.write("\n");
      out.write("</NOEMBED>");
      out.write("\n");
      out.write("</COMMENT>");
      out.write("\n");
      out.write("</OBJECT>");
      out.write("\n");
      out.write("\r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write(" ***************************************************************\r\n");
      out.write(" * (C) Copyright 2002 by Deitel & Associates, Inc. and         *\r\n");
      out.write(" * Prentice Hall. All Rights Reserved.                         *\r\n");
      out.write(" *                                                             *\r\n");
      out.write(" * DISCLAIMER: The authors and publisher of this book have     *\r\n");
      out.write(" * used their best efforts in preparing the book. These        *\r\n");
      out.write(" * efforts include the development, research, and testing of   *\r\n");
      out.write(" * the theories and programs to determine their effectiveness. *\r\n");
      out.write(" * The authors and publisher make no warranty of any kind,     *\r\n");
      out.write(" * expressed or implied, with regard to these programs or to   *\r\n");
      out.write(" * the documentation contained in these books. The authors     *\r\n");
      out.write(" * and publisher shall not be liable in any event for          *\r\n");
      out.write(" * incidental or consequential damages in connection with, or  *\r\n");
      out.write(" * arising out of, the furnishing, performance, or use of      *\r\n");
      out.write(" * these programs.                                             *\r\n");
      out.write(" ***************************************************************\r\n");
      out.write("-->");
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
