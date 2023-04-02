package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StringBean_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      coreservlets.StringBean stringBean = null;
      synchronized (_jspx_page_context) {
        stringBean = (coreservlets.StringBean) _jspx_page_context.getAttribute("stringBean", PageContext.PAGE_SCOPE);
        if (stringBean == null){
          stringBean = new coreservlets.StringBean();
          _jspx_page_context.setAttribute("stringBean", stringBean, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <OL>\r\n");
      out.write("     <LI>Initial value (from jsp:getProperty):\r\n");
      out.write("         <I>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((coreservlets.StringBean)_jspx_page_context.findAttribute("stringBean")).getMessage())));
      out.write("</I>\r\n");
      out.write("     <LI>Initial value (from JSP expression):\r\n");
      out.write("         <I>");
      out.print( stringBean.getMessage() );
      out.write("</I>\r\n");
      out.write("     <LI>");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("stringBean"), "message", "Best string bean: Fortex", null, null, false);
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("                       Value after setting property with jsp:setProperty:\r\n");
      out.write("\r\n");
      out.write("         <I>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((coreservlets.StringBean)_jspx_page_context.findAttribute("stringBean")).getMessage())));
      out.write("</I>\r\n");
      out.write("     <LI>");
 stringBean.setMessage ("My favorite: Kentucky Wonder"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                       Value after setting property with scriptlet:\r\n");
      out.write("\r\n");
      out.write("         <I>");
      out.print( stringBean.getMessage() );
      out.write("</I>\r\n");
      out.write("  </OL>");
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
