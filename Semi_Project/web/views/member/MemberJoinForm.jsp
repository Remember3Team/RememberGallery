<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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



</head>
<body>
	<%@include file="../common/menubar.jsp"%>

	<br clear="both">
	<div id="aa">
		<div id="bb">abc</div>
	</div>


	<script>
			function abc() {
				if ($("#aa").css('opacity') == '0') {
					$("#aa").css("opacity", "1");

				} else if ($("#aa").css('opacity') == '1') {
					$("#aa").css("opacity", "0");
				}
			}
		</script> 


	<%@include file="../common/footer.jsp"%>
</body>

</html>