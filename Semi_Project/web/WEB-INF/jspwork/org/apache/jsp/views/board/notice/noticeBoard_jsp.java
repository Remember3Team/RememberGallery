/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-26 07:22:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import board.notice.model.vo.*;
import java.util.ArrayList;
import member.model.vo.Member;

public final class noticeBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/board/notice/../../common/menubar.jsp", Long.valueOf(1590477602405L));
    _jspx_dependants.put("/views/board/notice/../../common/footer.jsp", Long.valueOf(1590116110993L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("board.notice.model.vo");
    _jspx_imports_packages.add("javax.servlet.http");
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

      out.write('\n');

	ArrayList<Notice> list = ((ArrayList<Notice>)request.getAttribute("list"));
	
	PageInfo pi = (PageInfo)request.getAttribute("pi");

	int listCount = pi.getListCount();
	int currentPage = pi.getCurrentPage();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
	

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>공지사항</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/bootstrap.css\">\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/views/js/jquery-3.4.1.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/views/js/bootstrap.js\"></script>    \n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/style.css\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\" rel=\"stylesheet\"> \n");
      out.write("\n");
      out.write(" <style>\n");
      out.write(" \t#insertNotice{ float:right; margin-right:100px; }\n");
      out.write(" \t#noticeList div{margin: 0 auto;}\n");
      out.write(" \t#noticeCorner {margin-top:40px;} \n");
      out.write("\t#subnav{ float: left; margin-left:20px;}\n");
      out.write("\t.headLine{ float:left; width:30%; /*margin-top:90px; margin-left:90px; margin-bottom:50px;*/ display:block; box-sizing:border-box;}\n");
      out.write("\t.headLine hr{ background-color:red; width:25px; border:2px solid red; margin-bottom:10px;}\n");
      out.write(" \ttable{ margin-top:30px; }\n");
      out.write(" \t#noticeCorner .col-sm-6 { box-sizing:border-box; float:left; width:70%; margin:0; padding:0; }\n");
      out.write(" \t#noticeList:after { display:block; content:\"\"; clear:both; }\n");
      out.write(" \t#noticeList { width:1800px; margin: 20px auto 0; }\n");
      out.write(" \t.p-parents { display: flex; flex-direction: column; justify-content: center; align-items: center; margin: 0 auto; }\n");
      out.write("    .pppp { display: flex; text-align: center; margin : 50px auto; background: rgb(255, 255, 255); height: 36px; border : 1px solid black; border-radius: 5px; justify-content: center; align-items: center; }\n");
      out.write("    .pppp > ol > li:first-child { border-left : 1px solid black; }\n");
      out.write("    .pppp > a { display: inline-flex; justify-content: center; align-items: center; padding: 7px 12px; font-size: 13px; font-weight: 500; color:#9c9c9c; text-decoration: none; }\n");
      out.write("\t.pppp > ol { display: inline-flex; list-style: none; justify-content: center; align-items: center; }\n");
      out.write("    .pppp > ol > li { display: inline-flex; list-style: none; justify-content: center; align-items: center; margin-top: 16px; border-right: 1px solid; vertical-align: middle; list-style: none; width: 36px; height: 34px; text-decoration: none; }\n");
      out.write("  \t.page-list1 { background-color:#c82c1f; }\n");
      out.write("    .page-cur { font-size : 14px; background:none; color: white; padding : 0; border-style : none; }\n");
      out.write("    .page-nocur { font-size: 14px; background:none; color: #c82c1f; padding : 0; border-style : none; }\n");
      out.write("    .page-a:hover { color: black; text-decoration:none; }\n");
      out.write(" </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- Navigation에서 Notice>공지사항 눌렀을 때 나오는 페이지 (계연) -->\n");
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
      out.write("/amateur.master\" class=\"logo\">\r\n");
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
      out.write("\t\t\t<ul class=\"navi\" style=\"margin-right:40px;\">\r\n");
      out.write("\t\t\t ");
if(loginUser != null){ 
      out.write(" \r\n");
      out.write("\t\t\t<li style=\"width: 80px;height:20px;\"> <img\r\n");
      out.write("\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/views/img/login1.png\" style=\"width:30px; \"></a>\r\n");
      out.write("\t\t\t\t<ul style=\"width:150px; padding-right:30px;\" >\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/Mo.li\">마이페이지 소비자</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">장바구니</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Chat</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">1:1문의</a></li>\r\n");
      out.write("\r\n");
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
      out.write("/views/member/signIn.jsp\" class=\"icon1\" onclick=\"login_btn();\"><img\r\n");
      out.write("\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/views/img/login2.png\"  style=\"width:30px; paading-bottom:10px;\"></a>\r\n");
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
      out.write("\t");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<div id=\"noticeCorner\" class=\"containter\">\n");
      out.write("\t\t<div id=\"noticeList\" class=\"row\" style=\"display:block\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- Notice 게시판 Logo -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"headLine\">\n");
      out.write("\t\t\t\t<hr style=\"display:inline-block;\">\n");
      out.write("\t\t\t\t<h3 style=\"font-size:20px;\">Notice</h3>\n");
      out.write("\t\t\t</div><!-- class headLine end -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t <div class=\"col-sm-6\" style=\"text-align:center !important; display:block; margin-top:140px; margin-bottom:200px;\">\n");
      out.write("\t\t\t\t\t<table class=\"table table-hover\" id=\"listArea\" style=\"text-align:center;\">\n");
      out.write("\t\t\t\t  \t\t<thead>\n");
      out.write("\t\t\t\t    \t\t<tr>\n");
      out.write("\t\t\t\t      \t\t\t<th class=\"text-center\">게시글 번호</th>\n");
      out.write("\t\t\t\t      \t\t\t<th class=\"text-center\">내용</th>\n");
      out.write("\t\t\t\t      \t\t\t<th class=\"text-center\">작성자</th>\n");
      out.write("\t\t\t\t      \t\t\t<th class=\"text-center\">작성일</th>\n");
      out.write("\t\t\t\t    \t\t</tr>\n");
      out.write("\t\t\t\t  \t\t</thead>\n");
      out.write("\t\t\t\t  \t\t<tbody>\n");
      out.write("\t\t\t\t  \t\t");
if(list.isEmpty()){ 
      out.write("\n");
      out.write("\t\t\t\t  \t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"text-center\" colspan=\"4\" style=\" margin:0 auto; margin-top:140px; margin-bottom:240px; width:100%\">\n");
      out.write("          \t\t\t    \t\t\t\t\t\t게시글이 존재하지 않습니다.\n");
      out.write("          \t\t\t\t\t\t</td>\n");
      out.write("   \t\t\t\t  \t\t\t</tr>\n");
      out.write("\t\t\t\t  \t\t");
}else{ 
      out.write("\t\t\t\t   \t\t\t\t\n");
      out.write("\t\t\t\t\t  \t\t\t");
for(Notice n:list){ 
      out.write("\n");
      out.write("\t\t\t\t\t    \t\t\t");
if(n.getNoti_no()!=0){ 
      out.write("\n");
      out.write("\t\t\t\t\t\t\t    \t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t    \t\t\t<input type=\"hidden\" value=\"");
      out.print(n.getNoti_no() );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-center\">");
      out.print(n.getNoti_no() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t      \t\t\t<td class=\"text-center\">");
      out.print(n.getNoti_title() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t      \t\t\t<td class=\"text-center\">관리자</td>\n");
      out.write("\t\t\t\t\t\t\t      \t\t\t<td class=\"text-center\">");
      out.print(n.getNoti_date() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t    \t\t</tr>\n");
      out.write("\t\t\t\t\t    \t\t");
}
      out.write("\n");
      out.write("\t\t\t\t\t    \t");
} 
      out.write("\n");
      out.write("\t\t\t\t    \t");
} 
      out.write("\n");
      out.write("\t\t\t\t  \t\t</tbody>\n");
      out.write("\t\t\t\t\t</table><!-- class table end -->\n");
      out.write("\t\t\t\t</div><!--class col-sm-6 end -->\n");
      out.write("\t\t\t</div><!-- id noticeList end -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t<!-- Pagination -->\n");
      out.write("\t<div class = \"p-parents\" style=\"margin-right:0px;\">\n");
      out.write("\t<div class=\"pppp\" style=\"margin-left:1000px\">\n");
      out.write("\t\t\t");
if (currentPage == 1) { 
      out.write("\n");
      out.write("            <a style = \"color:#9c9c9c; \"  disabled>Previous</a>\n");
      out.write("            ");
}else {
      out.write("\n");
      out.write("            <a class = \"page-a\" href=\"");
      out.print(request.getContextPath() );
      out.write("/list.no?currentPage=");
      out.print(currentPage - 1 );
      out.write("\" >Previous</a>\n");
      out.write("            ");
} 
      out.write("\n");
      out.write("            <ol>\n");
      out.write("            ");
for(int p = startPage ; p<=endPage ; p++){ 
      out.write("\n");
      out.write("            ");
if(currentPage == p){ 
      out.write("\n");
      out.write("              <li class = \"page-list1\"><button disabled class = \"page-cur\" >");
      out.print(p);
      out.write("</button></li>\n");
      out.write("            ");
} else { 
      out.write("\n");
      out.write("              <li class = \"page-list2\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/list.no?currentPage=");
      out.print(p);
      out.write("'\"><button class = \"page-nocur\">");
      out.print(p);
      out.write("</button></li>\n");
      out.write("            ");
} 
      out.write("\n");
      out.write("            ");
} 
      out.write("\n");
      out.write("            </ol>\n");
      out.write("            ");
if (currentPage == maxPage) { 
      out.write("\n");
      out.write("            <a style = \"color:#9c9c9c; \"  disabled>Next</a>\n");
      out.write("            ");
} else { 
      out.write("\n");
      out.write("            <a class = \"page-a\" href=\"");
      out.print(request.getContextPath());
      out.write("/list.no?currentPage=");
      out.print(currentPage + 1);
      out.write("\">Next</a>\n");
      out.write("            ");
} 
      out.write("\n");
      out.write("   </div>\n");
      out.write("</div>\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\t<!-- 게시글 작성  -->\t\n");
      out.write("\t<button id=\"insertNotice\" type=\"button active\" class=\"btn btn-secondary\" \n");
      out.write("\t\t\tonclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/views/board/notice/noticeInsert.jsp'\">게시글 작성</button>\n");
      out.write("</div>\n");
      out.write("<br><br><br>\n");
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
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\t$(function(){\n");
      out.write("\t\t$(\"#listArea td\").click(function(){\n");
      out.write("\t\t\tvar noti_no = $(this).parent().children(\"input\").val();\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/detail.no?noti_no=\"+noti_no;\n");
      out.write("\t\t\t\n");
      out.write("\t\t})\n");
      out.write("\t})\n");
      out.write("\n");
      out.write("</script>\n");
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
