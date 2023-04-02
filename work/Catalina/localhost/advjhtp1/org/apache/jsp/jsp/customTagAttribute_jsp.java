package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customTagAttribute_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/jsp/advjhtp1-taglib.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_advjhtp1_welcome2_firstName_nobody;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_advjhtp1_welcome2_firstName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_advjhtp1_welcome2_firstName_nobody.release();
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
      out.write("<!-- Fig. 10.33: customTagAttribute.jsp             -->\r\n");
      out.write("<!-- JSP that uses a custom tag to output content. -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html xmlns = \"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("   <head>\r\n");
      out.write("      <title>Specifying Custom Tag Attributes</title>\r\n");
      out.write("   </head>\r\n");
      out.write("\r\n");
      out.write("   <body>\r\n");
      out.write("      <p>Demonstrating an attribute with a string value</p>\r\n");
      out.write("      <h1>\r\n");
      out.write("         ");
      if (_jspx_meth_advjhtp1_welcome2_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      </h1>\r\n");
      out.write("\r\n");
      out.write("      <p>Demonstrating an attribute with an expression value</p>\r\n");
      out.write("      <h1>\r\n");
      out.write("         ");
      out.write("\r\n");
      out.write("         ");

            String name = request.getParameter( "name" );
         
      out.write("\r\n");
      out.write("\r\n");
      out.write("         ");
      //  advjhtp1:welcome2
      com.deitel.advjhtp1.jsp.taglibrary.Welcome2TagHandler _jspx_th_advjhtp1_welcome2_1 = (com.deitel.advjhtp1.jsp.taglibrary.Welcome2TagHandler) _jspx_tagPool_advjhtp1_welcome2_firstName_nobody.get(com.deitel.advjhtp1.jsp.taglibrary.Welcome2TagHandler.class);
      _jspx_th_advjhtp1_welcome2_1.setPageContext(_jspx_page_context);
      _jspx_th_advjhtp1_welcome2_1.setParent(null);
      _jspx_th_advjhtp1_welcome2_1.setFirstName( name );
      int _jspx_eval_advjhtp1_welcome2_1 = _jspx_th_advjhtp1_welcome2_1.doStartTag();
      if (_jspx_th_advjhtp1_welcome2_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_advjhtp1_welcome2_firstName_nobody.reuse(_jspx_th_advjhtp1_welcome2_1);
      out.write("\r\n");
      out.write("      </h1>\r\n");
      out.write("   </body>\r\n");
      out.write("\r\n");
      out.write("</html>  \r\n");
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

  private boolean _jspx_meth_advjhtp1_welcome2_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  advjhtp1:welcome2
    com.deitel.advjhtp1.jsp.taglibrary.Welcome2TagHandler _jspx_th_advjhtp1_welcome2_0 = (com.deitel.advjhtp1.jsp.taglibrary.Welcome2TagHandler) _jspx_tagPool_advjhtp1_welcome2_firstName_nobody.get(com.deitel.advjhtp1.jsp.taglibrary.Welcome2TagHandler.class);
    _jspx_th_advjhtp1_welcome2_0.setPageContext(_jspx_page_context);
    _jspx_th_advjhtp1_welcome2_0.setParent(null);
    _jspx_th_advjhtp1_welcome2_0.setFirstName("Naser");
    int _jspx_eval_advjhtp1_welcome2_0 = _jspx_th_advjhtp1_welcome2_0.doStartTag();
    if (_jspx_th_advjhtp1_welcome2_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_advjhtp1_welcome2_firstName_nobody.reuse(_jspx_th_advjhtp1_welcome2_0);
    return false;
  }
}
