<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	margin: 5em;
	padding: 50px 50px;
}

h1 {
	color: white;
}

.card {
	width: 400px;
	hight: 500px;
	padding: 15px 25px;
	background-color: navy;
	border-radius: 10px;
	background-color: navy;
}

.link {
	text-decoration: none;
	color: white;
	font-size: 20px;
}
</style>
</head>
<body>

	<div class="card">
		<h1>Hello Listener</h1>
		<a href="create" class="link">add attribute with listener</a><br /> <a
			href="remove" class="link">remove attribute with listener</a>
	</div>
<br />
	<div class="card">
		<h1>Hello Filter</h1>
		<a href="admin/admin" class="link">Admin</a><br />
		 <a href="admin/user"
			class="link">User</a>
	</div>
</body>
</html>







