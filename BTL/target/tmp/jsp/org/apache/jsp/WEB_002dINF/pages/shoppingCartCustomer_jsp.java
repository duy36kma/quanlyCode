package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shoppingCartCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_errors_path_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_modelAttribute_method_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_form_input_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_errors_path_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_modelAttribute_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_form_input_path_nobody.release();
    _jspx_tagPool_form_errors_path_class_nobody.release();
    _jspx_tagPool_form_form_modelAttribute_method_action.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<title>Enter Customer Information</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_header.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_menu.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"page-title\">Enter Customer Information</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_modelAttribute_method_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_form_0.setPageContext(_jspx_page_context);
      _jspx_th_form_form_0.setParent(null);
      _jspx_th_form_form_0.setMethod("POST");
      _jspx_th_form_form_0.setModelAttribute("customerForm");
      _jspx_th_form_form_0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}/shoppingCartCustomer", java.lang.String.class, (PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
      try {
        int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
        if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\r\n");
            out.write("\t\t<table>\r\n");
            out.write("\t\t\t<tr>\r\n");
            out.write("\t\t\t\t<td>Name *</td>\r\n");
            out.write("\t\t\t\t<td>");
            if (_jspx_meth_form_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t<td>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_class_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_0.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_0.setPath("name");
            _jspx_th_form_errors_0.setDynamicAttribute(null, "class", new String("error-message"));
            int[] _jspx_push_body_count_form_errors_0 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_0 = _jspx_th_form_errors_0.doStartTag();
              if (_jspx_th_form_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_0.doFinally();
              _jspx_tagPool_form_errors_path_class_nobody.reuse(_jspx_th_form_errors_0);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t<tr>\r\n");
            out.write("\t\t\t\t<td>Email *</td>\r\n");
            out.write("\t\t\t\t<td>");
            if (_jspx_meth_form_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t<td>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_class_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_1.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_1.setPath("email");
            _jspx_th_form_errors_1.setDynamicAttribute(null, "class", new String("error-message"));
            int[] _jspx_push_body_count_form_errors_1 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_1 = _jspx_th_form_errors_1.doStartTag();
              if (_jspx_th_form_errors_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_1.doFinally();
              _jspx_tagPool_form_errors_path_class_nobody.reuse(_jspx_th_form_errors_1);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t<tr>\r\n");
            out.write("\t\t\t\t<td>Phone *</td>\r\n");
            out.write("\t\t\t\t<td>");
            if (_jspx_meth_form_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t<td>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_class_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_2.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_2.setPath("phone");
            _jspx_th_form_errors_2.setDynamicAttribute(null, "class", new String("error-message"));
            int[] _jspx_push_body_count_form_errors_2 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_2 = _jspx_th_form_errors_2.doStartTag();
              if (_jspx_th_form_errors_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_2.doFinally();
              _jspx_tagPool_form_errors_path_class_nobody.reuse(_jspx_th_form_errors_2);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t<tr>\r\n");
            out.write("\t\t\t\t<td>Address *</td>\r\n");
            out.write("\t\t\t\t<td>");
            if (_jspx_meth_form_input_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t<td>");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_3 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_class_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_3.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_3.setPath("address");
            _jspx_th_form_errors_3.setDynamicAttribute(null, "class", new String("error-message"));
            int[] _jspx_push_body_count_form_errors_3 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_3 = _jspx_th_form_errors_3.doStartTag();
              if (_jspx_th_form_errors_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_3[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_3.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_3.doFinally();
              _jspx_tagPool_form_errors_path_class_nobody.reuse(_jspx_th_form_errors_3);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t<tr>\r\n");
            out.write("\t\t\t\t<td>&nbsp;</td>\r\n");
            out.write("\t\t\t\t<td><input type=\"submit\" value=\"Submit\" /> <input type=\"reset\"\r\n");
            out.write("\t\t\t\t\tvalue=\"Reset\" /></td>\r\n");
            out.write("\t\t\t</tr>\r\n");
            out.write("\t\t</table>\r\n");
            out.write("\r\n");
            out.write("\t");
            int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_form_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_form_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_form_0.doFinally();
        _jspx_tagPool_form_form_modelAttribute_method_action.reuse(_jspx_th_form_form_0);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_footer.jsp", out, false);
      out.write("\r\n");
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

  private boolean _jspx_meth_form_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_0.setPageContext(_jspx_page_context);
    _jspx_th_form_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_0.setPath("name");
    int[] _jspx_push_body_count_form_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_0 = _jspx_th_form_input_0.doStartTag();
      if (_jspx_th_form_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_0.doFinally();
      _jspx_tagPool_form_input_path_nobody.reuse(_jspx_th_form_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_1.setPageContext(_jspx_page_context);
    _jspx_th_form_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_1.setPath("email");
    int[] _jspx_push_body_count_form_input_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_1 = _jspx_th_form_input_1.doStartTag();
      if (_jspx_th_form_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_1.doFinally();
      _jspx_tagPool_form_input_path_nobody.reuse(_jspx_th_form_input_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_2.setPageContext(_jspx_page_context);
    _jspx_th_form_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_2.setPath("phone");
    int[] _jspx_push_body_count_form_input_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_2 = _jspx_th_form_input_2.doStartTag();
      if (_jspx_th_form_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_2.doFinally();
      _jspx_tagPool_form_input_path_nobody.reuse(_jspx_th_form_input_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_3 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_3.setPageContext(_jspx_page_context);
    _jspx_th_form_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_3.setPath("address");
    int[] _jspx_push_body_count_form_input_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_3 = _jspx_th_form_input_3.doStartTag();
      if (_jspx_th_form_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_3.doFinally();
      _jspx_tagPool_form_input_path_nobody.reuse(_jspx_th_form_input_3);
    }
    return false;
  }
}
