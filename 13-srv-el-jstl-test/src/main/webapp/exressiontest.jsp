<%@page import="com.jdc.mkt.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container mt-4">
		<h1 class="text-primary">Expression Language Test</h1>

		<h4 class="text-primary">Person Object</h4>

		<ul>
			<li>Name :${requestScope.person.name }</li>
			<li>Age :${requestScope.person.age }</li>
		</ul>

		<h4 class="text-primary">Operators</h4>
		<ul>
			<li>5+3 result :${5+3 }</li>
			<li>5/3 result :${5 / 3 }</li>
			<li>10 % 2 result :${10 mod 2 }</li>
			<li>20 equals to 10 result :${20 ge 10  }</li>
		</ul>

		<h4 class="text-primary">List ,Map</h4>
		<ul>
			<li>List result : ${requestScope.list.get(0) }</li>
			<li>Map result :${requestScope.map['a'] }</li>
		</ul>
	</div>
</body>
</html>


