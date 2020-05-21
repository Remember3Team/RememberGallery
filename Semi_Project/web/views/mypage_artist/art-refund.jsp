<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "mypage_artist.RefundQnACard.model.vo.*, artistapply.model.vo.*, product.model.vo.*, java.util.ArrayList"%>
    
    <%
    	ArrayList<BuyList_a> list = (ArrayList<BuyList_a>) request.getAttribute("list");
    	ArrayList<Attachment> alist = (ArrayList<Attachment>) request.getAttribute("alist");
    	Apply aphoto = (Apply) request.getAttribute("aphoto");
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
<div class="headline">
        <div class="headline-text">
            <hr>
            <h3 style="font-size: 20px;"> 작가 마이페이지</h3>
        </div>
        <div class="headline-subbox">
            <div class="artist-img">
                <!--Artist Image-->
				<img src="<%= request.getContextPath() %>/apply_uploadFiles/<%= aphoto.getArtist_pro() %>" style="width:83px; height :83px;">
           </div>
            <div class="artist-btn" style = "display: inline-block; vertical-align: middle;">
                <button class="btn btn-outline-dark" style = "width:120px; display:block; margin-bottom:5px;" onclick="checkCard();">정보 수정</button>
                <button class="btn btn-outline-dark" style = "width:120px; display:block;margin-top:5px;" onclick="checkCard();">감동 카드</button>
                
            </div>
                <script>
                	function checkCard() {
                		location.href = "<%= request.getContextPath() %>/list.ac"
                			
                	}
                </script>
        </div>
    </div>
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
                <div class="btn-group" data-toggle="buttons" style="vertical-align : inherit;">
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
                <button type="submit" class="btn btn-outline-dark" style = "margin : 10px 0; width:100px">조회</button>
            </div>

        </form>
        <div class = "refund-table">
            <div class="table-headline">
                <div><span>반품 / 환불 목록</span></div>
                <button class="btn btn-outline-dark" style = "width:120px; float:right;" onclick = "refund(this);">환불 완료</button>
            </div>
            
            <script type="text/javascript">

/* $("document").ready(function(){
	$("#input[name=check]:checkbox").click(function(){
		totalPrice();
	});
}); */

// BASKET_NO 를 일정한 형식으로 담을 변수
var arrayList = '';


function refund(){
	
	var checkboxList = $("input[name=check]:checked");
	arrayList = '';
	for(var i=0; i<checkboxList.length; i++){
		
		// checkbox가 체크 되어있을 때만 실행
		if($(checkboxList[i]).is(":checked")){
			console.log(i);
			
		if(i != checkboxList.length-1){
			
				arrayList += $(checkboxList[i]).val() + ",";
				
		} else{
			
				arrayList += $(checkboxList[i]).val();
				
		}
			
		}
	}
	
	console.log(arrayList);
	
	// 하나도 체크 안했을 시 
	if(arrayList == ''){
		alert("한가지 이상을 선택해주세요.");
	}
	else{
		if(!confirm('환불하시겠습니까?'))
			return false;
		
		// post ajax 통신 
		
		$.ajax({
			type: "POST",
			url: "list.ar",
			data: {order_no : arrayList},
			success: function(ret){
				// 현재 페이지 새로고침
				location.reload();
			}
		});
	}
}


</script>
          
            
            <table style="width:100%" name="refund-list">
                <tr>
                    <th style = "text-align : center;"><input type="checkbox"></th>
                    <th style = "text-align : center;">주문 번호</th>
                    <th style = "text-align : center;">이미지</th>
                    <th style = "text-align : center;">상품 정보</th>
                    <th style = "text-align : center;">금액</th>
                    <th style = "text-align : center;">구매자 아이디</th>
                    <th style = "text-align : center;">처리 상태</th>
                    <th style = "text-align : center;">주문 정보 확인</th>
                </tr>
                
                
                <% for(int i = 0 ; i < list.size(); i++){
                	BuyList_a b = list.get(i);
                %>
               
				<tr>
					<td><input type="checkbox" name="check" value="<%=b.getOrder_no() %>"></td>
					<td><%=b.getOrder_no() %></td>
					<td>
					 <% for(int j=0; j<alist.size(); j++){ 
							Attachment a = alist.get(j); %>
							
						<% if(b.getPaint_no() == a.getPaint_no()) { %>
					<img src="<%= request.getContextPath() %>/thumbnail_uploadFiles/<%= a.getSavefileName() %>" width="150px" height="150px">
					 <%} %>
					<%} %>
					</td>
					<td>작품명 : <%=b.getPaint_name()%><br>작가명 : <%=b.getArtist_name()%> </td>
					<td><%=b.getPaint_price()%></td>
					<td><%=b.getUser_id()%></td>
					<td><%=b.getOrder_status()%></td>
					<td><button class="btn btn-outline-dark" id="detail_order" style = "width:150px">주문 상세보기</button></td>
				</tr>
				<%} %>
               
            </table>
        </div>
        
    </div>
    <!-- <div style="width : 350px; margin : 0 auto;">
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
        </div> -->

<%@include file="../common/footer.jsp" %>
</body>
</html>