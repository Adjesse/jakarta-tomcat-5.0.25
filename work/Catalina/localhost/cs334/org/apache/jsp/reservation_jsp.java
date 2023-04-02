package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reservation_jsp extends org.apache.jasper.runtime.HttpJspBase
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

 
		if (session.isNew() || session.getAttribute("UserName") == null)
		{ 
 		response.sendRedirect("login.jsp"); 
 		} 
 		
 	
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title>reservation</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#ccccff\">\r\n");
      out.write("<br /><br /><br />\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("<p align=\"justify\">\r\n");
      out.write(" <table border=\"0\" align=\"center\" width=\"80%\" bgcolor=\"#b4b394\" cellpadding=\"2\" cellspacing=\"6\">\r\n");
      out.write("  <tr align=\"center\">\r\n");
      out.write("   <td>\r\n");
      out.write("    <table border=\"0\" width=\"90%\" bgcolor=\"#ebe2d5\">\r\n");
      out.write("     \r\n");
      out.write("       <font face =\"verdana\" size=\"2pt\"><br />\r\n");
      out.write("       \r\n");
      out.write("       <center>\r\n");
      out.write("      <tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t\r\n");
      out.write("<a href=\"/cs334/hotelinfo.jsp?catagory=Helton\">Helton</a><br />\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("<a href=\"/cs334/hotelinfo.jsp?catagory=Sheraton\">Sheraton</a><br />\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("<a href=\"/cs334/hotelinfo.jsp?catagory=Merit\">Merit</a><br />\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("</font>\r\n");
      out.write("      \r\n");
      out.write("    </table>\r\n");
      out.write("   </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("  </table>\r\n");
      out.write(" </p>\t\r\n");
      out.write("\t\t\r\n");
      out.write("</center>\r\n");
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
