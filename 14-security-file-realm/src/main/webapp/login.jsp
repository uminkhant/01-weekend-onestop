<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
<title>login form</title>
</head>
<body>
	<!-- <div class="container mt-4">
		<form action="j_security_check" type="post">
			<div class="form-group">
				<label for="user" class="form-label">LoginId </label>
				<input id="user" type="text" class="form-control"  name="j_username"/>
			</div>
			<div class="form-group">
				<label for="pass" class="form-label">Password</label>
				<input id="pass" type="text" class="form-control" name="j_password" />
			</div>
			
			<button type="submit" class="btn btn-outline-primary mt-2">Login</button>
		</form>
	</div> -->
	
	<c:url value="/login" var="login"></c:url>
	<div class="container mt-4">
		<form action="${login }" method="post">
			<div class="form-group">
				<label for="user" class="form-label">LoginId </label>
				<input id="user" type="text" class="form-control"  name="loginId"/>
			</div>
			<div class="form-group">
				<label for="pass" class="form-label">Password</label>
				<input id="pass" type="text" class="form-control" name="password" />
			</div>
			
			<button type="submit" class="btn btn-outline-primary mt-2">Login</button>
		</form>
	</div>
</body>
</html>