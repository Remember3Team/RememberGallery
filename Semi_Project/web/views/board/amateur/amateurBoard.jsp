<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.amateur.model.vo.*, board.notice.model.vo.*, java.util.ArrayList"%>

<%
	ArrayList<Amateur> list = ((ArrayList<Amateur>)request.getAttribute("list"));
	PageInfo pi = (PageInfo) request.getAttribute("pi");
	ArrayList<FileManagement> fileList = ((ArrayList<FileManagement>)request.getAttribute("fileList"));
	
	System.out.println("[jsp]게시글 리스트 출력확인:"+list);
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
<title>아마추어 게시판</title>
 <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/bootstrap.css">
	<script src="<%=request.getContextPath() %>/views/js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/views/js/bootstrap.js"></script>    
<link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/style.css">
<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet"> 
    
<style>
	#subnav{ float: left; margin-left:20px;}
	#goDetail{z-index:4;}
	.container{ position : relative; margin-top:10px;}
	.headLine{ /*float:left;*/ width:30%; /*margin-top:90px; margin-left:90px; margin-bottom:50px;*/ display:block; box-sizing:border-box;}
	.headLine hr{ background-color:red; width:25px; border:2px solid red; margin-bottom:10px;}
	
</style>
</head>
<body>
	<%@include file="../../common/menubar.jsp" %>
<br clear="both">
<br><br><br>
	<!-- 아마추어 게시판 Logo -->
			<div class="headLine">
				<hr style="display:inline-block;">
				<h3 style="font-size:20px;">Amateur</h3>
			</div><!-- class headLine end -->
	<div class="container">
        <div class="row">
		
		<%for(int i=0;i<list.size();i++){ %>
	        <% Amateur a = list.get(i); %>
	          	<div id="goDetail" class="col-lg-4 col-md-6 mb-4">
			       <div class="card h-100">
 			             <%for(int j=0; j<fileList.size();j++){ 
			              		FileManagement fm = fileList.get(j);%>
			              		<%if(a.getEvent_no()==fm.getEvent_no()){ %>
			             			 <a href="#">
			             			 	<img class="card-img-top" src="<%=request.getContextPath() %>/thumbnail_uploadFiles/amateur/<%=fm.getEvent_file() %>" alt="">
			             			 </a>
			              		<%} %>
			              	<%} %> 
			        
			              <div class="card-body">		              		
			              	<input id="event_no" type="hidden" value="<%=a.getEvent_no() %>">
			              	<h4 class="card-title"><a href="#"><%=a.getEvent_title() %></a></h4>
			                <h5><%=a.getUser_id() %></h5>
			                <p><%=a.getEvent_date() %></p>
			                <p><span>조회수</span><%=a.getHit() %>
			              </div><!-- class card-body end -->
			              
			              <div class="card-footer">
			                <img class="emptyHeart" onclick="heartCheck();" src="<%=request.getContextPath() %>/views/img/emptyHeart.png">
		              	  	
		              	  </div><!-- class card-footer end -->
		            </div><!-- class card end -->
		          </div><!-- id goDetail end -->
          <%} %>
         </div>
        <!-- /.row -->

		<!-- Pagination -->
	  	<div style="text-align:center;">
			<div class="col-mid-12">
				 <ul class="pagination justify-content-center" style="margin:20px 0">
	    	    	     <li class="page-item"><a class="page-link" href="<%=request.getContextPath()%>/list.am?currentPage=1">Previous</a></li>
	  					<%for(int p = startPage; p<=endPage; p++){ %>
	  					 	<li class="page-item"><a class="page-link" href="<%=request.getContextPath() %>/list.am?currentPage=<%=p%>"><%=p%></a></li>
	  					<%} %>
	                     <li class="page-item"><a class="page-link" href="<%=request.getContextPath() %>/list.am?currentPage=<%=maxPage%>">Next</a></li>
	        	  </ul>
			</div><!-- class col-mid-12 end --> 
		</div><!-- Pagination end --> 
	
	
	</div><!-- contatiner end -->
      
      <!-- /.col-lg-9 -->

      
     <button id="insertAma" type="button active" class="btn btn-secondary" 
     		 onclick="location.href='<%=request.getContextPath()%>/views/board/amateur/amateurInsert.jsp'">게시글 작성</button>


<!--footer -->
<%@include file="../../common/footer.jsp" %>

</body>

<script>

$(function(){
	$(".card-title").click(function(){
		var event_no = $(this).parent().children("input").val();
		alert("event_no:"+event_no);
		location.href="<%=request.getContextPath()%>/detail.am?event_no="+event_no;
				
	})
})
//하트 변경
function heartCheck(){
	var heart = document.getElementsByClassName("emptyHeart");
	if(heart.src.match("colorHeart")){
		heart.src="<%=request.getContextPath() %>/views/img/emptyHeart.png"
		var heartYN = 'N';
	}else{
		heart.src="<%=request.getContextPath() %>/views/img/colorHeart.png"
		var heartYN = 'Y';		
	}
}
</script>
</html>