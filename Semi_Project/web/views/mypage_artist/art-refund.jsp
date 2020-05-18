<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "mypage_artist.model.vo.*, product.model.vo.*, java.util.ArrayList"%>
    
    <%
    	ArrayList<BuyList_a> list = (ArrayList<BuyList_a>) request.getAttribute("list");
    	ArrayList<Attachment> alist = (ArrayList<Attachment>) request.getAttribute("alist");
    %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>art refund</title>
 <!-- link rel="stylesheet" href="../css/style.css" -->
  <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="<%=request.getContextPath()%>/views/css/Style-refund.css">
   <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/bootstrap.css">
<script src="<%=request.getContextPath() %>/views/js/jquery-3.4.1.min.js"></script>

</head>

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
        <div class = "refund-table">
            <div class="table-headline">
                <div><span>반품 / 환불 목록</span></div>
                <div class="button"><button class="btn btn-outline-dark" style = "width:120px">환불 완료</button></div>
            </div>
            <table style="width:100%" name="refund-list">
                <tr>
                    <th style = "text-align : center;"><input type="checkbox"></th>
                    <th style = "text-align : center;">주문 번호</th>
                    <th style = "text-align : center;">이미지</th>
                    <th style = "text-align : center;">상품 정보</th>
                    <th style = "text-align : center;">금액</th>
                    <th style = "text-align : center;">처리 상태</th>
                    <th style = "text-align : center;">주문 정보 확인</th>
                </tr>
                
                
                <% for(int i = 0 ; i < list.size(); i++){
                	BuyList_a b = list.get(i);
                %>
               
				<tr>
					<td><input type="checkbox"></td>
					<td><%=b.getOrder_no() %></td>
					<td>
					 <% for(int j=0; j<alist.size(); j++){ 
							Attachment a = alist.get(j); %>
							
						<% if(b.getPaint_no() == a.getPaint_no()) { %>
					<img src="<%= request.getContextPath() %>/thumbnail_uploadFiles/<%= a.getSavefileName() %>" width="150px" height="150px"></td>
					 <%} %>
					<%} %>
					<td>작품명 : <%=b.getPaint_name()%><br>작가명 :  <%=b.getArtist_name()%> </td>
					
					<td><%=b.getPaint_price()%></td>
					<td><%=b.getOrder_status()%></td>
					<td><button class="btn btn-outline-dark" id="detail_order" style = "width:150px">주문 상세보기</button></td>
				</tr>
				<%} %>
               
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