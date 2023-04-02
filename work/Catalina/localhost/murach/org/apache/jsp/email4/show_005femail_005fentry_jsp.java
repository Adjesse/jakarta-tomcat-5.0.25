package org.apache.jsp.email4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import business.*;
import data.*;

public final class show_005femail_005fentry_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html public \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Chapter 4 - Email List application</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String firstName = request.getParameter("firstName");
	String lastName = request.getParameter("lastName");
	String emailAddress = request.getParameter("emailAddress");

	User user = new User(firstName, lastName, emailAddress);
	UserIO.addRecord(user, "../webapps/murach/WEB-INF/etc/UserEmail.txt");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1>Thanks for joining our email list</h1>\r\n");
      out.write("<p>Here is the information that you entered:</p>\r\n");
      out.write("<table cellspacing=\"5\" cellpadding=\"5\" border=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"right\">First name:</td>\r\n");
      out.write("\t\t<td>");
      out.print( user.getFirstName() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"right\">Last name:</td>\r\n");
      out.write("\t\t<td>");
      out.print( user.getLastName() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"right\">Email address:</td>\r\n");
      out.write("\t\t<td>");
      out.print( user.getEmailAddress() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<p>To enter another email address, click on the Back <br>\r\n");
      out.write("   button in your browser or the Return button shown <br>\r\n");
      out.write("   below.</p>\r\n");
      out.write("\r\n");
      out.write("<form action=\"join_email_list.html\" method=\"post\">\r\n");
      out.write("\t<input type=\"submit\" value=\"Return\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
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
