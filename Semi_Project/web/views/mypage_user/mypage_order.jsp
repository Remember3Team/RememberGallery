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
  <link rel="stylesheet" href="../css/Style-ar.css">
  <link rel="stylesheet" href="../css/Style-refund.css">
  
<script src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script>
</head>
<body>
	<%@include file="../common/menubar.jsp" %>
	<%@include file="../common/mypagehead2.jsp" %>
    
    <div class="title">
        <h3><b>주문 내역</b></h3>
        <hr>
    </div>
    	
    
      
      <div class="container">
      <form action="">
            <div class="search-bar">
                <div class="bar1">
                    <input type="text" name="order-status" list="status-list" placeholder=" 주문 처리 상태">
                    <datalist id="status-list">
                        <option>입금전</option>
                        <option>배송준비중</option>
                        <option>배송중</option>
                        <option>배송완료</option>
                        <option>환불신청</option>
                        <option>환불완료</option>
                    </datalist>
                </div>
                <div class="btn-group" data-toggle="buttons">
                                <label class="btn btn-outline-dark">
                                    <input type="radio" name="term" value="today">오늘
                                </label>
                                <label class="btn btn-outline-dark">
                                    <input type="radio" name="term" value="week">1주일
                                </label>
                                <label class="btn btn-outline-dark">
                                    <input type="radio" name="term" value="month" >1개월
                                </label>
                                <label class="btn btn-outline-dark">
                                    <input type="radio" name="term" value="three_months" >3개월
                                </label>
                                <label class="btn btn-outline-dark">
                                    <input type="radio" name="term" value="six_months" >6개월
                                </label>
                            </div> 
                &nbsp;&nbsp;&nbsp;
                <div class="bar3">
                    <input type="date" name="refund-date1"> ~
                    <input type="date" name="refund-date1">
                </div>
                <button type="submit" class="btn btn-dark" style="width:70px">조회</button>
            </div>

        </form>
     
    
   
    <br>
    <br>
    <div>
        <h6>* 기본적으로 최근 3개월간의 자료가 조회되며, 기간 검색시 지난 내역을 조회할 수 있습니다.<br>
        * 취소/환불 신청은 수령확인 버튼을 누르면 진행됩니다.
        </h6>
    </div>
    <br>
    <br>

      <div class = "order-table">
            <div class="table-headline">
                <div><span><b>주문 상품정보</b></span></div>
            </div>
            <table style="width:100%" name="order-list">
                <tr>
                    <th>주문 번호</th>
                    <th>이미지</th>
                    <th>상품명</th>
                    <th>금액</th>
                    <th>주문일자</th>
                    <th>주문 처리상태</th>
                </tr>
                <tr>
                    <td>p0001</td>
                    <td>이미지</td>
                    <td>작품명 : Remember Me</td>
                    <td>10,000</td>
                    <td>2020-05-13</td>
                    <td>환불 요청</td>
                </tr>

            </table>
        </div>
   
      <br>
      <br>
    </div> 
    </div>
    
	
	<%@include file="../common/footer.jsp" %>
</body>
</html>