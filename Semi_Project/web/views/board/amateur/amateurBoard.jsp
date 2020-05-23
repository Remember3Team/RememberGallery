<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.amateur.model.vo.*, board.notice.model.vo.*, java.util.ArrayList"%>

<%
	Amateur a = new Amateur();
	AmateurLike al = new AmateurLike();
	ArrayList<Amateur> list = ((ArrayList<Amateur>)request.getAttribute("list"));
	PageInfo pi = (PageInfo) request.getAttribute("pi");
	ArrayList<FileManagement> fileList = ((ArrayList<FileManagement>)request.getAttribute("fileList"));
	ArrayList<AmateurLike> likeList = ((ArrayList<AmateurLike>)request.getAttribute("likeList"));
	
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
	.headLine{ /*float:left;*/ width:30%; margin-top:90px; margin-left:90px; margin-bottom:50px; display:block; box-sizing:border-box;}
	.headLine hr{ background-color:red; width:25px; border:2px solid red; margin-bottom:10px;}
	
</style>
</head>

<body>
<!-- header -->
<%@include file="../../common/menubar.jsp" %>

<!-- Amateur Board Header -->
	<div class="headLine">
		<hr style="display:inline-block;">
		<h3 style="font-size:20px;">Amateur</h3>
	</div><!-- class headLine end -->
	
<!-- Amateur Board List -->	
	<div class="container">
     	<div class="row">
			<%if(list.isEmpty()){%>
          		<span style="font-size:20px; margin:0 auto; margin-top:140px; margin-bottom:240px;">
          			    게시글이 존재하지 않습니다.
          		</span>
     		<%}else{ %>
				<%for(int i=0;i<list.size();i++){ %>
	        		<% a = list.get(i); %>
	        		<%if(a.getEvent_no()!=0){ %>
	          			<div id="goDetail" class="col-lg-4 col-md-6 mb-4">
			       			<div class="card h-100">
							<%for(int j=0; j<fileList.size();j++){ 
			              		FileManagement fm = fileList.get(j);%>
					              	<%if(a.getEvent_no()==fm.getEvent_no()){ %>
					             		<a href="#">
					             			<img class="card-img-top" src="<%=request.getContextPath() %>/thumbnail_uploadFiles/amateur/<%=fm.getEvent_file() %>" alt="">
					             		</a>
					              	<%} %><!-- if a.getEventNo()==fm.getEvent_no end -->
					        <%} %><!--fileList for loop end --> 			
							<div class="card-body">		              		
			              		<input id="event_no" type="hidden" value="<%=a.getEvent_no() %>">
			              		<h4 class="card-title"><a href="#"><%=a.getEvent_title() %></a></h4>
			                	<h5><%=a.getUser_id() %></h5>
			                	<p><%=a.getEvent_date() %></p>
			                	<p><span>조회수</span><%=a.getHit() %>
			                </div><!-- class card-body end -->	

<!-- card footer -->
					        <%--  <div class="card-footer">
								<div style="float:right;" onclick="emptyheartCheck();" class="emptyheartCheck">			                				        	       		
		      <%if(loginUser!=null){ %>		    	
		      		<%for(int k = 0 ; k < likeList.size() ; k++ ){ %>
			      		<% al = likeList.get(k);%>
									<div style="float:right;">
									<%if(a.getEvent_no()==totalLike.getEvent_no()){ %>
										<div class="likeCount" style="float:left; margin-right:10px;">
											<span class="countArea"><%totalLike.getEvent_count(); %></span>
						     			</div>
						     		<%} %>
					 				</div>
							<%if(a.getEvent_no()==al.getEvent_no()){ %>
		        					<img class="heartcheck" src="<%=request.getContextPath()%>/views/img/colorHeart.png">
		 	 				 <%}%> <!--if a.getEvent_no == al.getEvent_no end -->
     			    <%} %><!-- likeList for loop end -->		
				
				<%}else{%><!-- 로그인 데이터가 없을때 -->
				    				<img class="heartcheck" src="<%=request.getContextPath()%>/views/img/emptyHeart.png">
    			<%} %>
								</div>		              		    		
			             		</div><!-- class card-footer end --> --%>
				    	</div><!-- class card end -->
				   	</div><!-- id goDetail end --> 
			<%} %><!-- if a.getEvent_no end -->
          <%}%><!-- list for loop end -->
       <%} %>
                
         </div> <!-- /.row -->

<!-- Pagination -->
		<div style="text-align:center; margin-bottom:100px;">
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

<!-- insert Btn -->	
	<button id="insertAma" type="button active" class="btn btn-secondary" style="float:right; margin-bottom:100px; margin-right:100px">게시글 작성</button>
	<br clear="both">

<!--footer -->
<%@include file="../../common/footer.jsp" %>
      
</body>
<script>
	$(function(){
		<%-- $(".heartcheck").click(function(){
		  	  var event_no = $(".card-body").children("<input>").val();
		  	  var heart = $(".heartcheck").attr('src');
		  	  var heartYN;

		  	  if(heart=='<%=request.getContextPath()%>/views/img/colorHeart.png'){
		  		  $(".heartcheck").attr('src','<%=request.getContextPath()%>/views/img/emptyHeart.png');
		  		  heartYN = 'N';
		  	  }else{
		  		  $(".heartcheck").attr('src','<%=request.getContextPath()%>/views/img/colorHeart.png');
		  		  heartYN = 'Y';
		  	  }
		  	  $.ajax({
		  		url:"like.am",
		  		type:"post",
		  		data:{event_no:event_no,heartYN:heartYN},
		 
		  		success:function(data){
		  			var $likeCount = $(".likeCount");
		  			var $count = $("<span>").text(data);
		  			
		  			$likeCount.html($count);
		  			
		  		},
		  		error:function(request,statur,error){
		  			alert("로그인을 하셔야 합니다.");
		  			 $(".heartcheck").attr('src','<%=request.getContextPath()%>/views/img/emptyHeart.png');
		  		}
		  		  
		  	  })
			})   --%>
		$(".card-title").click(function(){
			var event_no = $(this).parent().children("input").val();
			location.href="<%=request.getContextPath()%>/detail.am?event_no="+event_no;			
		})	 	
		$("#insertAma").click(function(){
			<% if(loginUser != null){ %>
			    location.href="<%=request.getContextPath()%>/views/board/amateur/amateurInsert.jsp"		
			<% }%>
		<%-- 	<% else{ %>
				alert("로그인 해야만 게시글 상세보기가 가능합니다!");
			<% } %> --%>
		});
	
	})
	
</script>
</html>