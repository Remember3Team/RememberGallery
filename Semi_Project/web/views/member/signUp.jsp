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
	background: #d3d3d3;
	color: gray;
	border-radius: 5px;
	width: 80px;
	height: 25px;
	text-align: center;
	color: white;
}

#idCheck:hover, #joinBtn:hover, #goMain:hover {
	cursor: pointer;
	color: red;
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
							class="nomal-text" type="text" name="userName" placeholder="NAME"
							required>
					</div>
					<br>

					<div class="info-box2">
						<label class="labelfirst">아이디<a
							style="color: red; font-size: 15px;">*</a></label><input
							class="nomal-text" type="text" id="userId" name="userId" required>
					</div>
					<div id="idresult" style="font-size: 13px; float: right;">영어,숫자
						포함해서 4글자이상 입력하세요.</div>
					<br> <br>
					<div id="idCheck"
						style="float: right; width: 100px; height: 20px; background-color: gray; text-align: center; color: white;"
						>중복확인</div>
					<br> <br>

					<div class="info-box3">
						<label class="labelfirst">비밀번호<a
							style="color: red; font-size: 15px;">*</a></label> <input
							class="nomal-text" type="password" id="userPwd" name="userPwd"
							placeholder="PASSWORD" required>
					</div>
					<div id="pwdresult" style="font-size: 13px; float: right;">영어,숫자
						포함해서 6글자 이상 입력하세요.</div>


					<br>

					<div class="info-box4">
						<label class="labelfirst">비밀번호 확인<a
							style="color: red; font-size: 15px;">*</a></label> <input
							class="nomal-text" type="password" id="userPwd2" name="userPwd2"
							placeholder="confirm password" required>
					</div>
					<div id="pwdcheck" style="font-size: 13px; float: right;"></div>

					<br> <br>

					<div class="info-box5">
						<label class="labelfirst">닉네임</label><input class="nomal-text"
							type="text" name="nickName" placeholder="NICKNAME">
					</div>

					<div class="info-box6">
						<label class="labelfirst">휴대폰 번호</label>
						&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <input
							type="tel" id="Phone" name="phone" maxlength="11"
							autocomplete="off" placeholder="(-)없이 휴대폰 번호 기재"
							style="height: 25px; width: 280px; float: right;">

					</div>

					<div class="info-box7">
						<label class="labelfirst">주소<a
							style="color: red; font-size: 15px;">*</a></label> <br>
					</div>
						<!-- <table>
							<colgroup>
								<col style="width: 20%">
								<col>
							</colgroup>
							<tbody>
								<tr>
									<th style="font-size: 10px;">우편번호</th>
									<td><input type="hidden" id="confmKey" name="confmKey"
										value=""> <input type="text" id="zipNo" name="zipNo"
										readonly style="width: 100px;"> <input type="button"
										value="주소검색" onclick="goPopup();"></td>
								</tr>
								<tr>
									<th style="font-size: 10px;">도로명주소</th>
									<td><input type="text" id="roadAddrPart1"
										style="width: 85%;"></td>
								</tr>
								<tr>
									<th style="font-size: 10px;">상세주소</th>
									<td><input type="text" id="addrDetail" style="width: 40%"
										value=""> <input type="text" id="roadAddrPart2"
										style="width: 40%;" value=""></td>
								</tr>
							</tbody>
						</table> -->

					<div class="info-box7">
						<label class="labelfirst">이메일<a
							style="color: red; font-size: 15px;">*</a></label><input
							class="nomal-text" type="email" name="email"
							placeholder="@ 포함한 이메일 기재" required>
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

				</div>
				<!-- infobox 끝 -->
				<br> <br>
				<div class="submit-box" align="center">
					<div id="goMain" onclick="goMain();">메인으로</div>
					<!-- <div id="joinBtn" onclick="insertMember();"></div> -->
					<input type="submit" value="가입하기"
						style="width: 280px; height: 30px; color: white; background: #cc0000">

				</div>
				<!-- submit-box 끝 -->
			</div>
			<!-- section 끝-->
		</form>
	</div>
	<!-- container 끝-->

	<script>
	

	function goMain() {
			location.href = "<%=request.getContextPath()%>/index.jsp";
	}
	
	function insertMember(){
		/* alert("회원가입이 완료 되었습니다."); */
		
		return true;
	}
	

	
/* 	
$(function(){
	//주소 api
	function goPopup(){
	// 주소검색을 수행할 팝업 페이지를 호출합니다.
	// 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrLinkUrl.do)를 호출하게 됩니다.
	var pop = window.open("/popup/jusoPopup.jsp","pop","width=570,height=420, scrollbars=yes, resizable=yes"); 
	
	// 모바일 웹인 경우, 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrMobileLinkUrl.do)를 호출하게 됩니다.
    //var pop = window.open("/popup/jusoPopup.jsp","pop","scrollbars=yes, resizable=yes"); 
}

function jusoCallBack(roadFullAddr){
		// 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.	
		document.form.userAddr.value = roadFullAddr;		
}
	
	
}); */
	
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
						type : "post",
						data : {
							userId : userId.val()
						},
						success : function(data) {
							if (data == 'fail') {
								alert("아이디가 중복 됩니다.");
								userId.focus();
							} else {
								alert("아이디가 사용가능합니다.");
								userId.attr("readonly", "true");
								idCheck = 1;
							}
						},
						error : function(data) {
							console.log("서버 통신 안됨");
						}

					})
				}
			})

		});// ajax 중복

		// jquery

		//정규 표현식 
		// 모든 공백 체크 정규식
		var empJ = /\s/g;

		//아이디 정규식
		var idJ = /^[a-z0-9_]{4,20}$/;
		$(function() {
			//idresult
			$("#userId").change(
					function() {

						if (idJ.test($(this).val())) {
							$("#idresult").html("정상입력").css('color', 'green');
							$(this).focus().css("background", "white");
						} else {
							$("#userId").val('');
							$("#idresult").html("영어,숫자 사용해서 4글자이상 입력하세요.").css(
									'color', 'red');
							$(this).focus().css("background", "white");
						}
					});

			//idcheck 중복확인
			$(function() {
				$()
			})

			//비밀번호 정규식 
			var pwdJ = /^[a-z0-9_]{6,20}$/;
			//pwdresult
			$("#userPwd").change(
					function() {
						if (pwdJ.test($(this).val())) {
							$("#pwdresult").html("정상입력").css('color', 'green');
							$(this).focus().css("bakcground", "white");
						} else {
							$("#userId").val('');
							$("#pwdresult").html("영어,숫자 사용해서 6글자 이상 입력하세요.")
									.css('color', 'red');
							$(this).focus().css("background", "white");
						}
					});

			//pwdresult
			/* 	if(!pwdJ.test(name)){
					window.alert("패스워드는 0~9까지 영문자만 가능합니다.");
					
					
					return false;
				} */

			//pwdcheck
			$("#userPwd2").change(function() {

				if ($('#userPwd').val() != $(this).val()) {
					$('#pwdcheck').html('비밀번호 일치 x').css("color", 'red');
					$('#userPwd2').val('');
					$(this).focus();
				} else {
					$("#pwdcheck").html('비밀번호 일치').css("color", 'green');
				}
			})
			$("#userPwd").change(function() {
				if ($('#userPwd2').val() != $(this).val()) {
					/*  					$('#pwdcheck').html('비밀번호 일치 x').css("color", 'red');
					 */$('#userPwd2').val('');
					$('#userPwd2').focus();
				} else {
					$('#pwdcheck').html('비밀번호 일치').css("color", 'green');
				}
			});

		}); // 아이디, 비번 체크
	</script>

	<%@include file="../common/footer.jsp"%>

</body>
</html>