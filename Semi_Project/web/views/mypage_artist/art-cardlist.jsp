<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <!-- link rel="stylesheet" href="../css/style.css" -->
  <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="../css/bootstrap.css">
  <link rel="stylesheet" href="../css/Style-refund.css">
<script src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script> 
</head>
<body>
<%@include file="../common/menubar.jsp" %>
<%@include file="../common/mypagehead.jsp" %>
    <div class="title">
        <h3>감동카드</h3>
        <hr>
    </div>

    <div class="container">
        <form action="">
            <div class="search-bar">
                <div class="bar1">
                    <input type="text" name="order-status" list="status-list" placeholder=" 테마">
                    <datalist id="status-list">
                        <option value="풍경"></option>
                        <option value="인물"></option>
                        <option value="정물"></option>
                        <option value="동물"></option>
                        <option value="추상"></option>
                        <option value="팝아트"></option>
                        <option value="오브제"></option>
                    </datalist>
                </div>
                <div class="bar2">
                    <button>오늘</button>
                    <button>1주일</button>
                    <button>1개월</button>
                    <button>3개월</button>
                    <button>6개월</button>
                </div>
                <div class="bar3">
                    <input type="date" name="refund-date1"> ~
                    <input type="date" name="refund-date1">
                </div>
                <button type="submit">조회</button>
            </div>

        </form>
        <div class = "card-table">
            <div class="table-headline">
                <div><span>카드 내역</span></div>
                <div class="button"><button class="delete-bt" style = "width:120px">선택 삭제</button></div>
            </div>
            <table style="width:100%" name="card-list">
                <tr>
                    <th><input type="checkbox"></th>
                    <th>상품 번호</th>
                    <th>이미지</th>
                    <th>상품 정보</th>
                    <th>구매자 닉네임</th>
                    <th>감동 카드</th>
                </tr>
                <tr>
                    <td><input type="checkbox"></td>
                    <td>a0001</td>
                    <td><img src="../image/artist.JPG" alt="pimage"></td>
                    <td>작품명 : Remember Me</td>
                    <td>짱짱</td>
                    <td><textarea class="card"></textarea></td>
                </tr>

            </table>
        </div>
        
    </div>
    <div style="width : 350px; margin : 0 auto;">
        <div class="pagination">
            <a href="#" class="disabled" aria-label="Go to previous page">Previous</a>
            <ol>
              <li class="current-page">
                <a href="#" aria-label="Current page. Page 1">1</a>
              </li>
              <li>
                <a href="#" aria-label="Go to 2 page">2</a>
              </li>
              <li>
                <a href="#" aria-label="Go to 3 page">3</a>
              </li>
              <li>
                <button type="button" disabled>...</button>
              </li>
              <li>
                <a href="#" aria-label="Go to 7 page">7</a>
              </li>
              <li>
                <a href="#" aria-label="Go to 8 page">8</a>
              </li>
            </ol>
            <a href="#" aria-label="Go to next page">Next</a>
          </div>
        </div>
    
<%@include file="../common/footer.jsp" %>


</body>
</html>