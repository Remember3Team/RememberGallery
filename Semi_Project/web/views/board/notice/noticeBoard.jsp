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
 	#insertNotice{ float:right; margin-right:100px; }
 	#noticeList div{margin: 0 auto;}
 	#noticeCorner {margin-top:40px;} 
	#subnav{ float: left; margin-left:20px;}
 </style>
</head>
<body>
<!-- Navigation에서 Notice>공지사항 눌렀을 때 나오는 페이지 (계연) -->
<%@include file="../../common/menubar.jsp" %>

	<%@include file="../../common/menubar.jsp" %>
	<br clear="both">
	<br>
	<br>
	<div id="noticeCorner" class="containter">
	<div id="noticeList" class="row">
		<ul id="subnav" class="nav flex-column">
		  <li class="nav-item">
		    <a class="nav-link active" href="noticeBoard.jsp">공지사항</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="../inquiry/inquiryBoard.jsp">1:1문의</a>
		  </li>
		</ul>
			<div class="col-sm-6">
			
				<table class="table table-hover">
			  		<thead>
			    		<tr>
			      			<th>게시글 번호</th>
			      			<th>내용</th>
			      			<th>작성자</th>
			      			<th>작성일</th>
			    		</tr>
			  		</thead>
			  		<tbody>
			    		<tr>
			      			<td>1</td>
			      			<td  onclick="location.href='noticeDetail.jsp'">사이트 이용 문의 안내입니다.</td>
			      			<td>관리자</td>
			      			<td>2020-03-24</td>
			    		</tr>
			    		<tr>
			      			<td>2</td>
			      			<td>4월의 작품 선정 결과(메인페이지 참고)</td>
			      			<td>관리자</td>
			      			<td>2020-05-01</td>
			    		</tr>
			    		<tr>
			      			<td>3</td>
			      			<td>3월의 작품 선정 결과(메인페이지 참고)</td>
			      			<td>관리자</td>
			      			<td>2020-04-01</td>
			    		</tr>
			    		<tr>
			    			<td>4</td>
			      			<td>2월의 작품 선정 결과(메인페이지 참고)</td>
			      			<td>관리자</td>
			      			<td>2020-03-01</td>
			    		</tr>
			    		<tr>
			    			<td>5</td>
			      			<td>2월의 작품 선정 결과(메인페이지 참고)</td>
			      			<td>관리자</td>
			      			<td>2020-03-01</td>
			    		</tr>
			    		<tr>
			    			<td>6</td>
			      			<td>2월의 작품 선정 결과(메인페이지 참고)</td>
			      			<td>관리자</td>
			      			<td>2020-03-01</td>
			    		</tr>
			    		<tr>
			    			<td>7</td>
			      			<td>2월의 작품 선정 결과(메인페이지 참고)</td>
			      			<td>관리자</td>
			      			<td>2020-03-01</td>
			    		</tr>
			    		<tr>
			    			<td>8</td>
			      			<td>2월의 작품 선정 결과(메인페이지 참고)</td>
			      			<td>관리자</td>
			      			<td>2020-03-01</td>
			    		</tr>
			    		<tr>
			    			<td>9</td>
			      			<td>2월의 작품 선정 결과(메인페이지 참고)</td>
			      			<td>관리자</td>
			      			<td>2020-03-01</td>
			    		</tr>
			    		<tr>
			    			<td>10</td>
			      			<td>2월의 작품 선정 결과(메인페이지 참고)</td>
			      			<td>관리자</td>
			      			<td>2020-03-01</td>
			    		</tr>
			  		</tbody>
				</table>
			</div>
		</div>
		
		<div style="text-align:center;">
			<div class="col-mid-12">
				 <ul class="pagination justify-content-center" style="margin:20px 0">
	    	    	     <li class="page-item"><a class="page-link" href="#">Previous</a></li>
	  					 <li class="page-item active"><a class="page-link" href="#">1</a></li>
	  					 <li class="page-item"><a class="page-link" href="#">2</a></li>
	  					 <li class="page-item"><a class="page-link" href="#">3</a></li>
	                     <li class="page-item"><a class="page-link" href="#">Next</a></li>
	        	  </ul>
		
			</div>
		</div>
	<button id="insertNotice" type="button active" class="btn btn-secondary" 
		onclick="location.href='<%=request.getContextPath()%>/views/board/notice/noticeInsert.jsp'">게시글 작성</button>
</div>
<br><br><br>
	<%@include file="../../common/footer.jsp" %>
</body>
</html>