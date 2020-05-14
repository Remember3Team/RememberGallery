<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String message = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/style.css">
<link
	href="https://fonts.googleapis.com/css2?family=Roboto&display=swap"
	rel="stylesheet">


<script src="../js/jquery-3.4.1.min.js"></script>

<style>
</style>
</head>
<body
	Style="width: 100%; height: 600px; background-color: white; text-align: center;">
	<%@include file="../views/common/menubar.jsp"%>

	<form method="get" action="<%=request.getContextPath()%>/login.me"
		onsubmit="return validate(); ">
		<h2
			Style="margin-top: 100px; color: black; margin-bottom: 100px; margin-left: 20px;">로그인
			실패</h2>
		<table class="inputinfo_big" Style="color: black; margin: 0 auto;">
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

		<div class="btns" align="center" style="margin-top: 30px;">
			<div id="JoinBtn_big" Style="background-color: red;">
				<a href="#" Style="color: white; text-decoration: none;">회원가입</a>
			</div>
			<div id="LoginBtn_big"
				Style="background-color: red; margin-top: 2px;">
				<a href="#" Style="color: white; text-decoration: none;">로그인</a>
			</div>
			<br> <a href="#" Style="color: black; text-decoration: none;">아이디/비밀번호
				찾기</a>
			<div id="Id"></div>
			</div>
	</form>


</body>
</html>