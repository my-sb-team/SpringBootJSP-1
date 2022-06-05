<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<c:forEach var="item" items="${items}">
			<li>${item.name} (${item.price}) :: [<a
				href="/cart/add/${item.id}">Add To Cart</a>]
			</li>
		</c:forEach>
	</ul>

</body>
</html>