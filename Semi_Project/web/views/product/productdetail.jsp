<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8" import = "product.model.vo.*,artistapply.model.vo.*, java.util.ArrayList"%>
<%

	product plist = (product)request.getAttribute("plist");
	ArrayList<Attachment> alist = (ArrayList<Attachment>)request.getAttribute("alist");
	ArrayList<product> sizelist = (ArrayList<product>)request.getAttribute("sizelist");
	Apply apply = (Apply)request.getAttribute("aplly");
	masterpiece mp = (masterpiece)request.getAttribute("mp");
	MasterpieceCount mc = (MasterpieceCount)request.getAttribute("mc");
	ArrayList<Paint_QnA> qna = (ArrayList<Paint_QnA>)request.getAttribute("qna");
	ArrayList<Paint_QnA> qna2 = (ArrayList<Paint_QnA>)request.getAttribute("qna2");


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- link rel="stylesheet" href="../css/style.css" -->
 <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/style.css">
 <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
 <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/bootstrap.css">
<script src="<%=request.getContextPath() %>/views/js/jquery-3.4.1.min.js"></script>
 <!— Swiper JS —>
  <script src="<%=request.getContextPath() %>/views/js/swiper.min.js"></script>
    <!-- Link Swiper's CSS -->
  <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/swiper.min.css">


<style>
#sumnailimage {
   border: solid 1px;
   display: inline-block;
   width: 528px;
   height: 507px;
   margin-left: 191px;
   margin-right: 20px;
   margin-top: 20px;
   float: left;
}

#data {
   display: inline-block;
   width: 760px;
   height: 400px;
   float: left;
   margin-left: 20px;
   margin-right: 0px;
   margin-top: 20px;
}

#simulationMain {
   position : relative;<!--안에 이미지에 대한 기준-->
   border: solid 1px;
   display: inline-block;
   width: 369px;
   height: 358px;
   margin-left: 191px;
   margin-right: 20px;
   margin-top: 20px;
   float: left;
}
#simulation1{
border: solid 1px;
   display: inline-block;
   width: 121px;
   height: 125px;
   margin-left: 50px;
   margin-right: 20px;
   margin-top: 100px;
   float: left;
}
#simulation2{
border: solid 1px;
   display: inline-block;
   width: 121px;
   height: 125px;
   margin-left: 10px;
   margin-right: 20px;
   margin-top: 100px;
   float: left;
}
#simulation3{
border: solid 1px;
   display: inline-block;
   width: 121px;
   height: 125px;
   margin-left: 10px;
   margin-right: 20px;
   margin-top: 100px;
   float: left;
}

#writer {
   border: solid 1px;
   display: inline-block;
   width: 369px;
   height: 358px;
   margin-left: 191px;
   margin-right: 20px;
   margin-top: 20px;
   float: left;
}
#data2 {
   display: inline-block;
   width: 760px;
   height: 358px;
   float: left;
   margin-left: 10px;
   margin-right: 0px;
   margin-top: 100px;
}


 ul,li{
      list-style:none;
      }
  #slide{
      height:400px;
      width: 700px;
      position:relative;
      overflow:hidden;
     
      }
  #slide ul{
      width:400%;
      height:200%;
      transition:1s;
      }
  #slide li{
      float: left;
      }
  #slide input{
      display:none;
      }
  #slide label{
      display:inline-block;
      vertical-align:middle;
      margin-left:10px;
      margin-right:10px;
      margin-bottom:0px;
      width:15px;
      height:15px;
      border:3px solid rgb(0, 0, 0);
      transition:0.3s;
      border-radius:50%;
      cursor:pointer;
      }
  #slide .pos{
      text-align:center;
      position:absolute;
      bottom: 0;
      left:0;
      width:100%;
      }
    #pos1:checked~ul{
      margin-left:0%;
      }
    #pos2:checked~ul{
      margin-left:-702px;
      }
    #pos3:checked~ul{
      margin-left:-1404px;
      }
    #pos1:checked~.pos>label:nth-child(1){
      background:rgb(255, 255, 255);
      }
    #pos2:checked~.pos>label:nth-child(2){
      background:rgb(255, 255, 255);
      }
    #pos3:checked~.pos>label:nth-child(3){
      background:rgb(255, 255, 255);
      }

      #imgInfo { width:100%; }
      #imgInfo td { width:50%; font-size:20px; line-height:2; }
      .btnArea { width:100%; margin:10px 0; }
	  .btnArea:after { display:block; content:""; clear:both; }
	 .btn{
	 	width:550px;
	 	height:40px;
	 }
	 
	  <!-- Demo styles -->
  <style>
    html, body {
      position: relative;
      height: 100%;
    }
    body {
      background: #eee;
      font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
      font-size: 14px;
      color:#000;
      margin: 0;
      padding: 0;
    }
    .swiper-container {
      width: 75%;
      height: 500px;
    }
    .swiper-slide {
      text-align: center;
      font-size: 18px;
      background: #fff;
      }
      
      .swiper-fiximg {
       	 position : absolute;
       	 top : 20%;
       	 left : 35%;
       	 z-index:100;
       	 
      }

      /* Center slide text vertically */
      display: -webkit-box;
      display: -ms-flexbox;
      display: -webkit-flex;
      display: flex;
      -webkit-box-pack: center;
      -ms-flex-pack: center;
      -webkit-justify-content: center;
      justify-content: center;
      -webkit-box-align: center;
      -ms-flex-align: center;
      -webkit-align-items: center;
      align-items: center;
    }
	 
</style>
</head>
<body>
   <%@include file="../common/menubar.jsp"%>
<br>
<table style = "margin : 0 auto;">
<tr>
<td>
   <div id="slide">
  <input type="radio" name="pos" id="pos1" checked>
  <input type="radio" name="pos" id="pos2">
  <input type="radio" name="pos" id="pos3">

  <ul>
  <%for(int i =0; i< alist.size();i++){
	  Attachment a = alist.get(i);
	  if(a.getFileLevel() == 0){%>
    <li><img src="<%=request.getContextPath()%>/thumbnail_uploadFiles/<%=a.getSavefileName()%>" width=700px; height=400px;></li>
    <%}}%>
     <%for(int i =0; i< alist.size();i++){
	  Attachment a = alist.get(i);
	  if(a.getFileLevel() == 1){%>
    <li><img src="<%=request.getContextPath()%>/thumbnail_uploadFiles/<%=a.getSavefileName()%>" width=700px; height=400px;></li>
        <%}}%>
  </ul>
  <p class="pos">
    <label for="pos1"></label>
    <label for="pos2"></label>
    <label for="pos3"></label>

  </p>
</div>
   
   </td>
  <td style="box-sizing:border-box; padding: 0 0 0 50px;">
      <div>
         <h3 align="left"><%=plist.getPaint_name() %></h3>
      </div>
      <hr style="margin: 1;" color="black" width="554px">
      <table id="imgInfo">
      	<tr>
      		<td align="center">작가명 : <%= plist.getArtist_name()%></td>
      		<td align="center">카테고리 : <%=plist.getCategory() %></td>
      	</tr>
      	<tr>
      		<td align="center">제작년도 : <%=plist.getCategory() %></td>
      		<td align="center">사이즈 :<% for(int i =0;i < sizelist.size();i++) {
				product p = sizelist.get(i);
				if(plist.getSize_no() == p.getSize_no() ){%>
			
					<%=p.getWidth()%> *<%=+p.getHeight()%>
					
				<% }}%></td>
      	</tr>
      </table>  	 																																																																																	
      <hr style="margin: 1;" color="black" width="554px">
      <table id="imgInfo">
      <tr>
      <td>
       <span style="text-align: center; width: 100px; font-size: 35px;"><%=plist.getPatint_price() %>원</span>
      </td>
      <td>
  
      		
      		<div style="float:right;">
      		<div class="likeCount" style="float:left; margin-right:10px;">
      			<span class="countArea"><%=mc.getCount() %></span>
      		</div>
      		
      		<%if(mp.getUser_id() != null){ %>
      		<img class="heartcheck" src="<%=request.getContextPath()%>/views/img/colorHeart.png">
      		<%}else{%>
      		<img class="heartcheck" src="<%=request.getContextPath()%>/views/img/emptyHeart.png">
      		<%} %>
      		
      		
      		</div>
      </td>
      </tr>
      </table>
      <script>
      $(function(){
      $(".heartcheck").click(function(){
    	  var paint_no = "<%=plist.getPaint_no()%>";
    	  var heart = $(".heartcheck").attr('src');
    	  var heartYN;

    	  if(heart=='<%=request.getContextPath()%>/views/img/colorHeart.png'){
    		  $(".heartcheck").attr('src','<%=request.getContextPath()%>/views/img/emptyHeart.png');
    		  heartYN = 'N';
    	  }else{
    		  $(".heartcheck").attr('src','<%=request.getContextPath()%>/views/img/colorHeart.png');
    		  heartYN = 'Y';
    	  }
    	  $.ajax({
    		url:"masterpiece.po",
    		type:"post",
    		data:{paint_no:paint_no,heartYN:heartYN},
   
    		success:function(data){
    			var $likeCount = $(".likeCount");
    			var $count = $("<span>").text(data);
    			
    			$likeCount.html($count);
    			
    		},
    		error:function(request,statur,error){
    			alert("로그인을 하셔야 합니다.");
    			 $(".heartcheck").attr('src','<%=request.getContextPath()%>/views/img/emptyHeart.png');
    		}
    		  
    	  })
    	  
    	  
      });
      });
      
     
      </script>
      
     

      <div class="btnArea">
      <input id="paint_no" type="hidden" value="<%=plist.getPaint_no()%>">
	      <input type="button" class = "btn btn-outline-dark" value="바로 구매하기"><br clear="both"><br>
	       <input type="button" class = "btn btn-outline-success"  value="장바구니 담기" onclick="장바구니"><br clear="both"><br>
	      <inputtype="button" class = "btn btn-outline-danger"  value="Q & A" onclick="q&a"> Q & A<input type="hidden" value="" id="mid">
	      <!-- <input type="hidden" value="${ movieDetail.movie_id }" id="movie_id"> -->
	      <input type="hidden" value="" id="movie_id">
  
      </div>
       <script>
                  $(function(){
				 		$(".btn-outline-dark").click(function(){
				 			var paint_no = $(this).parent().children("#paint_no").val();
				 			
				 			location.href="<%=request.getContextPath()%>/Buy.po?paint_no="+paint_no;
				 		});
				 		
				 	});
				 	
                  $(function(){
				 		$(".btn-outline-success").click(function(){
				 			var paint_no = $(this).parent().children("#paint_no").val();
				 			
				 			location.href="<%=request.getContextPath()%>/basket.po?paint_no="+paint_no;
				 		});
				 		
				 	});
			</script>
      
  </td>
	</tr>
	</table>	
   <br clear="both">
   <br>
   <hr style = "margin : 50px auto;" color="black" width="1300px">
   <br clear="both">
   
   <h3 align="center">인테리어 시뮬레이션</h3>
     
  <!-- Swiper -->
  <div class="swiper-container"> 
  <%for(int i =0; i< alist.size();i++){
	  Attachment a = alist.get(i);
	  if(a.getFileLevel() == 0){%>
     	<img class = "swiper-fiximg" src="<%=request.getContextPath()%>/thumbnail_uploadFiles/<%=a.getSavefileName()%>" width="30%">
    <%}}%>
    
 
    <div class="swiper-wrapper">
      <div class="swiper-slide"><img src="<%=request.getContextPath() %>/views/interior/인테리어1.jpg" width="100%"></div>
      <div class="swiper-slide"><img src="<%=request.getContextPath() %>/views/interior/인테리어2.jpg"  width="100%"></div>
      <div class="swiper-slide"><img src="<%=request.getContextPath() %>/views/interior/인테리어3.jpg"  width="100%"></div>
      <div class="swiper-slide">Slide 4</div>
    </div>
    <!— Add Pagination —>
    <div class="swiper-pagination"></div>
    <!— Add Arrows —>
    <div class="swiper-button-next"></div>
    <div class="swiper-button-prev"></div>
  </div>
  
  <!— Initialize Swiper —>
  <script>
    var swiper = new Swiper('.swiper-container', {
      pagination: {
        el: '.swiper-pagination',
        type: 'progressbar',
      },
      navigation: {
        nextEl: '.swiper-button-next',
        prevEl: '.swiper-button-prev',
      },
    });
  </script>
   
   <br clear="both">
   <hr style = "margin : 50px auto;" color="black" width="1300px">
   <h3 align="center">작품 소개</h3>
   <a style="text-align: left; width: 100px; margin-left:300px; font-size: 15px; text-decoration: none !important; border-bottom: dotted 0px !important; color: black !important;"><%=plist.getPaint_int() %></a>
   <br>
   <hr style = "margin : 50px auto;" color="black" width="1300px">
   <h3 align="center">작가 소개</h3>
   
   <div id="writer">
      <img src="<%=request.getContextPath()%>/views/interior/<%=apply.getArtist_pro() %>" style="width: 369px; height: 358px;">
   </div>
   
   <div id="data2">
   <a style="text-align: left; width: 100px; margin-left:30px; font-size: 15px; text-decoration: none !important; border-bottom: dotted 0px !important; color: black !important;"><%=apply.getArtist_int() %></a>
   </div>
   <br clear="both">
   <hr style = "margin : 50px auto;" color="black" width="1300px">
  
   <h3 align="center">Q & A</h3>
   <br>
   <div class="q&a">
   <table style = "margin : 0 auto;">
    <tr>
		<td>Q & A 작성</td>
		<td>
		<textArea rows="5" cols="100" class="QnAContent"></textArea>
		</td>
		<td>
			<button class="addQNA" type="button active" class="btn btn-secondary" style="width:100px;">Q&A등록</button>
		</td>
		</tr>
   </table>
   <div id="replySelectArea">
			<table id="replySelectTable" class="table" align="center">
				<% if(qna.isEmpty()) { %>
					<tr><td colspan="3">Q & A가 없습니다.</td></tr>				
				<% }else { %>
					<% for(int i=qna.size()-1; i>=0; i--){ %>
						<tr>
							<td width="100px"><%= qna.get(i).getUser_id() %></td>
							<td width="400px"><%= qna.get(i).getPqusetion() %></td>
							<td width="200px"><%= qna.get(i).getPq_date() %></td>
							<%if(qna.get(i).getPq_yn().equals("N")) {%>
							<td>
								<input class="qna_no" type="hidden" value="<%=qna.get(i).getPq_no()%>">
								<button class="addA" type="button active" class="btn btn-secondary" style="width:100px;">답변하기</button>
								<div class="Acontents" style="display:none;">
									<textArea rows="5" cols="100" class="AContent"></textArea>
									<button class="hideA"  type="button active" class="btn btn-secondary" style="width:100px;">답변접기</button>
									<button class="insertA" type="button active" class="btn btn-secondary" style="width:100px;">작성완료</button>
								</div>
								<div></div>
							</td>
							<%}else if(qna.get(i).getPq_yn().equals("Y")){%>
							<td>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>답변완료</b>
							</td>
							<%} %>
						</tr>
							<%for(int j=qna2.size()-1; j>0; j--){ %>
							<%if(qna.get(i).getPq_no() == qna2.get(j).getPq_no()){%>
							<div class="answertable">
							<tr>
							<td width ="100px">판매자</td>
							<td width="400px"><%= qna.get(j).getPanswer()%></td>
							<td width="200px"><%= qna.get(j).getPq_date() %></td>
							</tr>
							</div>
							<%}} %>
					<% } %>
				<% } %>
			</table>
		</div>
</div>
		<script>
		$(function(){
			$(".hideA").click(function(){
				$(this).parent(".Acontents").hide();
				
			})
		})
		
		
		$(function(){
			$(".addA").click(function(){
				$(this).parent().children(".Acontents").show();
				
			})
		})
		
		$(function(){
			$(".insertA").click(function(){ 
				var qna_no = $(this).parent().parent().children(".qna_no").val();
				var content = $(this).parent().children(".AContent").val();
				$.ajax({
					url:"insertA.po",
					type:"post",
					data:{qna_no:qna_no,content:content},
					
					success:function(data){
						$replyTable = $("answertable");
						$replyTable.html("");
						for(var key in data){
							var $tr = $("<tr>");
							
							var $contentTd =$("<td>").text(data[key].panswer).css("width","400px");
							var $dateTd = $("<td>").text(data[key].pq_date).css("width","200px");
							
						
							$tr.append($contentTd);
							$tr.append($dateTd);
							$replyTable.append($tr);
						}
					},
					error:function(request,statur,error){
						alter("댓글은 한번만 등록할 수 있습니다.");
					}
				})
			})
		})
		
		$(function(){
			$(".addQNA").click(function(){
				var paint_no = "<%=plist.getPaint_no()%>";
				var content = $(".QnAContent").val();
				
				$.ajax({
					url:"insertQnA.po",
					type:"post",
					data:{content:content,paint_no:paint_no},
					
					success:function(data){
						$replyTable = $("#replySelectTable");
						$replyTable.html("");
						for(var key in data){
							var $tr = $("<tr>");
							var $writerTd = $("<td>").text(data[key].user_id).css("width","100px");
							var $contentTd =$("<td>").text(data[key].pqusetion).css("width","400px");
							var $dateTd = $("<td>").text(data[key].pq_date).css("width","200px");
							
							$tr.append($writerTd);
							$tr.append($contentTd);
							$tr.append($dateTd);
							$replyTable.append($tr);
						}
						$("#QnAContent").val("");
					},
					error:function(request,statur,error){
						alert("로그인을해야합니다.");
					}
				})
			})
		})
		</script>
   <br clear="both">
   <%@include file="../common/footer.jsp"%>



</body>
</html>