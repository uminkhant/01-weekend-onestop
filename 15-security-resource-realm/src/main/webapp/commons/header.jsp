<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<title>Insert title here</title>
<style>
.nav_bg {
	background-color: #45B39D;
}

.nav_font {
	color: white;
}
</style>
</head>
<body>

	<c:url var="userTable" value="/admin/userTable" />
	<c:url var="loginForm" value="/login" />
	<c:url var="admin" value="/admin/adminpage" />
	<c:url var="member" value="/member/memberpage" />

	<nav class="navbar navbar-expand-lg nav_bg">
		<div class="container-fluid">
			<a href="" class="navbar-brand">Resource Test</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navId"
				aria-controls="navId" aria-expanded="false">
				<span class="navbar-toggler-icon nav_font"></span>
			</button>
			<div class="collapse navbar-collapse" id="navId">
				<ul class="navbar-nav">
					<li class="nav-item"><a href="${userTable }"
						class="nav-link nav_font">User Table</a></li>
					<li class="nav-item"><a href="" ${loginForm }
						class="nav-link nav_font">Login Form</a></li>
					<li class="nav-item"><a href="${admin }"
						class="nav-link nav_font">Admin</a></li>
					<li class="nav-item"><a href="${member }"
						class="nav-link nav_font">Member</a></li>
				</ul>
			</div>
		</div>
	</nav>

</body>
</html>