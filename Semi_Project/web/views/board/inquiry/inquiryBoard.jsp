<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/style.css">
 <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
 <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/bootstrap.css">
<script src="<%=request.getContextPath() %>/views/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/views/js/bootstrap.js"></script>    
</head>
<style>
	#centerDiv{margin-top:70px;}
</style>
<body>
<%@include file="../../common/menubar.jsp" %>

<div id="centerDiv" class="container">
 <form>
  <div class="form-row">
    <div class="form-group col-md-4">
      	<select id="inputState" class="form-control">
       	 	<option selected>Choose...</option>
        	<option>...</option>
      </select>
    </div>
    <div class="form-group col-md-6">
      <input type="text" class="form-control" id="inputTitle" placeholder="게시글 제목은 모든 사용자에게 노출됩니다.">
    </div>
  </div>
  <div class="form-group">
  	<div class="form-group col-md-12">
    	<textarea class="form-control" id="inputAddress2" rows="5" placeholder="문의 내용을 입력해주세요"></textarea> 
    </div>
  </div>
    
  <div class="form-group">
    <div class="form-check">
      <button type="submit" class="btn btn-primary">문의하기</button>
    </div>
  </div>
  
  
 </form>
</div>

<%@include file="../../common/footer.jsp" %>

</body>
</html>