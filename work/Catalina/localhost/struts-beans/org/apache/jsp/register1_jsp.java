package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<HEAD><TITLE>New Account Registration</TITLE></HEAD>\r\n");
      out.write("<BODY BGCOLOR=\"#FDF5E6\">\r\n");
      out.write("<CENTER>\r\n");
      out.write("<H1>New Account Registration</H1>\r\n");
      out.write("   <FORM ACTION=\"register1.do\" METHOD=\"POST\">\r\n");
      out.write("     <center>\r\n");
      out.write("       <table>\r\n");
      out.write("           <tr>\r\n");
      out.write("              <td>Email address: </td>\r\n");
      out.write("              <td><INPUT TYPE=\"TEXT\" NAME=\"email\"></td>\r\n");
      out.write("           </tr>\r\n");
      out.write("               <td>Password: </td>\r\n");
      out.write("              <td><INPUT TYPE=\"PASSWORD\" NAME=\"password\"></td>\r\n");
      out.write("           </tr>\r\n");
      out.write("       </table>\r\n");
      out.write("    </center>\r\n");
      out.write("    <center>\r\n");
      out.write("       <table>\r\n");
      out.write("           <tr>\r\n");
      out.write("              <td><INPUT TYPE=\"SUBMIT\" VALUE=\"Sign Me Up!\"><BR><p></td>\r\n");
      out.write("           </tr>\r\n");
      out.write("       </table>\r\n");
      out.write("    </center>\r\n");
      out.write("</FORM>\r\n");
      out.write("</CENTER>\r\n");
      out.write("</BODY></HTML>");
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
