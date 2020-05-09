<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴바</title>
 <link rel="stylesheet" href="views/css/style.css">
 <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
</head>
<body>
<header id="menu">
       <div id="logo">
        <a href="<%= request.getContextPath() %>/index.jsp" class="logo">
            <img src="<%= request.getContextPath() %>/views/img/logo-02.png">
        </a>
      </div>
                 <ul class = "navi">
                    <li><a href="#">ABOUT</a></li>
                    <li><a href="views/product/product.jsp">STORE</a></li>
                    <li><a href="#">COMMUNITY</a>
                        <ul>
                            <li><a href="#">아마추어 게시판</a></li>
                            <li><a href="#">자유게시판</a></li>
                        </ul>
                    </li>
                    <li><a href="#">NOTICE</a>
                        <ul>
                            <li><a href="#">공지사항</a></li>
                            <li><a href="#">1:1문의</a></li>
                        </ul>    
                    </li>
                </ul>
        <!--icon :: 색상변경 또는 없애버리고 메뉴바 만들기-->
        <div id="loginWrap">
            <a href ="#" class="icon" ><img src="<%= request.getContextPath() %>/views/img/login2.png"></a>
            <a href ="#" class="icon"><img src="<%= request.getContextPath() %>/views/img/search2.png"></a>
        </div>
      
    </header> 

</body>
</html>