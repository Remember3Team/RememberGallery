/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-22 06:04:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board.amateur;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import board.amateur.model.vo.*;
import java.util.ArrayList;
import member.model.vo.Member;

public final class amateurDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/board/amateur/../../common/footer.jsp", Long.valueOf(1590116113589L));
    _jspx_dependants.put("/views/board/amateur/../../common/menubar.jsp", Long.valueOf(1590047285721L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
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

	Amateur a = (Amateur)request.getAttribute("amateur");
	FileManagement fm = (FileManagement)request.getAttribute("fileList");
	ArrayList<Reply> rList = (ArrayList<Reply>)request.getAttribute("rList");
	
	System.out.println("[jsp] 출력 결과 : "+rList);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>");
      out.print(a.getEvent_title() );
      out.write("</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/style.css\">\n");
      out.write(" <link href=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\" rel=\"stylesheet\">\n");
      out.write(" <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/bootstrap.css\">\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/views/js/jquery-3.4.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/views/js/bootstrap.js\"></script>    \n");
      out.write("<style>\n");
      out.write("\t#detailArea div{ margin:0 auto; margin-top:100px; width:80%;}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- header -->\n");
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
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write(" \t <div class=\"container\"> \n");
      out.write("         <div class=\"row\" id=\"detailArea\">\n");
      out.write("            <div class=\"cols-sm-6\">\n");
      out.write("               <table align=\"center\" class=\"table\">\n");
      out.write("                  <tr>\n");
      out.write("                     <td>제목</td>\n");
      out.write("                     <td colspan=\"4\"><span>");
      out.print(a.getEvent_title() );
      out.write("</span></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                     <td>작성자</td>\n");
      out.write("                     <td><span>");
      out.print(a.getUser_id() );
      out.write("</span></td>\n");
      out.write("                     \n");
      out.write("                     <td>작성일</td>\n");
      out.write("                     <td><span>");
      out.print(a.getEvent_date() );
      out.write("</span></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                     <td colspan=\"4\"><span>내용</span></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                     <td colspan=\"4\">\n");
      out.write("                        <p>\n");
      out.write("                           ");
      out.print(a.getEvent() );
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("                        \t<a href=\"#\">\n");
      out.write("\t\t\t             \t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/thumbnail_uploadFiles/amateur/");
      out.print(fm.getEvent_file() );
      out.write("\" alt=\"\">\n");
      out.write("\t\t\t             \t</a>\n");
      out.write("                        </p>\n");
      out.write("                     </td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                  \t<td> 좋아요 </td>\n");
      out.write("                  \t<td> \n");
      out.write("                  \t\t<div style=\"float:right; onclick=\"emptyheartCheck();\" class=\"emptyheartCheck\">\n");
      out.write("      \t\t\t\t\t\t<input id=\"paint_no\" type=\"hidden\" value=\"");
      out.print(a.getEvent_like());
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t");
if(a.getUser_id() != null){ 
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"heartcheck\" src=\"");
      out.print(request.getContextPath());
      out.write("/views/img/emptyHeart.png\">\n");
      out.write("\t\t\t\t\t\t\t");
}else{
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"heartcheck\" src=\"");
      out.print(request.getContextPath());
      out.write("/views/img/emptyHeart.png\">\n");
      out.write("\t\t\t\t\t\t\t");
} 
      out.write(" \n");
      out.write("      \t\t     \t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <br><br><br>\n");
      out.write("                  <tr>\n");
      out.write("\t\t\t\t\t<td>댓글작성</td>\n");
      out.write("\t\t\t\t\t<td><textArea rows=\"5\" cols=\"80\" id=\"replyContent\"></textArea></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<button id=\"addReply\" type=\"button active\" class=\"btn btn-secondary\" style=\"width:100px;\">댓글등록</button>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t  </tr>\n");
      out.write("\t\t\t\t  <br><br>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t\t<script>\n");
      out.write("\t\t\t\t $(function(){\n");
      out.write("\t\t\t\t      $(\".heartcheck\").click(function(){\n");
      out.write("\t\t\t\t    \t  var event_no = \"");
      out.print(a.getEvent_no());
      out.write("\";\n");
      out.write("\t\t\t\t    \t  var heart = $(\".heartcheck\").attr('src');\n");
      out.write("\t\t\t\t    \t  var heartYN;\n");
      out.write("\n");
      out.write("\t\t\t\t    \t  if(heart=='");
      out.print(request.getContextPath());
      out.write("/views/img/colorHeart.png'){\n");
      out.write("\t\t\t\t    \t\t  $(\".heartcheck\").attr('src','");
      out.print(request.getContextPath());
      out.write("/views/img/emptyHeart.png');\n");
      out.write("\t\t\t\t    \t\t  heartYN = 'N';\n");
      out.write("\t\t\t\t    \t  }else{\n");
      out.write("\t\t\t\t    \t\t  $(\".heartcheck\").attr('src','");
      out.print(request.getContextPath());
      out.write("/views/img/colorHeart.png');\n");
      out.write("\t\t\t\t    \t\t  heartYN = 'Y';\n");
      out.write("\t\t\t\t    \t  }\n");
      out.write("\t\t\t\t    \t  $.ajax({\n");
      out.write("\t\t\t\t    \t\turl:\"like.am\",\n");
      out.write("\t\t\t\t    \t\ttype:\"post\",\n");
      out.write("\t\t\t\t    \t\tdata:{event_no:event_no,heartYN:heartYN},\n");
      out.write("\t\t\t\t   \n");
      out.write("\t\t\t\t    \t\tsuccess:function(data){\n");
      out.write("\t\t\t\t    \t\t\tvar $likeCount = $(\".likeCount\");\n");
      out.write("\t\t\t\t    \t\t\tvar $count = $(\"<span>\").text(data);\n");
      out.write("\t\t\t\t    \t\t\t\n");
      out.write("\t\t\t\t    \t\t\t$likeCount.html($count);\n");
      out.write("\t\t\t\t    \t\t\t\n");
      out.write("\t\t\t\t    \t\t},\n");
      out.write("\t\t\t\t    \t\terror:function(request,statur,error){\n");
      out.write("\t\t\t\t    \t\t\talert(\"로그인을 하셔야 합니다.\");\n");
      out.write("\t\t\t\t    \t\t\t $(\".heartcheck\").attr('src','");
      out.print(request.getContextPath());
      out.write("/views/img/emptyHeart.png');\n");
      out.write("\t\t\t\t    \t\t}\n");
      out.write("\t\t\t\t    \t\t  \n");
      out.write("\t\t\t\t    \t  })\n");
      out.write("\t\t\t\t</script>\n");
      out.write("       <div id=\"replySelectArea\">\n");
      out.write("\t\t\t<table id=\"replySelectTable\" class=\"table\" align=\"center\">\n");
      out.write("\t\t\t\t");
 if(rList.isEmpty()) { 
      out.write("\n");
      out.write("\t\t\t\t\t<tr><td colspan=\"3\">댓글이 없습니다.</td></tr>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t");
 }else { 
      out.write("\n");
      out.write("\t\t\t\t\t");
 for(int i=rList.size()-1; i>=0; i--){ 
      out.write("\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td width=\"100px\">");
      out.print( rList.get(i).getUser_id() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t<td width=\"400px\">");
      out.print( rList.get(i).getReply() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t<td width=\"200px\">");
      out.print( rList.get(i).getReply_date() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("            </div><!-- cols-sm-6 div end -->\n");
      out.write("         </div><!-- row div end -->\n");
      out.write("       </div><!-- container div end -->\n");
      out.write(" \n");
      out.write("\t\t<button id=\"goAmateurBoard\" type=\"button active\" class=\"btn btn-secondary\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/views/board/amateur/amateurBoard.jsp'\">목록으로 가기</button>\n");
      out.write("   </body>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\t\t$(function(){\n");
      out.write("\t\t\t$(\"#addReply\").click(function(){\n");
      out.write("\t\t\t\tvar writer = \"");
      out.print(loginUser.getUserId());
      out.write("\";\n");
      out.write("\t\t\t\tvar bid = ");
      out.print(a.getEvent_no());
      out.write(";\n");
      out.write("\t\t\t\tvar content = $(\"#replyContent\").val();\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\turl:\"insertReply.am\",\n");
      out.write("\t\t\t\t\ttype:\"post\",\n");
      out.write("\t\t\t\t\tdata:{writer:writer,content:content,bid:bid},\n");
      out.write("\t\t\t\t\tsuccess:function(data){\n");
      out.write("\t\t\t\t\t\t$replyTable = $(\"#replySelectTable\");\n");
      out.write("\t\t\t\t\t\t$replyTable.html(\"\");\n");
      out.write("\t\t\t\t\t\tfor(var key in data){\n");
      out.write("\t\t\t\t\t\t\tvar $tr = $(\"<tr>\");\n");
      out.write("\t\t\t\t\t\t\tvar $writerTd = $(\"<td>\").text(data[key].user_id).css(\"width\",\"100px\");\n");
      out.write("\t\t\t\t\t\t\tvar $contentTd =$(\"<td>\").text(data[key].reply).css(\"width\",\"400px\");\n");
      out.write("\t\t\t\t\t\t\tvar $dateTd = $(\"<td>\").text(data[key].reply_date).css(\"width\",\"200px\");\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t$tr.append($writerTd);\n");
      out.write("\t\t\t\t\t\t\t$tr.append($contentTd);\n");
      out.write("\t\t\t\t\t\t\t$tr.append($dateTd);\n");
      out.write("\t\t\t\t\t\t\t$replyTable.append($tr);\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t$(\"#replyContent\").val(\"\");  \n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\terror:function(request,statur,error){\n");
      out.write("\t\t\t\t\t\talert(\"code:\"+request.status+\"\\n\"+\"message:\"+request.responseText+\"\\n\"+\"error\"+error);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t})\n");
      out.write("\t\t\t})\n");
      out.write("\t\t})\n");
      out.write("\t</script>\n");
      out.write("<!-- footer -->\t\n");
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
