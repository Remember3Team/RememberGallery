/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-18 04:15:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.mypage_005fuser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.NumberFormat;
import mypage_user.mainOrderRefundWish.model.vo.*;
import product.model.vo.*;
import java.util.ArrayList;
import member.model.vo.Member;

public final class mypage_005fwishlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/mypage_user/../common/mypagehead2.jsp", Long.valueOf(1589762798663L));
    _jspx_dependants.put("/views/mypage_user/../common/menubar.jsp", Long.valueOf(1589771766061L));
    _jspx_dependants.put("/views/mypage_user/../common/footer.jsp", Long.valueOf(1589256474995L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("product.model.vo");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("mypage_user.mainOrderRefundWish.model.vo");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("java.text.NumberFormat");
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
      out.write("\r\n");
      out.write("    \r\n");

	ArrayList<Morw> list = ((ArrayList<Morw>)request.getAttribute("list"));
	ArrayList<Attachment> plist = (ArrayList<Attachment>) request.getAttribute("plist");
 System.out.println(request.getContextPath());
 int totalPrice = 0;
 NumberFormat nf = NumberFormat.getInstance();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write(" <link href=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\" rel=\"stylesheet\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/views/css/Style-mypagehead.css\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/views/css/Style-refund.css\">\r\n");
      out.write("  \r\n");
      out.write("<script src=\"../js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("$(\"document\").ready(function(){\r\n");
      out.write("\t$(\"#input[name=check]:checkbox\").click(function(){\r\n");
      out.write("\t\ttotalPrice();\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("// BASKET_NO 를 일정한 형식으로 담을 변수\r\n");
      out.write("var arrayList = '';\r\n");
      out.write("\r\n");
      out.write("// BASKET_NO 값을 읽어오기 위한 메소드 (삭제 버튼 클릭 시 호출 메소드)\r\n");
      out.write("function deleteBasket(){\r\n");
      out.write("\t// 먼저 input checkbox중 name이 check인 객체들을 정의\r\n");
      out.write("\tvar checkboxList = $(\"input[name=check]:checkbox\");\r\n");
      out.write("\tarrayList = '';\r\n");
      out.write("\t\r\n");
      out.write("\t// 위에서 정의한 checkbox 객체 배열 리스트 for문으로 하나씩 확인\r\n");
      out.write("\tfor(var i=0; i<checkboxList.length; i++){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// checkbox가 체크 되어있을 때만 실행\r\n");
      out.write("\t\tif($(checkboxList[i]).is(\":checked\")){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// BASKET_NO 를 담을 변수가 비어있으면 먼저 check된 값을 저장\r\n");
      out.write("\t\t\tif(arrayList == '')\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tarrayList = $(checkboxList[i]).val();\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t\t// 기존에 값이 있으면 앞에 (,) 콤마를 붙이고 값을 이어서 저장\r\n");
      out.write("\t\t\telse{\r\n");
      out.write("\t\t\t\tarrayList = arrayList + \",\"+$(checkboxList[i]).val();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 하나도 체크 안했을 시 \r\n");
      out.write("\tif(arrayList == ''){\r\n");
      out.write("\t\talert(\"한가지 이상을 선택해주세요.\");\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\tif(!confirm('삭제하시겠습니까?'))\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// post ajax 통신 \r\n");
      out.write("\t\tvar param = \"basket_no=\"+encodeURIComponent(arrayList); \r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype: \"POST\",\r\n");
      out.write("\t\t\turl: \"Wishlist\",\r\n");
      out.write("\t\t\tdata: param,\r\n");
      out.write("\t\t\tsuccess: function(ret){\r\n");
      out.write("\t\t\t\t// 현재 페이지 새로고침\r\n");
      out.write("\t\t\t\tlocation.reload();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var totalPrice = 0;\r\n");
      out.write("\r\n");
      out.write("//전체금액\r\n");
      out.write("function totalPrice(){\r\n");
      out.write("\tvar checkboxList = $(\"input[name=check]:checkbox\");\r\n");
      out.write("\ttotalPrice = 0;\r\n");
      out.write("\t\r\n");
      out.write("\tfor(var i=0; i<checkboxList.length; i++){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// checkbox가 체크 되어있을 때만 실행\r\n");
      out.write("\t\tif($(checkboxList[i]).is(\":checked\")){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar parentTr = $(checkboxList[i]).parents('tr');\r\n");
      out.write("\t\t\tvar value = $(parentTr).find('input[name=price]').val();\r\n");
      out.write("\t\t\tconsole.log(value);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
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
      out.write("\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/Mo.li\">마이페이지 소비자</a></li>\r\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">마이페이지 소비자</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">My Page(?)</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">장바구니</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Chat</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">1:1문의</a></li>\r\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">마이페이지 관리자</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">마이페이지 판매자</a></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/logout.me\">로그아웃</a></li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
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
      out.write('\r');
      out.write('\n');
      out.write('	');
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
      out.write("            <h3 style=\"font-size: 20px;\"><b>마이페이지</b></h3>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"second-menu\">\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/views/mypage_user/mypage_info.jsp\">회원 정보</a></li><a>|</a>\n");
      out.write("            ");
      out.write("\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/Mo.li?menu=order\">주문 내역</a></li><a>|</a>\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/Refund.li\">반품/환불</a></li><a>|</a>\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/Wishlist\">장바구니</a></li><a>|</a>\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/qna\">문의 내역</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t<div class=\"title\">\r\n");
      out.write("        <h3><b>장바구니</b></h3>\r\n");
      out.write("        <hr>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <h4>* 장바구니에 담긴 상품은 30일까지 보관됩니다.</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("\r\n");
      out.write("    <div class = \"wishlist-table\">\r\n");
      out.write("            <div class=\"table-headline\">\r\n");
      out.write("                <div><span><b>관심상품</b></span></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <table style=\"width:100%\" name=\"order-list\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                \t<th></th>\r\n");
      out.write("                \t<th>그림</th>\r\n");
      out.write("                    <th>상품정보</th>\r\n");
      out.write("                    <th>금액</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                \t");
if(!list.isEmpty()){ 
      out.write("\r\n");
      out.write("\t\t\t  \t\t\t");
for(Morw m:list){
			  				totalPrice+=m.getPaintPrice();
			  				
      out.write("\r\n");
      out.write("\t\t\t    \t\t<tr>\r\n");
      out.write("                \t\t\t<td><input type=\"checkbox\" name=\"check\" value=\"");
      out.print(m.getBasketNo() );
      out.write("\"></td>\r\n");
      out.write("                \t\t\t\r\n");
      out.write("                \t\t\t<td>");
 for(int j=0; j<plist.size(); j++){ 
							Attachment a = plist.get(j); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
 if(m.getPaintNo() == a.getPaint_no()) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t <img src=\"");
      out.print( request.getContextPath() );
      out.write("/thumbnail_uploadFiles/");
      out.print( a.getSavefileName() );
      out.write("\" width=\"150px\" height=\"150px\">\r\n");
      out.write("\t\t\t\t\t ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("</td>\r\n");
      out.write("\t\t\t      \t\t\t<td>작가 : ");
      out.print(m.getArtistName());
      out.write("<br>\r\n");
      out.write("\t\t\t      \t\t\t작품명 : ");
      out.print(m.getPaintName());
      out.write("</td>\r\n");
      out.write("\t\t\t      \t\t\t<td>");
      out.print(nf.format(m.getPaintPrice()));
      out.write("\r\n");
      out.write("\t\t\t      \t\t\t\t<input type=\"hidden\" name=\"price\" value=\"");
      out.print(m.getPaintPrice() );
      out.write("\" />\r\n");
      out.write("\t\t\t      \t\t\t</td>\r\n");
      out.write("\t\t\t    \t\t</tr>\r\n");
      out.write("\t\t\t    \t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t    \t");
} else{
      out.write("\r\n");
      out.write("\t\t\t    \t\t\r\n");
      out.write("\t\t\t    \t");
} 
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            <div style=\"float:right\">\r\n");
      out.write("            \t");
      out.write("\r\n");
      out.write("            \t<br>\r\n");
      out.write("            \t<b>전체 금액 : <span id=\"total_price\" >");
      out.print(nf.format(totalPrice) );
      out.write("</span></b>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       <br>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("      <button type=\"submit\" class=\"btn btn-dark\" style=\"width:100px\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/views/product/product.jsp\">쇼핑 계속하기</a></button>\r\n");
      out.write("      <button type=\"submit\" class=\"btn btn-dark\" style=\"width:100px\" onclick=\"javascript: deleteBasket();\">선택상품 삭제</button>\r\n");
      out.write("      <button type=\"submit\" class=\"btn btn-dark\" style=\"width:100px; float:right;\">선택상품 주문</button>\r\n");
      out.write("      <button type=\"submit\" class=\"btn btn-dark\" style=\"width:100px; float:right; margin-right: 4px;\">전체상품 주문</button>\r\n");
      out.write("    </div>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
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