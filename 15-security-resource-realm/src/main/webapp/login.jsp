<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="commons/header.jsp" />

	<c:url var="loginform" value="/loginForm"></c:url>
	<c:url var="logout" value="/logout"></c:url>

	<div class="container">
		<h3 class="text-success">Login Form</h3>
		<form action="${loginform }" method="post">
			<div class="form-group mb-3">
				<label for="loginId" class="form-label">Login Id :</label> <input
					type="text" class="form-control" id="loginId" name="loginId" />
			</div>
			<div class="form-group mb-3">
				<label for="pass" class="form-label">Password :</label> <input
					type="text" class="form-control" id="pass" name="password" />
			</div>
			<div class="form-group mb-3">
				<button type="submit" class="btn btn-outline-primary mr-2">login</button>
				<c:if test="${loginUser != null }">
					<a href="${logout }" class="btn btn-outline-primary">Logout</a>
				</c:if>
			</div>
		</form>
	</div>
</body>
</html>