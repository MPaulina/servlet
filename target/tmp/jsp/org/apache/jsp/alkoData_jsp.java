package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class alkoData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>alkoData</title>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#339933\">\n");
      out.write("\t<h1>ALKOHOLE</h1>\n");
      out.write("\t<img\n");
      out.write("\t\tsrc=\"http://www.alkohole.wortale.net/gal/alkohole-inne-alkohole-13239847630666.jpg\"\n");
      out.write("\t\talign=\"right\" />\n");
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
      com.example.servletjspdemo.service.StorageSer storage = null;
      synchronized (application) {
        storage = (com.example.servletjspdemo.service.StorageSer) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new com.example.servletjspdemo.service.StorageSer();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("alko"), request);
      out.write("\n");
      out.write("\n");
      out.write("\t<form action=\"showAllAlcohols.jsp\" method=\"get\">\n");
      out.write("\t\t<br /> TYP ALKOHOLU: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alko.typ}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br /> NAZWA: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alko.marka}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br />\n");
      out.write("\t\tRODZAJ:\n");
      out.write("\t\t");

 			String wyswietlRodzaj[] = request.getParameterValues("rodzaj");
 			if (wyswietlRodzaj != null && wyswietlRodzaj.length != 0) {
 				for (int i = 0; i < wyswietlRodzaj.length; i++) {
 					out.println(wyswietlRodzaj[i] + ",");
 				}

 				alko.setRodzaj(wyswietlRodzaj);
 			}
 		
      out.write("\n");
      out.write("\n");
      out.write("\t\t<br /> POJEMNOŚĆ:\n");
      out.write("\t\t");

			String wyswietPojemnosc[] = request.getParameterValues("pojemnosc");
			if (wyswietPojemnosc != null && wyswietPojemnosc.length != 0) {
				for (int i = 0; i < wyswietPojemnosc.length; i++) {
					out.println(wyswietPojemnosc[i] + ",");
				}

				alko.setPojemnosc(wyswietPojemnosc);
			}
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t");

			alko.setInfo(request.getParameter("info"));
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t<br /> UWAGI: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alko.info}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br />\n");
      out.write("\n");
      out.write("\t\t");

			storage.add(alko);
			session.removeAttribute("alko");
			//out.println("<p><u>Typ:</u> " + alko.getMarka() + ". <u>Marka:</u> " + alko.getTyp() + ". <u>Rodzaj:</u> " + alko.getRodzajToString() + ". <u>Pojemnosc:</u> " + alko.getPojemnoscToString() + ". <u>Uwagi:</u> " + alko.getInfo() + "<br /></p>");
		
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<br /> <br /> <input type=\"submit\" value=\"Show all alcohols\">\n");
      out.write("\t</form>\n");
      out.write("\t<br />\n");
      out.write("\t<form action=\"Alcohols.jsp\" method=\"get\">\n");
      out.write("\t\t<input type=\"submit\" value=\"Back\">\n");
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
