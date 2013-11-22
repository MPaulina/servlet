package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.example.servletjspdemo.web.Alcohol.PojemnoscEnum;
import com.example.servletjspdemo.web.Alcohol.RodzajEnum;
import com.example.servletjspdemo.web.Alcohol.TypEnum;
import java.util.Date;

public final class Alcohols_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Alcohols</title>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#339933\">\n");
      out.write("<h1>ALKOHOLE</h1>\n");
      out.write("<img src=\"http://www.alkohole.wortale.net/gal/alkohole-inne-alkohole-13239847630666.jpg\" align=\"right\" />\n");
      out.write("\t");
      com.example.servletjspdemo.web.Alcohol typ = null;
      synchronized (session) {
        typ = (com.example.servletjspdemo.web.Alcohol) _jspx_page_context.getAttribute("typ", PageContext.SESSION_SCOPE);
        if (typ == null){
          typ = new com.example.servletjspdemo.web.Alcohol();
          _jspx_page_context.setAttribute("typ", typ, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('	');
      com.example.servletjspdemo.web.Alcohol alko = null;
      synchronized (session) {
        alko = (com.example.servletjspdemo.web.Alcohol) _jspx_page_context.getAttribute("alko", PageContext.SESSION_SCOPE);
        if (alko == null){
          alko = new com.example.servletjspdemo.web.Alcohol();
          _jspx_page_context.setAttribute("alko", alko, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('	');
      com.example.servletjspdemo.web.Alcohol rodzaj = null;
      synchronized (session) {
        rodzaj = (com.example.servletjspdemo.web.Alcohol) _jspx_page_context.getAttribute("rodzaj", PageContext.SESSION_SCOPE);
        if (rodzaj == null){
          rodzaj = new com.example.servletjspdemo.web.Alcohol();
          _jspx_page_context.setAttribute("rodzaj", rodzaj, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('	');
      com.example.servletjspdemo.web.Alcohol pojemnosc = null;
      synchronized (session) {
        pojemnosc = (com.example.servletjspdemo.web.Alcohol) _jspx_page_context.getAttribute("pojemnosc", PageContext.SESSION_SCOPE);
        if (pojemnosc == null){
          pojemnosc = new com.example.servletjspdemo.web.Alcohol();
          _jspx_page_context.setAttribute("pojemnosc", pojemnosc, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('	');
      com.example.servletjspdemo.web.Alcohol info = null;
      synchronized (session) {
        info = (com.example.servletjspdemo.web.Alcohol) _jspx_page_context.getAttribute("info", PageContext.SESSION_SCOPE);
        if (info == null){
          info = new com.example.servletjspdemo.web.Alcohol();
          _jspx_page_context.setAttribute("info", info, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("person"), request);
      out.write("\n");
      out.write("\n");
      out.write("\t<form action=\"alkoData.jsp\">\n");
      out.write("\t\t<br /><b>TYP:</b><br /> \n");
      out.write("\t\t");

        for(TypEnum e: TypEnum.values())         
            out.print("<input type='radio' name='typ' value=" + e.slownieToString() + ">" + e.slownieToString() + "<br />");
        
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<br /><b>NAZWA:</b><br /> \n");
      out.write("\t\t<input type='text' name='marka' value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alko.marka}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'><br />\n");
      out.write("\t\t\n");
      out.write("\t\t<br /><b>RODZAJ:</b><br />\n");
      out.write("\t\t<select size=\"10\" name=\"rodzaj\" multiple=\"multiple\">\n");
      out.write("\t\t ");

         for(RodzajEnum e: RodzajEnum.values())
             out.print("<option value=" + e.rodzajToString() + ">" + e.rodzajToString() + "</option>");
         
      out.write("\n");
      out.write("\t\t</select> <br /> \n");
      out.write("\t\t\n");
      out.write("\t\t<br /><b>POJEMNOSC:</b><br />\n");
      out.write("\t\t");

        for(PojemnoscEnum e: PojemnoscEnum.values())         
            out.print("<input type='checkbox' name='pojemnosc' value=" + e.slownieToStirng() + ">" + e.slownieToStirng() +"<br /> ");
        
      out.write("\n");
      out.write("      \n");
      out.write("\t\t<br /><b>UWAGI:</b><br />\t\n");
      out.write("\t\t\t<textarea name='info' rows=\"3\" cols=\"40\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alko.info}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\t\n");
      out.write("\t\t<br />\n");
      out.write("\t\t\n");
      out.write("\t\t<br /> <input type=\"submit\" value=\"Zatwierdz\">\n");
      out.write("\n");
      out.write("\t</form>\n");
      out.write("</body>\n");
      out.write("</html>");
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
