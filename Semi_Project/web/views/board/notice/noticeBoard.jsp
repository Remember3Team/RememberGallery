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
<title>NOTICE</title>
 <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/style.css">
 <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
 <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/bootstrap.css">
<script src="<%=request.getContextPath() %>/views/js/jquery-3.4.1.min.js"></script>

 <style>
	#noticeCorner{
		margin: 0 auto;
	} 
	#subnav{
		margin-left:50px;
		margin-top:100px;
	}
	#noticeTable{
		margin: 0 auto;
		margin-top: 100px;
		
	}
 </style>
</head>
<body>
<!-- Navigation에서 Notice>공지사항 눌렀을 때 나오는 페이지 (계연) -->
<%@include file="../../common/menubar.jsp" %>

	<div id="noticeCorner" class="containter">
		<div class="row">
			<ul id="subnav" class="nav flex-column">
			  <li class="nav-item">
			    <a class="nav-link active" href="noticeBoard.jsp">공지사항</a>
			  </li>
			  <li class="nav-item">
			    <a class="nav-link" href="../inquiry/inquiryBoard.jsp">1:1문의</a>
			  </li>
			</ul>
				 <div id="noticeTable" class="col-sm-6">
				
					<table class="table table-hover" id="listArea">
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
		<button id="insertNotice" type="button active" class="btn btn-secondary" onclick="location.href='<%=request.getContextPath()%>/views/board/notice/noticeInsert.jsp'">게시글 작성</button>
	</div>

<script>
	$(function(){
		$("#listArea td").click(function(){
			var noti_no = $(this).parent().children("input").val();
			location.href='<%=request.getContextPath()%>/detail.no?noti_no='+noti_no;
		
		})
	})
</script>
<br><br><br>
	<%@include file="../../common/footer.jsp" %>
<script type="text/javascript" src="../../js/bootstrap.js"></script>    
</body>
</html>