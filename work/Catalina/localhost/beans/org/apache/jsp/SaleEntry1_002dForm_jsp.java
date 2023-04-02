package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SaleEntry1_002dForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Invoking SaleEntry1.jsp</TITLE>\r\n");
      out.write("<LINK REL=STYLESHEET\r\n");
      out.write("      HREF=\"JSP-Styles.css\"\r\n");
      out.write("      TYPE=\"text/css\">\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<CENTER>\r\n");
      out.write("<TABLE BORDER=5>\r\n");
      out.write("  <TR><TH CLASS=\"TITLE\">\r\n");
      out.write("      Invoking SaleEntry1.jsp</TABLE>\r\n");
      out.write("<FORM ACTION=\"SaleEntry1.jsp\">\r\n");
      out.write("  Item ID: <INPUT TYPE=\"TEXT\" NAME=\"itemID\"><BR>\r\n");
      out.write("  Number of Items: <INPUT TYPE=\"TEXT\" NAME=\"numItems\"><BR>\r\n");
      out.write("  Discount Code: <INPUT TYPE=\"TEXT\" NAME=\"discountCode\"><P>\r\n");
      out.write("  <INPUT TYPE=\"SUBMIT\" VALUE=\"Show Price\">\r\n");
      out.write("</FORM>     \r\n");
      out.write("</CENTER></BODY></HTML>");
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
