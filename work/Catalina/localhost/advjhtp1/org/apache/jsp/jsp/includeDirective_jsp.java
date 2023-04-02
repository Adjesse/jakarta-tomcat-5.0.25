package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class includeDirective_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/jsp/banner.html");
    _jspx_dependants.add("/jsp/toc.html");
    _jspx_dependants.add("/jsp/clock2.jsp");
  }

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

      out.write("<?xml version = \"1.0\"?>\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("\r\n");
      out.write("<!-- Fig. 10.28: includeDirective.jsp -->\r\n");
      out.write("\r\n");
      out.write("<html xmlns = \"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("   <head>\r\n");
      out.write("      <title>Using the include directive</title>\r\n");
      out.write("\r\n");
      out.write("      <style type = \"text/css\">\r\n");
      out.write("         body { \r\n");
      out.write("            font-family: tahoma, helvetica, arial, sans-serif; \r\n");
      out.write("         }\r\n");
      out.write("\r\n");
      out.write("         table, tr, td { \r\n");
      out.write("            font-size: .9em;\r\n");
      out.write("            border: 3px groove;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            background-color: #dddddd; \r\n");
      out.write("         }\r\n");
      out.write("      </style>\r\n");
      out.write("   </head>\r\n");
      out.write("\r\n");
      out.write("   <body>\r\n");
      out.write("      <table>\r\n");
      out.write("         <tr>\r\n");
      out.write("            <td style = \"width: 160px; text-align: center\">\r\n");
      out.write("               <img src = \"images/logotiny.png\" \r\n");
      out.write("                  width = \"140\" height = \"93\" \r\n");
      out.write("                  alt = \"Deitel & Associates, Inc. Logo\" />\r\n");
      out.write("            </td>\r\n");
      out.write(" \r\n");
      out.write("            <td>\r\n");
      out.write("\r\n");
      out.write("               ");
      out.write("\r\n");
      out.write("               ");
      out.write("<!-- Fig. 10.7: banner.html                -->\r\n");
      out.write("<!-- banner to include in another document -->\r\n");
      out.write("<div style = \"width: 580px\">\r\n");
      out.write("   <p>\r\n");
      out.write("      Java(TM), C, C++, Visual Basic(R),\r\n");
      out.write("      Object Technology, and <br /> Internet and \r\n");
      out.write("      World Wide Web Programming Training&nbsp;<br />\r\n");
      out.write("      On-Site Seminars Delivered Worldwide\r\n");
      out.write("   </p>\r\n");
      out.write("\r\n");
      out.write("   <p>\r\n");
      out.write("      <a href = \"mailto:deitel@deitel.com\">\r\n");
      out.write("         deitel@deitel.com</a><br />\r\n");
      out.write("\r\n");
      out.write("      978.579.9911<br />\r\n");
      out.write("      490B Boston Post Road, Suite 200, \r\n");
      out.write("      Sudbury, MA 01776\r\n");
      out.write("   </p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("         </tr>\r\n");
      out.write("\r\n");
      out.write("         <tr>\r\n");
      out.write("            <td style = \"width: 160px\">\r\n");
      out.write("\r\n");
      out.write("               ");
      out.write("\r\n");
      out.write("               ");
      out.write("<!-- Fig. 10.8: toc.html                     -->\r\n");
      out.write("<!-- contents to include in another document -->\r\n");
      out.write("\r\n");
      out.write("<p><a href = \"http://www.deitel.com/books/index.html\">\r\n");
      out.write("   Publications/BookStore\r\n");
      out.write("</a></p>\r\n");
      out.write("\r\n");
      out.write("<p><a href = \"http://www.deitel.com/whatsnew.html\">\r\n");
      out.write("   What's New\r\n");
      out.write("</a></p>\r\n");
      out.write("\r\n");
      out.write("<p><a href = \"http://www.deitel.com/books/downloads.html\">\r\n");
      out.write("   Downloads/Resources\r\n");
      out.write("</a></p>\r\n");
      out.write("\r\n");
      out.write("<p><a href = \"http://www.deitel.com/faq/index.html\">\r\n");
      out.write("   FAQ (Frequently Asked Questions)\r\n");
      out.write("</a></p>\r\n");
      out.write("\r\n");
      out.write("<p><a href = \"http://www.deitel.com/intro.html\">\r\n");
      out.write("   Who we are\r\n");
      out.write("</a></p>\r\n");
      out.write("\r\n");
      out.write("<p><a href = \"http://www.deitel.com/index.html\">\r\n");
      out.write("   Home Page\r\n");
      out.write("</a></p>\r\n");
      out.write("\r\n");
      out.write("<p>Send questions or comments about this site to \r\n");
      out.write("   <a href = \"mailto:deitel@deitel.com\">\r\n");
      out.write("      deitel@deitel.com\r\n");
      out.write("   </a><br />\r\n");
      out.write("   Copyright 1995-2002 by Deitel &amp; Associates, Inc. \r\n");
      out.write("   All Rights Reserved.\r\n");
      out.write("</p>\r\n");
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
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td style = \"vertical-align: top\"> \r\n");
      out.write("\r\n");
      out.write("               ");
      out.write("\r\n");
      out.write("               ");
      out.write("<!-- Fig. 10.9: clock2.jsp                        -->\r\n");
      out.write("<!-- date and time to include in another document -->\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("   <tr>\r\n");
      out.write("      <td style = \"background-color: black;\">\r\n");
      out.write("         <p class = \"big\" style = \"color: cyan; font-size: 3em; \r\n");
      out.write("            font-weight: bold;\">\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
 
               // get client locale
               java.util.Locale locale = request.getLocale();

               // get DateFormat for client's Locale
               java.text.DateFormat dateFormat = 
                  java.text.DateFormat.getDateTimeInstance(
                     java.text.DateFormat.LONG,
                     java.text.DateFormat.LONG, locale );

            
      out.write(' ');
      out.write(' ');
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.print( dateFormat.format( new java.util.Date() ) );
      out.write("\r\n");
      out.write("         </p> \r\n");
      out.write("      </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("</table>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("         </tr>\r\n");
      out.write("      </table>\r\n");
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
