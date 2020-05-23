<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.free.model.vo.*,
     board.notice.model.vo.*, board.amateur.model.vo.*, java.util.ArrayList" %>

<%
ArrayList<Free> list = ((ArrayList<Free>)request.getAttribute("list"));
PageInfo pi = (PageInfo) request.getAttribute("pi");

System.out.println("[Free게시판]jsp확인-List:"+list);

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
<title>자유 게시판</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/bootstrap.css">
	<script src="<%=request.getContextPath() %>/views/js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/views/js/bootstrap.js"></script>    
<link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/style.css">
<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet"> 

</head>
<body>
<!-- Navigation에서 자유게시판 눌렀을 때 나오는 페이지 (계연) -->
	<%@include file="../../common/menubar.jsp" %>
	
	<div id="freeCorner" class="containter">
		<div id="freeList" class="row" style="display:block">
			
			<!-- 자유 게시판 Logo -->
			
			<div class="headLine">
				<hr style="display:inline-block;">
				<h3 style="font-size:20px;">자유게시판</h3>
			</div><!-- class headLine end -->
			
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
					  			<%for(Free f:list){ %>
					    		<tr>
					    			<input type="hidden" value="<%=f.getFree_no() %>">
									<td><%=f.getFree_no() %></td>
					      			<td><%=f.getFree_title() %></td>
					      			<td><%=f.getUser_id() %></td>
					      			<td><%=f.getFree_date() %></td>
					    		</tr>
					    		<%}%>
				    	<%} %>
				  		</tbody>
					</table><!-- class table end -->
				</div><!--class col-sm-6 end -->
			</div><!-- id noticeList end -->
			
<%-- 		<!-- Pagination -->
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
		</div><!-- Pagination end -->  --%>
	
	
		
	<!-- 게시글 작성  -->	
	<button id="insertfree" type="button active" class="btn btn-secondary" 
			onclick="location.href='<%=request.getContextPath()%>/views/board/free/freeInsert.jsp'">게시글 작성</button>
</div>
<br><br><br>
	<%@include file="../../common/footer.jsp" %>
</body>

<script>
	$(function(){
		$("#listArea td").click(function(){
			var free_no = $(this).parent().children("input").val();
			location.href="<%=request.getContextPath()%>/detail.ee?free_no="+free_no;
			
		})
	})

</script>
</html>