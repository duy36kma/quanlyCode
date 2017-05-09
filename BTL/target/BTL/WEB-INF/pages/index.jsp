<!DOCTYPE html>
<html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
<meta http-equiv="Content-Type" content="text/html;charset="UTF-8">

<title>Shop Online</title>

<link rel="stylesheet" type="text/css" href="styles.css">

</head>
<body>


	<jsp:include page="_header.jsp" />
	<jsp:include page="_menu.jsp" />

	<div class="page-title">Shopping Cart</div>

	<div class="demo-container">
		<div class="fLeft">

			<ul>
				<li><h4>Chào mừng quý khách hàng đến với Shop</h4></li>
				<li><h4>Thiên đường mua sắm Thú nhồi bông.</h4></li>
				<li><h4>Chúc quý khách mua sắm vui vẻ!!</h4></li>
			</ul>

		</div>
		<div class="fRight" style="max-width: 500px">
			<img class="mySlides" src="http://media.bizwebmedia.net/sites/34951/Upload/Gallery/3005348slide_1.jpg" 
				alt="d" style="width: 450px; height: 400px">
				<img alt="b" class="mySlides"
				src="/img/20-11.jpg" style="width: 450px; height: 400px" /> 
			<img class="mySlides" alt="a" src="/img/qua.jpg"
				style="width: 450px; height: 400px" /> 
			<img class="mySlides" src="http://media.bizwebmedia.net/sites/34951/Upload/Gallery/4510653slide2.jpg" 
				style=" height: 400px; width: 450px;">
			<img class="mySlides"
				alt="c" src="/img/banner.jpg"
				style="width: 450px; height: 400px" />
			<img class="mySlides"
				alt="c" src="/img/banner1.jpg"
				style="width: 450px; height: 400px" />
				
				
		</div>

		<script>
			var myIndex = 0;
			carousel();

			function carousel() {
				var i;
				var x = document.getElementsByClassName("mySlides");
				for (i = 0; i < x.length; i++) {
					x[i].style.display = "none";
				}
				myIndex++;
				if (myIndex > x.length) {
					myIndex = 1
				}
				x[myIndex - 1].style.display = "block";
				setTimeout(carousel, 9000);
			}
		</script>
	</div>


	<jsp:include page="_footer.jsp" />

</body>
</html>