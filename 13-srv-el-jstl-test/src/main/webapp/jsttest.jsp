<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<h1 class="text-primary">JSTL Test</h1>

		<c:url var="home" value="index.jsp">
			<c:param name="message" value="From jstl"></c:param>
		</c:url>

		<c:choose>
			<c:when test="${requestScope.persons ne null }">
				<ol>
					<c:forEach items="${requestScope.persons }" var="p">
						<li>Name :${p.name }</li>
						<li>Age : ${p.age }</li>
						<br />
					</c:forEach>
				</ol>
			</c:when>

			<c:otherwise>
				<p class="text-danager">There is no person object !</p>
			</c:otherwise>
		</c:choose>
		<div class="pe-4">
			<a href="${home }">Go to home page</a>
		</div>
		
	
	</div>
</body>
</html>