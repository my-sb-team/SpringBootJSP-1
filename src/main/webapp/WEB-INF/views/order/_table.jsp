<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<table border="1" style="width:100%">
	<tr>
		<th>id</th>
		<th>username</th>
		<th>address</th>
		<th>createDate</th>		
		<th></th>
	</tr>
	<c:forEach var="item" items="${items}">
		<tr>
			<td>${item.id}</td>
			<td>${item.account.username}</td>
			<td>${item.address}</td>
			<td>${item.createDate}</td>			
			<td><a href="/order/edit/${item.id}">Edit</a></td>
		</tr>
	</c:forEach>
</table>