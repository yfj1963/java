package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String username = request.getParameter("username");
String password = request.getParameter("password");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'index.jsp' starting page<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\"></title>\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("  </head>\r\n");
      out.write("  <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"4\">\r\n");
      out.write("\r\n");
      out.write("  <tr> \r\n");
      out.write("\r\n");
      out.write("    <td bgcolor=\"#000099\"> \r\n");
      out.write("\r\n");
      out.write("      <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"4\">\r\n");
      out.write("\r\n");
      out.write("        <tr> \r\n");
      out.write("\r\n");
      out.write("          <td bgcolor=\"#FFFFFF\">&nbsp;<b>*</b>&nbsp;</td>\r\n");
      out.write("\r\n");
      out.write("          <td width=\"100%\"><font color=\"#CCCCCC\">&nbsp; <font color=\"#FFFFFF\"><strong>Title</strong></font></font></td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("      </table></td>\r\n");
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("  <tr> \r\n");
      out.write("\r\n");
      out.write("     <td width=\"100%\" bgcolor=\"#EAEAEA\" colspan=\"2\"> \r\n");
      out.write("\r\n");
      out.write("      <form name=\"Name\" action=\"post\"><p>\r\n");
      out.write("\r\n");
      out.write("          <label for=\"textfield\">Field 1: </label>\r\n");
      out.write("\r\n");
      out.write("          <input type=\"text\" name=\"textfield\" id=\"textfield\">\r\n");
      out.write("\r\n");
      out.write("        </p>\r\n");
      out.write("\r\n");
      out.write("        <p> \r\n");
      out.write("\r\n");
      out.write("          <input type=\"submit\" name=\"Submit\" value=\"Submit\">\r\n");
      out.write("\r\n");
      out.write("        </p>\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("  </td>\r\n");
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<Table>\r\n");
      out.write("\t<Tr>\r\n");
      out.write("\t\t<td>My Table  </Td>\r\n");
      out.write("\t</Tr>\r\n");
      out.write("</Table> \r\n");
      out.write("  <body>\r\n");
      out.write("    This is my JSP page. <br>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
