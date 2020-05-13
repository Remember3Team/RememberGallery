<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.notice.model.vo.Notice"%>
<%
	Notice n = (Notice)request.getAttribute("notice");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/style.css">
 <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
 <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/bootstrap.css">
<script src="<%=request.getContextPath() %>/views/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/views/js/bootstrap.js"></script>    
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
			
			<table align="center" class="table">
				<tr>
					<td>제목</td>
					<td colspan="4"><span><%=n.getNoti_title() %></span></td>
				</tr>
				<tr>
					<td>작성자</td>
					<td><span>관리자</span></td>
					
					<td>작성일</td>
					<td><span><%=n.getNoti_date() %></span>
				</tr>
				<tr>
					<td colspan="4">내용</td>
				</tr>
				<tr>
					<td colspan="4">
						<p>
							<%=n.getNotice() %>
						</p>
					</td>
				</tr>
			</table>
		</div>
	</div>
	<button id="goNoticeBoard" type="button active" class="btn btn-secondary" 
		onclick="location.href='<%=request.getContextPath()%>/list.no'">목록으로 가기</button>
	
<br><br><br>
<%@include file="../../common/footer.jsp" %>

</body>
</html>