<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>art refund</title>
</head>
<link rel="stylesheet" href="../css/Style-refund.css">
<body>
<%@include file="../common/menubar.jsp" %>
<%@include file="../common/mypagehead.jsp" %>
    <div class="title">
        <h3>반품 / 환불 관리</h3>
        <hr>
    </div>

    <div class="container">
        <form action="">
            <div class="search-bar">
                <div class="bar1">
                    <input type="text" name="order-status" list="status-list" placeholder=" 주문 처리 상태">
                    <datalist id="status-list">
                        <option value="환불신청"></option>
                        <option value="환불완료"></option>
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
        <div class = "refund-table">
            <div class="table-headline">
                <div><span>반품 / 환불 목록</span></div>
                <div class="button"><button class="refund-bt" style = "width:120px">환불 완료</button></div>
            </div>
            <table style="width:100%" name="refund-list">
                <tr>
                    <th><input type="checkbox"></th>
                    <th>주문 번호</th>
                    <th>이미지</th>
                    <th>상품 정보</th>
                    <th>금액</th>
                    <th>처리 상태</th>
                    <th>주문 정보 확인</th>
                </tr>
                <tr>
                    <td><input type="checkbox"></td>
                    <td>p0001</td>
                    <td><img src="../img/artist.JPG" alt="pimage"></td>
                    <td>작품명 : Remember Me</td>
                    <td>10,000</td>
                    <td>환불 요청</td>
                    <td><button class="order-info-bt">주문 상세보기</button></td>
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