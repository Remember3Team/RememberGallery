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
#InsertArea{  margin-bottom:200px;}
#amateurHeader{ background:white; }
</style>

</head>
<body>

	<!-- header -->

<%@include file="../../common/menubar.jsp" %>
<br clear="both">
<br><br><br>

	
	<div class="container" id="InsertArea">	
	   <div id="amateurHeader" class="jumbotron text-center">
	   		<h1>아마추어 게시판 글 등록 페이지</h1>
	   		<p>당신도 아티스트가 될 수 있습니다.</p>
	   </div>   
       <form action="<%=request.getContextPath()%>/insert.am" method="post" encType="multipart/form-data">
           <div class="form-group">
            	<label for="noti_title">Title</label>
            	<input type="text" class="form-control" name="event_title" id="event_title" placeholder="Enter Title">
       	 	</div>
        	<div class="form-group">
            	<label for="event">Comment</label>
            	<textarea class="form-control" rows="10" name="event" id="event"></textarea>
        	</div>
        	<div id="fileArea" class="form-group" style="display:block;">
        		<label for="event_file" style="font-size:17px;">작품 제출하기</label>
        		<input type="file" id="event_file" name="event_file" onchange="LoadImg(this)">
        	</div>
        	<div id="ImgArea" class="form-group" style="display:block;">
        		<img id="imgArea" width="150" height="150">
        	</div>
        	<div class="form-group">
            	<input type="submit" class="btn btn-secondary" value="등록하기">&nbsp;
            	<input type="reset" class="btn btn-secondary" value="다시쓰기">
        	</div>
		</form>
   </div>
   

   <script>
   
   	function LoadImg(value){
   		if(value.files && value.files[0]){
   			var reader = new FileReader();
   
   			reader.onload = function(e){
   				$("#imgArea").attr("src",e.target.result);
   			}
   		}
   		reader.readAsDataURL(value.files[0]);
   	}
   </script>
    <!-- footer -->
	<%@include file="../../common/footer.jsp" %>


</body>
</html>