/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-23 11:14:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.mypage_005fartist;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;
import artistapply.model.vo.*;

public final class art_002dregistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/mypage_artist/../common/menubar.jsp", Long.valueOf(1590229468449L));
    _jspx_dependants.put("/views/mypage_artist/../common/footer.jsp", Long.valueOf(1590116113589L));
    _jspx_dependants.put("/views/mypage_artist/../common/mypagehead.jsp", Long.valueOf(1590116597917L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("artistapply.model.vo");
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

      out.write("\n");
      out.write(" \n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>art-registration</title>\n");
      out.write("</head>\n");
      out.write(" <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/Style-ar.css\">\n");
      out.write("\n");
      out.write("<body>\n");
      out.write('\r');
      out.write('\n');

	Member loginUser = (Member) session.getAttribute("loginUser");

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
      out.write("/list.am\">아마추어\r\n");
      out.write("\t\t\t\t\t\t\t게시판</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">자유게시판</a></li>\r\n");
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
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">마이페이지 소비자</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">My Page(?)</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">장바구니</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Chat</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">1:1문의</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">마이페이지 관리자</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">마이페이지 판매자</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/mypage.me?userId=");
      out.print(loginUser.getUserId() );
      out.write("\">정보수정</a></li>\r\n");
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
      out.write('\n');
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"title\">\n");
      out.write("        <h3>상품 등록</h3>\n");
      out.write("        <hr>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <form action=\"");
      out.print(request.getContextPath());
      out.write("/insert.th\" method=\"post\" encType=\"multipart/form-data\">\n");
      out.write("            <!--section1-->\n");
      out.write("            <div class=\"section1\" style=\"padding-bottom: 90px;\">\n");
      out.write("                <span>상품 정보<a style=\"color:red;\">*</a></span>\n");
      out.write("                <div class=\"artregi-infobox\">\n");
      out.write("                    <div class=\"info-box1\">\n");
      out.write("                        <label class=\"labelfirst\" for=\"pname\">작품명</label><input class=\"nomal-text\" type=\"text\"\n");
      out.write("                            name=\"pname\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"info-box2\">\n");
      out.write("                        <label class=\"labelfirst\" for=\"aname\">작가명</label><input class=\"nomal-text\" type=\"text\"\n");
      out.write("                            name=\"aname\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"info-box3\">\n");
      out.write("                        <label class=\"labelfirst\">테마</label>\n");
      out.write("                        <select class=\"select-thema\" name=\"select-thema\">\n");
      out.write("                            <option value=\"풍경\">풍경</option>\n");
      out.write("                            <option value=\"인물\">인물</option>\n");
      out.write("                            <option value=\"정물\">정물</option>\n");
      out.write("                            <option value=\"동물\">동물</option>\n");
      out.write("                            <option value=\"추상\">추상</option>\n");
      out.write("                            <option value=\"팝아트\">팝아트</option>\n");
      out.write("                            <option value=\"오브제\">오브제</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"info-box4\">\n");
      out.write("                        <label class=\"labelfirst\">제작년도</label><input class=\"nomal-text\" type=\"text\" name=\"year\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"info-box5\">\n");
      out.write("                        <label class=\"labelfirst\">가격</label><input class=\"nomal-text\" type=\"text\" name=\"price\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"info-box6\">\n");
      out.write("                        <label class=\"labelfirst\">태그</label>\n");
      out.write("                        <div class = \"check-area\">\n");
      out.write("                       <input type=\"checkbox\" name = \"tagname\" value=\"우아한\" checked>우아한\n");
      out.write("                       <input type=\"checkbox\" name = \"tagname\" value=\"생동감있는\" checked>생동감 있는\n");
      out.write("                       <input type=\"checkbox\" name = \"tagname\" value=\"컬러풀한\" checked>컬러풀한\n");
      out.write("                       <input type=\"checkbox\" name = \"tagname\" value=\"서정적인\" checked>서정적인 <br>\n");
      out.write("                       <input type=\"checkbox\" name = \"tagname\" value=\"동적인\">동적인\n");
      out.write("                       <input type=\"checkbox\" name = \"tagname\" value=\"무드있는\">무드있는\n");
      out.write("                       <input type=\"checkbox\" name = \"tagname\" value=\"정교한\">정교한\n");
      out.write("                       <input type=\"checkbox\" name = \"tagname\" value=\"따뜻한\">따뜻한\n");
      out.write("                       <input type=\"checkbox\" name = \"tagname\" value=\"신선한\">신선한\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <script>\n");
      out.write("                    </script>\n");
      out.write("\n");
      out.write("                    <div class=\"info-box7\">\n");
      out.write("                        <label class=\"labelfirst\">상세 설명</label>\n");
      out.write("                        <textarea name=\"paint_int\">\n");
      out.write("                    </textarea>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--section2-->\n");
      out.write("\n");
      out.write("            <div class=\"section2\" style=\"padding-bottom: 100px;\">\n");
      out.write("                <span>이미지 등록<a style=\"color:red;\">*</a></span>\n");
      out.write("                <div class=\"artregi-imgbox\">\n");
      out.write("                \n");
      out.write("                    <div class=\"img-box\">\n");
      out.write("                        <label class=\"labelsecond\">대표 이미지</label>\n");
      out.write("                        <div class=\"img-upload1\">\n");
      out.write("                            <label for=\"thumbnailImg\">파일 첨부하기</label>\n");
      out.write("                            <input class=\"upload1-name1\" value=\"파일선택\">\n");
      out.write("                            <input type=\"file\" id=\"thumbnailImg\" name=\"thumbnailImg\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <hr style=\"margin-bottom:30px;\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"img-box2\">\n");
      out.write("                        <label class=\"labelsecond\">추가 이미지<br>0/5</label>\n");
      out.write("                        <div class=\"img-upload2\">\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"a-img\" >파일 첨부하기</label>\n");
      out.write("                            <input class=\"upload2-name1\" value=\"파일선택\">\n");
      out.write("                            <input type=\"file\" id=\"a-img\" name=\"a-img\"><br>\n");
      out.write("                         </div>\n");
      out.write("                         <div>    \n");
      out.write("                             <label for=\"a-img2\" >파일 첨부하기</label>\n");
      out.write("                             <input class=\"upload2-name2\" value=\"파일선택\">\n");
      out.write("                            <input type=\"file\" id=\"a-img2\" name=\"a-img2\"><br>\n");
      out.write("                         </div>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <script>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"submit-box\">\n");
      out.write("                <button class = \"submit-bt\" type=submit>제출하기</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </form>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("    \n");
      out.write("    /* 파일 이름 추출해서 넣어주기 label에 넣어주기*/\n");
      out.write("\n");
      out.write("    $(document).ready(function(){\n");
      out.write("    \tvar fileTarget = $('.img-upload1 #thumbnailImg');\n");
      out.write("    \tvar fileTarget2 = $('.img-upload2 #a-img');\n");
      out.write("    \tvar fileTarget3 = $('.img-upload2 #a-img2');\n");
      out.write("    \t\n");
      out.write("    \tfileTarget.on('change', function(){\n");
      out.write("    \t\tif(window.FileReader){\n");
      out.write("    \t\t\tvar filename = $(this)[0].files[0].name;\n");
      out.write("    \t\t\t} else { \n");
      out.write("    \t\t\t\tvar filename = $(this).val().split('/').pop().split('\\\\').pop();\n");
      out.write("    \t\t\t}\n");
      out.write("    \t\t\t\t\n");
      out.write("    \t\t$(this).siblings('.upload1-name1').val(filename);\n");
      out.write("    \t\t\n");
      out.write("    \t});\n");
      out.write("    \t\n");
      out.write("    \tfileTarget2.on('change', function(){\n");
      out.write("    \t\tif(window.FileReader){\n");
      out.write("    \t\t\tvar filename = $(this)[0].files[0].name;\n");
      out.write("    \t\t\t} else { \n");
      out.write("    \t\t\t\tvar filename = $(this).val().split('/').pop().split('\\\\').pop();\n");
      out.write("    \t\t\t}\n");
      out.write("    \t\t\t\t\n");
      out.write("    \t\t$(this).siblings('.upload2-name1').val(filename);\n");
      out.write("    \t\t\n");
      out.write("    \t});\n");
      out.write("    \t\n");
      out.write("    \tfileTarget3.on('change', function(){\n");
      out.write("    \t\tif(window.FileReader){\n");
      out.write("    \t\t\tvar filename = $(this)[0].files[0].name;\n");
      out.write("    \t\t\t} else { \n");
      out.write("    \t\t\t\tvar filename = $(this).val().split('/').pop().split('\\\\').pop();\n");
      out.write("    \t\t\t}\n");
      out.write("    \t\t\t\t\n");
      out.write("    \t\t$(this).siblings('.upload2-name2').val(filename);\n");
      out.write("    \t\t\n");
      out.write("    \t});\n");
      out.write("    \t\n");
      out.write("    \t\n");
      out.write("    \t});\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    \n");
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
