<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.free.model.vo.*, java.util.ArrayList"%>
<%
	Free f = (Free)request.getAttribute("free");
	ArrayList<Reply> rList = ((ArrayList<Reply>)request.getAttribute("rList"));
	
	System.out.println("rList 값 확인:"+rList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=f.getFree_title() %></title>
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
 	 <div class="container"> 
         <div class="row" id="detailArea">
            <div class="cols-sm-6">
               <table align="center" class="table">
                  <tr>
                     <td>제목</td>
                     <td colspan="4"><span><%=f.getFree_title() %></span></td>
                  </tr>
                  <tr>
                     <td>작성자</td>
                     <td><span><%=f.getUser_id() %></span></td>
                     
                     <td>작성일</td>
                     <td><span><%=f.getFree_date() %></span></td>
                  </tr>
                  <tr>
                     <td colspan="4"><span>내용</span></td>
                  </tr>
                  <tr>
                     <td colspan="4">
                        <p>
                           <%=f.getFree_content() %>
                        </p>
                        <p>
                        	<a href="#">
			             		<img src="<%=request.getContextPath() %>/thumbnail_uploadFiles/free/<%=f.getFree_picture() %>" alt="">
			             	</a>
                        </p>
                     </td>
                  </tr>
                 
                  <tr>
					<td>댓글작성</td>
					<td><textArea rows="5" cols="80" id="replyContent"></textArea></td>
					<td>
						<button id="addReply" type="button active" class="btn btn-secondary" style="width:100px;">댓글등록</button>
					</td>
				  </tr>
				  <br><br>
				</table>
				
        <div id="replySelectArea">
			<table id="replySelectTable" class="table" align="center">
				<% if(rList==null) { %>
					<tr><td colspan="3">댓글이 없습니다.</td></tr>
					
				<% }else { %>
					<% for(int i=rList.size()-1; i>=0; i--){ %>
						<tr>
							<td width="100px"><%= rList.get(i).getUser_id() %></td>
							<td width="400px"><%= rList.get(i).getFree_r_content() %></td>
							<td width="200px"><%= rList.get(i).getFree_r_date() %></td>
						</tr>
					<% } %>
				<% } %>
			</table>
		</div> 
            </div><!-- cols-sm-6 div end -->
         </div><!-- row div end -->
       </div><!-- container div end -->
 
		<button id="goFreeBoard" type="button active" class="btn btn-secondary" onclick="location.href='<%=request.getContextPath()%>/views/board/free/freeBoard.jsp'">목록으로 가기</button>
   </body>

	<script>
		$(function(){
			
			$("#addReply").click(function(){
				
				var bid = <%=f.getFree_no()%>;
				var content = $("#replyContent").val();
				
				$.ajax({
					url:"insertReply.ee",
					type:"post",
					data:{content:content,bid:bid},
					success:function(data){
						$replyTable = $("#replySelectTable");
						$replyTable.html("");
						for(var key in data){
							var $tr = $("<tr>");
							var $writerTd = $("<td>").text(data[key].user_id).css("width","100px");
							var $contentTd =$("<td>").text(data[key].reply).css("width","400px");
							var $dateTd = $("<td>").text(data[key].reply_date).css("width","200px");
							
							$tr.append($writerTd);
							$tr.append($contentTd);
							$tr.append($dateTd);
							$replyTable.append($tr);
						}
						$("#replyContent").val("");  
					},
					error:function(request,statur,error){
						alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error"+error);
					}
				})
			})
			
		})
	</script>
</html>