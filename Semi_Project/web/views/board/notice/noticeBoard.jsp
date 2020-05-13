<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.notice.model.vo.*, java.util.ArrayList"%>
<%
	ArrayList<Notice> list = ((ArrayList<Notice>)request.getAttribute("list"));
	PageInfo pi = (PageInfo)request.getAttribute("pi");
	
	int listCount = pi.getListCount();
	int currentPage = pi.getCurrentPage();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
	
	 
%>
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
 	#insertNotice{ float:right; margin-right:100px; }
 	#noticeList div{margin: 0 auto;}
 	#noticeCorner {margin-top:40px;} 
	#subnav{ float: left; margin-left:20px;}
 </style>
</head>
<body>
<!-- Navigation에서 Notice>공지사항 눌렀을 때 나오는 페이지 (계연) -->
	<%@include file="../../common/menubar.jsp" %>
	<br clear="both">
	<br>
	<br>
	
	<div id="noticeCorner" class="containter">
	<div id="noticeList" class="row">
		<ul id="subnav" class="nav flex-column">
		  <li class="nav-item">
		    <a class="nav-link active" href="noticeBoard.jsp">공지사항</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="../inquiry/inquiryBoard.jsp">1:1문의</a>
		  </li>
		</ul>
		게시판 리스트 출력 페이지 입니다.
			 <div class="col-sm-6">
			
				<table class="table table-hover">
			  		<thead>
			    		<tr>
			      			<th>게시글 번호</th>
			      			<th>내용</th>
			      			<th>작성자</th>
			      			<th>작성일</th>
			    		</tr>
			  		</thead>
			  		<tbody>
			  		<%if(!list.isEmpty()){ %>
			  			<%for(Notice n:list){ %>
			    		<tr>
			    			<input type="hidden" value="<%=n.getNoti_no() %>">
							<td><%=n.getNoti_no() %></td>
			      			<td><%=n.getNoti_title() %></td>
			      			<td>관리자</td>
			      			<td><%=n.getNoti_date() %></td>
			    		</tr>
			    		<%} %>
			    	<%} else{%>
			    		
			    	<%} %>
			    	
			  		</tbody>
				</table>
			</div>
		</div>
		<!-- Pagination -->
	 	<div style="text-align:center;">
			<div class="col-mid-12">
				 <ul class="pagination justify-content-center" style="margin:20px 0">
	    	    	     <li class="page-item"><a class="page-link" href="<%=request.getContextPath()%>/list.no?currentPage=1">Previous</a></li>
	  					<%for(int p = startPage; p<=endPage; p++){ %>
	  					 <li class="page-item active"><a class="page-link" href="<%=request.getContextPath() %>/list.bo?currentPage=<%=currentPage-1 %>'">1</a></li>
	  					 <li class="page-item"><a class="page-link" href="<%=request.getContextPath() %>/list.bo?currentPage=<%=p %>"><%=p %></a></li>
	  					 <%} %>
	  					
	                     <li class="page-item"><a class="page-link" href="<%=request.getContextPath() %>/list.bo?currentPage=<%=maxPage%>">Next</a></li>
	        	  </ul>
		
			</div> 
		</div>
	<button id="insertNotice" type="button active" class="btn btn-secondary" 
		onclick="location.href='<%=request.getContextPath()%>/views/board/notice/noticeInsert.jsp'">게시글 작성</button>
</div>
<br><br><br>
	<%@include file="../../common/footer.jsp" %>
</body>
</html>