<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%
    	String message = (String)request.getAttribute("msg");
    	
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
<body Style ="width:100%; height:600px; background-color:beige;">
	<%@include file="../common/menubar.jsp" %>
<h1 style= "color:black";> 실패 창</h1>
<a href = "#">아이디 찾기</a>
/
<a href = "#">비밀번호 찾기</a>

	
</body>
</html>