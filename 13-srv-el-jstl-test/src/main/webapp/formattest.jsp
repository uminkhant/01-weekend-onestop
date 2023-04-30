<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
<title>Format</title>
</head>
<body>
	<div class="container mt-4">
		<h1 class="text-primary">JSTL Format</h1>

		<c:if test="${requestScope.number ne null }">
			Number : <f:formatNumber value="${requestScope.number }"  type="currency" currencySymbol="Ks"/>
		</c:if>
		<c:if test="${requestScope.date ne null }">
			Date  : <f:formatDate value="${requestScope.date }" dateStyle="full"  />
		</c:if>
		
		<c:if test="${requestScope.date ne null }">
			Time  : <f:parseDate value="${requestScope.date }"  timeStyle="time"  />
		</c:if>
	</div>
</body>
</html>