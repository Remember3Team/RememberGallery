/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-12 11:00:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board.amateur;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class amateurBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/board/amateur/../../common/footer.jsp", Long.valueOf(1589256474995L));
    _jspx_dependants.put("/views/board/amateur/../../common/menubar.jsp", Long.valueOf(1589280864515L));
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
      out.write("<title>Insert title here</title>\n");
      out.write(" <link rel=\"stylesheet\" href=\"../../css/style.css\">\n");
      out.write(" <link href=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\" rel=\"stylesheet\">\n");
      out.write(" <link rel=\"stylesheet\" href=\"../../css/bootstrap.css\">\n");
      out.write("<script src=\"../../js/jquery-3.4.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../../js/bootstrap.js\"></script>    \n");
      out.write("<style>\n");
      out.write("\t#subnav{ float: left; margin-left:20px;}\n");
      out.write("\t#goDetail{z-index:4;}\n");
      out.write("\t.container{\n");
      out.write("\tposition : relative;\n");
      out.write("\tmargin-top:10px;}\n");
      out.write("</style>\n");
      out.write("</head>\n");
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
      out.write("\n");
      out.write("<br clear=\"both\">\n");
      out.write("<br><br><br>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<ul id=\"subnav\" class=\"nav flex-column\">\n");
      out.write("\t\t  <li class=\"nav-item\">\n");
      out.write("\t\t    <a class=\"nav-link active\" href=\"amateurBoard.jsp\">아마추어 게시판</a>\n");
      out.write("\t\t  </li>\n");
      out.write("\t\t  <li class=\"nav-item\">\n");
      out.write("\t\t    <a class=\"nav-link\" href=\"../free/freeBoard.jsp\">자유 게시판</a>\n");
      out.write("\t\t  </li>\n");
      out.write("\t\t</ul>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("          <div id=\"goDetail\" class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <h4 class=\"card-title\">\n");
      out.write("                  <a href=\"#\">작품 이름</a>\n");
      out.write("                </h4>\n");
      out.write("                <h5>작가 이름</h5>\n");
      out.write("                <p>가격</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <svg class=\"bi bi-heart\" width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("  \t\t\t\t\t<path fill-rule=\"evenodd\" d=\"M8 2.748l-.717-.737C5.6.281 2.514.878 1.4 3.053c-.523 1.023-.641 2.5.314 4.385.92 1.815 2.834 3.989 6.286 6.357 3.452-2.368 5.365-4.542 6.286-6.357.955-1.886.838-3.362.314-4.385C13.486.878 10.4.28 8.717 2.01L8 2.748zM8 15C-7.333 4.868 3.279-3.04 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 01.176-.17C12.72-3.042 23.333 4.867 8 15z\" clip-rule=\"evenodd\"/>\n");
      out.write("\t\t\t\t</svg>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        <div id=\"goDetail\" class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <h4 class=\"card-title\">\n");
      out.write("                  <a href=\"#\">작품 이름</a>\n");
      out.write("                </h4>\n");
      out.write("                <h5>작가 이름</h5>\n");
      out.write("                <p>가격</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <svg class=\"bi bi-heart-fill\" width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("  \t\t\t\t\t<path fill-rule=\"evenodd\" d=\"M8 1.314C12.438-3.248 23.534 4.735 8 15-7.534 4.736 3.562-3.248 8 1.314z\" clip-rule=\"evenodd\"/>\n");
      out.write("\t\t\t\t</svg>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("            <div id=\"goDetail\" class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <h4 class=\"card-title\">\n");
      out.write("                  <a href=\"#\">작품 이름</a>\n");
      out.write("                </h4>\n");
      out.write("                <h5>작가 이름</h5>\n");
      out.write("                <p>가격</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <svg class=\"bi bi-heart-fill\" width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("  \t\t\t\t\t<path fill-rule=\"evenodd\" d=\"M8 1.314C12.438-3.248 23.534 4.735 8 15-7.534 4.736 3.562-3.248 8 1.314z\" clip-rule=\"evenodd\"/>\n");
      out.write("\t\t\t\t</svg>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("             <div id=\"goDetail\" class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <h4 class=\"card-title\">\n");
      out.write("                  <a href=\"#\">작품 이름</a>\n");
      out.write("                </h4>\n");
      out.write("                <h5>작가 이름</h5>\n");
      out.write("                <p>가격</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <svg class=\"bi bi-heart-fill\" width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("  \t\t\t\t\t<path fill-rule=\"evenodd\" d=\"M8 1.314C12.438-3.248 23.534 4.735 8 15-7.534 4.736 3.562-3.248 8 1.314z\" clip-rule=\"evenodd\"/>\n");
      out.write("\t\t\t\t</svg>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("             <div id=\"goDetail\" class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <h4 class=\"card-title\">\n");
      out.write("                  <a href=\"#\">작품 이름</a>\n");
      out.write("                </h4>\n");
      out.write("                <h5>작가 이름</h5>\n");
      out.write("                <p>가격</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <svg class=\"bi bi-heart-fill\" width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("  \t\t\t\t\t<path fill-rule=\"evenodd\" d=\"M8 1.314C12.438-3.248 23.534 4.735 8 15-7.534 4.736 3.562-3.248 8 1.314z\" clip-rule=\"evenodd\"/>\n");
      out.write("\t\t\t\t</svg>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("   \t\t\t<div id=\"goDetail\" class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <h4 class=\"card-title\">\n");
      out.write("                  <a href=\"#\">작품 이름</a>\n");
      out.write("                </h4>\n");
      out.write("                <h5>작가 이름</h5>\n");
      out.write("                <p>가격</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <svg class=\"bi bi-heart\" width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("  \t\t\t\t\t<path fill-rule=\"evenodd\" d=\"M8 2.748l-.717-.737C5.6.281 2.514.878 1.4 3.053c-.523 1.023-.641 2.5.314 4.385.92 1.815 2.834 3.989 6.286 6.357 3.452-2.368 5.365-4.542 6.286-6.357.955-1.886.838-3.362.314-4.385C13.486.878 10.4.28 8.717 2.01L8 2.748zM8 15C-7.333 4.868 3.279-3.04 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 01.176-.17C12.72-3.042 23.333 4.867 8 15z\" clip-rule=\"evenodd\"/>\n");
      out.write("\t\t\t\t</svg>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.row -->\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      \t\t<div style=\"text-align:center;\">\n");
      out.write("\t\t\t<div class=\"col-mid-12\">\n");
      out.write("\t\t\t\t <ul class=\"pagination justify-content-center\" style=\"margin:20px 0\">\n");
      out.write("\t    \t    \t     <li class=\"page-item\"><a class=\"page-link\" href=\"#\">Previous</a></li>\n");
      out.write("\t  \t\t\t\t\t <li class=\"page-item active\"><a class=\"page-link\" href=\"#\">1</a></li>\n");
      out.write("\t  \t\t\t\t\t <li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\n");
      out.write("\t  \t\t\t\t\t <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\n");
      out.write("\t                     <li class=\"page-item\"><a class=\"page-link\" href=\"#\">Next</a></li>\n");
      out.write("\t        \t  </ul>\n");
      out.write("\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("      <!-- /.col-lg-9 -->\n");
      out.write("\n");
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
