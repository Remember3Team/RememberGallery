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
</style>
</head>


<body>
	<%@include file="../common/menubar.jsp"%>

	<div class="container">
		<form action="<%=request.getContextPath()%>/insert.th" method="post"
			encType="multipart/form-data">
			<!--section1-->
			<div class="section1" style="padding-bottom: 90px;">
				<h1 style="color: black;">JOIN</h1>
				<hr style="border: 1px soild black;">
				<span>회원 가입<a style="color: red; font-size: 5px;">*</a></span>
				<hr style="border: 1px soild black;">
				<div class="artregi-infobox">
					<div class="info-box1">
						<label class="labelfirst" for="pname">*이름</label><input
							class="nomal-text" type="text" name="pname">
					</div>
					<div class="info-box2">
						<label class="labelfirst" for="pname">*아이디</label><input
							class="nomal-text" type="text" name="pname">
					</div>

					<div class="info-box3">
						<label class="labelfirst" for="aname">*비밀번호</label><input
							class="nomal-text" type="text" name="aname">
					</div>

					<div class="info-box4">
						<label class="labelfirst" for="aname">*비밀번호 확인</label><input
							class="nomal-text" type="text" name="aname">
					</div>


					<br> <br> <br>
					<div class="info-box5">
						<label class="labelfirst">닉네임</label><input class="nomal-text"
							type="text" name="year">
					</div>

					<div class="info-box6">
						<label class="labelfirst">휴대폰 번호</label><input class="nomal-text"
							type="text" name="price">
					</div>

					<div class="info-box7">
						<label class="labelfirst">*주소</label> <input class="nomal-text"
							type="text" name="price">

					</div>

					<div class="info-box7">
						<label class="labelfirst">이메일</label><input class="nomal-text"
							type="text" name="price">
					</div>
					<br>

					<div>
						<div class="info-box8">
							<div class="info-box8">
								<button
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
					</div>

				</div>
				<br> <br> <br> <br>
				<div class="submit-box">
					<button class="submit-bt" type="submit">회원가입</button>
				</div>
			</div>


		</form>
	</div>
	<!-- container -->

	<%@include file="../common/footer.jsp"%>

</body>
</html>