/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-13 05:16:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.mypage_005fuser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mypage_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/mypage_user/../common/menubar.jsp", Long.valueOf(1589280864515L));
    _jspx_dependants.put("/views/mypage_user/../common/footer.jsp", Long.valueOf(1589256474995L));
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write(" <link href=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../css/bootstrap.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../css/Style-mypagehead.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../css/Style-refund.css\">\r\n");
      out.write("  \r\n");
      out.write("<script src=\"../js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/bootstrap.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
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
      out.write("            <a href =\"#\" class=\"iconRm\" style=\"important!\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/views/img/login2.png\"></a>\r\n");
      out.write("            <a href =\"#\" class=\"iconRm\" style=\"important!\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/views/img/search2.png\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header> \r\n");
      out.write("    <br clear=\"both\">\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t<div class=\"headline\">\r\n");
      out.write("        <div class=\"headline-text\">\r\n");
      out.write("            <hr>\r\n");
      out.write("            <h3 style=\"font-size: 20px;\">마이 페이지</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <br>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    <ul class=\"nav nav-pills nav-fill\" align=\"left\">\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("            김다슬님은 _____등급입니다\r\n");
      out.write("            <a href=\"#\" class=\"btn btn-secondary btn-sm active\" role=\"button\" aria-pressed=\"true\">등급 혜택보기</a>&nbsp;\r\n");
      out.write("            <a href=\"#\" class=\"btn btn-outline-secondary btn-sm active\" role=\"button\" aria-pressed=\"true\">마일리지:0 point</a>\r\n");
      out.write("            </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <br>\r\n");
      out.write("    \r\n");
      out.write("    <div class = \"refund-table\">\r\n");
      out.write("            <div class=\"table-headline\">\r\n");
      out.write("                <div><span><b>최근 주문내역</b></span></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <table style=\"width:100%\" name=\"refund-list\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th></th>\r\n");
      out.write("                    <th>주문 번호</th>\r\n");
      out.write("                    <th>상품명</th>\r\n");
      out.write("                    <th>금액</th>\r\n");
      out.write("                    <th>주문일자</th>\r\n");
      out.write("                    <th>배송현황</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"checkbox\"></td>\r\n");
      out.write("                    <td>p0001</td>\r\n");
      out.write("                    <td>작품명 : Remember Me</td>\r\n");
      out.write("                    <td>10,000</td>\r\n");
      out.write("                    <td>2020-05-13</td>\r\n");
      out.write("                    <td>환불 요청</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div style=\"width : 350px; margin : 0 auto;\">\r\n");
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
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
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