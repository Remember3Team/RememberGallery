/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-12 05:35:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.mypage_005fartist;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class art_002dregistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/mypage_artist/../common/menubar.jsp", Long.valueOf(1589255202411L));
    _jspx_dependants.put("/views/mypage_artist/../common/footer.jsp", Long.valueOf(1589256758532L));
    _jspx_dependants.put("/views/mypage_artist/../common/mypagehead.jsp", Long.valueOf(1589256758489L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>art-registration</title>\n");
      out.write("</head>\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/Style-ar.css\">\n");
      out.write("<body>\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>메뉴바</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/views/css/style.css\">\r\n");
      out.write(" <link href=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<header id=\"menu\">\r\n");
      out.write("       <div id=\"logo\">\r\n");
      out.write("        <a href=\"");
      out.print( request.getContextPath() );
      out.write("/index.jsp\" class=\"logo\">\r\n");
      out.write("            <img src=\"");
      out.print( request.getContextPath() );
      out.write("/views/img/logo-02.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("      </div>\r\n");
      out.write("                 <ul class = \"navi\">\r\n");
      out.write("                    <li><a href=\"#\">ABOUT</a></li>\r\n");
      out.write("                    <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/views/product/product.jsp\">STORE</a></li>\r\n");
      out.write("                    <li><a href=\"#\">COMMUNITY</a>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/views/board/amateur/amateurBoard.jsp\">아마추어 게시판</a></li>\r\n");
      out.write("                            <li><a href=\"#\">자유게시판</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\">NOTICE</a>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/list.no\">공지사항</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/views/inquiry/inquiryBoard.jsp\">1:1문의</a></li>\r\n");
      out.write("                        </ul>    \r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("        <!--icon :: 색상변경 또는 없애버리고 메뉴바 만들기-->\r\n");
      out.write("        <div id=\"loginWrap\">\r\n");
      out.write("            <a href =\"#\" class=\"icon\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/views/img/login2.png\"></a>\r\n");
      out.write("            <a href =\"#\" class=\"icon\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/views/img/search2.png\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header> \r\n");
      out.write("    <br clear=\"both\">\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
      out.write("            <li><a href=\"#\">상품 관리</a></li><a>|</a>\n");
      out.write("            <li><a href=\"#\">주문 관리</a></li><a>|</a>\n");
      out.write("            <li><a href=\"#\">배송 관리</a></li><a>|</a>\n");
      out.write("            <li><a href=\"#\">반품 / 환불 관리</a></li><a>|</a>\n");
      out.write("            <li><a href=\"#\">문의 내역</a></li>\n");
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
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <form action=\"#\">\n");
      out.write("            <!--section1-->\n");
      out.write("            <div class=\"section1\" style=\"padding-bottom: 100px;\">\n");
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
      out.write("                        <select name=\"select-thema\">\n");
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
      out.write("                        <label class=\"labelfirst\">태그</label><input class=\"tag\" type=\"text\" name=\"tag\">\n");
      out.write("                        <button class=\"tag-button\">취소</button><button class=\"tag-button\"\n");
      out.write("                            style=\"margin-right: 5px;\">태그추가</button>\n");
      out.write("                        <div id=\"tag-area\"></div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"info-box7\">\n");
      out.write("                        <label class=\"labelfirst\">상세 설명</label>\n");
      out.write("                        <textarea>\n");
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
      out.write("                    <div class=\"img-box\">\n");
      out.write("                        <label class=\"labelsecond\">대표 이미지</label>\n");
      out.write("                        <div class=\"img-upload1\">\n");
      out.write("                            <label for=\"file\">파일 첨부하기</label>\n");
      out.write("                            <input type=\"file\" id=\"file\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr style=\"margin-bottom:30px;\">\n");
      out.write("                    <div class=\"img-box2\">\n");
      out.write("                        <label class=\"labelsecond\">추가 이미지<br>(0/5)</label>\n");
      out.write("                        <div class=\"img-upload2\">\n");
      out.write("                            <label for=\"file\">파일 첨부하기</label>\n");
      out.write("                            <input type=\"file\" id=\"file\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"submit-box\">\n");
      out.write("                <button class = \"submit-bt\" type=submit>제출하기</button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    </form>\n");
      out.write("    </div>\n");
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
