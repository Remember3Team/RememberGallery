/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-24 09:19:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.mypage_005fartist;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypage_artist.management.model.vo.*;
import artistapply.model.vo.*;
import artistapply.model.vo.*;
import board.notice.model.vo.PageInfo;
import java.util.ArrayList;
import member.model.vo.Member;
import artistapply.model.vo.*;

public final class detail_005forder_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/mypage_artist/../common/menubar.jsp", Long.valueOf(1590296642087L));
    _jspx_dependants.put("/views/mypage_artist/../common/mypagehead.jsp", Long.valueOf(1590116110775L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("artistapply.model.vo");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("mypage_artist.management.model.vo");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("board.notice.model.vo.PageInfo");
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
      out.write("    ");

    	ArrayList<Mypage_artist> DOV_plist = (ArrayList<Mypage_artist>)request.getAttribute("DOV_plist");
    	ArrayList<Mypage_artist> DOV_dlist = (ArrayList<Mypage_artist>)request.getAttribute("DOV_dlist");
    	ArrayList<Mypage_artist> DOV_slist = (ArrayList<Mypage_artist>)request.getAttribute("DOV_slist");
    	/* Apply aphoto = (Apply) request.getAttribute("aphoto"); */
    	
    
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang='ko'>\r\n");
      out.write("    <head> \r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <title>주문 상세 보기</title>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\t\t  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/bootstrap.css\">\r\n");
      out.write("\t\t<script src=\"../js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"../js/bootstrap.js\"></script> \r\n");
      out.write("        <style>\r\n");
      out.write("            #mypage_text{\r\n");
      out.write("                font-size: 2em;\r\n");
      out.write("                margin-left: 100px;\r\n");
      out.write("                font-family:Verdana, Geneva, Tahoma, sans-serif;\r\n");
      out.write("            }\r\n");
      out.write("            #artist{\r\n");
      out.write("                margin-left: auto;\r\n");
      out.write("            }\r\n");
      out.write("            td{\r\n");
      out.write("                padding: 5px;\r\n");
      out.write("            }\r\n");
      out.write("            #info_change, #card_check{\r\n");
      out.write("                width: 150px;\r\n");
      out.write("            }  \r\n");
      out.write("            b{\r\n");
      out.write("                font-family:Verdana, Geneva, Tahoma, sans-serif;\r\n");
      out.write("            }\r\n");
      out.write("            #mypage_nav > ul > li > a{\r\n");
      out.write("                padding-left: 80px;\r\n");
      out.write("                padding-right: 80px;\r\n");
      out.write("                padding-top: 10px;\r\n");
      out.write("                padding-bottom: 10px;\r\n");
      out.write("                font-size: 1.2em;\r\n");
      out.write("                color: white;\r\n");
      out.write("                transition: all 0.5s;\r\n");
      out.write("            }\r\n");
      out.write("            #mypage_nav > ul > li > a:hover{\r\n");
      out.write("                color: rgb(182, 5, 5);\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("           \r\n");
      out.write("            select:hover{\r\n");
      out.write("                border-color: royalblue;\r\n");
      out.write("            }\r\n");
      out.write("            select{\r\n");
      out.write("                transition: 0.5s;\r\n");
      out.write("            }\r\n");
      out.write("            td{\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            .info{\r\n");
      out.write("                margin-left: 200px;\r\n");
      out.write("            }\r\n");
      out.write("            #t{\r\n");
      out.write("                border: 1px solid black;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("    ");
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
      out.write("\tmargin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navi > li > ul{\r\n");
      out.write("\tdisplay:none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navi > li:hover > ul{\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("/list.po\">STORE</a></li >\r\n");
      out.write("\t\t\t<li><a href=\"#\">COMMUNITY</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print( request.getContextPath() );
      out.write("/list.am\">아마추어\r\n");
      out.write("\t\t\t\t\t\t\t게시판</a></li>\r\n");
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
      out.write("\t\t\t");
if(loginUser != null){ 
      out.write("\r\n");
      out.write("\t\t\t<li><a href=\"#\">TEST</a> \r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/Mo.li\">마이페이지 소비자</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">My Page(?)</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">장바구니</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Chat</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">1:1문의</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">마이페이지 관리자</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">마이페이지 판매자</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/logout.me\">로그아웃</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
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
      out.write("    <div class=\"headline\">\r\n");
      out.write("        <div class=\"headline-text\">\r\n");
      out.write("            <hr>\r\n");
      out.write("            <h3 style=\"font-size: 20px;\"> 작가 마이페이지</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"headline-subbox\">\r\n");
      out.write("            <div class=\"artist-img\">\r\n");
      out.write("                <!--Artist Image-->\r\n");
      out.write("\t\t\t\t");
      out.write("            </div>\r\n");
      out.write("            <div class=\"artist-button\">\r\n");
      out.write("                <button style=\"margin-bottom: 3px;\">정보수정</button>\r\n");
      out.write("                <button>감동카드 확인</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t");
      out.write("\n");
      out.write("    \n");
      out.write("    ");

/*     Apply aphoto = (Apply)request.getAttribute("aphoto"); */
    
      out.write("\n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>MyPage Head</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/Style-mypagehead.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"second-menu\">\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/PM.list\">상품 관리</a></li><a>|</a>\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/OM.list\">주문 관리</a></li><a>|</a>\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/SM.list\">배송 관리</a></li><a>|</a>\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/list.ar\">반품 / 환불 관리</a></li><a>|</a>\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/list.qna\">문의 내역</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <br><br>\r\n");
      out.write("        <h3 align=\"center\">주문 상세 보기</h3>\r\n");
      out.write("        <br>\r\n");
      out.write("        <hr>\r\n");
      out.write("\r\n");
      out.write("        <br><br><br>\r\n");
      out.write("        <form>\r\n");
      out.write("            <h3 class=\"info\"><b>주문 상품</b></h3>\r\n");
      out.write("            <div class=\"container\" >\r\n");
      out.write("                <table class=\"table table-dark table-striped  table-hover\" >\r\n");
      out.write("                <tr >\r\n");
      out.write("                    <td>주문번호</td>\r\n");
      out.write("                    <td>이미지</td>\r\n");
      out.write("                    <td>상품정보</td>\r\n");
      out.write("                    <td>금액</td>\r\n");
      out.write("                    <td>처리상태</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
 for(Mypage_artist ma : DOV_plist){ 
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print(ma.getOrder_no() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(ma.getAfile() );
      out.write("</td>\r\n");
      out.write("                    <td>작품명 : ");
      out.print(ma.getPaint_name() );
      out.write("<br> 작가명 : ");
      out.print(ma.getArtist_name() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(ma.getPaint_price() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(ma.getOrder_status() );
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
} 
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br><br><br>\r\n");
      out.write("            <h3 class=\"info\"><b>결제 정보</b></h3>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <table class=\"table table-dark table-striped table-hover\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>입금자</td>\r\n");
      out.write("                        <td>결제 방법</td>\r\n");
      out.write("                        <td>연락처</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
 for(Mypage_artist ma : DOV_dlist){ 
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>");
      out.print(ma.getOrder_name() );
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(ma.getPay_type() );
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(ma.getOrder_phone() );
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br><br><br>\r\n");
      out.write("            <h3 class=\"info\"><b>배송 정보</b></h3>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <table class=\"table table-dark table-striped table-hover\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>수령인</td>\r\n");
      out.write("                        <td>배송지</td>\r\n");
      out.write("                        <td>배송 메시지</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
 for(Mypage_artist ma : DOV_slist){ 
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>");
      out.print(ma.getRec_name() );
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(ma.getRec_add() );
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(ma.getRec_message() );
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("    <br><br><br><br><br><br><br><br><br>\r\n");
      out.write("\t<br><br><br><br><br><br><br><br><br>\r\n");
      out.write("    <br><br><br><br><br><br><br><br><br>\r\n");
      out.write("\t<br><br><br><br><br><br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bootstrap.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
