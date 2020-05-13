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
<<<<<<< HEAD
<link rel="stylesheet" href="../../css/style.css">
<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet"> 
<style>
#InsertArea{  margin-bottom:200px;}
#amateurHeader{ background:white; }
</style>
=======

>>>>>>> refs/remotes/origin/master
</head>
<body>
<<<<<<< HEAD
	<!-- header -->
	<%@include file="../../common/menubar.jsp" %>
=======
<%@include file="../../common/menubar.jsp" %>
<br clear="both">
<br><br><br>
>>>>>>> refs/remotes/origin/master

<<<<<<< HEAD
	
	<div class="container" id="InsertArea">	
	   <div id="amateurHeader" class="jumbotron text-center">
	   		<h1>아마추어 게시판 글 등록 페이지</h1>
	   		<p>당신도 아티스트가 될 수 있습니다.</p>
	   </div>   
       <form action="<%=request.getContextPath()%>/insert.no" method="post">
           <div class="form-group">
            	<label for="noti_title">Title</label>
            	<input type="text" class="form-control" name="noti_title" id="noti_title" placeholder="Enter Title">
       	 	</div>
        	<div class="form-group">
            	<label for="notice">Comment</label>
            	<textarea class="form-control" rows="10" name="notice" id="notice"></textarea>
        	</div>
        	<div class="form-group">
            	<input type="submit" class="btn btn-secondary" value="등록하기" onclick="goNotice();">&nbsp;
            	<input type="reset" class="btn btn-secondary" value="다시쓰기">
        	</div>
        	<div class="form-group">
        		<div id="amateurFile">
        			<img id="amateurFile" width="100" height="100">
        		</div>
        	</div>
        	<div id="fileArea">
        		<intput type="file" id="file1" name="file1" onchange="LoadImg(this);">
        	</div>
       </form>
   </div>
   <script>
   	$(function(){
   		$("#fileArea").hide();
   		$("#amateurFile").click(function(){
   			$("file1").click();
   		})
   	})
   	function LoadImg(value,num){
   		if(value.files && value.files[0]){
   			var reader = new FileReader();
   			reader.onload = function(e){
   				$("file1").attr("src",e.target.result);
   			}
   		}
   		reader.readAsDataURL(value.files[0]);
   	}
   </script>
    <!-- footer -->
	<%@include file="../../common/footer.jsp" %>
=======

<%@include file="../../common/footer.jsp" %>

>>>>>>> refs/remotes/origin/master
</body>
</html>