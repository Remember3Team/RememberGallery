/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-27 04:25:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import product.model.vo.*;
import artistapply.model.vo.*;
import java.util.ArrayList;
import member.model.vo.Member;

public final class productpay_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/product/../common/menubar.jsp", Long.valueOf(1590552876312L));
    _jspx_dependants.put("/views/product/../common/footer.jsp", Long.valueOf(1590116110993L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("product.model.vo");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("artistapply.model.vo");
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
      out.write("    ");

    	product po = (product)request.getAttribute("po");
    ArrayList<Attachment> at = (ArrayList<Attachment>)request.getAttribute("at");
    
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!-- link rel=\"stylesheet\" href=\"../css/style.css\" -->\r\n");
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
      out.write(" <!— Swiper JS —>\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath() );
      out.write("/views/js/swiper.min.js\"></script>\r\n");
      out.write("    <!-- Link Swiper's CSS -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/swiper.min.css\">\r\n");
      out.write("\r\n");
      out.write(" <script src=\"https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("#order {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\twidth: 760px;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-left: 20px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#what {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\twidth: 320px;\r\n");
      out.write("\theight: 896px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-left: 150px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tbackground-color: rgb(224, 224, 224);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#add1, #add4{\r\n");
      out.write("\twidth:100px;\t\r\n");
      out.write("}\r\n");
      out.write("#add2, #add3, #add5, #add6{\r\n");
      out.write("\twidth:400px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
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
      out.write("\r\n");
      out.write("<table class=\"table\">\r\n");
      out.write("  <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"col\"></th>\r\n");
      out.write("      <th scope=\"col\">상품명</th>\r\n");
      out.write("      <th scope=\"col\">수량</th>\r\n");
      out.write("      <th scope=\"col\">판매가</th>\r\n");
      out.write("      <th scope=\"col\">배송비</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </thead>\r\n");
      out.write("   \r\n");
      out.write("  <tbody>\r\n");
      out.write("      <tr>\r\n");
      out.write("      <th scope=\"row\">\r\n");
      out.write("       ");
for(int i =0; i< at.size();i++){
	  Attachment a = at.get(i);
	  if(a.getFileLevel() == 0){
      out.write("\r\n");
      out.write("      <img class=\"rimage\" src=\"");
      out.print(request.getContextPath());
      out.write("/thumbnail_uploadFiles/");
      out.print(a.getSavefileName());
      out.write("\" style=\"width: 126px; height: 115px;\">\r\n");
      out.write("      ");
}} 
      out.write("\r\n");
      out.write("      </th>\r\n");
      out.write("      <td ><a>");
      out.print(po.getPaint_name());
      out.write("</a></td>\r\n");
      out.write("      <td><a>1</a></td>\r\n");
      out.write("      <td><a>");
      out.print(po.getPatint_price());
      out.write("</a></td>\r\n");
      out.write("      <td><a>무료배송</a></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </tbody>\r\n");
      out.write("  \r\n");
      out.write("</table>\r\n");
      out.write("<br clear=\"both\"><br>\r\n");
      out.write("<script>\r\n");
      out.write("function execDaumPostcode() {\r\n");
      out.write("           new daum.Postcode({\r\n");
      out.write("               oncomplete: function(data) {\r\n");
      out.write("\r\n");
      out.write("                   // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write("\r\n");
      out.write("                   // 각 주소의 노출 규칙에 따라 주소를 조합한다.\r\n");
      out.write("                   // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("                   var addr = ''; // 주소 변수\r\n");
      out.write("                   var extraAddr = ''; // 참고항목 변수\r\n");
      out.write("\r\n");
      out.write("                   //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.\r\n");
      out.write("                   if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우\r\n");
      out.write("                       addr = data.roadAddress;\r\n");
      out.write("                   } else { // 사용자가 지번 주소를 선택했을 경우(J)\r\n");
      out.write("                       addr = data.jibunAddress;\r\n");
      out.write("                   }\r\n");
      out.write("\r\n");
      out.write("                   // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.\r\n");
      out.write("                   if(data.userSelectedType === 'R'){\r\n");
      out.write("                       // 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("                       // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("                       if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\r\n");
      out.write("                           extraAddr += data.bname;\r\n");
      out.write("                       }\r\n");
      out.write("                       // 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("                       if(data.buildingName !== '' && data.apartment === 'Y'){\r\n");
      out.write("                           extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("                       }\r\n");
      out.write("                   } else {\r\n");
      out.write("                     \r\n");
      out.write("                   }\r\n");
      out.write("\r\n");
      out.write("                   // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("                   document.getElementById('add1').value = data.zonecode;\r\n");
      out.write("                   document.getElementById(\"add2\").value = addr;\r\n");
      out.write("                   // 커서를 상세주소 필드로 이동한다.\r\n");
      out.write("                   document.getElementById(\"add3\").focus();\r\n");
      out.write("               }\r\n");
      out.write("           }).open();\r\n");
      out.write("       }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function execDaumPostcode2() {\r\n");
      out.write("    new daum.Postcode({\r\n");
      out.write("        oncomplete: function(data) {\r\n");
      out.write("\r\n");
      out.write("            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write("\r\n");
      out.write("            // 각 주소의 노출 규칙에 따라 주소를 조합한다.\r\n");
      out.write("            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("            var addr = ''; // 주소 변수\r\n");
      out.write("            var extraAddr = ''; // 참고항목 변수\r\n");
      out.write("\r\n");
      out.write("            //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.\r\n");
      out.write("            if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우\r\n");
      out.write("                addr = data.roadAddress;\r\n");
      out.write("            } else { // 사용자가 지번 주소를 선택했을 경우(J)\r\n");
      out.write("                addr = data.jibunAddress;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.\r\n");
      out.write("            if(data.userSelectedType === 'R'){\r\n");
      out.write("                // 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("                // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\r\n");
      out.write("                    extraAddr += data.bname;\r\n");
      out.write("                }\r\n");
      out.write("                // 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("                if(data.buildingName !== '' && data.apartment === 'Y'){\r\n");
      out.write("                    extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("                }\r\n");
      out.write("            } else {\r\n");
      out.write("              \r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("            document.getElementById('add4').value = data.zonecode;\r\n");
      out.write("            document.getElementById(\"add5\").value = addr;\r\n");
      out.write("            // 커서를 상세주소 필드로 이동한다.\r\n");
      out.write("            document.getElementById(\"add6\").focus();\r\n");
      out.write("        }\r\n");
      out.write("    }).open();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<div id=\"order\">\r\n");
      out.write("\r\n");
      out.write("<form action=\"");
      out.print(request.getContextPath());
      out.write("/insert.po\" method=\"post\"><!-- form 태그 시작 -->\r\n");
      out.write("<h3 align=\"left\">주문하시는 분</h3>\r\n");
      out.write("<input type=\"hidden\" id=\"paint_no\" value=\"");
      out.print(po.getPaint_no());
      out.write("\" name=\"paint_no\">\r\n");
      out.write("<table class=\"table table-borderless\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"col\">이름* &nbsp; &nbsp;\r\n");
      out.write("      <input type=\"text\" id=\"name\" placeholder=\"이름\" size=\"10px\" style=\"margin-left: 50px;\" name=\"ordername\"></th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"row\">핸드폰 &nbsp;\r\n");
      out.write("       <input type=\"text\" id=\"name\" placeholder=\"010-\" size=\"10px\" style=\"margin-left: 50px;\" name=\"orderphone\"></th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"row\">E-mail\r\n");
      out.write("\r\n");
      out.write("       <input type=\"email\" id=\"email\" placeholder=\"abc@abc.com\" size=\"20px\" style=\"margin-left: 62px;\" name=\"orderEmail\"></th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th>\r\n");
      out.write("       <input type=\"text\" id=\"add1\" class=\"form-control\" placeholder=\"우편번호\" size=\"10px\" style=\"margin-left: 109px; float:left;\" name=\"orderadress1\" readonly>\t\r\n");
      out.write("       &nbsp;&nbsp;<button type=\"button\" onclick=\"execDaumPostcode();\" class=\"btn btn-outline-dark \">주소 검색</button>\r\n");
      out.write("       </th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"row\">주소\r\n");
      out.write("       <input type=\"text\" id=\"add2\" class=\"form-control\" placeholder=\"기본주소\" size=\"20px\" style=\"margin-left: 109px; \" name=\"orderadress2\" readonly></th>\r\n");
      out.write("    </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("      <th>\r\n");
      out.write("       <input type=\"text\" id=\"add3\" class=\"form-control\" placeholder=\"상세 주소\" size=\"20px\" style=\"margin-left: 109px;\" name=\"orderadress3\">\r\n");
      out.write("       </th>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<h3 align=\"left\">받으시는 분</h3>\r\n");
      out.write("<script>\r\n");
      out.write(" \r\n");
      out.write("</script>\r\n");
      out.write("<table class=\"table table-borderless\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"row\">이름 &nbsp;&nbsp;\r\n");
      out.write("       <input type=\"text\" id=\"name\" placeholder=\"이름\" size=\"10px\" style=\"margin-left: 62px;\" name=\"receivename\"></th>\r\n");
      out.write("\r\n");
      out.write("    </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("      <th scope=\"row\">핸드폰 &nbsp;\r\n");
      out.write("       <input type=\"text\" id=\"name\" placeholder=\"010-\" size=\"10px\" style=\"margin-left: 50px;\" name=\"receivephone\"></th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th>\r\n");
      out.write("       <input type=\"text\" id=\"add4\" class=\"form-control\" placeholder=\"우편번호\" size=\"10px\" style=\"margin-left: 109px; float:left;\" name=\"receiveaddress1\" readonly>\r\n");
      out.write("       &nbsp;&nbsp;<button type=\"button\" onclick=\"execDaumPostcode2();\"  class=\"btn btn-outline-dark\">주소 검색</button>\r\n");
      out.write("       </th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"row\">주소\r\n");
      out.write("       <input type=\"text\" id=\"add5\" class=\"form-control\" placeholder=\"기본주소\" size=\"20px\" style=\"margin-left: 109px;\" name=\"receiveaddress2\" readonly></th>\r\n");
      out.write("    </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("      <th>\r\n");
      out.write("       <input type=\"text\" id=\"add6\" class=\"form-control\" placeholder=\"상세 주소\" size=\"20px\" style=\"margin-left: 109px;\" name=\"receiveaddress3\">\r\n");
      out.write("       </th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("     <th scope=\"row\">전하실 말씀\r\n");
      out.write("      <textarea style=\"margin-left: 20px; resize : none;\" class=\"form-control col-sm-8\" rows=\"6\" name=\"receivecontent\"></textarea>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br celar=\"both\">\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"what\">\r\n");
      out.write("<h3 align=\"left\" style=\"margin-top: 30px; margin-left: 10px\">결제 정보</h3>\r\n");
      out.write("<br>\r\n");
      out.write("<div style=\"background: white; margin-left:10px; width:300px\">\r\n");
      out.write("<a>총 주문 금액 : ");
      out.print(po.getPatint_price());
      out.write("원</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<h3 align=\"left\" style=\"margin-top: 30px; margin-left: 10px\">결제 수단</h3>\r\n");
      out.write("\r\n");
      out.write("<div class=\"btn-group\" data-toggle=\"buttons\" style=\"margin-left:10px; width:300px;\">\r\n");
      out.write("<label class=\"btn btn-outline-dark\">\r\n");
      out.write("<input type=\"radio\" name=\"orderrule\" value=\"무통장입금\" style=\"display:none;\">무통장입금\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"btn btn-outline-dark\">\r\n");
      out.write("<input type=\"radio\" name=\"orderrule\" value=\"신용 카드\" style=\"display:none;\">신용 카드\r\n");
      out.write("</label>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<h3 align=\"left\" style=\"margin-top: 30px; margin-left: 10px\">이용 약관 안내</h3>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div style=\"background: white; margin-left:10px; width:300px\">\r\n");
      out.write("<a>아름답고 소담스러운 열매를 맺어 우리 인생을 풍부하게 하는 것이다 보라 청춘을 ! 그들의 몸이 얼마나 튼튼하며\r\n");
      out.write("\r\n");
      out.write("별과 같이 산야에 피어나는 군영과 같이 이상은 실로 인간의 부패를 방지하는 소금이라 할지니 인생에 가치를 주는 원질이 되는 것이다 그들은 앞이 긴지라 착목한는 곳이 원대하고 그들은 피가 더운지라 실현에 대한 자신과 용기가 있다 그러므로 그들은 이상의 보배를 능히 품으며 그들의 이상은 아름답고\r\n");
      out.write("\r\n");
      out.write("열매를 맺어 우리 인생을 풍부하게 하는 것이다 보라 청춘을 ! 그들의 몸이 얼마나 튼튼하며 그들</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div style=\"margin-left:10px; width:300px\">\r\n");
      out.write("<button type=\"submit\" class=\"btn btn-dark btn-sm\" style=\" width:300px;\"> 주문하기</button> <br><br>\r\n");
      out.write("<button type=\"button\" class=\"btn btn-dark btn-sm buycancel\" style=\" width:300px;\"> 취소</button> \r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("\t\t$(\".buycancel\").click(function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</div>\r\n");
      out.write("<br clear=\"both\"><br>\r\n");
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
