package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class guestBookErrorPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
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

      out.write("<?xml version = \"1.0\"?>\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("\r\n");
      out.write("<!-- Fig. 37.24: guestBookErrorPage.jsp -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html xmlns = \"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("   <head>\r\n");
      out.write("      <title>Error!</title>\r\n");
      out.write("\r\n");
      out.write("      <style type = \"text/css\">\r\n");
      out.write("         .bigRed {\r\n");
      out.write("            font-size: 2em;\r\n");
      out.write("            color: red; \r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("         }\r\n");
      out.write("      </style>\r\n");
      out.write("   </head>\r\n");
      out.write("\r\n");
      out.write("   <body>\r\n");
      out.write("      <p class = \"bigRed\"> \r\n");
      out.write("\r\n");
      out.write("      ");
 // scriptlet to determine exception type
         // and output beginning of error message
         if ( exception instanceof SQLException )
      
      out.write("\r\n");
      out.write("\r\n");
      out.write("            An SQLException\r\n");
      out.write("\t\t\t\r\n");
      out.write("      \r\n");
      out.write("      ");

		  else if ( exception instanceof ClassNotFoundException )
      
      out.write("\r\n");
      out.write("\r\n");
      out.write("            A ClassNotFoundException\r\n");
      out.write("      \r\n");
      out.write("      ");

         else
      
      out.write("\r\n");
      out.write("\r\n");
      out.write("            An exception\r\n");
      out.write("\r\n");
      out.write("      ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("         ");
      out.write("\r\n");
      out.write("         occurred while interacting with the guestbook database. \r\n");
      out.write("      </p>\r\n");
      out.write("\r\n");
      out.write("      <p class = \"bigRed\">\r\n");
      out.write("         The error message was:<br />\r\n");
      out.write("         ");
      out.print( exception.getMessage() );
      out.write("\r\n");
      out.write("      </p>\r\n");
      out.write("\r\n");
      out.write("      <p class = \"bigRed\">Please try again later</p>\r\n");
      out.write("   </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write(" /*************************************************************************\r\n");
      out.write(" * (C) Copyright 1992-2004 by Deitel & Associates, Inc. and               *\r\n");
      out.write(" * Pearson Education, Inc. All Rights Reserved.                           *\r\n");
      out.write(" *                                                                        *\r\n");
      out.write(" * DISCLAIMER: The authors and publisher of this book have used their     *\r\n");
      out.write(" * best efforts in preparing the book. These efforts include the          *\r\n");
      out.write(" * development, research, and testing of the theories and programs        *\r\n");
      out.write(" * to determine their effectiveness. The authors and publisher make       *\r\n");
      out.write(" * no warranty of any kind, expressed or implied, with regard to these    *\r\n");
      out.write(" * programs or to the documentation contained in these books. The authors *\r\n");
      out.write(" * and publisher shall not be liable in any event for incidental or       *\r\n");
      out.write(" * consequential damages in connection with, or arising out of, the       *\r\n");
      out.write(" * furnishing, performance, or use of these programs.                     *\r\n");
      out.write(" *************************************************************************/\r\n");
      out.write("-->\r\n");
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
