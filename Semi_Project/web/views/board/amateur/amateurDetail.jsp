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
<style>
	#detailArea div{ margin:0 auto; margin-top:100px; width:80%;}
</style>
</head>
<body>
<!-- header -->
<%@include file="../../common/menubar.jsp" %>

<body>
 	 <div class="container"> 
         <div class="row" id="detailArea">
            <div class="cols-sm-6">
               <table align="center" class="table">
                  <tr>
                     <td>제목</td>
                     <td colspan="4"><span>안녕하세요</span></td>
                  </tr>
                  <tr>
                     <td>작성자</td>
                     <td><span>김계연</span></td>
                     
                     <td>작성일</td>
                     <td><span>2020-02-04</span></td>
                  </tr>
                  <tr>
                     <td colspan="4"><span>내용</span></td>
                  </tr>
                  <tr>
                     <td colspan="4">
                        <p>
                           내용입니다.
                        </p>
                     </td>
                  </tr>
               </table>
            </div><!-- cols-sm-6 div end -->
         </div><!-- row div end -->
       </div>
 
		<button id="goAmateurBoard" type="button active" class="btn btn-secondary" onclick="location.href='<%=request.getContextPath()%>/views/board/amateur/amateurBoard.jsp'">목록으로 가기</button>
   </body>

<!-- footer -->	
<%@include file="../../common/footer.jsp" %>

</body>
</html>