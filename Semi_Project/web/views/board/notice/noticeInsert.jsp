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
</head>
<body>
       <form action="<%=request.getContextPath()%>/insert.bo" method="post">
           <div class="form-group">
            	<label for="noti_title">Title</label>
            	<input type="text" class="form-control" name="noti_title" id="noti_title" placeholder="Enter Title">
       	 	</div>
        	<div class="form-group">
            	<label for="notice">Comment</label>
            	<textarea class="form-control" rows="10" name="notice" id="notice"></textarea>
        	</div>
        	<div class="form-group">
            	<label for="File">File Input</label>
            	<input type="file" id="File">
        	</div>
        	<div class="form-group">
            	<input type="submit" value="저장하기" >&nbsp;<input type="reset" value="다시쓰기">
        	</div>
       </form>
    	<button onclick="goList();">버튼</button>
    </body>
   
</body>
</html>