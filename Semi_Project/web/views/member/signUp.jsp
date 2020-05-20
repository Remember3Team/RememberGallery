<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/views/css/Style-signUp.css">

<script src="../js/jquery-3.4.1.min.js"></script>

<style>
#idCheck {
	text-align: center;
}

#idCheck:hover {
	cursor: pointer;
}

#idCheck, #goMain, #joinBtn {
	background:red ;
	color:white;
	border-radius: 5px;
	width: 80px;
	height: 25px;
	text-align: center;
}

#idCheck:hover, #joinBtn:hover, #goMain:hover {
	cursor: pointer;
}

td {
	text-align: right;
}

#joinBtn {
	background: yellowgreen;
}

#joinBtn, #goMain {
	display: inline-block;
}
</style>
</head>


<body>
	<%@include file="../common/menubar.jsp"%>

	<div class="container">
		<form id="joinForm" action="<%=request.getContextPath()%>/insert.me"
			method="post" onsubmit="return insertMember()">
			<!--section1-->
			<div class="section1" style="padding-bottom: 90px;">
				<h1 style="color: black;">JOIN</h1>
				
				<hr style="border: 1px soild black;">
				<span>회원 가입<a style="color: red; font-size: 15px;">*</a></span>
				<hr style="border: 1px soild black;">
				
				<div class="artregi-infobox">
					<div class="info-box1">
						<label class="labelfirst" id="name">이름<a
							style="color: red; font-size: 15px;">*</a></label><input
							class="nomal-text" type="text" name="userName" >
						<label id="nameresult"></label>
					</div>
					<br>

					<div class="info-box2">
						<label class="labelfirst" id="userId">아이디<a
							style="color: red; font-size: 15px;">*</a></label><input
							class="nomal-text" type="text" name="userId" required>

					</div>
					<div id="idCheck"
						style="float: right; width: 100px; height: 20px; background-color: gray; text-align: center; color: white;" >중복확인</div>

					<br> <br>
					<div class="info-box3">
						<label class="labelfirst" id="userPwd">비밀번호<a
							style="color: red; font-size: 15px;">*</a></label><input
							class="nomal-text" type="password" name="userPwd"  required>
					</div>
					<br>

					<div class="info-box4">
						<label class="labelfirst" id="userPwd2">비밀번호 확인<a
							style="color: red; font-size: 15px;">*</a></label> <input
							class="nomal-text" type="password" name="userPwd2"  required>
						<label id="pwdResult">sadaddssd</label>
					</div>
					<br> <br>
					<div class="info-box5">
						<label class="labelfirst">닉네임</label><input class="nomal-text"
							type="text" name="nickName">
					</div>

					<div class="info-box6">
						<label class="labelfirst">휴대폰 번호</label>
						&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <input
							type="tel" id="Phone" name="phone" value="" maxlength="11"
							autocomplete="off">

					</div>

					<div class="info-box7">
						<label class="labelfirst">주소<a
							style="color: red; font-size: 15px;">*</a></label> <input
							class="nomal-text" type="text" name="address" required>

					</div>

					<div class="info-box7">
						<label class="labelfirst">이메일<a
							style="color: red; font-size: 15px;">*</a></label><input class="nomal-text"
							type="text" name="email"  required>
					</div>
					<br>
<!-- 
					<div>
						<div class="info-box8">
							<div class="info-box8">
								<button class="PrivacyAgree"
									style="background-color: gray; color: white; text-align: center; width: 400px; height: 20px;">▽</button>
							</div>
							<div class="info-box8">
								<textarea name="paint_int">개인정보수집·이용·제공 동의서 (재)충남테크노파크는 “민간 수출전문가 모집 및 pool 등록”과 관련하여󰡔개인정보보호법󰡕 제15조제1항제1조, 
								제24조제1항제1호에 따라 아래와 같이 개인(신용)정보의 수집·이용에관하여 귀하의 동의를 얻고자 합니다. 1. 개인(신용)정보의 수집·이용에 관한 사항 ① 개인정보의 수집·이용 목적
								ㅇ 귀하의 개인정보는 [(재)충남테크노파크]의 “민간 수출전문가 모집 및 pool 등록”과 관련 하여 전문가pool 등록 및 선정과정, 활용기간 동안의 연락·확인 목적으로 수집·이용됩니다.
								 ② 수집·이용할 개인정보의 항목ㅇ 개인식별 정보(성명, 전자우편주소, (휴대)전화번호) ③ 개인정보의 보유·이용 기간 ㅇ 위 개인정보는 제공된날부터 제공된 목적을 달성할 때까지 보유·
								 이용되며 보유목적 달성시 또는 정보주체가 삭제를 요청할 경우 지체 없이파기합니다.
                    </textarea>
							</div>
						</div>
					</div>
					<div class="info-box9">
						<label class="labelfirst" style="float: right;"><input
							class="" type="checkbox" name="price">확인 후, 동의하겠습니다.</label>
					</div> -->

				</div><!-- infobox 끝 -->
				<br> <br> <br> <br>
				<div class="submit-box" align="center">
					<div id="goMain" onclick="goMain();">메인으로</div>
					<!-- <div id="joinBtn" onclick="insertMember();">가입하기</div> -->
					<input type="submit" value="가입하기">
					
				</div><!-- submit-box 끝 -->
			</div><!-- section 끝-->
		</form>
	</div>
	<!-- container 끝-->

	<script>
	function goMain(){
		location.href="<%=request.getContextPath()%>/index.jsp";
	}
	
	function insertMember(){
		/* alert("회원가입이 완료 되었습니다."); */
		return true;
	}
	
	//ajax
	 	$(function(){
	 		$("#idCheck").click(function(){
	 			var userId = $("#joinForm input[name = 'userId']");
	 			
	 			if(!userId || userId.val().length<4){
	 				alert("아이디는 최소 4자리 이상이어야합니다.");
	 				userId.focus();
	 			}else{
	 				$.ajax({
	 					url: "<%=request.getContextPath()%>/idCheck.me",
	 					type:"post",
	 					data:{userId : userId.val()},
	 					success:function(data){
	 						if(data=='fail'){
	 							alert("아이디가 중복 됩니다.");
	 							userId.focus();
	 						}else{
	 							alert("아이디가 사용가능합니다.");
	 							userId.attr("readonly","true");
	 						}
	 					},
	 					error:function(data){
	 						console.log("서버 통신 안됨");
	 					}
	 					
	 				})
	 			}
	 		})
	 		
	 	})


		$(function(){
			$("#userName").change(function(){
				var regExp =/^[가-힣]{2,}$/;
				if(regExp.test($this).val()){
					$("#nameresult").jsp("정상입력").css('color','green');
					$(this).css("background","white");
				}else{
					$('#name').val('');
					$('#nameresult').jsp("이름은 한글로 2자 이상이여야합니다.").css('color','red');
					$(this).focus().css("background","red");
				}
			});
	/* 		$("#userPwd2").chacnge(function(){
				if($('#userPwd').val()!=$(this).val)				
			}) */
			
		}); /* function */
	
	
	</script>

	<%-- 	<%@include file="../common/footer.jsp"%> --%>

</body>
</html>