<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="../../css/style.css">
 <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
 <link rel="stylesheet" href="../../css/bootstrap.css">
<script src="../../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../../js/bootstrap.js"></script>    
<style>
	#goNoticeBoard{ float:right; margin-right:100px; }
 	#noticeDetail div{margin: 0 auto;}
	#subnav{float:left; margin-left:20px;}
</style>
</head>
<body>
<%@include file="../../common/menubar.jsp" %>
		<ul id="subnav" class="nav flex-column">
		  <li class="nav-item">
		    <a class="nav-link active" href="noticeBoard.jsp">공지사항</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="../inquiry/inquiryBoard.jsp">1:1문의</a>
		  </li>
		</ul>
	<div id="noticeDetail" class="row">
		<div class="cols-sm-6">

			<br>
			<table class="table">
				<tr>
					<td>제목</td>
					<td  colspan="6">사이트 이용문의 안내입니다.</td>
				</tr>
				<tr>
					<td>작성자</td>
					<td><span>관리자</span></td>
					<td>조회수</td>
					<td><span>1,030,203</span></td>
					<td>작성일</td>
					<td><span>2020-05-10</span>
				</tr>
				<tr>
					<td colspan="6">내용</td>
				</tr>
					<td colspan="6">
						<p>
							내용에 대한 값을 불러오려고 합니다.
						</p>
					</td>
			</table>
		</div>
	</div>
	<button id="goNoticeBoard" type="button active" class="btn btn-secondary" 
		onclick="location.href='<%=request.getContextPath()%>/views/board/notice/noticeBoard.jsp'">목록으로 가기</button>
	
<br><br><br>
<%@include file="../../common/footer.jsp" %>
</body>
</html>