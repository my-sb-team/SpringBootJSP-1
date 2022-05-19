<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/product/save" method="post">
        <label>name</label><input name="name">
        <label>price</label><input name="price">
        <button>Save</button>
    </form>
    <ul>
        <li>${name}</li>
        <li>${price}</li>
    </ul>
</body>
</html>