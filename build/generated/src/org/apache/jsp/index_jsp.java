package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("\n");
      out.write("\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Personajes</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body background=\"Background\\1SAO.png\">\n");
      out.write("\n");
      out.write("    <center>    \n");
      out.write("        <div><FONT COLOR=#FFFFFF>Bienvenido ^^</FONT></div>\n");
      out.write("        <section text-align=\"center\" >\n");
      out.write("            <div aling=\"center\">\n");
      out.write("                <br> <FONT COLOR=#FFFFFF>Seleccione la clase de su personaje.</FONT>\n");
      out.write("                <form id=\"tipoPersonaje\" action=\"IndexServlet\">\n");
      out.write("                    <br> <select name=\"tipo\" >\n");
      out.write("                        <option value=\"Elfo\">Elfo</option>\n");
      out.write("                        <option value=\"Enano\">Enano</option>\n");
      out.write("                        <option value=\"Hechicero\">Hechicero</option>\n");
      out.write("                        <option value=\"Humano\">Humano</option>\n");
      out.write("                    </select> \n");
      out.write("                    <input type=\"submit\" value=\"Siguiente\"/>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </section>  \n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("    <div  class=\"modal-footer\">\n");
      out.write("        <a target=\"_blank\" href=\"https://www.google.com/search?q=sao&client=ubuntu&hs=V9E&channel=fs&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiaupvd7KPSAhUKPiYKHVu-AuIQ_AUICCgB&biw=1366&bih=646\"> Link del cual fue sacado la imagen </a>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
