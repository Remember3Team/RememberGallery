<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.amateur.model.vo.*, board.notice.model.vo.*, java.util.ArrayList"%>
<%
	Amateur a = new Amateur();
	ArrayList<Amateur> list = ((ArrayList<Amateur>)request.getAttribute("masterList"));
	ArrayList<FileManagement> fileList = ((ArrayList<FileManagement>)request.getAttribute("masterFileList"));

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/bootstrap.css">
	<script src="<%=request.getContextPath() %>/views/js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/views/js/bootstrap.js"></script>    
<link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/style.css">
<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet"> 
<!-- Swiper js -->  
<script src="<%=request.getContextPath() %>/views/js/swiper.min.js"></script>
 
   <!-- Link Swiper's CSS -->
  <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/swiper.min.css">

</head>

<body>

   <section>
   
       <div id ="contents" >
        <div class="part1">
            <div class="slide">
                <h1 align="center">REMEMBER ART</h1>
            <a href="#"><img src="views/img/slide1.jpg" style="height: auto;"> </a>
            <a href="#"><img src=""></a>
            <a href="#"><img src=""></a>    
            </div> <!--slide end-->      
        </div>
        <!--part1 end-->
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

			                </div><!-- class card-body end -->	


				    	</div><!-- class card end -->
				   	</div><!-- id goDetail end --> 
			<%} %><!-- if a.getEvent_no end -->
          <%}%><!-- list for loop end -->
       <%} %>
                
         </div> <!-- /.row --> 
         
<%--          <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner" role="listbox">
	<% for(int i = 0;i<list.size();i++){%>
		<% a = list.get(i);%>
		<%if(a.getEvent_no()!=0){ %>
			<%for(int j = 0;j<fileList.size();j++){
				FileManagement fm = fileList.get(j);%>
				<% if(a.getEvent_no()==fm.getEvent_no()){ %>
				    <div class="carousel-item active">
				      <img class="d-block img-fluid" src="<%=request.getContextPath() %>/thumbnail_uploadFiles/amateur/<%=fm.getEvent_file() %>" alt="First slide">
				    </div>
				<%} %>
			<% }%>
		<%} %>
	<% }%>

  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div> --%>
         
  </div>
        
        <div class="part2">
            <h1>part2</h1>
            <div>
                <div class ="block block-test2 area1">첫 번째 영역 </div>
                <div class ="block block-test2 area2">두 번째 영역 </div>
                <div class ="block block-test2 area3">세 번째 영역 </div>
            </div>
        </div> 
        <!--part2 end-->

        <div class="part3">
            <h1>part3</h1>
            <div>
                <div class ="block block-test3 area1">첫 번째 영역 </div>
                <div class ="block block-test3 area2">두 번째 영역 </div>
                <div class ="block block-test3 area3">세 번째 영역 </div>
            </div>
        </div>
        <!--part3 end-->
    </div> <!--content end-->
   </section>

</body>
</html>