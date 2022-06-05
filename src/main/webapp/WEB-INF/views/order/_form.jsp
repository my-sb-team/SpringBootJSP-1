<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form action="/order/index" modelAttribute="item">
	<form:input path="id" placeholder="Order Id?"/>
	<form:input path="acount.username" placeholder="Order Name?"/>
	<form:input path="address" placeholder="Order Id?"/>
	<form:input path="createDate" placeholder="Order Id?"/>
	<hr>
	<button formaction="/order/create">Create</button>
	<button formaction="/order/update">Update</button>
	<a href="/order/delete/${item.id}">Delete</a>
	<a href="/order/index">Reset</a>
</form:form>