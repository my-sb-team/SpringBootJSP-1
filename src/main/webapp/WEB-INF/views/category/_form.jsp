<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/category/index" modelAttribute="item">
		<form:input path="id" placeholder="Category Id?"/>
		<form:input path="name" placeholder="Category Name?"/>
		<hr>
		<button formaction="/category/create">Create</button>
		<button formaction="/category/update">Update</button>
		<a href="/category/delete/${item.id}">Delete</a>
		<a href="/category/index">Reset</a>
	</form:form>
</body>
</html>