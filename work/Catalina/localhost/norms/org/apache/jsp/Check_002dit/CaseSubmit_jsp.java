package org.apache.jsp.Check_002dit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.Date;
import java.text.*;
import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;

public final class CaseSubmit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<title>OISS account user List</title>\r\n");
      out.write("<style>\r\n");
      out.write(".fontface {font-family:Arial} \r\n");
      out.write("\r\n");
      out.write("TH {font-size:12pt;}\r\n");
      out.write("TD {font-size:12pt;}\r\n");
      out.write("</style>\r\n");
      out.write("<META HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=iso-8859-1\">\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY BGCOLOR=\"#FFFFFF\" TEXT=\"#000000\" link=\"#0c5449\" vlink=\"#009933\" alink=\"#009933\" CLASS=fontface>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Menu/header.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Menu/menu.jsp", out, false);
      out.write("\r\n");
      out.write("<TABLE WIDTH=\"100%\" BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"0\">\r\n");
      out.write("  \r\n");
      out.write("  <TR>  \r\n");
      out.write("  <TD>\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("    <p><!-- begin copying below this line -->\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("\t  <p><br /><center>\r\n");
      out.write("\t\t  <span class=\"style2\">\r\n");
      out.write("\t\tTo insert a new case....<br />\r\n");
      out.write("\t\tPlease enter the information accordinly......</span></p>\r\n");
      out.write("\t  <br />\r\n");
      out.write("\r\n");
      out.write("<form name=\"edit\" method=\"post\" action=\"http://141.217.52.151/MySQLProj/main.html\" onSubmit=\"return validateForm(this)\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <table border=\"0\" width=\"88%\" >\r\n");
      out.write("\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                              <td align=\"right\"><b>User_ID: </b></td>\r\n");
      out.write("                                              <td><input type=\"text\" name=\"bannerid\" size=\"15\" MAXLENGTH=\"9\"  ></td>\r\n");
      out.write("                                              <td align=\"right\"><strong>ADMIT TERM CODE:</strong></td>\r\n");
      out.write("                                              <td><input type=\"text\" name=\"termcode\" size=\"15\" MAXLENGTH=\"6\" ></td>\r\n");
      out.write("                                            </tr><br /><tr><br /></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                          </table>\r\n");
      out.write("\t\r\n");
      out.write("            \t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<center>\r\n");
      out.write("\t\t                                    <p align=\"justify\">                                            \r\n");
      out.write("\t\t                                    <hr width=\"580\" style=\"border: 2px dashed #C0C0C0\" color=\"#FFFFFF\" size=\"6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<center>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"style2\">\t\t </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t       \r\n");
      out.write("                                                <input type=\"submit\" name=\"act\" value=\"Submit\">\t\t\t\t\t\t\t\t\t\t  \r\n");
      out.write("                                              <input type=\"reset\" value=\"Reset\"></form>\r\n");
      out.write("\t<p>&nbsp;\t</p></td></tr>\r\n");
      out.write("</TABLE><br />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p>  <br />\r\n");
      out.write("  <br />\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <p>&nbsp;</p>\r\n");
      out.write("    </TD>\r\n");
      out.write("  </TR>  \r\n");
      out.write("</TABLE>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Menu/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
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
