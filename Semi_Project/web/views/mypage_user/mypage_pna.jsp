<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
<link rel="stylesheet" href="../css/bootstrap.css">
<link rel="stylesheet" href="../css/Style-mypagehead.css">
<link rel="stylesheet" href="../css/Style-qna.css">
  
<script src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script>
</head>
<body>
	<%@include file="../common/menubar.jsp" %>
	<%@include file="../common/mypagehead2.jsp" %>
	
	<div class="title">
        <h3><b>문의 내역</b></h3>
        <hr>
    </div>
    

    <div class="container">
 
 	<div class="info-box3">
        <label class="labelfirst"></label>
        <select id="qnaCate" name="select-thema">
        <option value="q1" >1:1문의</option>
        <option value="q2" >상품문의</option>
        </select>
    </div>
      <div class = "qna-table1" style="display:block;">
            <table style="width:100%" name="qna-list">
                <tr>
                    <th>주문 번호</th>
                    <th>상품명</th>
                    <th>문의 내용</th>
                    <th>날짜</th>
                    <th>답변상태</th>
                  
                </tr>
                <tr>
                    <td>p0001</td>
                    <td>작품명 : Remember Me</td>
                    <td>색상문의</td>
                    <td>2020-05-07</td>   
                    <td>'N'</td>
                </tr>

            </table>
        </div>
         <div class = "qna-table2" style="display:none;" >
            <table style="width:100%" name="qna-list">
                <tr>
                    <th>카테고리</th>
                    <th>문의 내용</th>
                    <th>날짜</th>
                    <th>답변상태</th>
                  
                </tr>
                <tr>
                    <td>배송</td>
                    <td>택배사 문제</td>
                    <td>2020-05-09</td>   
                    <td>'N'</td>
                </tr>

            </table>
        </div>
    </div>
      <script>
         $(function(){
        	 $("#qnaCate").change(function(){
                 if(("#qnaCate").val()=='q1') {
	                 $(".qna-table1").hide();
	                 $(".qna-table2").show();
                 }else{
                	 $(".qna-table1").show();
                	 $(".qna-table2").hide();
            });
              
    </script>
   
      <br>
      <br>
    </div> 
</div>
<br>
<br>
<br>
	<%@include file="../common/footer.jsp" %>
</body>
</html>