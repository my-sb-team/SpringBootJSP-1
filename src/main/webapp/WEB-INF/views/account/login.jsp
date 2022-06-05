<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body class="col-3 m-auto text-center">
	<h2>LOGIN</h2>
	<h3>${message}</h3>
    <form action="/account/login" method="post">
        <div class="form-group">
			<label for="exampleInputEmail1">Username</label>
			<input type="text" name="txtUsername" 
				value="${cookie.username.value}" class="form-control">
        </div>
        <div class="form-group">
			<label for="exampleInputPassword1">Password</label>			
			<input type="password" name="txtPassword"
				value="${cookie.password.value}" class="form-control">
        </div>
        <div class="form-group form-check">
			<input type="checkbox" name="remember" class="form-check-input">
			<label class="form-check-label" for="exampleCheck1">Remember me?</label>
        </div>
        <button class="btn btn-primary">Login</button>
    </form>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

</body>
</html>