/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.26.v20200117
 * Generated at: 2020-05-01 20:03:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Users/nick2/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425971470000L));
    _jspx_dependants.put("jar:file:/C:/Users/nick2/.m2/repository/org/springframework/spring-webmvc/5.2.3.RELEASE/spring-webmvc-5.2.3.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1578981040000L));
    _jspx_dependants.put("file:/C:/Users/nick2/.m2/repository/org/springframework/spring-webmvc/5.2.3.RELEASE/spring-webmvc-5.2.3.RELEASE.jar", Long.valueOf(1588361248984L));
    _jspx_dependants.put("file:/C:/Users/nick2/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1588361232524L));
    _jspx_dependants.put("jar:file:/C:/Users/nick2/.m2/repository/org/springframework/spring-webmvc/5.2.3.RELEASE/spring-webmvc-5.2.3.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1578981040000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns:v-on=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <title>Getting Started: Serving Web Content</title>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("    <link href=\"/styles/style.css\" rel=\"stylesheet\"/>\n");
      out.write("    <link href=\"");
      if (_jspx_meth_spring_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\"/>\n");
      out.write("    <script src=\"");
      if (_jspx_meth_spring_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"> </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<header id=\"log\">\n");
      out.write("    <span class=\"name\">𝒫𝑒𝓇𝓈𝑜𝓃 𝒢𝒶𝓁𝓁𝑒𝓇𝓎</span>\n");
      out.write("    <a class=\"aut\" v-on:click=\"reg=!reg\" href=\"#reg\">Sing up</a>\n");
      out.write("    <a class=\"aut\" v-on:click=\"log=!log\" href=\"#login\">Sing in</a>\n");
      out.write("    <div class=\"form log\">\n");
      out.write("        <form class=\"modal\" action=\"/login\" v-show=\"log\" method=\"POST\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("\n");
      out.write("                <div class=\"field\">\n");
      out.write("                    <label>Login:<input class=\"fieldL\" name=\"login\" required/></label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"field\">\n");
      out.write("                    <label>Password:<input name=\"password\" class=\"fieldP\" required type=\"password\"/></label>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"field\">\n");
      out.write("                    <input type=\"checkbox\" class=\"fieldCh\" id=\"horns\" name=\"rememberMe\"/>\n");
      out.write("                    <label for=\"horns\">Remember?</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"fieldSubmit\">\n");
      out.write("                <a type=\"submit\" class=\"cancel\" v-on:click=\"log=!log\" href=\"#!\">Cancel</a>\n");
      out.write("                <button type=\"submit\" >Sing in\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form reg\">\n");
      out.write("        <form class=\"modal\" action=\"/register\" v-show=\"reg\" method=\"POST\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("\n");
      out.write("                <div class=\"field\">\n");
      out.write("                    <label>Login:<input class=\"fieldL\" name=\"login\" required/></label>\n");
      out.write("                </div >\n");
      out.write("                <div class=\"field\">\n");
      out.write("                    <label>Password:<input class=\"fieldP\" name=\"password\" required type=\"password\"/></label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"field\" >\n");
      out.write("                    <label>Email:<input class=\"fieldE\" name=\"email\" required type=\"email\"/></label>\n");
      out.write("                    <input type=\"hidden\" name=\"role\" value=\"ROLE_USER\"/>\n");
      out.write("                    <!--                <secure:csrfInput/>-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"field\">\n");
      out.write("                <a type=\"submit\" class=\"cancel\" v-on:click=\"reg=!reg\" href=\"#!\">Cancel</a>\n");
      out.write("                <button type=\"submit\" >Sing up\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</header>\n");
      out.write("<main>\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <div class=\"fullscreen-bg\">\n");
      out.write("            <div class=\"overlay\">\n");
      out.write("            </div>\n");
      out.write("            <video loop=\"\" muted=\"\" autoplay=\"\" poster=\"video/plane.jpg\" class=\"fullscreen-bg__video\">\n");
      out.write("                <source src=\"");
      if (_jspx_meth_spring_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"  type=\"video/mp4\">\n");
      out.write("                <source src=\"");
      if (_jspx_meth_spring_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"  type=\"video/webm\">\n");
      out.write("            </video>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</main>\n");
      out.write("<footer>\n");
      out.write("    <span class=\"info\">© 2020 PersonGallery</span>\n");
      out.write("    <script src=\"");
      if (_jspx_meth_spring_005furl_005f4(_jspx_page_context))
        return;
      out.write("\"> </script>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_spring_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f0 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    boolean _jspx_th_spring_005furl_005f0_reused = false;
    try {
      _jspx_th_spring_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005furl_005f0.setParent(null);
      // /WEB-INF/view/index.jsp(10,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005furl_005f0.setValue("/static/styles/style.css");
      int[] _jspx_push_body_count_spring_005furl_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005furl_005f0 = _jspx_th_spring_005furl_005f0.doStartTag();
        if (_jspx_th_spring_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005furl_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005furl_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005furl_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f0);
      _jspx_th_spring_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_spring_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f1 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    boolean _jspx_th_spring_005furl_005f1_reused = false;
    try {
      _jspx_th_spring_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_spring_005furl_005f1.setParent(null);
      // /WEB-INF/view/index.jsp(11,17) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005furl_005f1.setValue("/static/js/vueJs.js");
      int[] _jspx_push_body_count_spring_005furl_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005furl_005f1 = _jspx_th_spring_005furl_005f1.doStartTag();
        if (_jspx_th_spring_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005furl_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005furl_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005furl_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f1);
      _jspx_th_spring_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_spring_005furl_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f2 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    boolean _jspx_th_spring_005furl_005f2_reused = false;
    try {
      _jspx_th_spring_005furl_005f2.setPageContext(_jspx_page_context);
      _jspx_th_spring_005furl_005f2.setParent(null);
      // /WEB-INF/view/index.jsp(76,29) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005furl_005f2.setValue("/static/imageMainPage/1.mp4");
      int[] _jspx_push_body_count_spring_005furl_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005furl_005f2 = _jspx_th_spring_005furl_005f2.doStartTag();
        if (_jspx_th_spring_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005furl_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005furl_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005furl_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f2);
      _jspx_th_spring_005furl_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005furl_005f2, _jsp_getInstanceManager(), _jspx_th_spring_005furl_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f3 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    boolean _jspx_th_spring_005furl_005f3_reused = false;
    try {
      _jspx_th_spring_005furl_005f3.setPageContext(_jspx_page_context);
      _jspx_th_spring_005furl_005f3.setParent(null);
      // /WEB-INF/view/index.jsp(77,29) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005furl_005f3.setValue("/static/imageMainPage/1.mp4");
      int[] _jspx_push_body_count_spring_005furl_005f3 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005furl_005f3 = _jspx_th_spring_005furl_005f3.doStartTag();
        if (_jspx_th_spring_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005furl_005f3[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005furl_005f3.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005furl_005f3.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f3);
      _jspx_th_spring_005furl_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005furl_005f3, _jsp_getInstanceManager(), _jspx_th_spring_005furl_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f4 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    boolean _jspx_th_spring_005furl_005f4_reused = false;
    try {
      _jspx_th_spring_005furl_005f4.setPageContext(_jspx_page_context);
      _jspx_th_spring_005furl_005f4.setParent(null);
      // /WEB-INF/view/index.jsp(86,17) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005furl_005f4.setValue("/static/js/index.js");
      int[] _jspx_push_body_count_spring_005furl_005f4 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005furl_005f4 = _jspx_th_spring_005furl_005f4.doStartTag();
        if (_jspx_th_spring_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005furl_005f4[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005furl_005f4.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005furl_005f4.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f4);
      _jspx_th_spring_005furl_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005furl_005f4, _jsp_getInstanceManager(), _jspx_th_spring_005furl_005f4_reused);
    }
    return false;
  }
}
