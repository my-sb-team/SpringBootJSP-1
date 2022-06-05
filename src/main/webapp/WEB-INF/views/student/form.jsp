<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
	<title>Title</title>
	<!-- Required meta tags -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<!-- Bootstrap CSS -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  </head>
  <body class="mt-2 ">
	<form:form class="container form border rounded-lg border-primary p-3" action="/student/save" modelAttribute="sv">
		<h4 class="h4 text-center text-primary font-weight-bold">
			Detail of your information
		</h4>
		<div class="font-italic mt-3 text-center text-danger">
			${invalid}
		</div>
		<div class=" mt-3 text-center text-success">
			${valid}
		</div>
		<div class="form-group row m-auto">
			<form:label class="form-group col-2 font-weight-bold" path="name">Name</form:label>
			<form:input class="form-control col-9" path="name" /> <br>			
		</div>	
		<div class="row">
			<div class="col-2"></div>
			<div class="col-9 mb-2">
				<form:errors path="name" class=" badge badge-danger" />
			</div>
		</div>
		
		<div class="form-group row m-auto">
			<form:label class="form-group col-2 font-weight-bold" path="email">Email</form:label>
			<form:input class="form-control col-9" path="email" /> <br>			
		</div>
		<div class="row">
			<div class="col-2"></div>
			<div class="col-9 mb-2">
				<form:errors path="email" class="badge badge-danger" />
			</div>
		</div>
		
		<div class="form-group row m-auto">
			<form:label class="form-group col-2 font-weight-bold" path="marks">Mark</form:label>
			<form:input class="form-control col-9" path="marks" type="number"/> <br>
			
		</div>
		<div class="row">
			<div class="col-2"></div>
			<div class="col-9 mb-2">
				<form:errors path="marks" class="badge badge-danger" />
			</div>
		</div>
		
		<div class="form-group row m-auto">
			<form:label class="form-group col-2 font-weight-bold" path="gender">Gender</form:label>
			<form:radiobuttons class="ml-5 mr-2 mt-2" items="${genders}" path="gender" /> <br>
			
		</div>
		<div class="row">
			<div class="col-2"></div>
			<div class="col-9 mb-2">
				<form:errors path="gender" class="badge badge-danger" />
			</div>
		</div>
		
		<div class="form-group row m-auto">
			<form:label class="form-group col-2 font-weight-bold" path="hobbies">Hobbies</form:label>
			<form:checkboxes class="ml-5 mr-2" path="hobbies" items="${hobbies}"/> <br>
			
		</div>
		<div class="row">
			<div class="col-2"></div>
			<div class="col-9 mb-2">
				<form:errors path="hobbies" class="badge badge-danger" />
			</div>
		</div>
		
		<div class="form-group row m-auto">
			<form:label class="form-group col-2 font-weight-bold" path="faculty">Faculty</form:label>
			<form:select class="form-control col-9" path="faculty" items="${faculties}"/> <br>
			
		</div>
		<div class="row">
			<div class="col-2"></div>
			<div class="col-9 mb-2">
				<form:errors path="faculty" class="badge badge-danger" />
			</div>
		</div>
		
		<div class="text-center mt-2">
			<button class="btn btn-primary">Save</button>
		</div>
		
	</form:form>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>