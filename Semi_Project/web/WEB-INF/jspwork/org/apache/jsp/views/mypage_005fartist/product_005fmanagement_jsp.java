/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-15 04:13:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.mypage_005fartist;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;

public final class product_005fmanagement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/mypage_artist/../common/menubar.jsp", Long.valueOf(1589443343000L));
    _jspx_dependants.put("/views/mypage_artist/../common/footer.jsp", Long.valueOf(1589255111000L));
    _jspx_dependants.put("/views/mypage_artist/../common/mypagehead.jsp", Long.valueOf(1589349871000L));
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
      out.write("<title>상품관리</title>\r\n");
      out.write(" <!-- link rel=\"stylesheet\" href=\"../css/style.css\" -->\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../css/bootstrap.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../css/Style-refund.css\">\r\n");
      out.write("<script src=\"../js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/bootstrap.js\"></script> \r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
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
      out.write("#LoginBtn input, #memberJoinBtn, #logoutBtn, #myPage {\r\n");
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
      out.write("\tbackground: gray;\r\n");
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
      out.write("\t/* text-align:center; */\r\n");
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
      out.write("\t/* display:inline-block; */\r\n");
      out.write("\tmargin-left: 35%;\r\n");
      out.write("\tborder-radius: 10px;\r\n");
      out.write("\ttext-algin: \"center\";\r\n");
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
      out.write("\r\n");
      out.write("h1 {\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tpadding-top: 80px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputinfo {\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("}\r\n");
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
      out.write("\t\t\t\t\t<li><a href=\"#\">마이페이지 관리자</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">마이페이지 판매자</a></li>\r\n");
      out.write("\t\t\t\t\t\t<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 11111111111-->\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/logout.me\">로그아웃</a></li>\r\n");
      out.write("\t\t\t\t\t\t<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 111111111111-->\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 222222222222-->\r\n");
      out.write("\t\t\t<input type=\"hidden\" id = \"checkLogin\"> \r\n");
      out.write("\t\t\t\t<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 22222222222222222-->\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<!--icon :: 색상변경 또는 없애버리고 메뉴바 만들기-->\r\n");
      out.write("\t\t<div id=\"loginWrap\">\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"icon\" onclick=\"login_btn();\"><img\r\n");
      out.write("\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/views/img/login2.png\"></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--마이페이지로 넘어가는부분 잠시 수정 -->\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"icon\"><img\r\n");
      out.write("\t\t\t\tsrc=\"");
      out.print( request.getContextPath() );
      out.write("/views/img/search2.png\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</header>\t\r\n");
      out.write("\t<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 3333333333333-->\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\t$(function (){\r\n");
      out.write("\t\t\t\t\tif($(\"#checkLogin\").length>0){\r\n");
      out.write("\t\t\t\t\t\t$(\"#LoginArea\").css(\"display\",\"none\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 3333333333333333-->\r\n");
      out.write("\t<br clear=\"both\">\r\n");
      out.write("\t<div id=\"Login_pop\">\r\n");
      out.write("\t\t");
 
			if (loginUser == null) {
		
      out.write("\r\n");
      out.write("\t\t<div id=\"LoginArea\">\r\n");
      out.write("\t\t\t<form method=\"get\" action=\"");
      out.print(request.getContextPath());
      out.write("/login.me\"\r\n");
      out.write("\t\t\t\tonsubmit=\"return validate();\">\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\"><img\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/views/img/close2.png\"></a> <br>\r\n");
      out.write("\t\t\t\t<br> <br>\r\n");
      out.write("\t\t\t\t<h1 align=\"center\">로그인</h1>\r\n");
      out.write("\t\t\t\t<table class=\"inputinfo\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label>ID:</label>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"userId\" id=\"userId\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label>PW: </label>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"password\" name=\"userPwd\" id=\"userPwd\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"btns\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<div id=\"memberJoinBtn\">회원가입</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"LoginBtn\" style=\"display: inline-block;\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"로그인\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\t/* 로그인 팝업창 띄우기  */\r\n");
      out.write("\t\t\t\tfunction login_btn() {\r\n");
      out.write("\t\t\t\t\tif ($(\"#Login_pop\").css('opacity') == '0') {\r\n");
      out.write("\t\t\t\t\t\t$(\"#Login_pop\").css(\"opacity\", \"0.9\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t} else if ($(\"#Login_pop\").css('opacity') == '0.9') {\r\n");
      out.write("\t\t\t\t\t\t$(\"#Login_pop\").css(\"opacity\", \"0\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t\t");

				} else {
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"LoginArea\">\r\n");
      out.write("\t\t\t\t<label>");
      out.print(loginUser.getUserName());
      out.write("님의 방문을 환영합니다.</label>\r\n");
      out.write("\t\t\t\t<div class=\"btns\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t<div id=\"myPage\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"location.href='myPage.me?userId=");
      out.print(loginUser.getUserId());
      out.write("';\">정보수정\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"logoutBtn\" onclick=\"logout();\">로그아웃</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</div><!-- #LoginArea 끝 -->\r\n");
      out.write("\t</div><!-- #Login_pop 끝 -->\r\n");
      out.write("\t<br clear=\"both\">\r\n");
      out.write("\t<!-- 스크립트 부분 -->\r\n");
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
      out.write('\r');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>MyPage Head</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/Style-mypagehead.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"headline\">\n");
      out.write("        <div class=\"headline-text\">\n");
      out.write("            <hr>\n");
      out.write("            <h3 style=\"font-size: 20px;\"> 작가 마이페이지</h3>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"headline-subbox\">\n");
      out.write("            <div class=\"artist-img\">\n");
      out.write("                <!--Artist Image-->\n");
      out.write("                <img src=\"../img/artist.JPG\" alt=\"artist-img\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"artist-button\">\n");
      out.write("                <button style=\"margin-bottom: 3px;\">정보수정</button>\n");
      out.write("                <button>감동카드 확인</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"second-menu\">\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/views/mypage_artist/product_management.jsp\">상품 관리</a></li><a>|</a>\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/views/mypage_artist/order_management.jsp\">주문 관리</a></li><a>|</a>\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/views/mypage_artist/shipping_management.jsp\">배송 관리</a></li><a>|</a>\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/views/mypage_artist/art-refund.jsp\">반품 / 환불 관리</a></li><a>|</a>\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/views/mypage_artist/art-qna.jsp\"\">문의 내역</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("    <div class=\"title\">\r\n");
      out.write("        <h3>상품관리</h3>\r\n");
      out.write("        <hr>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <form action=\"\">\r\n");
      out.write("            <div class=\"search-bar\">\r\n");
      out.write("                <div class=\"bar1\">\r\n");
      out.write("                    <input type=\"text\" name=\"order-status\" list=\"genre\" placeholder=\"테마\">\r\n");
      out.write("                    <datalist name=\"genre\" id=\"genre\">\r\n");
      out.write("                                <option value=\"인물\">인물</option>\r\n");
      out.write("                                <option value=\"풍경\">풍경</option>\r\n");
      out.write("                                <option value=\"정물\">정물</option>\r\n");
      out.write("                                <option value=\"동물\">동물</option>\r\n");
      out.write("                                <option value=\"추상\">추상</option>\r\n");
      out.write("                                <option value=\"팝아트\">팝아트</option>\r\n");
      out.write("                                <option value=\"오브제\">오브제</option>\r\n");
      out.write("                            </datalist>  \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"btn-group\" data-toggle=\"buttons\">\r\n");
      out.write("                                <label class=\"btn btn-outline-dark\">\r\n");
      out.write("                                    <input type=\"radio\" name=\"term\" value=\"today\">오늘\r\n");
      out.write("                                </label>\r\n");
      out.write("                                <label class=\"btn btn-outline-dark\">\r\n");
      out.write("                                    <input type=\"radio\" name=\"term\" value=\"week\">1주일\r\n");
      out.write("                                </label>\r\n");
      out.write("                                <label class=\"btn btn-outline-dark\">\r\n");
      out.write("                                    <input type=\"radio\" name=\"term\" value=\"month\" >1개월\r\n");
      out.write("                                </label>\r\n");
      out.write("                                <label class=\"btn btn-outline-dark\">\r\n");
      out.write("                                    <input type=\"radio\" name=\"term\" value=\"three_months\" >3개월\r\n");
      out.write("                                </label>\r\n");
      out.write("                                <label class=\"btn btn-outline-dark\">\r\n");
      out.write("                                    <input type=\"radio\" name=\"term\" value=\"six_months\" >6개월\r\n");
      out.write("                                </label>\r\n");
      out.write("                            </div> \r\n");
      out.write("                &nbsp;&nbsp;&nbsp;\r\n");
      out.write("                <div class=\"bar3\">\r\n");
      out.write("                    <input type=\"date\" name=\"refund-date1\"> ~\r\n");
      out.write("                    <input type=\"date\" name=\"refund-date1\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-dark\" style=\"width:70px\">조회</button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("        <div class = \"refund-table\">\r\n");
      out.write("            <div class=\"table-headline\">\r\n");
      out.write("                <div><span>상품관리</span></div>\r\n");
      out.write("                <div class=\"button\"><button class=\"btn btn-outline-dark\" style = \"width:100px\">선택삭제</button></div>\r\n");
      out.write("                <div class=\"button\"><button class=\"btn btn-outline-dark\" style = \"width:100px\" onclick=\"registration();\">상품등록</button></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <script>\r\n");
      out.write("               function registration(){\r\n");
      out.write("            \t   location.href=\"");
      out.print(request.getContextPath() );
      out.write("/views/mypage_artist/art-registration.jsp\";\r\n");
      out.write("               }\r\n");
      out.write("                </script>\r\n");
      out.write("            <table style=\"width:100%\" name=\"refund-list\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th><input type=\"checkbox\"></th>\r\n");
      out.write("                    <th>상품 번호</th>\r\n");
      out.write("                    <th>이미지</th>\r\n");
      out.write("                    <th>상품 정보</th>\r\n");
      out.write("                    <th>금액</th>\r\n");
      out.write("                    <th>수정 및 삭제</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"checkbox\"></td>\r\n");
      out.write("                    <td>p0001</td>\r\n");
      out.write("                    <td><img src=\"../img/artist.JPG\" alt=\"pimage\"></td>\r\n");
      out.write("                    <td>작품명 : Remember Me</td>\r\n");
      out.write("                    <td>10,000</td>\r\n");
      out.write("                    <td><button class=\"btn btn-outline-dark\" id=\"detail_order\" style = \"width:100px\">내용수정</button>\r\n");
      out.write("                    \t&nbsp;<button class=\"btn btn-outline-dark\" id=\"detail_order\" style = \"width:100px\">삭제</button>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("    <div style=\"width : 350px; margin : 0 auto;\">\r\n");
      out.write("        <div class=\"pagination\">\r\n");
      out.write("            <a href=\"#\" class=\"disabled\" aria-label=\"Go to previous page\">Previous</a>\r\n");
      out.write("            <ol>\r\n");
      out.write("              <li class=\"current-page\">\r\n");
      out.write("                <a href=\"#\" aria-label=\"Current page. Page 1\">1</a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <a href=\"#\" aria-label=\"Go to 2 page\">2</a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <a href=\"#\" aria-label=\"Go to 3 page\">3</a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <button type=\"button\" disabled>...</button>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <a href=\"#\" aria-label=\"Go to 7 page\">7</a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <a href=\"#\" aria-label=\"Go to 8 page\">8</a>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ol>\r\n");
      out.write("            <a href=\"#\" aria-label=\"Go to next page\">Next</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("<br><br><br><br><br><br><br><br><br><br><br><br><br><br>\r\n");
      out.write("<br><br><br><br><br><br><br><br><br><br><br><br><br><br>\r\n");
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
