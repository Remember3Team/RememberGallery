<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
#LoginBtn input, #memberJoinBtn, #logoutBtn, #myPage {
	display: inline-block;
	vertical-align: middle;
	text-align: center;
	background: red;
	color: white;
	height: 30px;
	width: 100px;
}

#memberJoinBtn {
	background: gray;
}

#loginBtn:hover
      #memberJoinBtn:hover, #logoutBtn:hover, #memberJoinBtn:hover,
	#myPage:hover {
	cursor: pointer;
}
</style>

<body>
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


	<%@include file="../common/menubar.jsp"%>
	<!-- section1 -->

	<section id="content"
		style="background: gray; height: 650px; margin-top: -62px;">

		<pre>
      </pre>
		<form method="get" action="<%=request.getContextPath()%>/login.me"
			onsubmit="return validate();">
			<br> <br> <br>
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
				<div id="memberJoinBtn" style="background-color:white;">
					<a
						href="<%=request.getContextPath()%>/views/member/signUp.jsp"
						style="text-decoration: none; color: black;">회원가입</a>
				</div>
				<div id="LoginBtn" style="display: inline-block;">
					<input type="submit" value="로그인">
				</div>

			</div>

		</form>
		<%-- 	
		<div id="LoginArea">
			<label><%=loginUser.getUserName()%>님의 방문을 환영합니다.</label>
			<div class="btns" align="right">
				<div id="myPage"
					onclick="location.href='myPage.me?userId=<%=loginUser.getUserId()%>';">정보수정
				</div>
				<div id="logoutBtn" onclick="logout();">로그아웃</div>
			</div>
		</div>

	 --%>
	</section>

	<%@include file="../common/footer.jsp"%>
</body>
</html>