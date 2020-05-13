<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../../css/bootstrap.css">
<script src="../../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../../js/bootstrap.js"></script>    
<link rel="stylesheet" href="../../css/style.css">
<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet"> 
</head>
<body>
<%@include file="../../common/menubar.jsp" %>

<div id="submit" onload="add();" class="alert alert-success alert-dismissible" style="display:none;">
	<button type="button" class="close" data-dismiss="alert">&times;</button>
    <strong>Success!</strong> 성공적으로 등록되었습니다.
</div>
	<div class="container">
	   
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
            	<input type="submit" onclick="goList();" id="submit" class="btn btn-secondary" value="등록하기" onclick="goNotice();">&nbsp;
            	<input type="reset" class="btn btn-secondary" value="다시쓰기">
        	</div>
       </form>
       <script>
       		
       </script>

   </div>
   
</body>
</html>