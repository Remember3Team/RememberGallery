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

</head>
<body>
<%@include file="../../common/menubar.jsp" %>
<br clear="both">
<br><br><br>

<body>
 <div class="container">
         <div class="row">

            <div class="cols-sm-6">
               <table class="table table-hover" id="listArea">
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
               
            </div>
         </div>
         
      </div>

           <script type="text/javascript" src="js/bootstrap.js"></script>
   </body>
<button id="goAmateurBoard" type="button active" class="btn btn-secondary" onclick="location.href='<%=request.getContextPath()%>/views/board/amateur/amateurBoard.jsp'">목록으로 가기</button>
	
<%@include file="../../common/footer.jsp" %>

</body>
</html>