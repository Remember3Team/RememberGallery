<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴바</title>
<<<<<<< HEAD

=======
>>>>>>> refs/remotes/origin/master
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
        

<<<<<<< HEAD

	</header>

	<br clear="both">
	<div id="Login_pop">

		<%
			if (loginUser == null) {
		%>
		<div id="LoginArea">
			<form method="get" action="<%=request.getContextPath()%>/login.me"
				onsubmit="return validate();">
				<a href="<%=request.getContextPath()%>/index.jsp"><img
					src="<%=request.getContextPath()%>/views/img/close2.png"></a> <br>
				<br> <br>
				<h1 align="center">로그인</h1>
				<table class="inputinfo">
					<tr>
						<td><label>ID:</label>
						<td>
						<td><input type="text" name="userId" id="userId"></td>
					</tr>
					<tr>
						<td><label>PW: </label>
						<td>
						<td><input type="password" name="userPwd" id="userPwd"></td>
					</tr>
				</table>

				<div class="btns" align="center">
					<div id="memberJoinBtn">회원가입</div>
					<div id="LoginBtn" style="display: inline-block;">
						<input type="submit" value="로그인">
					</div>

				</div>

			</form>
			<script>
				/* 로그인 팝업창 띄우기  */
				function login_btn() {
					if ($("#Login_pop").css('opacity') == '0') {
						$("#Login_pop").css("opacity", "0.9");

					} else if ($("#Login_pop").css('opacity') == '0.9') {
						$("#Login_pop").css("opacity", "0");
					}
				}
			</script>
			<%
				} else {
			%>
			<div id="LoginArea" >
				<label><%=loginUser.getUserName()%>님의 방문을 환영합니다.</label>
				<div class="btns" align="right">
					<div id="myPage"
						onclick="location.href='myPage.me?userId=<%=loginUser.getUserId()%>';">정보수정</div>
					<div id="logoutBtn" onclick="logout();">로그아웃</div>
				</div>
			</div>
			<%
				}
			%>
		</div>
	</div>


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

=======
    </header> 
    <br clear="both">
>>>>>>> refs/remotes/origin/master
</body>
</html>