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
	.headLine{ /*float:left;*/ width:30%; /*margin-top:90px; margin-left:90px; margin-bottom:50px;*/ display:block; box-sizing:border-box;}
	.headLine hr{ background-color:red; width:25px; border:2px solid red; margin-bottom:10px;}
</style>
<body>
<%@include file="../../common/menubar.jsp" %>

<!-- 1:1 게시판 Logo -->
<div class="headLine">
		<hr style="display:inline-block;">
		<h3 style="font-size:20px;">1:1문의</h3>
</div><!-- class headLine end -->
			
<div id="centerDiv" class="container">
 <form>
  <div class="form-row">
    <div class="form-group col-md-3">
      	<select id="inputState" class="form-control">
       	 	<option selected>선택</option>
        	<option>배송문의</option>
        	<option>환불문의</option>
        	<option>사이트 이용문의</option>
        	<option>기타문의</option>
      </select>
    </div>
    <div class="form-group col-md-9">
      <input type="text" class="form-control" id="inputTitle" placeholder="게시글 제목은 모든 사용자에게 노출됩니다.">
    </div>
  </div>
  <div class="form-row">
  	<div class="form-group col-md-11">
  		<textarea class="form-control" id="inputAddress2" rows="5" placeholder="문의 내용을 입력해주세요"></textarea>
    </div>
    <div class="form-group col-md-1">
	    <button type="submit" class="btn btn-primary" style="height:130px">문의하기</button>  		
    </div>
  </div>
 </form> <!-- form end -->
 <br><br><br><br>
 
<table class="table">
  <thead>
    <tr>
      <th scope="col">문의구분</th>
      <th scope="col">문의내용</th>
      <th scope="col">작성자</th>
      <th scope="col">답변 여부</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">배송관련</th>
      <td>배송관련 문의드립니다.</td>
      <td>USER08</td>
      <td>Y</td>
    </tr>
    <tr>
      <th scope="row">배송관련</th>
      <td>배송관련 문의드립니다.</td>
      <td>USER08</td>
      <td>Y</td></tr>
    <tr>
      <th scope="row">배송관련</th>
      <td>배송관련 문의드립니다.</td>
      <td>USER08</td>
      <td>Y</td>
    </tr>
  </tbody>
</table> 
 
</div>

<%@include file="../../common/footer.jsp" %>

</body>
</html>