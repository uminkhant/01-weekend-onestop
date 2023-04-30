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
<title>Security File realm</title>
</head>
<body>

	<c:url value="/member" var="member"></c:url>
	<c:url value="/admin" var="admin"></c:url>
	<c:url value="/logout" var="logout"></c:url>

<%-- 	<%
	request.setAttribute("loginUser", request.getUserPrincipal());
	request.setAttribute("isAdmin", request.isUserInRole("Admin"));
	%> --%>

	<div class="container mt-4">
 		<h2 class="text-success">Welcome </h2>
		<c:choose>
			<c:when test="${loginUser != null }">
				<a href="${member }" class="btn btn-primary">Member Role page</a>
				<c:if test="${isAdmin }">
					<a href="${admin }" class="btn btn-primary"> Admin Role page</a>
				</c:if>
				<a href="${logout }" class="btn btn-primary">Logout</a>
			</c:when>
			<c:otherwise>
				<a href="${member }" class="btn btn-primary">Member Role page</a>
				<a href="${admin }" class="btn btn-primary">Admin Role page</a>
			</c:otherwise>
		</c:choose>

	</div>
</body>
</html>