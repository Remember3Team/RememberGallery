/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
<<<<<<< HEAD
 * Generated at: 2020-05-26 05:36:48 UTC
=======
<<<<<<< HEAD
 * Generated at: 2020-05-25 08:49:26 UTC
=======
 * Generated at: 2020-05-25 08:50:51 UTC
>>>>>>> refs/remotes/origin/master
>>>>>>> refs/remotes/origin/master
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import product.model.vo.*;
import java.util.ArrayList;
import board.notice.model.vo.*;
import member.model.vo.Member;

public final class searchproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> refs/remotes/origin/master
    _jspx_dependants.put("/views/product/../common/menubar.jsp", Long.valueOf(1590395843439L));
    _jspx_dependants.put("/views/product/../common/footer.jsp", Long.valueOf(1590116110993L));
<<<<<<< HEAD
=======
=======
    _jspx_dependants.put("/views/product/../common/menubar.jsp", Long.valueOf(1590392853455L));
    _jspx_dependants.put("/views/product/../common/footer.jsp", Long.valueOf(1590116113589L));
>>>>>>> refs/remotes/origin/master
>>>>>>> refs/remotes/origin/master
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("product.model.vo");
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

      out.write("\r\n");
      out.write("   \r\n");
      out.write("   ");

   	ArrayList<product> searchlist = (ArrayList<product>)request.getAttribute("searchlist");
   	ArrayList<Attachment> alist = (ArrayList<Attachment>)request.getAttribute("alist");
   
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("  <!-- link rel=\"stylesheet\" href=\"../css/style.css\" -->\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/style.css\">\r\n");
      out.write(" <link href=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\" rel=\"stylesheet\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/bootstrap.css\">\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/views/js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write(" <style>\r\n");
      out.write(" #search{\r\n");
      out.write("    background-color: rgb(224, 224, 224);\r\n");
      out.write("}\r\n");
      out.write(".rul {\r\n");
      out.write("\tmargin-right: 10px;\r\n");
      out.write("\tmargin-left: 10px;\r\n");
      out.write("\theight: 400px;\r\n");
      out.write("\tpadding-left: 100px;\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("}\r\n");
      out.write(".gellary {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\twidth: 20%;\r\n");
      out.write("\theight: 90%;\r\n");
      out.write("\tmargin-right: 20px;\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write(".mname {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 20px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write(".list{\r\n");
      out.write("\tmargin-right: 10px;\r\n");
      out.write("\tmargin-left: 50px;\r\n");
      out.write("\tpadding-left: 10px;\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".buy{\r\n");
      out.write("\tmargin-left:160px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("            input[type=range]::-webkit-slider-runnable-track { \r\n");
      out.write("                width: 100%; \r\n");
      out.write("                height: 8.4px; \r\n");
      out.write("                cursor: pointer; \r\n");
      out.write("                box-shadow: 1px 1px 1px #000000, 0px 0px 1px #0d0d0d;\r\n");
      out.write("                 background: red; \r\n");
      out.write("                 border-radius: 1.3px; \r\n");
      out.write("                 border: 0.2px solid #010101;\r\n");
      out.write("            }\r\n");
      out.write("                  \r\n");
      out.write("            input[type=range]:focus::-webkit-slider-runnable-track {\r\n");
      out.write("                    background: red;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\ttable{\r\n");
      out.write("\t\ttable-layout:fixed;\r\n");
      out.write("\t}\r\n");
      out.write("\tb{\r\n");
      out.write("\t\tmargin-left:10px;\r\n");
      out.write("\t}\r\n");
      out.write("  </style>\r\n");
      out.write("  \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("       <h1 align=\"center\">미술품 판매(가제)</h1>\r\n");
      out.write("        <div id=\"search\">\r\n");
      out.write("            \r\n");
      out.write("           <form action=\"");
      out.print(request.getContextPath());
      out.write("/worksearch.po\" method=\"post\">\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <table class=\"table table-borderless\" >\r\n");
      out.write("               \r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t<tr>          \r\n");
      out.write("                    <td><b>작가 명</b><br><input type=\"text\" class=\"form-control\" id=\"aname\" name=\"aname\" style=\"width:200px; margin-left:150px;\"></td>\r\n");
      out.write("                    <td><b>테마</b><br><select name=\"category\" id=\"category\" class=\"form-control\" style=\"width:200px; margin-left:150px;\">\r\n");
      out.write("                    \t\t\t<option value=\"테마를 선택하세요\">테마를 선택하세요</option>\r\n");
      out.write("                                <option value=\"인물\">인물</option>\r\n");
      out.write("                                <option value=\"풍경\">풍경</option> \r\n");
      out.write("                                <option value=\"정물\">정물</option>\r\n");
      out.write("                                <option value=\"동물\">동물</option>\r\n");
      out.write("                                <option value=\"추상\">추상</option>\r\n");
      out.write("                                <option value=\"팝아트\">팝아트</option>\r\n");
      out.write("                                <option value=\"오브제\">오브제</option>\r\n");
      out.write("                    </select></td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <div>\r\n");
      out.write("                    <label > <b>가격: </b></label><br>\r\n");
      out.write("                    <input type=\"range\" name=\"price\" min=\"0\" max=\"100000000\" step=\"5000000\" value=\"0\"\r\n");
      out.write("                     oninput=\"document.getElementById('value1').innerHTML=this.value;\" style=\"margin-left:150px;\">\r\n");
      out.write("                    <span id=\"value1\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td><button type=\"submit\" id=\"submit\" class=\"btn btn-dark\"  style=\"width:150px; margin-left:150px;\">검색</button></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("        <p class=\"h3\">검색 결과 작품</p>\r\n");
      out.write("        <br clear=\"both\">\r\n");
      out.write("           ");
 for(int i=0; i<searchlist.size(); i++){ 
             product p = searchlist.get(i);
             for(int j=0;j<alist.size();j++){	 
             Attachment a = alist.get(j);
      out.write("\r\n");
      out.write("\t\t\t ");
if(p.getPaint_no() == a.getPaint_no()) { 
      out.write("\r\n");
      out.write("        <div class=\"list\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"paint_no\" type=\"hidden\" value=\"");
      out.print(p.getPaint_no());
      out.write("\"><br>\r\n");
      out.write("\t\t\t\t<img class=\"rimage\" src=\"");
      out.print( request.getContextPath() );
      out.write("/thumbnail_uploadFiles/");
      out.print( a.getSavefileName() );
      out.write("\" style=\"width: 300px; height: 300px;\">\t\t      \r\n");
      out.write("\t\t\t\t\t<div class=\"mname\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 이름 -->\r\n");
      out.write("\t\t\t\t\t\t<b>");
      out.print(p.getPaint_name() );
      out.write("</b>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"mname\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 작가명-->\r\n");
      out.write("\t\t\t\t\t\t<p>작가명 :");
      out.print(p.getArtist_name() );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t</div><br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-outline-dark detail_view\" style=\"width:303px; heighht:20px;\">상세보기</button><br><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<!-- 상세정보보기로 이동 -->\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-outline-secondary buy_product\" style=\"width:303px; heighht:20px;\">구매하기</button>\r\n");
      out.write("\t\t\t\t\t\t<!-- 구매페이지로이동-->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                  ");
 } 
      out.write("\r\n");
      out.write("                  ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t  $(function(){\r\n");
      out.write("\t\t\t\t\t \t\t$(\".detail_view\").click(function(){\r\n");
      out.write("\t\t\t\t\t \t\t\tvar paint_no = $(this).parent().children(\"input\").val();\r\n");
      out.write("\t\t\t\t\t \t\t\t\r\n");
      out.write("\t\t\t\t\t \t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/detail.po?paint_no=\"+paint_no;\r\n");
      out.write("\t\t\t\t\t \t\t});\r\n");
      out.write("\t\t\t\t\t \t\t\r\n");
      out.write("\t\t\t\t\t \t});\r\n");
      out.write("\t                  \r\n");
      out.write("\t                  $(function(){\r\n");
      out.write("\t                \t  $(\".buy_product\").click(function(){\r\n");
      out.write("\t                \t\t  var paint_no = $(this).parent().children(\"input\").val();\r\n");
      out.write("\t                \t\t  \r\n");
      out.write("\t                \t\t  location.href=\"");
      out.print(request.getContextPath());
      out.write("/Buy.po?paint_no=\"+paint_no;\r\n");
      out.write("\t                \t  })\r\n");
      out.write("\t                \t  \r\n");
      out.write("\t                  })\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("   <br clear=\"both\"><br><br><br><br><br><br><br><br>\r\n");
      out.write("\r\n");
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
