/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-22 18:15:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.mypage_005fartist;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypage_artist.RefundQnACard.model.vo.*;
import artistapply.model.vo.*;
import product.model.vo.*;
import java.util.ArrayList;
import member.model.vo.Member;
import artistapply.model.vo.*;

public final class art_002drefund_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/mypage_artist/../common/menubar.jsp", Long.valueOf(1590048362000L));
    _jspx_dependants.put("/views/mypage_artist/../common/footer.jsp", Long.valueOf(1590084783000L));
    _jspx_dependants.put("/views/mypage_artist/../common/mypagehead.jsp", Long.valueOf(1590116627000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("product.model.vo");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("artistapply.model.vo");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("mypage_artist.RefundQnACard.model.vo");
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
      out.write('\n');

    	ArrayList<BuyList_a> list = (ArrayList<BuyList_a>) request.getAttribute("list");
    	ArrayList<Attachment> alist = (ArrayList<Attachment>) request.getAttribute("alist");
    	Apply aphoto = (Apply) request.getAttribute("aphoto");
    	
    	PageInfo pi = (PageInfo)request.getAttribute("pi");
    	
    	int listCount = pi.getListCount();
    	int currentPage = pi.getCurrentPage();
    	int maxPage = pi.getMaxPage();
    	int startPage = pi.getStartPage();
    	int endPage = pi.getEndPage();
    
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>art refund</title>\n");
      out.write("<!-- link rel=\"stylesheet\" href=\"../css/style.css\" -->\n");
      out.write("<link\n");
      out.write("\thref=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/bootstrap.css\">\n");
      out.write("\t\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/views/css/Style-refund.css\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"");
      out.print(request.getContextPath() );
      out.write("/views/js/jquery-3.4.1.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
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
      out.write("\n");
      out.write("\t<div class=\"headline\">\n");
      out.write("\t\t<div class=\"headline-text\">\n");
      out.write("\t\t\t<hr>\n");
      out.write("\t\t\t<h3 style=\"font-size: 20px;\">작가 마이페이지</h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"headline-subbox\">\n");
      out.write("\t\t\t<div class=\"artist-img\">\n");
      out.write("\t\t\t\t<!--Artist Image-->\n");
      out.write("\t\t\t\t<img src=\"");
      out.print( request.getContextPath() );
      out.write("/apply_uploadFiles/");
      out.print( aphoto.getArtist_pro() );
      out.write("\" style=\"width: 83px; height: 83px;\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"artist-btn\"\n");
      out.write("\t\t\t\tstyle=\"display: inline-block; vertical-align: middle;\">\n");
      out.write("\t\t\t\t<button class=\"btn btn-outline-dark\"\n");
      out.write("\t\t\t\t\tstyle=\"width: 120px; display: block; margin-bottom: 5px;\"\n");
      out.write("\t\t\t\t\tonclick=\"checkCard();\">정보 수정</button>\n");
      out.write("\t\t\t\t<button class=\"btn btn-outline-dark\"\n");
      out.write("\t\t\t\t\tstyle=\"width: 120px; display: block; margin-top: 5px;\"\n");
      out.write("\t\t\t\t\tonclick=\"checkCard();\">감동 카드</button>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<script>\n");
      out.write("                \tfunction checkCard() {\n");
      out.write("                \t\tlocation.href = \"");
      out.print( request.getContextPath() );
      out.write("/list.ac\"\n");
      out.write("                \t\t\t\n");
      out.write("                \t}\n");
      out.write("                </script>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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
      out.write("\n");
      out.write("\t<div class=\"title\">\n");
      out.write("\t\t<h3>반품 / 환불 관리</h3>\n");
      out.write("\t\t<hr>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<form action=\"\">\n");
      out.write("\t\t\t<div class=\"search-bar\">\n");
      out.write("\t\t\t\t<div class=\"bar1\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"order-status\" list=\"status-list\"\n");
      out.write("\t\t\t\t\t\tplaceholder=\" 주문 처리 상태\">\n");
      out.write("\t\t\t\t\t<datalist id=\"status-list\">\n");
      out.write("\t\t\t\t\t\t<option value=\"환불신청\"></option>\n");
      out.write("\t\t\t\t\t\t<option value=\"환불완료\"></option>\n");
      out.write("\t\t\t\t\t</datalist>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"btn-group\" data-toggle=\"buttons\"\n");
      out.write("\t\t\t\t\tstyle=\"vertical-align: inherit;\">\n");
      out.write("\t\t\t\t\t<label class=\"btn btn-outline-dark\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\tname=\"term\" value=\"today\">오늘\n");
      out.write("\t\t\t\t\t</label> <label class=\"btn btn-outline-dark\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\tname=\"term\" value=\"week\">1주일\n");
      out.write("\t\t\t\t\t</label> <label class=\"btn btn-outline-dark\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\tname=\"term\" value=\"month\">1개월\n");
      out.write("\t\t\t\t\t</label> <label class=\"btn btn-outline-dark\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\tname=\"term\" value=\"three_months\">3개월\n");
      out.write("\t\t\t\t\t</label> <label class=\"btn btn-outline-dark\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\tname=\"term\" value=\"six_months\">6개월\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<div class=\"bar3\">\n");
      out.write("\t\t\t\t\t<input type=\"date\" name=\"refund-date1\"> ~ <input\n");
      out.write("\t\t\t\t\t\ttype=\"date\" name=\"refund-date1\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn btn-outline-dark\"\n");
      out.write("\t\t\t\t\tstyle=\"margin: 10px 0; width: 100px\">조회</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<div class=\"refund-table\">\n");
      out.write("\t\t\t<div class=\"table-headline\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<span>반품 / 환불 목록</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<button class=\"btn btn-outline-dark\"\n");
      out.write("\t\t\t\t\tstyle=\"width: 120px; float: right;\" onclick=\"refund(this);\">환불\n");
      out.write("\t\t\t\t\t완료</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\t\t\t// 전체 선택\n");
      out.write("           $(function(){\n");
      out.write("            \t// 전체 선택 체크박스를 클릭하면,\n");
      out.write("               $(\"#check_all\").click(function(){\n");
      out.write("            \t   \n");
      out.write("                   var chk = $(this).is(\":checked\");//.attr('checked');\n");
      out.write("                    // 하위 체크박스의 상태를 checked로 변경\n");
      out.write("                   if(chk){\n");
      out.write("                \t   $(\".check_sub\").prop('checked', true);\n");
      out.write("                   } else{\n");
      out.write("                \t   $(\".check_sub\").prop('checked', false);\n");
      out.write("                   }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\t\tvar arrayList = '';\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\tfunction refund(){\n");
      out.write("\t\n");
      out.write("\t\t\tvar checkboxList = $(\"input[name=check]:checked\");\n");
      out.write("\t\t\tarrayList = '';\n");
      out.write("\t\t\tfor(var i=0; i<checkboxList.length; i++){\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t// checkbox가 체크 되어있을 때만 실행\n");
      out.write("\t\t\t\tif($(checkboxList[i]).is(\":checked\")){\n");
      out.write("\t\t\t\t\t// 확인\n");
      out.write("\t\t\t\t\tconsole.log(i);\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\tif(i != checkboxList.length-1){\n");
      out.write("\t\t\t\t\t\tarrayList += $(checkboxList[i]).val() + \",\";\n");
      out.write("\t\t\t\t\t} else{\n");
      out.write("\t\t\t\t\t\tarrayList += $(checkboxList[i]).val();\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t// 확인용\n");
      out.write("\t\t\tconsole.log(arrayList);\n");
      out.write("\t\n");
      out.write("\t\t\t// 하나도 체크 안했을 시 \n");
      out.write("\t\t\tif(arrayList == ''){\n");
      out.write("\t\t\t\talert(\"한가지 이상을 선택해주세요.\");\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\t\tif(!confirm('환불 완료 처리를 하시겠습니까?')){\n");
      out.write("\t\t\t\t\treturn false;}\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t// post ajax\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\t\ttype: \"POST\",\n");
      out.write("\t\t\t\t\t\turl: \"list.ar\",\n");
      out.write("\t\t\t\t\t\tdata: {order_no : arrayList},\n");
      out.write("\t\t\t\t\t\tsuccess: function(ret){\n");
      out.write("\t\t\t\t\t\t\t// 현재 페이지 새로고침\n");
      out.write("\t\t\t\t\t\t\tlocation.reload();\n");
      out.write("\t\t\t\t\t\t}\t\t\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<table style=\"width: 100%\" name=\"refund-list\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th style=\"text-align: center;\"><input type=\"checkbox\"\n");
      out.write("\t\t\t\t\t\tid=\"check_all\"></th>\n");
      out.write("\t\t\t\t\t<th style=\"text-align: center;\">주문 번호</th>\n");
      out.write("\t\t\t\t\t<th style=\"text-align: center;\">이미지</th>\n");
      out.write("\t\t\t\t\t<th style=\"text-align: center;\">상품 정보</th>\n");
      out.write("\t\t\t\t\t<th style=\"text-align: center;\">금액</th>\n");
      out.write("\t\t\t\t\t<th style=\"text-align: center;\">구매자 아이디</th>\n");
      out.write("\t\t\t\t\t<th style=\"text-align: center;\">처리 상태</th>\n");
      out.write("\t\t\t\t\t<th style=\"text-align: center;\">주문 정보 확인</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");
 for(int i = 0 ; i < list.size(); i++){
                	BuyList_a b = list.get(i);
                
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td><input class=\"check_sub\" type=\"checkbox\" name=\"check\"\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(b.getOrder_no() );
      out.write("\"></td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(b.getOrder_no() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t");
 for(int j=0; j<alist.size(); j++){ 
							Attachment a = alist.get(j); 
      out.write(' ');
 if(b.getPaint_no() == a.getPaint_no()) { 
      out.write("\n");
      out.write("\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.print( request.getContextPath() );
      out.write("/thumbnail_uploadFiles/");
      out.print( a.getSavefileName() );
      out.write("\"\n");
      out.write("\t\t\t\t\t\twidth=\"150px\" height=\"150px\"> ");
} 
      out.write(' ');
} 
      out.write("\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>작품명 : ");
      out.print(b.getPaint_name());
      out.write("<br>작가명 : ");
      out.print(b.getArtist_name());
      out.write("\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(b.getPaint_price());
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(b.getUser_id());
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(b.getOrder_status());
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td><button class=\"btn btn-outline-dark\" id=\"detail_order\" style=\"width: 150px\">주문 상세보기</button></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t");
} 
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- 페이징 처리 시작 -->\n");
      out.write("\t\n");
      out.write("<div class = \"p-parents\">\n");
      out.write("\t<div class=\"pppp\">\n");
      out.write("\t\t\t");
if (currentPage == 1) { 
      out.write("\n");
      out.write("            <a style = \"color:#9c9c9c; \"  disabled>Previous</a>\n");
      out.write("            ");
}else {
      out.write("\n");
      out.write("            <a class = \"page-a\" href=\"");
      out.print(request.getContextPath() );
      out.write("/list.ar?currentPage=");
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
      out.write("/list.ar?currentPage=");
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
      out.write("/list.ar?currentPage=");
      out.print(currentPage + 1);
      out.write("\">Next</a>\n");
      out.write("            ");
} 
      out.write("\n");
      out.write("          </div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
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
