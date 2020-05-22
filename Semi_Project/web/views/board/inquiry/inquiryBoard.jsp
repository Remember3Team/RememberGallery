<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.inquiry.model.vo.*, board.notice.model.vo.*, java.util.ArrayList"%>
<%
ArrayList<Inquiry> list = ((ArrayList<Inquiry>)request.getAttribute("list"));

PageInfo pi = (PageInfo)request.getAttribute("pi");

int listCount = pi.getListCount();
int currentPage = pi.getCurrentPage();
int maxPage = pi.getMaxPage();
int startPage = pi.getStartPage();
int endPage = pi.getEndPage();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1:1문 - RememberArt</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/style.css">
 <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
 <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/bootstrap.css">
<script src="<%=request.getContextPath() %>/views/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/views/js/bootstrap.js"></script>    
</head>
<style>
	#centerDiv{margin-top:70px;}
	.headLine{ /*float:left;*/ width:30%; /*margin-top:90px; margin-left:90px; margin-bottom:50px;*/ display:block; box-sizing:border-box;}
	.headLine hr{ background-color:red; width:25px; border:2px solid red; margin-bottom:10px;}
</style>
<body>
<%@include file="../../common/menubar.jsp" %>

<!-- 1:1 게시판 Logo -->
<div class="headLine">
		<hr style="display:inline-block;">
		<h3 style="font-size:20px;">1:1문의</h3>
</div><!-- class headLine end -->

<div id="centerDiv" class="container" >
<!-- 사용자에게는 보이고 관리자에게 보이지 않는 페이지 div id addQuestionArea -->			
 <div id="addQuestionArea">
  <div class="form-row">
    <div class="form-group col-md-3">
      	<select id="Category" class="form-control">
       	 	<option selected>선택</option>
        	<option value="배송">배송문의</option>
        	<option value="환불">환불문의</option>
        	<option value="사이트오류">사이트 이용문의</option>
        	<option value="기타">기타문의</option>
      	  </select>
    </div>
    <div class="form-group col-md-9">
      <input type="text" class="form-control" id="question_title" name="question_title" placeholder="게시글 제목은 모든 사용자에게 노출됩니다.">
    </div>
  </div>
  <div class="form-row">
  	<div class="form-group col-md-11">
  		<textarea class="form-control" id="question" name="question" rows="5" placeholder="문의 내용을 입력해주세요"></textarea>
    </div>
    <div class="form-group col-md-1">
	    <button id="addQuestion" class="btn btn-primary" style="height:130px">문의하기</button>  		
    </div>
    
  </div>
  </div><!-- div id addQuestionArea end -->
  
 
 <script>
 	window.onload = function(){
 		//로그인 유저에 따라 입력 창 display none block 여부 확인
 		if("<%=loginUser.getUserId()%>"=="admin"){
	 		document.getElementById("addQuestionArea").style.display="none";		
 		}
 	}
 </script>
 <br><br><br><br>
<table class="table" id="inquiryList">
  <thead>
    <tr>
      <th scope="col" class="text-center">문의구분</th>
      <th scope="col" class="text-center">문의내용</th>
      <th scope="col" class="text-center">작성자</th>
      <%if(loginUser.getUserId().equals("admin")){ %>
      	<th scope="col" class="text-center">답변상태</th>
      <%}else{ %>      
      	<th scope="col" class="text-center">답변 여부</th>
      <%} %>
    </tr>
  </thead>
  <tbody id="showInquiry">
  <% if(list.isEmpty()){%>
  <%} else{%>
  	<%for(Inquiry in :list){%>
    <tr>
      <input type="hidden" value="<%=in.getQ_no() %>">
      <th scope="row" class="text-center"><%=in.getQ_cate() %></th>
      <td class="text-center"><%=in.getQuestion_title() %></td>
      <td class="text-center"><%=in.getUser_id() %></td>
      <%if(loginUser.getUserId().equals("admin") && in.getQ_yn().equals("N")){ %>
      	<td class="text-center"><button id="inputAnswer" class="btn btn-primary" data-toggle="modal" data-target="#intro">답변하기</button>
      <%}else{ %>
      	<td class="text-center"><%=in.getQ_yn() %></td>
      <%} %>
    </tr>
    <%if(loginUser.getUserId().equals("admin") || loginUser.getUserId().equals(in.getUser_id())){ %>
	<tr style="height:100px;">
		<td class="text-center">문의 내용</td>
		<td class="text-center" colspan="4"><span><%=in.getQuestion() %></span></textarea></td>
		
    </tr>
    <%} %>
    <tr>
    	<td colspan="4"></td>
    </tr>
  <%} %>
 <%} %>
  </tbody>
</table> 
       
        <div class="modal fade" id="intro" role="dialog" aria-labelledby="introHeader" aria-hidden="true" tabindex="-1">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">답변 입력</h4>
                    </div>
                    <form action="answer.in" method="get">
	                    <div class="modal-body">
	                        <textarea id="answerArea" name="answerArea" cols="80" row="30"></textarea>
	                    </div>
	                    <div class="modal-footer">
	                        <button type="submit" class="btn btn-default">전송</button>
	                        <button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
	                    </div>
                    </form>
                </div>
            </div>
        </div>

    </body>

  	<!-- Pagination -->
	  	<div style="text-align:center;">
			<div class="col-mid-12">
				 <ul class="pagination justify-content-center" style="margin:20px 0">
	    	    	     <li class="page-item"><a class="page-link" href="<%=request.getContextPath()%>/list.in?currentPage=1">Previous</a></li>
	  					<%for(int p = startPage; p<=endPage; p++){ %>
	  					 	<li class="page-item"><a class="page-link" href="<%=request.getContextPath() %>/list.in?currentPage=<%=p%>"><%=p%></a></li>
	  					<%} %>
	                     <li class="page-item"><a class="page-link" href="<%=request.getContextPath() %>/list.in?currentPage=<%=maxPage%>">Next</a></li>
	        	  </ul>
			</div><!-- class col-mid-12 end --> 
		</div><!-- Pagination end --> 
		
</div>

<%@include file="../../common/footer.jsp" %>

</body>
 <script>
 	$(function(){
 		 		
 		$("#addQuestion").click(function(){
 			var writer = "<%=loginUser.getUserId()%>";
			var q_cate = $("#Category").val();
 			var question_title = $("#question_title").val();
 			var question = $("#question").val();
 			
 			$.ajax({
 				url:"insert.in",
 				type:"post",
 				data:{writer:writer,q_cate:q_cate,question_title:question_title,question:question},
 				success:function(data){
 					$inquiryTable = $("#showInquiry");
 					$inquiryTable.html("");
 					
 					for(var key in data){
						 						
 						var $tr = $("<tr>");
 						
 						var $writerTd=$("<td>").text(data[key].user_id).addClass('text-center');
 						var $categoryTd=$("<td>").text(data[key].q_cate).addClass('text-center');
 						var $question_titleTd=$("<td>").text(data[key].question_title).addClass('text-center');
 						var $questionTd=$("<td>").text(data[key].question).addClass('text-center');
 						var $questionYnTd=$("<td>").text(data[key].q_yn).addClass('text-center');
 						
 						
 						$tr.append($categoryTd);
 						$tr.append($question_titleTd);
 						$tr.append($writerTd);
 						$tr.append($questionYnTd);
 						
 						$inquiryTable.append($tr);
 					}
 					$("#question_title").val("");
 					$("#question").val("");
 				},
 				error:function(request,statur,error){
					alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error"+error);
 				}
 			})
 		})
 	})
 </script>

</html>