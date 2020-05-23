<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유 게시판</title>
 <link rel="stylesheet" href="../../css/style.css">
 <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
 <link rel="stylesheet" href="../../css/bootstrap.css">
<script src="../../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../../js/bootstrap.js"></script>    

<style>
#InsertArea{  margin-bottom:200px;}
#freeHeader{ background:white; }
</style>


</head>
<body>

	<!-- header -->

<%@include file="../../common/menubar.jsp" %>


	<div class="container" id="InsertArea">	
	   <div id="freeHeader" class="jumbotron text-center">
	   		<h1 style="font-color:black !important;">자유 게시판</h1>
	   		<p>올바른 게시글 문화를 지켜주세요.</p>
	   </div>   
       <form action="<%=request.getContextPath()%>/insert.ee" method="post" encType="multipart/form-data">
           <div class="form-group">
            	<label for="free_title">Title</label>
            	<input type="text" class="form-control" name="free_title" id="free_title" placeholder="Enter Title">
       	 	</div>
        	<div class="form-group">
            	<label for="event">Comment</label>
            	<textarea class="form-control" rows="10" name="free_content" id="free_content"></textarea>
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
    <!-- footer -->
	<%@include file="../../common/footer.jsp" %>

   
</body>
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
</html>