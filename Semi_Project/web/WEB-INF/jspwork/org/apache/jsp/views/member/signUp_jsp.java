/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-18 05:26:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;

public final class signUp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/member/../common/menubar.jsp", Long.valueOf(1589762252090L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
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
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/views/css/Style-signUp.css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"../js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("#idCheck {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#idCheck:hover {\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#idCheck, #goMain, #joinBtn {\r\n");
      out.write("\tbackground:red ;\r\n");
      out.write("\tcolor:white;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\twidth: 80px;\r\n");
      out.write("\theight: 25px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#idCheck:hover, #joinBtn:hover, #goMain:hover {\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td {\r\n");
      out.write("\ttext-align: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#joinBtn {\r\n");
      out.write("\tbackground: yellowgreen;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#joinBtn, #goMain {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');

	Member loginUser = (Member) session.getAttribute("loginUser");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>메뉴바</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/style.css\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
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
      out.write("\tmargin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul li ul li:hover{\r\n");
      out.write("\tbackground-color:red;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<header id=\"menu\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print( request.getContextPath() );
      out.write("/index.jsp\" class=\"logo\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print( request.getContextPath() );
      out.write("/views/img/logo-02.png\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<ul class=\"navi\">\r\n");
      out.write("\t\t\t<li><a href=\"#\">ABOUT</a></li>\r\n");
      out.write("\t\t\t<!-- <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/views/product/product.jsp\">STORE</a></li> -->\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/list.po\">STORE</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">COMMUNITY</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print( request.getContextPath() );
      out.write("/views/board/amateur/amateurBoard.jsp\">아마추어\r\n");
      out.write("\t\t\t\t\t\t\t게시판</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">자유게시판</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">NOTICE</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/list.no\">공지사항</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print( request.getContextPath() );
      out.write("/views/inquiry/inquiryBoard.jsp\">1:1문의</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t");
if(loginUser != null){ 
      out.write("\r\n");
      out.write("\t\t\t<li><a href=\"#\">TEST</a> \r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">마이페이지 소비자</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">My Page(?)</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">장바구니</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Chat</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">1:1문의</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">마이페이지 관리자</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">마이페이지 판매자</a></li>\r\n");
      out.write("\t\t\t\t\t\t<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 11111111111-->\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/logout.me\">로그아웃</a></li>\r\n");
      out.write("\t\t\t\t\t\t<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 111111111111-->\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 222222222222-->\r\n");
      out.write("\t\t <!-- <input type=\"hidden\" id = \"checkLogin\">  -->\r\n");
      out.write("\t\t\t\t<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 22222222222222222-->\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<!--icon :: 색상변경 또는 없애버리고 메뉴바 만들기-->\r\n");
      out.write("\t\t<div id=\"loginWrap\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print( request.getContextPath() );
      out.write("/views/member/signIn.jsp\" class=\"icon\" onclick=\"login_btn();\"><img\r\n");
      out.write("\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/views/img/login2.png\"></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--마이페이지로 넘어가는부분 잠시 수정 -->\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"icon\"><img\r\n");
      out.write("\t\t\t\tsrc=\"");
      out.print( request.getContextPath() );
      out.write("/views/img/search2.png\"></a>\r\n");
      out.write("\t\t</div> <!-- loginWrap 끝 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</header>\t\r\n");
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
      out.write("\t");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<form id=\"joinForm\" action=\"");
      out.print(request.getContextPath());
      out.write("/insert.me\"\r\n");
      out.write("\t\t\tmethod=\"post\" onsubmit=\"return insertMember()\">\r\n");
      out.write("\t\t\t<!--section1-->\r\n");
      out.write("\t\t\t<div class=\"section1\" style=\"padding-bottom: 90px;\">\r\n");
      out.write("\t\t\t\t<h1 style=\"color: black;\">JOIN</h1>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<hr style=\"border: 1px soild black;\">\r\n");
      out.write("\t\t\t\t<span>회원 가입<a style=\"color: red; font-size: 15px;\">*</a></span>\r\n");
      out.write("\t\t\t\t<hr style=\"border: 1px soild black;\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"artregi-infobox\">\r\n");
      out.write("\t\t\t\t\t<div class=\"info-box1\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"labelfirst\" id=\"name\">이름<a\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"color: red; font-size: 15px;\">*</a></label><input\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"nomal-text\" type=\"text\" name=\"userName\" >\r\n");
      out.write("\t\t\t\t\t\t<label id=\"nameresult\"></label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"info-box2\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"labelfirst\" id=\"userId\">아이디<a\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"color: red; font-size: 15px;\">*</a></label><input\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"nomal-text\" type=\"text\" name=\"userId\" required>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"idCheck\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"float: right; width: 100px; height: 20px; background-color: gray; text-align: center; color: white;\">중복확인</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<br> <br>\r\n");
      out.write("\t\t\t\t\t<div class=\"info-box3\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"labelfirst\" id=\"userPwd\">비밀번호<a\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"color: red; font-size: 15px;\">*</a></label><input\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"nomal-text\" type=\"password\" name=\"userPwd\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"info-box4\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"labelfirst\" id=\"userPwd2\">비밀번호 확인<a\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"color: red; font-size: 15px;\">*</a></label> <input\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"nomal-text\" type=\"password\" name=\"userPwd2\">\r\n");
      out.write("\t\t\t\t\t\t<label id=\"pwdResult\">sadaddssd</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br> <br>\r\n");
      out.write("\t\t\t\t\t<div class=\"info-box5\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"labelfirst\">닉네임</label><input class=\"nomal-text\"\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" name=\"nickName\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"info-box6\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"labelfirst\">휴대폰 번호</label>\r\n");
      out.write("\t\t\t\t\t\t&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"tel\" id=\"Phone\" name=\"phone\" value=\"\" maxlength=\"11\"\r\n");
      out.write("\t\t\t\t\t\t\tautocomplete=\"off\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"info-box7\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"labelfirst\">주소<a\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"color: red; font-size: 15px;\">*</a></label> <input\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"nomal-text\" type=\"text\" name=\"address\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"info-box7\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"labelfirst\">이메일</label><input class=\"nomal-text\"\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" name=\"email\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("<!-- \r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"info-box8\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"info-box8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"PrivacyAgree\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"background-color: gray; color: white; text-align: center; width: 400px; height: 20px;\">▽</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"info-box8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea name=\"paint_int\">개인정보수집·이용·제공 동의서 (재)충남테크노파크는 “민간 수출전문가 모집 및 pool 등록”과 관련하여󰡔개인정보보호법󰡕 제15조제1항제1조, \r\n");
      out.write("\t\t\t\t\t\t\t\t제24조제1항제1호에 따라 아래와 같이 개인(신용)정보의 수집·이용에관하여 귀하의 동의를 얻고자 합니다. 1. 개인(신용)정보의 수집·이용에 관한 사항 ① 개인정보의 수집·이용 목적\r\n");
      out.write("\t\t\t\t\t\t\t\tㅇ 귀하의 개인정보는 [(재)충남테크노파크]의 “민간 수출전문가 모집 및 pool 등록”과 관련 하여 전문가pool 등록 및 선정과정, 활용기간 동안의 연락·확인 목적으로 수집·이용됩니다.\r\n");
      out.write("\t\t\t\t\t\t\t\t ② 수집·이용할 개인정보의 항목ㅇ 개인식별 정보(성명, 전자우편주소, (휴대)전화번호) ③ 개인정보의 보유·이용 기간 ㅇ 위 개인정보는 제공된날부터 제공된 목적을 달성할 때까지 보유·\r\n");
      out.write("\t\t\t\t\t\t\t\t 이용되며 보유목적 달성시 또는 정보주체가 삭제를 요청할 경우 지체 없이파기합니다.\r\n");
      out.write("                    </textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"info-box9\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"labelfirst\" style=\"float: right;\"><input\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"\" type=\"checkbox\" name=\"price\">확인 후, 동의하겠습니다.</label>\r\n");
      out.write("\t\t\t\t\t</div> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div><!-- infobox 끝 -->\r\n");
      out.write("\t\t\t\t<br> <br> <br> <br>\r\n");
      out.write("\t\t\t\t<div class=\"submit-box\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<div id=\"goMain\" onclick=\"goMain();\">메인으로</div>\r\n");
      out.write("\t\t\t\t\t<!-- <div id=\"joinBtn\" onclick=\"insertMember();\">가입하기</div> -->\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"가입하기\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div><!-- submit-box 끝 -->\r\n");
      out.write("\t\t\t</div><!-- section 끝-->\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- container 끝-->\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\tfunction goMain(){\r\n");
      out.write("\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction insertMember(){\r\n");
      out.write("\t\talert(\"회원가입이 완료 되었습니다.\");\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//ajax\r\n");
      out.write("\t \t$(function(){\r\n");
      out.write("\t \t\t$(\"#idCheck\").click(function(){\r\n");
      out.write("\t \t\t\tvar userId = $(\"#joinForm input[name = 'userId']\");\r\n");
      out.write("\t \t\t\t\r\n");
      out.write("\t \t\t\tif(!userId || userId.val().length<4){\r\n");
      out.write("\t \t\t\t\talert(\"아이디는 최소 4자리 이상이어야합니다.\");\r\n");
      out.write("\t \t\t\t\tuserId.focus();\r\n");
      out.write("\t \t\t\t}else{\r\n");
      out.write("\t \t\t\t\t$.ajax({\r\n");
      out.write("\t \t\t\t\t\turl: \"");
      out.print(request.getContextPath());
      out.write("/idCheck.me\",\r\n");
      out.write("\t \t\t\t\t\ttype:\"post\",\r\n");
      out.write("\t \t\t\t\t\tdata:{userId : userId.val()},\r\n");
      out.write("\t \t\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t \t\t\t\t\t\tif(data=='fail'){\r\n");
      out.write("\t \t\t\t\t\t\t\talert(\"아이디가 중복 됩니다.\");\r\n");
      out.write("\t \t\t\t\t\t\t\tuserId.focus();\r\n");
      out.write("\t \t\t\t\t\t\t}else{\r\n");
      out.write("\t \t\t\t\t\t\t\talert(\"아이디가 사용가능합니다.\");\r\n");
      out.write("\t \t\t\t\t\t\t\tuserId.attr(\"readonly\",\"true\");\r\n");
      out.write("\t \t\t\t\t\t\t}\r\n");
      out.write("\t \t\t\t\t\t},\r\n");
      out.write("\t \t\t\t\t\terror:function(data){\r\n");
      out.write("\t \t\t\t\t\t\tconsole.log(\"서버 통신 안됨\");\r\n");
      out.write("\t \t\t\t\t\t}\r\n");
      out.write("\t \t\t\t\t\t\r\n");
      out.write("\t \t\t\t\t})\r\n");
      out.write("\t \t\t\t}\r\n");
      out.write("\t \t\t})\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t})\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t$(\"#userName\").change(function(){\r\n");
      out.write("\t\t\t\tvar regExp =/^[가-힣]{2,}$/;\r\n");
      out.write("\t\t\t\tif(regExp.test($this).val()){\r\n");
      out.write("\t\t\t\t\t$(\"#nameresult\").jsp(\"정상입력\").css('color','green');\r\n");
      out.write("\t\t\t\t\t$(this).css(\"background\",\"white\");\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$('#name').val('');\r\n");
      out.write("\t\t\t\t\t$('#nameresult').jsp(\"이름은 한글로 2자 이상이여야합니다.\").css('color','red');\r\n");
      out.write("\t\t\t\t\t$(this).focus().css(\"background\",\"red\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t/* \t\t$(\"#userPwd2\").chacnge(function(){\r\n");
      out.write("\t\t\t\tif($('#userPwd').val()!=$(this).val)\t\t\t\t\r\n");
      out.write("\t\t\t}) */\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}); /* function */\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\t");
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
