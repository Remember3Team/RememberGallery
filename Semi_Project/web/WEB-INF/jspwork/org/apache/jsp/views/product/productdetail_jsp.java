/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-12 04:30:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/product/../common/menubar.jsp", Long.valueOf(1589175904969L));
    _jspx_dependants.put("/views/product/../common/footer.jsp", Long.valueOf(1589256769211L));
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
      out.write("<!-- link rel=\"stylesheet\" href=\"../css/style.css\"-->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"../js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/bootstrap.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("#sumnailimage {\r\n");
      out.write("\tborder: solid 1px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\twidth: 528px;\r\n");
      out.write("\theight: 507px;\r\n");
      out.write("\tmargin-left: 191px;\r\n");
      out.write("\tmargin-right: 20px;\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#data {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\twidth: 760px;\r\n");
      out.write("\theight: 400px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-left: 20px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#simulationMain {\r\n");
      out.write("\tposition : relative;<!--안에 이미지에 대한 기준-->\r\n");
      out.write("\tborder: solid 1px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\twidth: 369px;\r\n");
      out.write("\theight: 358px;\r\n");
      out.write("\tmargin-left: 191px;\r\n");
      out.write("\tmargin-right: 20px;\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write("#simulation1{\r\n");
      out.write("border: solid 1px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\twidth: 121px;\r\n");
      out.write("\theight: 125px;\r\n");
      out.write("\tmargin-left: 50px;\r\n");
      out.write("\tmargin-right: 20px;\r\n");
      out.write("\tmargin-top: 100px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write("#simulation2{\r\n");
      out.write("border: solid 1px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\twidth: 121px;\r\n");
      out.write("\theight: 125px;\r\n");
      out.write("\tmargin-left: 10px;\r\n");
      out.write("\tmargin-right: 20px;\r\n");
      out.write("\tmargin-top: 100px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write("#simulation3{\r\n");
      out.write("border: solid 1px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\twidth: 121px;\r\n");
      out.write("\theight: 125px;\r\n");
      out.write("\tmargin-left: 10px;\r\n");
      out.write("\tmargin-right: 20px;\r\n");
      out.write("\tmargin-top: 100px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#writer {\r\n");
      out.write("\tborder: solid 1px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\twidth: 369px;\r\n");
      out.write("\theight: 358px;\r\n");
      out.write("\tmargin-left: 191px;\r\n");
      out.write("\tmargin-right: 20px;\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write("#data2 {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\twidth: 760px;\r\n");
      out.write("\theight: 358px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-left: 10px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-top: 100px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
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
      out.write("                            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/views/board/amateur/amateurBoard.jsp\">아마추어 게시판</a></li>\r\n");
      out.write("                            <li><a href=\"#\">자유게시판</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\">NOTICE</a>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/list.no\">공지사항</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/views/inquiry/inquiryBoard.jsp\">1:1문의</a></li>\r\n");
      out.write("                        </ul>    \r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("        <!--icon :: 색상변경 또는 없애버리고 메뉴바 만들기-->\r\n");
      out.write("        <div id=\"loginWrap\">\r\n");
      out.write("            <a href =\"#\" class=\"icon\"><img src=\"");
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
      out.write("\t<div id=\"sumnailimage\">\r\n");
      out.write("\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/uploadFiles/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.edit_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\tstyle=\"width: 528px; height: 507px;\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"data\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<div id=\"title\">\r\n");
      out.write("\t\t\t<h3 align=\"left\">작품명</h3>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<hr style=\"margin: 1;\" color=\"black\" width=\"554px\">\r\n");
      out.write("\t\t<a style=\"text-align: left; width: 100px; margin: 0; font-size: 20px; text-decoration: none !important; border-bottom: dotted 0px !important; color: black !important;\">작가명 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.rnum }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("\t\t <a style=\"text-align: left; width: 100px; margin-left: 250px; font-size: 20px; text-decoration: none !important; border-bottom: dotted 0px !important; color: black !important;\">카테고리\r\n");
      out.write("\t\t\t: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.movie_type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a><br> <br> <a\r\n");
      out.write("\t\t\tstyle=\"text-align: left; width: 100px; margin: 0; font-size: 20px; text-decoration: none !important; border-bottom: dotted 0px !important; color: black !important;\">제작년도\r\n");
      out.write("\t\t\t: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.open_date }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a> <a\r\n");
      out.write("\t\t\tstyle=\"text-align: left; width: 100px; margin-left: 230px; font-size: 20px; text-decoration: none !important; border-bottom: dotted 0px !important; color: black !important;\">작품크기\r\n");
      out.write("\t\t\t: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.director_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a><br>\r\n");
      out.write("\t\t<hr style=\"margin: 1;\" color=\"black\" width=\"554px\">\r\n");
      out.write("\t\t<br> <a\r\n");
      out.write("\t\t\tstyle=\"text-align: left; width: 100px; margin-left: 500px; font-size: 20px; text-decoration: none !important; border-bottom: dotted 0px !important; color: black !important;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.director_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("원</a><br>\r\n");
      out.write("\t\t<input type=\"button\" value=\"바로 구매하기\"\r\n");
      out.write("\t\t\tstyle=\"background-color: rgb(224, 224, 224); margin-top: 10px;\"\r\n");
      out.write("\t\t\tonclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/views/product/productpay.jsp'\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<br> <input type=\"button\" value=\"장바구니 담기\"\r\n");
      out.write("\t\t\tstyle=\"background-color: rgb(224, 224, 224); margin-right: 10px; text-decoration: none;\"\r\n");
      out.write("\t\t\tonclick=\"장바구니\"> <br>\r\n");
      out.write("\t\t<br> \r\n");
      out.write("\t\t<input type=\"button\" value=\"Q & A\"\r\n");
      out.write("\t\t\tstyle=\"background-color: rgb(224, 224, 224); margin-right: 10px; text-decoration: none;\"\r\n");
      out.write("\t\t\tonclick=\"q&a\"> <input type=\"hidden\"\r\n");
      out.write("\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ loginUser.mid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"mid\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<input type=\"hidden\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ row.movie_id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" id=\"movie_id\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<br clear=\"both\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<hr style=\"margin-left: 191px;\" color=\"black\" width=\"1128px\">\r\n");
      out.write("\t<br clear=\"both\">\r\n");
      out.write("\t<h3 align=\"center\">인테리어 시뮬레이션</h3>\r\n");
      out.write("\t<div id=\"simulationMain\">\r\n");
      out.write("\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/uploadFiles/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.edit_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\tstyle=\"width: 369px; height: 358px;\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"simulation1\">\r\n");
      out.write("\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/uploadFiles/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.edit_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\tstyle=\"width: 121px; height: 125px;\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"simulation2\">\r\n");
      out.write("\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/uploadFiles/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.edit_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\tstyle=\"width: 121px; height: 125px;\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"simulation3\">\r\n");
      out.write("\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/uploadFiles/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.edit_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\tstyle=\"width: 121px; height: 125px;\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br clear=\"both\">\r\n");
      out.write("\t<hr style=\"margin-left: 191px;\" color=\"black\" width=\"1128px\">\r\n");
      out.write("\t<h3 align=\"center\">작품 소개</h3>\r\n");
      out.write("\t<a style=\"text-align: left; width: 100px; margin-left:300px; font-size: 15px; text-decoration: none !important; border-bottom: dotted 0px !important; color: black !important;\">입벌려 글들어온다.");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.rnum }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<hr style=\"margin-left: 191px;\" color=\"black\" width=\"1128px\">\r\n");
      out.write("\t<h3 align=\"center\">작가 소개</h3>\r\n");
      out.write("\t<div id=\"writer\">\r\n");
      out.write("\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/uploadFiles/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.edit_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\tstyle=\"width: 369px; height: 358px;\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"data2\">\r\n");
      out.write("\t<a style=\"text-align: left; width: 100px; margin-left:30px; font-size: 15px; text-decoration: none !important; border-bottom: dotted 0px !important; color: black !important;\">입벌려 글들어온다.");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.rnum }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br clear=\"both\">\r\n");
      out.write("\t<hr style=\"margin-left: 191px;\" color=\"black\" width=\"1128px\">\r\n");
      out.write("\t<h3 align=\"center\">Q & A</h3>\r\n");
      out.write("\t<br clear=\"both\">\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\tbody {\r\n");
      out.write("\tmargin : 0;}\r\n");
      out.write("\r\n");
      out.write("\t.footer{\r\n");
      out.write("\t\r\n");
      out.write("\tpadding : 20px 0;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("\tbackground-color: black;\r\n");
      out.write("\tcolor : white;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <footer>\r\n");
      out.write("  <div class=\"footer\">\r\n");
      out.write("    \"Copyright © 1998-2019 KH Information Educational Institute All Right Reserved\"\r\n");
      out.write("    </div>\r\n");
      out.write("   </footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
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
