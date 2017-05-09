package org.apache.jsp.WEB_002dINF.pages;

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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<title>Shop Online</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_header.jsp", out, false);
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_menu.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"page-title\">Shopping Cart</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"demo-container\">\r\n");
      out.write("\t\t<div class=\"fLeft\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><h4>Chào mừng quý khách hàng đến với Shop</h4></li>\r\n");
      out.write("\t\t\t\t<li><h4>Thiên đường mua sắm Thú nhồi bông.</h4></li>\r\n");
      out.write("\t\t\t\t<li><h4>Chúc quý khách mua sắm vui vẻ!!</h4></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"fRight\" style=\"max-width: 500px\">\r\n");
      out.write("\t\t\t<img class=\"mySlides\" src=\"http://media.bizwebmedia.net/sites/34951/Upload/Gallery/3005348slide_1.jpg\" \r\n");
      out.write("\t\t\t\talt=\"d\" style=\"width: 450px; height: 400px\">\r\n");
      out.write("\t\t\t\t<img alt=\"b\" class=\"mySlides\"\r\n");
      out.write("\t\t\t\tsrc=\"/img/20-11.jpg\" style=\"width: 450px; height: 400px\" /> \r\n");
      out.write("\t\t\t<img class=\"mySlides\" alt=\"a\" src=\"/img/qua.jpg\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 450px; height: 400px\" /> \r\n");
      out.write("\t\t\t<img class=\"mySlides\" src=\"http://media.bizwebmedia.net/sites/34951/Upload/Gallery/4510653slide2.jpg\" \r\n");
      out.write("\t\t\t\tstyle=\" height: 400px; width: 450px;\">\r\n");
      out.write("\t\t\t<img class=\"mySlides\"\r\n");
      out.write("\t\t\t\talt=\"c\" src=\"/img/banner.jpg\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 450px; height: 400px\" />\r\n");
      out.write("\t\t\t<img class=\"mySlides\"\r\n");
      out.write("\t\t\t\talt=\"c\" src=\"/img/banner1.jpg\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 450px; height: 400px\" />\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\tvar myIndex = 0;\r\n");
      out.write("\t\t\tcarousel();\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction carousel() {\r\n");
      out.write("\t\t\t\tvar i;\r\n");
      out.write("\t\t\t\tvar x = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("\t\t\t\tfor (i = 0; i < x.length; i++) {\r\n");
      out.write("\t\t\t\t\tx[i].style.display = \"none\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tmyIndex++;\r\n");
      out.write("\t\t\t\tif (myIndex > x.length) {\r\n");
      out.write("\t\t\t\t\tmyIndex = 1\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tx[myIndex - 1].style.display = \"block\";\r\n");
      out.write("\t\t\t\tsetTimeout(carousel, 9000);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
