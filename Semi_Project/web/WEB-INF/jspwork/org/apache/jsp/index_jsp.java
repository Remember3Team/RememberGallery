/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-27 02:45:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;
import board.amateur.model.vo.*;
import board.notice.model.vo.*;
import java.util.ArrayList;
import product.model.vo.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/common/footer.jsp", Long.valueOf(1590084783000L));
    _jspx_dependants.put("/views/main/main.jsp", Long.valueOf(1590547533000L));
    _jspx_dependants.put("/views/common/menubar.jsp", Long.valueOf(1590546971000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("product.model.vo");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("board.notice.model.vo");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("board.amateur.model.vo");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("<link rel=\"stylesheet\" href=\"views/css/style.css\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"../css/bootstrap.css\"> -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"views/css/MainSlide.css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"views/js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"views/js/bootstrap.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');

	Member loginUser = (Member)session.getAttribute("loginUser");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>메뉴바</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/style.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("/* 로그인 팝업 css */\r\n");
      out.write("/* #LoginBtn input, #memberJoinBtn, #logoutBtn, #myPage {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tbackground: red;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#memberJoinBtn {\r\n");
      out.write("\tbackground: gray;a\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#loginBtn:hover\r\n");
      out.write("      #memberJoinBtn:hover, #logoutBtn:hover, #memberJoinBtn:hover,\r\n");
      out.write("\t#myPage:hover {\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#Login_pop {\r\n");
      out.write("\topacity: 0;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tmargin-top: 70px;\r\n");
      out.write("\t-webkit-transition: all 0.5s;\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\ttext-align:center; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logout, #myPage {\r\n");
      out.write("\tbackground: orangered;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#myPage {\r\n");
      out.write("\tbackground: yellowgreen;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#LoginArea {\r\n");
      out.write("\tbackground: black;\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\theight: 400px;\r\n");
      out.write("\twidth: 350px;\r\n");
      out.write("\tmargin-left: 35%;\r\n");
      out.write("\tborder-radius: 10px;\r\n");
      out.write("\ttext-algin: \"center\";\r\n");
      out.write("\t\r\n");
      out.write(" display:inline-block; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loginArea>form, #userInfo {\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#LoginArea a img {\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tfont-size: 1em;\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\twidth: 40px;\r\n");
      out.write("\tpadding-top: 50px;\r\n");
      out.write("\tpadding-right: 50px;\r\n");
      out.write("}\r\n");
      out.write(" */\r\n");
      out.write("h1 {\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tpadding-top: 80px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputinfo {\r\n");
      out.write("\tmargin: 0 auto !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navi > li > ul{\r\n");
      out.write("\tdisplay:none !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navi > li:hover > ul{\r\n");
      out.write("\tdisplay: block !important;\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("ul li ul li:hover{\r\n");
      out.write("\tbackground-color:red !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<header id=\"menu\">\r\n");
      out.write("\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print( request.getContextPath() );
      out.write("/amateur.master\" class=\"logo\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print( request.getContextPath() );
      out.write("/views/img/logo-02.png\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<ul class=\"navi\">\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/views/about/about.jsp\">ABOUT</a></li>\r\n");
      out.write("\t\t\t<!-- <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/views/product/product.jsp\">STORE</a></li> -->\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/list.po\">STORE</a></li >\r\n");
      out.write("\t\t\t<li><a href=\"#\">COMMUNITY</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/list.am\">아마추어 게시판</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/list.ee\">자유게시판</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">NOTICE</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/list.no\">공지사항</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/list.in\">1:1문의</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 222222222222-->\r\n");
      out.write("\t\t <!-- <input type=\"hidden\" id = \"checkLogin\">  -->\r\n");
      out.write("\t\t\t\t<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 22222222222222222-->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<div id=\"loginWrap\" >\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<ul class=\"navi\">\r\n");
      out.write("\t\t\t ");
if(loginUser != null){ 
      out.write(" \r\n");
      out.write("\t\t\t<li style=\"width: 150px !important; padding:12px !important;\"> <img\r\n");
      out.write("\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/views/img/login1.png\" style=\"width:30px !important; \"></a>\r\n");
      out.write("\t\t\t\t<ul style=\"width:150px !important; display:flex !important; justify-content:center !important; flex-direction:column !important; margin-left: -12px !important;\" >\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/Mo.li\">마이페이지 소비자</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">마이페이지 관리자</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/PM.list\">마이페이지 판매자</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/logout.me\">로그아웃</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t\t<a href=\"");
      out.print( request.getContextPath() );
      out.write("/views/member/signIn.jsp\" class=\"icon1\"><img\r\n");
      out.write("\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/views/img/login2.png\"  style=\"width:30px; \"></a>\r\n");
      out.write("\t\t\t");
 } 
      out.write(" \r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<!--마이페이지로 넘어가는부분 잠시 수정 -->\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t</div> <!-- loginWrap 끝 -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!--icon :: 색상변경 또는 없애버리고 메뉴바 만들기-->\r\n");
      out.write("\r\n");
      out.write("\t</header>\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<!--  로그인 팝업창 보류 --><!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 3333333333333-->\r\n");
      out.write("<!-- \t\t\t<script>\r\n");
      out.write("\t\t\t\t$(function (){\r\n");
      out.write("\t\t\t\t\tif($(\"#checkLogin\").length>0){\r\n");
      out.write("\t\t\t\t\t\t$(\"#LoginArea\").css(\"display\",\"none\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t</script> -->\r\n");
      out.write("\t<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 3333333333333333-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t/*로그인 입력 안했을 시 => alter창 또는 팝업창 띄운 후, error 페이지로 연결*/\r\n");
      out.write("\t\tfunction validate() {\r\n");
      out.write("\t\t\tif ($(\"#userId\").val().trim().length == 0) {\r\n");
      out.write("\t\t\t\talert(\"아이디를 입력하세요\");\r\n");
      out.write("\t\t\t\t$(\"#userId\").focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t//비밀번호를 입력하지 않았을 때\r\n");
      out.write("\t\t\tif ($(\"#userPwd\").val().trim().length == 0) {\r\n");
      out.write("\t\t\t\talert(\"비밀번호를 입력하세요\");\r\n");
      out.write("\t\t\t\t$(\"#userPwd\").focus();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<br clear=\"both\">\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("\r\n");
      out.write("<section> <!-- 메인 슬라이드 -->\r\n");
      out.write("\n");
      out.write("\t\t<div id=\"contents\">\r\n");
      out.write("\t\t\t<div class=\"part1\">\r\n");
      out.write("\t\t<!-- \t\t<div class=\"slide\">\r\n");
      out.write("\t\t\t\t\t<h1 align=\"center\">REMEMBER ART</h1>\r\n");
      out.write("\t\t\t\t\t <a href=\"#\"><img src=\"views/img/slide1.jpg\" style=\"height: auto;\"> </a>\r\n");
      out.write("            <a href=\"#\"><img src=\"\"></a>\r\n");
      out.write("            <a href=\"#\"><img src=\"\"></a>    -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"slider-wrap\" style = \"position:relative; margin:-18px auto;\">\r\n");
      out.write("\t\t\t\t\t\t<ul id=\"slider\" >\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- <h3>Slide #2</h3>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Sammy1</span> \r\n");
      out.write("\t\t\t\t\t\t\t\t</div> <a href=\"");
      out.print(request.getContextPath());
      out.write("/views/mypage_artist/art-apply.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/views/img/slide6.jpg\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<!--  \t<h3>Slide #1</h3>-->\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- <span>작가제휴 바로가기</span>  -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t <button class=\"btn btn-outline-dark\" style=\" position:absolute; width:120px; height : 50px; margin-top: 10px;\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick= \"location.href='");
      out.print(request.getContextPath());
      out.write("/view.ap\">sammy</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/views/img/slide4.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- \t<h3>Slide #3</h3>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Sammy2</span> \r\n");
      out.write("\t\t\t\t\t\t\t\t</div> <a href=\"");
      out.print(request.getContextPath());
      out.write("/list.ar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/views/img/slide5.jpg\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"slider-btns\" id=\"next\" >\r\n");
      out.write("\t\t\t\t\t\t\t<span>▶</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"slider-btns\" id=\"previous\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>◀</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=\"slider-pagination-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\" margin-top: 35%;\">\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--slide end-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--part1 end-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\t//slide-wrap\r\n");
      out.write("\t\t\t\tvar slideWrapper = document.getElementById('slider-wrap');\r\n");
      out.write("\t\t\t\t//current slideIndexition\r\n");
      out.write("\t\t\t\tvar slideIndex = 0;\r\n");
      out.write("\t\t\t\t//items\r\n");
      out.write("\t\t\t\tvar slides = document.querySelectorAll('#slider-wrap ul li');\r\n");
      out.write("\t\t\t\t//number of slides\r\n");
      out.write("\t\t\t\tvar totalSlides = slides.length;\r\n");
      out.write("\t\t\t\t//get the slide width\r\n");
      out.write("\t\t\t\tvar sliderWidth = slideWrapper.clientWidth;\r\n");
      out.write("\t\t\t\t//set width of items\r\n");
      out.write("\t\t\t\tslides.forEach(function(element) {\r\n");
      out.write("\t\t\t\t\telement.style.width = sliderWidth + 'px';\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\t//set width to be 'x' times the number of slides\r\n");
      out.write("\t\t\t\tvar slider = document.querySelector('#slider-wrap ul#slider');\r\n");
      out.write("\t\t\t\tslider.style.width = sliderWidth * totalSlides + 'px';\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// next, prev\r\n");
      out.write("\t\t\t\tvar nextBtn = document.getElementById('next');\r\n");
      out.write("\t\t\t\tvar prevBtn = document.getElementById('previous');\r\n");
      out.write("\t\t\t\tnextBtn.addEventListener('click', function() {\r\n");
      out.write("\t\t\t\t\tplusSlides(1);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\tprevBtn.addEventListener('click', function() {\r\n");
      out.write("\t\t\t\t\tplusSlides(-1);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// hover\r\n");
      out.write("\t\t\t\tslideWrapper.addEventListener('mouseover', function() {\r\n");
      out.write("\t\t\t\t\tthis.classList.add('active');\r\n");
      out.write("\t\t\t\t\tclearInterval(autoSlider);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\tslideWrapper.addEventListener('mouseleave', function() {\r\n");
      out.write("\t\t\t\t\tthis.classList.remove('active');\r\n");
      out.write("\t\t\t\t\tautoSlider = setInterval(function() {\r\n");
      out.write("\t\t\t\t\t\tplusSlides(1);\r\n");
      out.write("\t\t\t\t\t}, 3000); \r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tfunction plusSlides(n) {\r\n");
      out.write("\t\t\t\t\tshowSlides(slideIndex += n);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tfunction currentSlides(n) {\r\n");
      out.write("\t\t\t\t\tshowSlides(slideIndex = n);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tfunction showSlides(n) {\r\n");
      out.write("\t\t\t\t\tslideIndex = n;\r\n");
      out.write("\t\t\t\t\tif (slideIndex == -1) {\r\n");
      out.write("\t\t\t\t\t\tslideIndex = totalSlides - 1;\r\n");
      out.write("\t\t\t\t\t} else if (slideIndex === totalSlides) {\r\n");
      out.write("\t\t\t\t\t\tslideIndex = 0;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tslider.style.left = -(sliderWidth * slideIndex) + 'px';\r\n");
      out.write("\t\t\t\t\tpagination();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t//pagination\r\n");
      out.write("\t\t\t\tslides.forEach(function() {\r\n");
      out.write("\t\t\t\t\tvar li = document.createElement('li');\r\n");
      out.write("\t\t\t\t\tdocument.querySelector('#slider-pagination-wrap ul')\r\n");
      out.write("\t\t\t\t\t\t\t.appendChild(li);\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tfunction pagination() {\r\n");
      out.write("\t\t\t\t\tvar dots = document\r\n");
      out.write("\t\t\t\t\t\t\t.querySelectorAll('#slider-pagination-wrap ul li');\r\n");
      out.write("\t\t\t\t\tdots.forEach(function(element) {\r\n");
      out.write("\t\t\t\t\t\telement.classList.remove('active');\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\tdots[slideIndex].classList.add('active');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tpagination();\r\n");
      out.write("\t\t\t\tvar autoSlider = setInterval(function() {\r\n");
      out.write("\t\t\t\t\tplusSlides(1);\r\n");
      out.write("\t\t\t\t}, 3000);\r\n");
      out.write("\t\t\t</script> <!-- 슬라이드 스크립트 끝 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--part2 end 마스터 피스 부분-->\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<!--part3 end 마스터 피스 부분-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!--content end-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 새미언니 버튼 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★ -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');

	Amateur a = new Amateur();
	ArrayList<Amateur> list = ((ArrayList<Amateur>)request.getAttribute("masterList"));
	ArrayList<FileManagement> fileList = ((ArrayList<FileManagement>)request.getAttribute("masterFileList"));
	
	product p = new product();
	ArrayList<product> proList = ((ArrayList<product>)request.getAttribute("masterProList"));
	ArrayList<Attachment> profileList = ((ArrayList<Attachment>)request.getAttribute("masterProFileList"));
	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/bootstrap.css\">\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/views/js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/views/js/bootstrap.js\"></script>    \r\n");
      out.write("\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\" rel=\"stylesheet\"> \r\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"../css/style.css\"> -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"../css/bootstrap.css\"> -->\r\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"../css/MainSlide.css\"> -->\r\n");
      out.write("\r\n");
      out.write("<script src=\"../js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/bootstrap.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\t.PaintMasterpiece-title{margin:0 auto;margin-top:80px; margin-bottom:80px;}\r\n");
      out.write("\t.PaintMasterpiece-title span{margin-left:350px;font-size:34px;}\r\n");
      out.write("\t/* .PaintMasterpiece-title hr{background-color:red; border:2px solid red; margin-bottom:10px;} */\r\n");
      out.write("\t.AmateurMasterpiece-title{margin:0 auto;margin-top:80px; margin-bottom:80px;}\r\n");
      out.write("\t.AmateurMasterpiece-title span{margin-left:350px;font-size:34px;}\r\n");
      out.write("/* \t.AmateurMasterpiece-title hr{background-color:red; border:2px solid red; margin-bottom:10px;} */\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("   <section>\r\n");
      out.write("       <div id =\"contents\" >\r\n");
      out.write("\r\n");
      out.write("   <div class=\"container\">\r\n");
      out.write("   \t\t<div class=\"PaintMasterpiece-title\">\r\n");
      out.write("   \t  \t\t<span> Masterpiece of this month - Pro</span>\r\n");
      out.write("   \t  \t\t<hr>\r\n");
      out.write("   \t  \t</div>\r\n");
      out.write("      \t<div class=\"row\">\r\n");
      out.write("\t\t");
if(proList.isEmpty()){
      out.write("\r\n");
      out.write("          \t<span style=\"font-size:30px; margin:0 auto\">마스터피스 집계 중입니다.</span>\r\n");
      out.write("     \t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t");
for(int i=0;i<proList.size();i++){ 
      out.write("\r\n");
      out.write("\t    \t\t");
 p = proList.get(i); 
      out.write("\r\n");
      out.write("\t       \t\t");
if(p.getPaint_no()!=0){ 
      out.write("\r\n");
      out.write("\t          \t\t<div id=\"goDetail\" class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("\t\t\t       \t   <div class=\"card h-100\">\r\n");
      out.write("\t\t\t\t\t   ");
for(int j=0; j<profileList.size();j++){ 
			            	Attachment at = profileList.get(j);
      out.write("\r\n");
      out.write("\t\t\t\t\t      \t");
if(p.getPaint_no()==at.getPaint_no()){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t       \t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t         \t\t\t<img class=\"card-img-top\" src=\"");
      out.print(request.getContextPath() );
      out.write("/thumbnail_uploadFiles/");
      out.print(at.getSavefileName() );
      out.write("\" alt=\"\">\r\n");
      out.write("\t\t\t             \t\t</a>\r\n");
      out.write("\t\t\t              \t");
} 
      out.write("<!-- if a.getEventNo()==fm.getEvent_no end -->\r\n");
      out.write("     \t\t\t        ");
} 
      out.write("<!--fileList for loop end --> \t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body\">\t\t              \t\t\r\n");
      out.write("\t\t\t\t           \t\t<input id=\"event_no\" type=\"hidden\" value=\"");
      out.print(p.getPaint_no());
      out.write("\">\r\n");
      out.write("\t\t\t\t           \t\t<h4 class=\"card-title\"><a href=\"#\"><p style=\"color:black\">");
      out.print(p.getPaint_name() );
      out.write("</p></a></h4>\r\n");
      out.write("\t\t\t\t              \t<h5>");
      out.print(p.getArtist_name() );
      out.write("</h5>\r\n");
      out.write("\t\t\t\t            </div><!-- class card-body end -->\t\r\n");
      out.write("\t\t         \t\t</div><!-- class card end -->\r\n");
      out.write("\t\t\t\t   </div><!-- id goDetail end --> \r\n");
      out.write("\t\t\t");
} 
      out.write("<!-- if a.getEvent_no end -->\r\n");
      out.write("          ");
}
      out.write("<!-- list for loop end -->\r\n");
      out.write("       ");
} 
      out.write("\r\n");
      out.write("                \r\n");
      out.write("         </div> <!-- /.row --> \r\n");
      out.write("   \r\n");
      out.write("      <br><br><br><br><br><br>\r\n");
      out.write("   \t  <div class=\"AmateurMasterpiece-title\">\r\n");
      out.write("   \t  \t\t<span> Masterpiece of this month - Amateur </span>\r\n");
      out.write("   \t  \t\t<hr>\r\n");
      out.write("   \t  \t</div>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("\t\t\t");
if(list.isEmpty()){
      out.write("\r\n");
      out.write("          \t\t<span style=\"font-size:30px;\">마스터피스 집계 중입니다.</span>\r\n");
      out.write("          \t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t");
for(int i=0;i<list.size();i++){ 
      out.write("\r\n");
      out.write("\t        \t\t");
 a = list.get(i); 
      out.write("\r\n");
      out.write("\t        \t\t");
if(a.getEvent_no()!=0){ 
      out.write("\r\n");
      out.write("\t          \t\t\t<div id=\"goDetail\" class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("\t\t\t       \t\t\t<div class=\"card h-100\">\r\n");
      out.write("\t\t\t\t\t\t\t");
for(int j=0; j<fileList.size();j++){ 
			              		FileManagement fm = fileList.get(j);
      out.write("\r\n");
      out.write("\t\t\t\t\t              \t");
if(a.getEvent_no()==fm.getEvent_no()){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t             \t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t             \t\t\t<img class=\"card-img-top\" src=\"");
      out.print(request.getContextPath() );
      out.write("/thumbnail_uploadFiles/amateur/");
      out.print(fm.getEvent_file() );
      out.write("\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t             \t\t</a>\r\n");
      out.write("\t\t\t\t\t              \t");
} 
      out.write("<!-- if a.getEventNo()==fm.getEvent_no end -->\r\n");
      out.write("\t\t\t\t\t        ");
} 
      out.write("<!--fileList for loop end --> \t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body\">\t\t              \t\t\r\n");
      out.write("\t\t\t              \t\t<input id=\"event_no\" type=\"hidden\" value=\"");
      out.print(a.getEvent_no() );
      out.write("\">\r\n");
      out.write("\t\t\t              \t\t<h4 class=\"card-title\"><a href=\"#\"><p style=\"color:black\">");
      out.print(a.getEvent_title() );
      out.write("</p></a></h4>\r\n");
      out.write("\t\t\t                \t<h5>");
      out.print(a.getUser_id() );
      out.write("</h5>\r\n");
      out.write("\t\t\t                </div><!-- class card-body end -->\t\r\n");
      out.write("\t\t\t\t    \t</div><!-- class card end -->\r\n");
      out.write("\t\t\t\t   \t</div><!-- id goDetail end --> \r\n");
      out.write("\t\t\t");
} 
      out.write("<!-- if a.getEvent_no end -->\r\n");
      out.write("          ");
}
      out.write("<!-- list for loop end -->\r\n");
      out.write("       ");
} 
      out.write("\r\n");
      out.write("                \r\n");
      out.write("         </div> <!-- /.row --> \r\n");
      out.write("       <div class=\"part1\">\r\n");
      out.write("      <!--       <div class=\"slide\">\r\n");
      out.write("                <h1 align=\"center\">REMEMBER ART</h1>\r\n");
      out.write("            <a href=\"#\"><img src=\"views/img/slide1.jpg\" style=\"height: auto;\"> </a>\r\n");
      out.write("            <a href=\"#\"><img src=\"\"></a>\r\n");
      out.write("            <a href=\"#\"><img src=\"\"></a>    \r\n");
      out.write("            </div> slide end       -->\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <button class=\"btn btn-outline-dark\" style=\" width : 120px; height : 50px; margin-top: 10px;\"\r\n");
      out.write("\t\t\tonclick= \"location.href='");
      out.print(request.getContextPath());
      out.write("/view.ap'\">sammy</button>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("  </div><!-- container end -->\r\n");
      out.write("       \r\n");
      out.write("    </div> <!--content end-->\r\n");
      out.write("   </section>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--content end-->\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\r\n");
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
      out.write("\twidth : 100%;\r\n");
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
      out.write("  <div class=\"footer\" style = \"width : 100%\">\r\n");
      out.write("    \"Copyright © 1998-2019 KH Information Educational Institute All Right Reserved\"\r\n");
      out.write("    </div>\r\n");
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
