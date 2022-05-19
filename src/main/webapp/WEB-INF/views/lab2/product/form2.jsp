<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	<title>Lab 2  bai 4</title>
</head>
<body>
	<div class="container m-auto row">
		<div class="col-6 m-auto text-center">
			<h1>Lab 2 Bài 4</h1>
			<form action="/product/save2" method="post">
				<div class="m-auto">
					<div class="input-group flex-nowrap">
						<span class="input-group-text bg-white">Name: </span> <input
							type="text" class="form-control" name="name"> <span
							class="input-group-text bg-white">Price: </span> <input
							type="text" class="form-control" name="price">
						<button class="btn btn-primary">Save</button>
					</div>
				</div>
			</form>
			<h2>Sản phẩm mặc định</h2>
			<ul class="list-group fs-4 m-auto">
				<li class="list-group-item text-start">Name: ${product1.name }</li>
				<li class="list-group-item text-start">Price: ${product1.price }</li>
			</ul>
			<h2>Sản phẩm vừa nhập</h2>
			<ul class="list-group fs-4 m-auto">
				<li class="list-group-item text-start">Name: ${product2.name }</li>
				<li class="list-group-item text-start">Price: ${product2.price }</li>
			</ul>
			<h2>Danh Sách Sản Phẩm</h2>
			<ul class="list-group fs-4 m-auto">
				<c:forEach var="item" items="${items}">
					<li class="list-group-item text-start">Name: ${item.name}</li>
					<li class="list-group-item text-start   ">Price: ${item.price}</li>
				</c:forEach>
			</ul>
		</div>
	</div>
	<!-- Bootstrap JavaScript Libraries -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>
</body>
</html>