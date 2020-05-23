/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-23 11:24:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board.amateur;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import board.amateur.model.vo.*;
import board.notice.model.vo.*;
import java.util.ArrayList;
import member.model.vo.Member;

public final class amateurBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/board/amateur/../../common/footer.jsp", Long.valueOf(1590116113589L));
    _jspx_dependants.put("/views/board/amateur/../../common/menubar.jsp", Long.valueOf(1590229468449L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("board.notice.model.vo");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("board.amateur.model.vo");
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

	ArrayList<Amateur> list = ((ArrayList<Amateur>)request.getAttribute("list"));
	PageInfo pi = (PageInfo) request.getAttribute("pi");
	ArrayList<FileManagement> fileList = ((ArrayList<FileManagement>)request.getAttribute("fileList"));
	
	System.out.println("[jsp]게시글 리스트 출력확인:"+list);
	int listCount = pi.getListCount();
	int currentPage = pi.getCurrentPage();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
	

      out.write("    \n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>아마추어 게시판</title>\n");
      out.write(" <link rel=\"stylesheet\" href=\"");
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
      out.write("    \n");
      out.write("<style>\n");
      out.write("\t#subnav{ float: left; margin-left:20px;}\n");
      out.write("\t#goDetail{z-index:4;}\n");
      out.write("\t.container{ position : relative; margin-top:10px;}\n");
      out.write("\t.headLine{ /*float:left;*/ width:30%; /*margin-top:90px; margin-left:90px; margin-bottom:50px;*/ display:block; box-sizing:border-box;}\n");
      out.write("\t.headLine hr{ background-color:red; width:25px; border:2px solid red; margin-bottom:10px;}\n");
      out.write("\t\n");
      out.write("</style>\n");
      out.write("</head>\n");
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
      out.write("\n");
      out.write("<br clear=\"both\">\n");
      out.write("<br><br><br>\n");
      out.write("\t<!-- 아마추어 게시판 Logo -->\n");
      out.write("\t\t\t<div class=\"headLine\">\n");
      out.write("\t\t\t\t<hr style=\"display:inline-block;\">\n");
      out.write("\t\t\t\t<h3 style=\"font-size:20px;\">Amateur</h3>\n");
      out.write("\t\t\t</div><!-- class headLine end -->\n");
      out.write("\t<div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("\t\t\n");
      out.write("\t\t");
for(int i=0;i<list.size();i++){ 
      out.write("\n");
      out.write("\t        ");
 Amateur a = list.get(i); 
      out.write("\n");
      out.write("\t          \t<div id=\"goDetail\" class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("\t\t\t       <div class=\"card h-100\">\n");
      out.write(" \t\t\t             ");
for(int j=0; j<fileList.size();j++){ 
			              		FileManagement fm = fileList.get(j);
      out.write("\n");
      out.write("\t\t\t              \t\t");
if(a.getEvent_no()==fm.getEvent_no()){ 
      out.write("\n");
      out.write("\t\t\t             \t\t\t <a href=\"#\">\n");
      out.write("\t\t\t             \t\t\t \t<img class=\"card-img-top\" src=\"");
      out.print(request.getContextPath() );
      out.write("/thumbnail_uploadFiles/amateur/");
      out.print(fm.getEvent_file() );
      out.write("\" alt=\"\">\n");
      out.write("\t\t\t             \t\t\t </a>\n");
      out.write("\t\t\t              \t\t");
} 
      out.write("\n");
      out.write("\t\t\t              \t");
} 
      out.write(" \n");
      out.write("\t\t\t        \n");
      out.write("\t\t\t              <div class=\"card-body\">\t\t              \t\t\n");
      out.write("\t\t\t              \t<input id=\"event_no\" type=\"hidden\" value=\"");
      out.print(a.getEvent_no() );
      out.write("\">\n");
      out.write("\t\t\t              \t<h4 class=\"card-title\"><a href=\"#\">");
      out.print(a.getEvent_title() );
      out.write("</a></h4>\n");
      out.write("\t\t\t                <h5>");
      out.print(a.getUser_id() );
      out.write("</h5>\n");
      out.write("\t\t\t                <p>");
      out.print(a.getEvent_date() );
      out.write("</p>\n");
      out.write("\t\t\t                <p><span>조회수</span>");
      out.print(a.getHit() );
      out.write("\n");
      out.write("\t\t\t              </div><!-- class card-body end -->\n");
      out.write("\t\t\t              \n");
      out.write("\t\t\t              <div class=\"card-footer\">\n");
      out.write("\t\t\t                <img class=\"Heart\" src=\"");
      out.print(request.getContextPath() );
      out.write("/views/img/emptyHeart.png\">\n");
      out.write("\t\t              \t  \t\n");
      out.write("\t\t              \t  </div><!-- class card-footer end -->\n");
      out.write("\t\t            </div><!-- class card end -->\n");
      out.write("\t\t          </div><!-- id goDetail end -->\n");
      out.write("          ");
} 
      out.write("\n");
      out.write("         </div>\n");
      out.write("        <!-- /.row -->\n");
      out.write("\n");
      out.write("\t\t<!-- Pagination -->\n");
      out.write("\t  \t<div style=\"text-align:center;\">\n");
      out.write("\t\t\t<div class=\"col-mid-12\">\n");
      out.write("\t\t\t\t <ul class=\"pagination justify-content-center\" style=\"margin:20px 0\">\n");
      out.write("\t    \t    \t     <li class=\"page-item\"><a class=\"page-link\" href=\"");
      out.print(request.getContextPath());
      out.write("/list.am?currentPage=1\">Previous</a></li>\n");
      out.write("\t  \t\t\t\t\t");
for(int p = startPage; p<=endPage; p++){ 
      out.write("\n");
      out.write("\t  \t\t\t\t\t \t<li class=\"page-item\"><a class=\"page-link\" href=\"");
      out.print(request.getContextPath() );
      out.write("/list.am?currentPage=");
      out.print(p);
      out.write('"');
      out.write('>');
      out.print(p);
      out.write("</a></li>\n");
      out.write("\t  \t\t\t\t\t");
} 
      out.write("\n");
      out.write("\t                     <li class=\"page-item\"><a class=\"page-link\" href=\"");
      out.print(request.getContextPath() );
      out.write("/list.am?currentPage=");
      out.print(maxPage);
      out.write("\">Next</a></li>\n");
      out.write("\t        \t  </ul>\n");
      out.write("\t\t\t</div><!-- class col-mid-12 end --> \n");
      out.write("\t\t</div><!-- Pagination end --> \n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t</div><!-- contatiner end -->\n");
      out.write("      \n");
      out.write("      <!-- /.col-lg-9 -->\n");
      out.write("\n");
      out.write("      \n");
      out.write("     <button id=\"insertAma\" type=\"button active\" class=\"btn btn-secondary\" \n");
      out.write("     \t\t onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/views/board/amateur/amateurInsert.jsp'\">게시글 작성</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--footer -->\n");
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
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("$(function(){\n");
      out.write("\t$(\".card-title\").click(function(){\n");
      out.write("\t\tvar event_no = $(this).parent().children(\"input\").val();\n");
      out.write("\t\talert(\"event_no:\"+event_no);\n");
      out.write("\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/detail.am?event_no=\"+event_no;\n");
      out.write("\t\t\t\t\n");
      out.write("\t})\n");
      out.write("\t$(\".Heart\").click(function(){\n");
      out.write("        var heart = $(\".Heart\").attr('src');\n");
      out.write("        var hState;\n");
      out.write("        if(heart=='emptyHeart.png'){\n");
      out.write("            $(\".Heart\").attr('src',\"");
      out.print(request.getContextPath() );
      out.write("/views/img/colorHeart.png\");\n");
      out.write("            hState = 'Y';\n");
      out.write("        }\n");
      out.write("        if(heart=='colorHeart.png'){\n");
      out.write("            $(\".Heart\").attr('src',\"");
      out.print(request.getContextPath() );
      out.write("/views/img/emptyHeart.png\");\n");
      out.write("            hState= 'N';\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("})\n");
      out.write("//하트 변경\n");
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
