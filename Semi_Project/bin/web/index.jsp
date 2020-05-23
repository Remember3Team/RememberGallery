<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8"> 
<title>Insert title here</title>

</head>
<body>

	<%@include file="views/common/menubar.jsp" %>
	<%@include file="views/main/main.jsp" %>
	<input type="button" value="바로 구매하기"
	
			style="background-color: rgb(224, 224, 224); margin-top: 10px;"
			onclick="location.href='<%=request.getContextPath()%>/views/mypage_artist/art-registration.jsp'">

	<input type="button" value="sammy"
			style="background-color: rgb(224, 224, 224); margin-top: 10px;"
			onclick="location.href='<%=request.getContextPath()%>/views/mypage_artist/art-apply.jsp'">
			
				<input type="button" value="sammy2"
			style="background-color: rgb(224, 224, 224); margin-top: 10px;"
			onclick="location.href='<%=request.getContextPath()%>/list.ar'">

	<%@include file="views/common/footer.jsp" %>
</body>
</html>