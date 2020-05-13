<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴바</title>
  <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/style.css">
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
                    <!-- <li><a href="<%= request.getContextPath() %>/views/product/product.jsp">STORE</a></li> -->
                    <li><a href="<%= request.getContextPath() %>/list.po">STORE</a></li>
                    <li><a href="#">COMMUNITY</a>
                        <ul>
                            <li><a href="<%= request.getContextPath() %>/views/board/amateur/amateurBoard.jsp">아마추어 게시판</a></li>
                            <li><a href="#">자유게시판</a></li>
                        </ul>
                    </li>
                    <li><a href="#">NOTICE</a>
                        <ul>
                            <li><a href="<%=request.getContextPath()%>/list.no">공지사항</a></li>
                            <li><a href="<%= request.getContextPath() %>/views/inquiry/inquiryBoard.jsp">1:1문의</a></li>
                        </ul>    
                    </li>
                </ul>
        <!--icon :: 색상변경 또는 없애버리고 메뉴바 만들기-->
        <div id="loginWrap">
            <a href ="<%= request.getContextPath() %>/views/mypage_artist/product_management.jsp" class="icon"><img src="<%= request.getContextPath() %>/views/img/login2.png"></a>
          <!--마이페이지로 넘어가는부분 잠시 수정 -->
            <a href ="#" class="icon"><img src="<%= request.getContextPath() %>/views/img/search2.png"></a>
        </div>


	</header>

	<br clear="both">
	<div id="Login_pop">

	<br clear="both">
	<!-- 스크립트 부분 -->

	<script>
		/*로그인 입력 안했을 시 => alter창 또는 팝업창 띄운 후, error 페이지로 연결*/
		function validate() {
			if ($("#userId").val().trim().length == 0) {
				alert("아이디를 입력하세요");
				$("#userId").focus();
				return false;
			}
			//비밀번호를 입력하지 않았을 때
			if ($("#userPwd").val().trim().length == 0) {
				alert("비밀번호를 입력하세요");
				$("#userPwd").focus();

				return false;
			}
			return true;
		}
	</script>

    </header> 
    <br clear="both">

</body>
</html>