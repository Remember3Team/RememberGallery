/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-23 11:02:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.mypage_005fuser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypage_user.mainOrderRefundWish.model.vo.*;
import product.model.vo.*;
import java.util.ArrayList;
import member.model.vo.Member;

public final class mypage_005forder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/mypage_user/../common/mypagehead2.jsp", Long.valueOf(1589950684061L));
    _jspx_dependants.put("/views/mypage_user/../common/menubar.jsp", Long.valueOf(1590229468449L));
    _jspx_dependants.put("/views/mypage_user/../common/footer.jsp", Long.valueOf(1590116113589L));
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
      out.write("    \r\n");

	
	ArrayList<Morw> list = ((ArrayList<Morw>)request.getAttribute("list"));
	ArrayList<Attachment> plist = (ArrayList<Attachment>) request.getAttribute("plist");
	 

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write(" <link href=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/bootstrap.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/Style-mypagehead.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/Style-ar.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/Style-refund.css\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write(".refund > label{\r\n");
      out.write("margin : 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".refund > input {\r\n");
      out.write("float : right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>  \r\n");
      out.write("  \r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/views/js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/bootstrap.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var searchStatus='all';\r\n");
      out.write("var term = 'all';\r\n");
      out.write("$(\"document\").ready(function(){\r\n");
      out.write("\t$(\"#searchStatus\").change(function(){\r\n");
      out.write("\t\tsearchStatus = this.value;\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"input[name=term]:radio\").click(function(){\r\n");
      out.write("\t\tconsole.log(this.value)\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function setStatus(obj){\r\n");
      out.write("\tterm = obj.value;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//수령확인을 orderNo로 받아올때\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function confirm2(gOrderNo, gPaintName, gArtistName, gPaintNo){\r\n");
      out.write("\tconsole.log(gOrderNo);\r\n");
      out.write("\tconsole.log(gPaintNo);\r\n");
      out.write("\tconsole.log(gPaintName);\r\n");
      out.write("\tconsole.log(gArtistName);\r\n");
      out.write("\r\n");
      out.write("\t\t   var status = $(\"#order_status_\"+gOrderNo).val();\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t   // input hidden태그에 보조 정보들 넣기\r\n");
      out.write("\t\t   $(\"#modal_order_no\").val(gOrderNo);\r\n");
      out.write("\t\t   $(\"#modal_paint_no\").val(gPaintNo);\r\n");
      out.write("\t\t   $(\"#modal_paint_name\").val(gPaintName);\r\n");
      out.write("\t\t   $(\"#modal_artist_name\").val(gArtistName);\r\n");
      out.write("\t\t   if(status == '배송완료'){\r\n");
      out.write("\t            if(confirm('수령하시겠습니까?')==true){\r\n");
      out.write("\t               var param = \"order_no=\"+encodeURIComponent(gOrderNo); //ajax 뒷단 통신\r\n");
      out.write("\t               $.ajax({\r\n");
      out.write("\t                  type: \"POST\",\r\n");
      out.write("\t                  url: \"Mo.li\",\r\n");
      out.write("\t                  data: param,\r\n");
      out.write("\t                  success: function(ret){ //통신이 완료되었을때 안에거 실행\r\n");
      out.write("\t                     $(\"order_status_\"+gOrderNo).val(\"수령완료\");\r\n");
      out.write("\t                     $(\"#td_order_status_\"+gOrderNo).html(\"수령완료\");\r\n");
      out.write("\t                      alert(\"수령확인 완료되었습니다!\");\r\n");
      out.write("\t                        $(\"#modal_order_no\").val(gOrderNo);\r\n");
      out.write("\t                        $(\"#confirm2button\").css(\"background\",\"white\").css(\"color\",\"black\");\r\n");
      out.write("\t                        $(\"#modal\").fadeIn(500);\r\n");
      out.write("\t                  }\r\n");
      out.write("\t               });\r\n");
      out.write("\t            }\r\n");
      out.write("\t         }else if(status=='수령완료'){            \r\n");
      out.write("\t               alert(\"이미 수령된 상품입니다!\");\r\n");
      out.write("\t         }else{\r\n");
      out.write("\t            alert(\"수령은 배달완료 이후 가능합니다!\");\r\n");
      out.write("\t         }\r\n");
      out.write("\t      }\r\n");
      out.write("\r\n");
      out.write("//취소 환불버튼 누르고 orderNo로 받아올때\r\n");
      out.write("$(document).ready(function () {\r\n");
      out.write("  // Your code\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function refundApply(orderNo){\r\n");
      out.write("\t $(\"#modal_refund\").fadeIn(500);\r\n");
      out.write("\t \r\n");
      out.write("\t $(\"#selectBank\").change(function(){\r\n");
      out.write("     \tvar selectBank = this.value;\r\n");
      out.write("     \t});\r\n");
      out.write("\t var refundName = $(\"#refundName\").val();\r\n");
      out.write("\t var account = $(\"#account\").val();\r\n");
      out.write("\t var refundReason = $(\"#refundReason\").val();\r\n");
      out.write("\t \r\n");
      out.write("\t console.log(refundName);\r\n");
      out.write("\t console.log(selectBank);\r\n");
      out.write("\t console.log(account);\r\n");
      out.write("\t console.log(refundReason);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function insertMessage(){\r\n");
      out.write("\tconsole.log(orderNo);\r\n");
      out.write("\tconsole.log(message);\r\n");
      out.write("\tconsole.log(paintNo);\r\n");
      out.write("\tconsole.log(paintName);\r\n");
      out.write("\tconsole.log(artistName);\r\n");
      out.write("\t\r\n");
      out.write("\t   if(confirm('메세지를 보내시겠습니까?')==false)\r\n");
      out.write("\t    return false;\r\n");
      out.write("\r\n");
      out.write("\t    var orderNo = $(\"#modal_order_no\").val(gOrderNo);\r\n");
      out.write("\t    var message = $(\"#message\").val();\r\n");
      out.write("\t    var paintNo = $(\"#modal_paint_no\").val(gPaintNo);\r\n");
      out.write("\t    var paintName = $(\"#modal_paint_name\").val(gPaintName);\r\n");
      out.write("\t    var artistName =  $(\"#modal_artist_name\").val(gArtistName);\r\n");
      out.write("\t    \r\n");
      out.write("\t    ");
      out.write("\r\n");
      out.write("\tconsole.log(\"Ajax 시작전 \");\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t  type: \"POST\",\r\n");
      out.write("\t  url: \"Mo.litwo\",\r\n");
      out.write("\t  data: {orderNo:orderNo, message:message, paintNo:paintNo, paintName:paintName, artistName:artistName},\r\n");
      out.write("\t  success: function(ret){\r\n");
      out.write("\t    location.reload();\r\n");
      out.write("\t},\r\n");
      out.write("\t  error:function(){\r\n");
      out.write("\t\t  alert(\"ajax불능\");\r\n");
      out.write("\t  }\r\n");
      out.write("\t\r\n");
      out.write("\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
      out.write("/Refund.li\">취소/환불</a></li><a>|</a>\n");
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
      out.write("    \r\n");
      out.write("    <div class=\"title\">\r\n");
      out.write("        <h3><b>주문 내역</b></h3>\r\n");
      out.write("        <hr>\r\n");
      out.write("    </div>\r\n");
      out.write("    \t\r\n");
      out.write("    \r\n");
      out.write("      \r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("      <form action=\"\">\r\n");
      out.write("            <div class=\"search-bar\">\r\n");
      out.write("                <div class=\"bar1\">\r\n");
      out.write("                    \r\n");
      out.write("                    <select id=\"searchStatus\">\r\n");
      out.write("                    \t<option value=\"all\">전체보기</option>\r\n");
      out.write("                        <option value=\"입금전\">입금전</option>\r\n");
      out.write("                        <option value=\"배송준비중\">배송준비중</option>\r\n");
      out.write("                        <option value=\"배송중\">배송중</option>\r\n");
      out.write("                        <option value=\"배송완료\">배송완료</option>\r\n");
      out.write("                        <option value=\"수령완료\">수령완료</option>\r\n");
      out.write("                        <option value=\"환불신청\">환불신청</option>\r\n");
      out.write("                        <option value=\"환불완료\">환불완료</option>\r\n");
      out.write("                    </select>\r\n");
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
      out.write("     \r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <div>\r\n");
      out.write("        <h6>* 기본적으로 최근 3개월간의 자료가 조회되며, 기간 검색시 지난 내역을 조회할 수 있습니다.<br>\r\n");
      out.write("        * 취소/환불 신청은 수령확인 버튼을 누르면 진행됩니다.\r\n");
      out.write("        </h6>\r\n");
      out.write("    </div>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("\r\n");
      out.write("      <div class = \"order-table\">\r\n");
      out.write("            <div class=\"table-headline\">\r\n");
      out.write("                <div><span><b>주문 상품정보</b></span></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <table style=\"width:100%\" name=\"order-list\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>주문 번호</th>\r\n");
      out.write("                    <th>그림</th>\r\n");
      out.write("                    <th>상품정보</th>\r\n");
      out.write("                    <th>금액</th>\r\n");
      out.write("                    <th>주문일자</th>\r\n");
      out.write("                    <th>주문 처리상태</th>\r\n");
      out.write("                    <th>취소 /환불</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                ");
if(!list.isEmpty()){ 
      out.write("\r\n");
      out.write("\t\t\t  \t\t\t");
for(int i =0 ; i <list.size();i++){ 
			  			Morw m = list.get(i);
			  			String gOrderStatus = m.getOrderStatus();
			  			String gOrderNo = m.getOrderNo();
			  			String gPaintName = m.getPaintName();
			  			String gArtistName = m.getArtistName();
			  			int gPaintNo = m.getPaintNo();
      out.write("\r\n");
      out.write("\t\t\t    \t\t<tr>\r\n");
      out.write("\t\t\t    \t\t\t<td>");
      out.print(m.getOrderNo() );
      out.write("<input type = \"hidden\" id=\"order_status_");
      out.print(m.getOrderNo());
      out.write("\" value=\"");
      out.print(m.getOrderStatus());
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
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
      out.write("\t\t\t\t\t <input type=\"hidden\" id=\"img_");
      out.print(m.getOrderNo());
      out.write("\" value=\"");
      out.print( a.getSavefileName() );
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("</td>\r\n");
      out.write("\t\t\t      \t\t\t<td id=\"artistname\"><label>작가 : </label><p>");
      out.print(m.getArtistName());
      out.write("</p><br>\r\n");
      out.write("\t\t\t      \t\t\t<label>작품명 : </label><p>");
      out.print(m.getPaintName());
      out.write("</p></td>\r\n");
      out.write("\t\t\t      \t\t\t<td>");
      out.print(m.getPaintPrice());
      out.write("</td>\r\n");
      out.write("\t\t\t      \t\t\t<td>");
      out.print(m.getOrderDate());
      out.write("</td>\r\n");
      out.write("\t\t\t      \t\t\t<td id=\"td_order_status_");
      out.print(m.getOrderNo());
      out.write('"');
      out.write('>');
      out.print(m.getOrderStatus());
      out.write("</td>\r\n");
      out.write("\t\t\t      \t\t\t<td><a href=\"javascript: refundApply('");
      out.print(m.getOrderNo());
      out.write("')\" class=\"btn btn-secondary btn-sm active\" role=\"button\" aria-pressed=\"true\">반품/취소</a>\r\n");
      out.write("\t\t\t      \t\t\t<a href=\"javascript: confirm2('");
      out.print(gOrderNo );
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(gPaintName );
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(gArtistName );
      out.write('\'');
      out.write(',');
      out.print(gPaintNo );
      out.write(")\" id=\"confirm2button\" class=\"btn btn-secondary btn-sm active\" role=\"button\" value=\"confirm2Status\" >수령확인</a>\r\n");
      out.write("\t\t\t      \t\t\t</td>\r\n");
      out.write("\t\t\t      \t\t\t<td style=\"display:none\">");
      out.print(m.getPaintNo() );
      out.write("</td>\r\n");
      out.write("\t\t\t    \t\t</tr>\r\n");
      out.write("\t\t\t    \t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t    \t");
} else{
      out.write("\r\n");
      out.write("\t\t\t    \t");
} 
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("   \r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("    </div> \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\t\r\n");
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
      out.write("\t<div id=\"modal\" style=\"position: fixed; display:none; width: 100%; height: 100%; top: 0; left: 0; background-color: rgba(0, 0, 0, 0.7); z-index: 9999;\">\r\n");
      out.write("      <div style=\"width: 400px; height: 400px; background-color: #fff; border-radius: 20px; position: absolute; left: 50%; top: 50%; transform: translate(-50%, -50%);\">\r\n");
      out.write("      \t<div style=\"position: absolute; top : 30px; left:40px;\"><h5><b>작가님에게 메세지를 남겨 보세요!</b></h5></div>\r\n");
      out.write("          <a href=\"javascript: $('#modal').fadeOut(500);\" style=\"width: 15px; height: 15px; position: absolute; top: 15px; right: 20px; display: block;\">\r\n");
      out.write("                   <img src=\"thumbnail_uploadFiles/modal.png\" style=\"width: 100%;\" /></a>\r\n");
      out.write("          <textarea id=\"message\" style=\"position:absolute; bottom :60px; left:40px; width:310px; height:110px;\"></textarea>\r\n");
      out.write("          <input type=\"hidden\" id=\"modal_order_no\"><button type=\"button\" id=\"#\" onclick=\"insertMessage()\" style=\"position:absolute; left:170px; bottom:20px; border-radius:10px;\"><b>전송</b></button>\r\n");
      out.write("\t\t  <input type=\"hidden\" id=\"modal_paint_no\"><!-- 안나오는 이유 체크 1 -->\r\n");
      out.write("\t\t  <input type=\"hidden\" id=\"modal_paint_name\"><!-- 안나오는 이유 체크 2 -->\r\n");
      out.write("\t\t  <input type=\"hidden\" id=\"modal_artist_name\">\r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   <div id=\"modal_refund\" style=\"position: fixed; display:none; width: 100%; height: 100%; top: 0; left: 0; background-color: rgba(0, 0, 0, 0.7); z-index: 9999;\">\r\n");
      out.write("      <div style=\"width: 400px; height: 380px; background-color: #fff; border-radius: 20px; position: absolute; left: 50%; top: 50%; transform: translate(-50%, -50%);\">\r\n");
      out.write("      \t<div style=\"position: absolute; top : 20px; left:20px;\"><h5><b>환불계좌등록</b></h5></div>\r\n");
      out.write("          <a href=\"javascript: $('#modal_refund').fadeOut(500);\" style=\"width: 15px; height: 15px; position: absolute; top: 15px; right: 20px; display: block;\">\r\n");
      out.write("                   <img src=\"thumbnail_uploadFiles/modal.png\" style=\"width: 100%;\" /></a>\r\n");
      out.write("          <div style=\"border-radius:5px; width:360px; height:250px; background-color:lightgray; position:absolute; top:60px; left:20px; border:1px black;\">\r\n");
      out.write("          \t<ul class= \"refund\" style=\"position:absolute; top:20px; left:20px;\">\r\n");
      out.write("          \t<li><label style=\"margin:14px; width:100px;\">예금주</label><input type=\"text\" id=\"refundName\" style=\"width:180px\">\r\n");
      out.write("          \t<div style=\"font-size:10px; position:absolute; left:126px; margin-top: -6px;\">예금주명은 주문자명과 동일해야합니다.</div></li>\r\n");
      out.write("\t\t    <li><label style=\"margin:14px; width:100px;\">은행선택</label><select id=\"selectBank\" style=\"width:180px\">\r\n");
      out.write("\t\t    <option value=\"국민\">국민</option>\r\n");
      out.write("\t\t    <option value=\"신한\">신한</option>\r\n");
      out.write("\t\t    <option value=\"NH\">NH</option>\r\n");
      out.write("\t\t    <option value=\"우리\">우리</option>\r\n");
      out.write("\t\t    </select></li>\r\n");
      out.write("\t\t    <li><label style=\"margin:14px; width:100px;\">계좌번호</label><input type=\"text\" id=\"account\" style=\"width:180px\">\r\n");
      out.write("\t\t    <div style=\"font-size:10px; position:absolute; left:126px; margin-top: -9px;\">'-'없이 숫자만 입력해주세요.</div></li>\r\n");
      out.write("\t\t    <li><label style=\"margin:14px; width:100px;\">환불사유</label><input type=\"text\" id=\"refundReason\" style=\"width:180px\"></li>\r\n");
      out.write("          \t</ul>\r\n");
      out.write("          </div>\r\n");
      out.write("          <button type=\"button\" id=\"\" onclick=\"submit()\" style=\"position:absolute; width:80px; left:115px; bottom:15px; border-radius:10px;\"><b>등록</b></button>\r\n");
      out.write("       \t  <button type=\"button\" id=\"\" onclick=\"submit()\" style=\"position:absolute; width:80px; right:115px; bottom:15px; border-radius:10px;\"><b>취소</b></button>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
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
