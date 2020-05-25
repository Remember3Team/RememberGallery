<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="views/css/style.css">
<link
	href="https://fonts.googleapis.com/css2?family=Roboto&display=swap"
	rel="stylesheet">
<!-- <link rel="stylesheet" href="../css/bootstrap.css"> -->
<link rel="stylesheet" href="views/css/MainSlide.css">

<script src="views/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="views/js/bootstrap.js"></script>
</head>

<body>

	<%@include file="views/common/menubar.jsp" %>

<section> <!-- 메인 슬라이드 -->
		<div id="contents">
			<div class="part1">
		<!-- 		<div class="slide">
					<h1 align="center">REMEMBER ART</h1>
					 <a href="#"><img src="views/img/slide1.jpg" style="height: auto;"> </a>
            <a href="#"><img src=""></a>
            <a href="#"><img src=""></a>    -->

					<div id="slider-wrap">
						<ul id="slider">
							<li>
								<div>
							<!--  	<h3>Slide #1</h3>-->	
									<span>작가제휴 바로가기</span> 
								</div> <a href="<%=request.getContextPath()%>/views/mypage_artist/art-apply.jsp">
								<img src="<%=request.getContextPath()%>/views/img/2.jpg"></a>
							</li>

							<li>
								<div>
									<!-- <h3>Slide #2</h3>-->
									<span>Sammy1</span> 
								</div> <a href="<%=request.getContextPath()%>/views/mypage_artist/art-apply.jsp">
								<img src="<%=request.getContextPath()%>/views/img/slide1.jpg"></a>
							</li>

							<li>
								<div>
								<!-- 	<h3>Slide #3</h3>-->
									<span>Sammy2</span> 
								</div> <a href="<%=request.getContextPath()%>/list.ar">
								<img src="https://fakeimg.pl/350x200/FF607F/000?text=33333"></a>
							</li>

							<li>
								<div>
								<!-- 	<h3>Slide #4</h3>-->
									<span>Sub-title #4</span> 
								</div> <a href="#">
								<img src="https://fakeimg.pl/350x200/0A6E0A/000?text=44444"></a>
							</li>

							<li>
								<div>
									<!-- <h3>Slide #5</h3>-->
									<span>Sub-title #5</span> 
								</div> <a href="#">
								<img src="https://fakeimg.pl/350x200/0064CD/000?text=55555"></a>
							</li>
						</ul>

						<div class="slider-btns" id="next">
							<span>▶</span>
						</div>
						<div class="slider-btns" id="previous">
							<span>◀</span>
						</div>

						<div id="slider-pagination-wrap">
							<ul>
							</ul>
						</div>
					</div>
				</div>
				<!--slide end-->
			</div>
			<!--part1 end-->

			<script>
				//slide-wrap
				var slideWrapper = document.getElementById('slider-wrap');
				//current slideIndexition
				var slideIndex = 0;
				//items
				var slides = document.querySelectorAll('#slider-wrap ul li');
				//number of slides
				var totalSlides = slides.length;
				//get the slide width
				var sliderWidth = slideWrapper.clientWidth;
				//set width of items
				slides.forEach(function(element) {
					element.style.width = sliderWidth + 'px';
				})
				//set width to be 'x' times the number of slides
				var slider = document.querySelector('#slider-wrap ul#slider');
				slider.style.width = sliderWidth * totalSlides + 'px';

				// next, prev
				var nextBtn = document.getElementById('next');
				var prevBtn = document.getElementById('previous');
				nextBtn.addEventListener('click', function() {
					plusSlides(1);
				});
				prevBtn.addEventListener('click', function() {
					plusSlides(-1);
				});

				// hover
				slideWrapper.addEventListener('mouseover', function() {
					this.classList.add('active');
					clearInterval(autoSlider);
				});
				slideWrapper.addEventListener('mouseleave', function() {
					this.classList.remove('active');
					autoSlider = setInterval(function() {
						plusSlides(1);
					}, 1500); //슬라이드 넘어가는 시간
				});

				function plusSlides(n) {
					showSlides(slideIndex += n);
				}

				function currentSlides(n) {
					showSlides(slideIndex = n);
				}

				function showSlides(n) {
					slideIndex = n;
					if (slideIndex == -1) {
						slideIndex = totalSlides - 1;
					} else if (slideIndex === totalSlides) {
						slideIndex = 0;
					}

					slider.style.left = -(sliderWidth * slideIndex) + 'px';
					pagination();
				}

				//pagination
				slides.forEach(function() {
					var li = document.createElement('li');
					document.querySelector('#slider-pagination-wrap ul')
							.appendChild(li);
				})

				function pagination() {
					var dots = document
							.querySelectorAll('#slider-pagination-wrap ul li');
					dots.forEach(function(element) {
						element.classList.remove('active');
					});
					dots[slideIndex].classList.add('active');
				}

				pagination();
				var autoSlider = setInterval(function() {
					plusSlides(1);
				}, 3000);
			</script> <!-- 슬라이드 스크립트 끝 -->

			<!--part2 end 마스터 피스 부분-->

		
			<!--part3 end 마스터 피스 부분-->
		</div>
		<!--content end-->
	</section>


<!-- 새미언니 버튼 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★ -->
<%-- 	<input type="button" value="바로 구매하기"

	 
			style="background-color: rgb(224, 224, 224); margin-top: 10px;"
			onclick="location.href='<%=request.getContextPath()%>/views/mypage_artist/art-registration.jsp'"> 

	<input type="button" value="sammy"
			style="background-color: rgb(224, 224, 224); margin-top: 10px;"
			onclick="location.href='<%=request.getContextPath()%>/views/mypage_artist/art-apply.jsp'">
			
				<input type="button" value="sammy2"
			style="background-color: rgb(224, 224, 224); margin-top: 10px;"
			onclick="location.href='<%=request.getContextPath()%>/list.ar'"> --%>

	<%@include file="views/main/main.jsp" %>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	<%@include file="views/common/footer.jsp" %>
</body>
</html>