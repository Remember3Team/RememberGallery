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
<title>공지사항</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/bootstrap.css">
	<script src="<%=request.getContextPath() %>/views/js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/views/js/bootstrap.js"></script>    
<link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/style.css">
<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet"> 

 <style>
 	#insertNotice{ float:right; margin-right:100px; }
 	#noticeList div{margin: 0 auto;}
 	#noticeCorner {margin-top:40px;} 
	#subnav{ float: left; margin-left:20px;}
	.headLine{ margin-top:90px; margin-left:90px; margin-bottom:50px; display:block;}
	.headLine hr{ background-color:red; width:25px; border:2px solid red; margin-bottom:10px;}
 	table{ margin-top:30px; }
 </style>
</head>
<body>
<!-- Navigation에서 Notice>공지사항 눌렀을 때 나오는 페이지 (계연) -->
	<%@include file="../../common/menubar.jsp" %>
	
	<div id="noticeCorner" class="containter">
		<div id="noticeList" class="row" style="display:block">
			
			<!-- Notice 게시판 Logo -->
			<div class="headLine">
				<hr style="display:inline-block;">
				<h3 style="font-size:20px;">Notice</h3>
			</div><!-- class headLine end -->
			
			<br clear="both">
				 <div class="col-sm-6" style="display:block;">
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
				  		<%if(list.isEmpty()){ %>
				  			<tr>
				  				<td>게시글이 존재하지 않습니다.</td>
				  			</tr>
				  		<%}else{ %>				   				
					  			<%for(Notice n:list){ %>
					    		<tr>
					    			<input type="hidden" value="<%=n.getNoti_no() %>">
									<td><%=n.getNoti_no() %></td>
					      			<td><%=n.getNoti_title() %></td>
					      			<td>관리자</td>
					      			<td><%=n.getNoti_date() %></td>
					    		</tr>
					    		<%}%>
				    	<%} %>
				  		</tbody>
					</table><!-- class table end -->
				</div><!--class col-sm-6 end -->
			</div><!-- id noticeList end -->
			
		<!-- Pagination -->
	  	<div style="text-align:center;">
			<div class="col-mid-12">
				 <ul class="pagination justify-content-center" style="margin:20px 0">
	    	    	     <li class="page-item"><a class="page-link" href="<%=request.getContextPath()%>/list.no?currentPage=1">Previous</a></li>
	  					<%for(int p = startPage; p<=endPage; p++){ %>
	  					 	<li class="page-item"><a class="page-link" href="<%=request.getContextPath() %>/list.no?currentPage=<%=p%>"><%=p%></a></li>
	  					<%} %>
	                     <li class="page-item"><a class="page-link" href="<%=request.getContextPath() %>/list.no?currentPage=<%=maxPage%>">Next</a></li>
	        	  </ul>
			</div><!-- class col-mid-12 end --> 
		</div><!-- Pagination end --> 
	
	
		
	<!-- 게시글 작성  -->	
	<button id="insertNotice" type="button active" class="btn btn-secondary" 
			onclick="location.href='<%=request.getContextPath()%>/views/board/notice/noticeInsert.jsp'">게시글 작성</button>
</div>
<br><br><br>
	<%@include file="../../common/footer.jsp" %>
</body>

<script>
	$(function(){
		$("#listArea td").click(function(){
			var noti_no = $(this).parent().children("input").val();
			location.href="<%=request.getContextPath()%>/detail.no?noti_no="+noti_no;
			
		})
	})

</script>
</html>