/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-11 04:50:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/product/../common/menubar.jsp", Long.valueOf(1589172010980L));
    _jspx_dependants.put("/views/product/../common/footer.jsp", Long.valueOf(1589172011286L));
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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("  <!-- link rel=\"stylesheet\" href=\"../css/style.css\" -->\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../css/bootstrap.css\">\r\n");
      out.write("  \r\n");
      out.write("<script src=\"../js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/bootstrap.js\"></script> \r\n");
      out.write("  <style>\r\n");
      out.write(" #search{\r\n");
      out.write("    background-color: rgb(224, 224, 224);\r\n");
      out.write("}\r\n");
      out.write(".rul {\r\n");
      out.write("\tmargin-right: 20px;\r\n");
      out.write("\tmargin-left: 20px;\r\n");
      out.write("\theight: 400px;\r\n");
      out.write("\tpadding-left: 190px;\r\n");
      out.write("}\r\n");
      out.write(".rank {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\twidth: 20%;\r\n");
      out.write("\theight: 90%;\r\n");
      out.write("\tmargin-right: 20px;\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write(".mname {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("  </style>\r\n");
      out.write("  \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>메뉴바</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/style.css\">\r\n");
      out.write(" <link href=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<header id=\"menu\">\r\n");
      out.write("       <div id=\"logo\">\r\n");
      out.write("        <a href=\"");
      out.print( request.getContextPath() );
      out.write("/index.jsp\" class=\"logo\">\r\n");
      out.write("            <img src=\"");
      out.print( request.getContextPath() );
      out.write("/views/img/logo-02.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("      </div>\r\n");
      out.write("                 <ul class = \"navi\">\r\n");
      out.write("                    <li><a href=\"#\">ABOUT</a></li>\r\n");
      out.write("                    <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/views/product/product.jsp\">STORE</a></li>\r\n");
      out.write("                    <li><a href=\"#\">COMMUNITY</a>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">아마추어 게시판</a></li>\r\n");
      out.write("                            <li><a href=\"#\">자유게시판</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\">NOTICE</a>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/views/board/notice/noticeBoard.jsp\">공지사항</a></li>\r\n");
      out.write("                            <li><a href=\"#\">1:1문의</a></li>\r\n");
      out.write("                        </ul>    \r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("        <!--icon :: 색상변경 또는 없애버리고 메뉴바 만들기-->\r\n");
      out.write("        <div id=\"loginWrap\">\r\n");
      out.write("            <a href =\"#\" class=\"icon\" ><img src=\"");
      out.print( request.getContextPath() );
      out.write("/views/img/login2.png\"></a>\r\n");
      out.write("            <a href =\"#\" class=\"icon\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/views/img/search2.png\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header> \r\n");
      out.write("    <br clear=\"both\">\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("       <h1 align=\"center\">미술품 판매(가제)</h1>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"search\">\r\n");
      out.write("            <form>\r\n");
      out.write("            <table class=\"table table-borderless\">\r\n");
      out.write("            <tr>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                \t<td></td>\r\n");
      out.write("                    <td><b>작가 명</b><br><input type=\"search\" id=\"artist\"></td>\r\n");
      out.write("                    <td><b>테마</b><br><select name=\"category\" id=\"category\">\r\n");
      out.write("                                <option value=\"figure painting\">인물</option>\r\n");
      out.write("                                <option value=\"landscape painting\">풍경</option>\r\n");
      out.write("                                <option value=\"landscape painting\">인물</option>\r\n");
      out.write("                                <option value=\"landscape painting\">정물</option>\r\n");
      out.write("                                <option value=\"landscape painting\">동물</option>\r\n");
      out.write("                                <option value=\"landscape painting\">추상</option>\r\n");
      out.write("                                <option value=\"landscape painting\">팝아트</option>\r\n");
      out.write("                                <option value=\"landscape painting\">오브제</option>\r\n");
      out.write("                    </select></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td><b>가격</b><br><input type=\"range\" id=\"price\" min=\"0\" max=\"100000000\" step=\"10000\" value=\"0\">\r\n");
      out.write("                    <br><a>1</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                \t<td></td>\r\n");
      out.write("                    <td><b>태그 검색</b><br><input type=\"search\" id=\"tag_search\" placeholder=\"내용을 입력해주세요\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td><button type=\"submit\" id=\"submit\" class=\"btn btn-dark\">검색</button></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("        <p class=\"h3\">전체</p>\r\n");
      out.write("        <br clear=\"both\">\r\n");
      out.write("        <div>\r\n");
      out.write("\t\t\t<ul class=\"rul\">\r\n");
      out.write("\t\t\t\t<li class=\"rank\"><img class=\"rimage\"\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/slide1.jpg\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 100%; height: 70%;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"mname\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 샘플 -->\r\n");
      out.write("\t\t\t\t\t\t<p>그림1</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<button id=\"detail\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/views/product/productdetail.jsp'\">상세보기</button>\r\n");
      out.write("\t\t\t\t\t\t<!-- 상세정보보기로 이동 -->\r\n");
      out.write("\t\t\t\t\t\t<button id=\"book\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/views/product/productpay.jsp'\">구매하기</button>\r\n");
      out.write("\t\t\t\t\t\t<!-- 구매페이지로이동-->\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"rank\"><img class=\"rimage\"\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/slide2.jpg\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 100%; height: 70%;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"mname\">\r\n");
      out.write("\t\t\t\t\t\t<p>그림2</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<button id=\"detail\">상세보기</button>\r\n");
      out.write("\t\t\t\t\t\t<button id=\"book\" onclick=\"location.href='moviePay.mo'\">구매하기</button>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"rank\"><img class=\"rimage\"\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/slide3.jpg\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 100%; height: 70%;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"mname\">\r\n");
      out.write("\t\t\t\t\t\t<p>그림3</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<button id=\"detail\">상세보기</button>\r\n");
      out.write("\t\t\t\t\t\t<button id=\"book\" onclick=\"location.href='moviePay.mo'\">구매하기</button>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"rank\"><img class=\"rimage\"\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/slide4.jpg\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 100%; height: 70%;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"mname\">\r\n");
      out.write("\t\t\t\t\t\t<p>그림4</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<button id=\"detail\">상세보기</button>\r\n");
      out.write("\t\t\t\t\t\t<button id=\"book\" onclick=\"location.href='moviePay.mo'\">구매하기</button>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("   <br><br><br><br><br><br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <footer>\r\n");
      out.write("    \"Copyright © 1998-2019 KH Information Educational Institute All Right Reserved\"\r\n");
      out.write("   </footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
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
}
