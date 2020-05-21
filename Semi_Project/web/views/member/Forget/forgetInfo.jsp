<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/views/css/Style-forgetinfo.css">


<script src="../js/jquery-3.4.1.min.js"></script>
<style>
#contents {
	height: 600px;
}
W
</style>
</head>


</head>
<body>
	<%@include file="../../common/menubar.jsp"%>
	<div id="contents">

		<div
			style="margin: 0 auto; width: 500px; height: 300px;  ">
			<h1
				style="color: black; text-align: center; margin: 0; padding-top: 120px;">아이디
				찾기</h1>
				<br>
			<hr style="border: 2px solid red">
			<div
				style="width: 250px; height: 200px;  margin: 0 auto; padding-top:40px;">
				<label>이름</label><input type="text" id="name" style="float:right;"> <br> <label>이메일
					주소</label><input type="text" id="email" style="float:right;">
			<button style="float:right">아이디 찾기</button>
			</div>
		</div>


		<div
			style="margin: 0 auto; width: 500px; height: 300px; ">
			<h1 style="color: black; text-align: center; padding-top: 20px;">비밀번호
				찾기</h1>
			<br>	
			<hr style="border: 2px solid red">
			<div style="width: 250px; height: 200px;  margin: 0 auto;padding-top:40px;">
				<label>이름</label><input type="text" id="name"style="float:right;"> <br> <label>아이디</label><input
					type="text" id="id" style="float:right;"> <br> <label>이메일 주소</label><input
					type="text" id="email" style="float:right;">
<button style="float:right">비밀번호 찾기</button>
			</div>
		</div>

	</div>
	<%@include file="../../common/footer.jsp"%>


</body>
</html>