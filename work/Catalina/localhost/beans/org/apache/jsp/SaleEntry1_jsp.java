package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SaleEntry1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- \r\n");
      out.write("Example of using jsp:setProperty with an explicit value\r\n");
      out.write("supplied to the \"value\" attribute. See SaleEntry2.jsp\r\n");
      out.write("and SaleEntry3.jsp for alternatives. \r\n");
      out.write("\r\n");
      out.write("Taken from Core Servlets and JavaServer Pages 2nd Edition\r\n");
      out.write("from Prentice Hall and Sun Microsystems Press,\r\n");
      out.write("http://www.coreservlets.com/.\r\n");
      out.write("(C) 2003 Marty Hall; may be freely used or adapted.\r\n");
      out.write("-->\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Using jsp:setProperty</TITLE>\r\n");
      out.write("<LINK REL=STYLESHEET\r\n");
      out.write("      HREF=\"JSP-Styles.css\"\r\n");
      out.write("      TYPE=\"text/css\">\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<CENTER>\r\n");
      out.write("<TABLE BORDER=5>\r\n");
      out.write("  <TR><TH CLASS=\"TITLE\">\r\n");
      out.write("      Using jsp:setProperty\r\n");
      out.write("</TABLE>\r\n");
      out.write("\r\n");
      coreservlets.SaleEntry entry = null;
      synchronized (_jspx_page_context) {
        entry = (coreservlets.SaleEntry) _jspx_page_context.getAttribute("entry", PageContext.PAGE_SCOPE);
        if (entry == null){
          entry = new coreservlets.SaleEntry();
          _jspx_page_context.setAttribute("entry", entry, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("entry"), "itemID",
 request.getParameter("itemID") );
      out.write('\r');
      out.write('\n');

   int numItemsOrdered = 1;
   try {
          numItemsOrdered = 
          Integer.parseInt(request.getParameter("numItems"));
   } catch(NumberFormatException nfe) {}

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("entry"), "numItems",
 numItemsOrdered );
      out.write('\r');
      out.write('\n');
 
    double discountCode = 1.0;
    try {
           String discountString = 
           request.getParameter("discountCode");
           discountCode = 
           Double.parseDouble(discountString);
    } catch(NumberFormatException nfe) {}

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("entry"), "discountCode",
 discountCode );
      out.write("\r\n");
      out.write("<BR>\r\n");
      out.write("<TABLE BORDER=1>\r\n");
      out.write("       <TR CLASS=\"COLORED\">\r\n");
      out.write("           <TH>Item ID<TH>Unit Price<TH>Number Ordered<TH>Total Price\r\n");
      out.write("       <TR ALIGN=\"RIGHT\">\r\n");
      out.write("           <TD>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((coreservlets.SaleEntry)_jspx_page_context.findAttribute("entry")).getItemID())));
      out.write("\r\n");
      out.write("           <TD>$");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((coreservlets.SaleEntry)_jspx_page_context.findAttribute("entry")).getItemCost())));
      out.write("\r\n");
      out.write("           <TD>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((coreservlets.SaleEntry)_jspx_page_context.findAttribute("entry")).getNumItems())));
      out.write("\r\n");
      out.write("           <TD>$");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((coreservlets.SaleEntry)_jspx_page_context.findAttribute("entry")).getTotalCost())));
      out.write("\r\n");
      out.write("</TABLE>       \r\n");
      out.write("</CENTER>\r\n");
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
