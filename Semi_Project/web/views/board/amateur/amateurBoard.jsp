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
	#subnav{ float: left; margin-left:20px;}
	#goDetail{z-index:4;}
	.container{margin-top:10px;}
</style>
</head>
<body>
<%@include file="../../common/menubar.jsp" %>
<br clear="both">
<br><br><br>
	<div class="container">
		<ul id="subnav" class="nav flex-column">
		  <li class="nav-item">
		    <a class="nav-link active" href="amateurBoard.jsp">아마추어 게시판</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="../free/freeBoard.jsp">자유 게시판</a>
		  </li>
		</ul>

        <div class="row">

          <div id="goDetail" class="col-lg-4 col-md-6 mb-4" onclick="location.href='<%=request.getContextPath()%>/views/board/amateur/amateurDetail.jsp'">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">작품 이름</a>
                </h4>
                <h5>작가 이름</h5>
                <p>가격</p>
              </div>
              <div class="card-footer">
                <svg class="bi bi-heart" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M8 2.748l-.717-.737C5.6.281 2.514.878 1.4 3.053c-.523 1.023-.641 2.5.314 4.385.92 1.815 2.834 3.989 6.286 6.357 3.452-2.368 5.365-4.542 6.286-6.357.955-1.886.838-3.362.314-4.385C13.486.878 10.4.28 8.717 2.01L8 2.748zM8 15C-7.333 4.868 3.279-3.04 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 01.176-.17C12.72-3.042 23.333 4.867 8 15z" clip-rule="evenodd"/>
				</svg>
              </div>
            </div>
          </div>

        <div id="goDetail" class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">작품 이름</a>
                </h4>
                <h5>작가 이름</h5>
                <p>가격</p>
              </div>
              <div class="card-footer">
                <svg class="bi bi-heart-fill" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M8 1.314C12.438-3.248 23.534 4.735 8 15-7.534 4.736 3.562-3.248 8 1.314z" clip-rule="evenodd"/>
				</svg>
              </div>
            </div>
          </div>

            <div id="goDetail" class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">작품 이름</a>
                </h4>
                <h5>작가 이름</h5>
                <p>가격</p>
              </div>
              <div class="card-footer">
                <svg class="bi bi-heart-fill" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M8 1.314C12.438-3.248 23.534 4.735 8 15-7.534 4.736 3.562-3.248 8 1.314z" clip-rule="evenodd"/>
				</svg>
              </div>
            </div>
          </div>
             <div id="goDetail" class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">작품 이름</a>
                </h4>
                <h5>작가 이름</h5>
                <p>가격</p>
              </div>
              <div class="card-footer">
                <svg class="bi bi-heart-fill" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M8 1.314C12.438-3.248 23.534 4.735 8 15-7.534 4.736 3.562-3.248 8 1.314z" clip-rule="evenodd"/>
				</svg>
              </div>
            </div>
          </div>
             <div id="goDetail" class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">작품 이름</a>
                </h4>
                <h5>작가 이름</h5>
                <p>가격</p>
              </div>
              <div class="card-footer">
                <svg class="bi bi-heart-fill" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M8 1.314C12.438-3.248 23.534 4.735 8 15-7.534 4.736 3.562-3.248 8 1.314z" clip-rule="evenodd"/>
				</svg>
              </div>
            </div>
          </div>
   			<div id="goDetail" class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">작품 이름</a>
                </h4>
                <h5>작가 이름</h5>
                <p>가격</p>
              </div>
              <div class="card-footer">
                <svg class="bi bi-heart" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M8 2.748l-.717-.737C5.6.281 2.514.878 1.4 3.053c-.523 1.023-.641 2.5.314 4.385.92 1.815 2.834 3.989 6.286 6.357 3.452-2.368 5.365-4.542 6.286-6.357.955-1.886.838-3.362.314-4.385C13.486.878 10.4.28 8.717 2.01L8 2.748zM8 15C-7.333 4.868 3.279-3.04 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 01.176-.17C12.72-3.042 23.333 4.867 8 15z" clip-rule="evenodd"/>
				</svg>
              </div>
            </div>
          </div>
        </div>
        <!-- /.row -->

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
	
	</div>
      <!-- /.col-lg-9 -->
      
     <button id="insertAma" type="button active" class="btn btn-secondary" onclick="location.href='<%=request.getContextPath()%>/views/board/amateur/amateurInsert.jsp'">게시글 작성</button>
      

<%@include file="../../common/footer.jsp" %>

</body>
</html>