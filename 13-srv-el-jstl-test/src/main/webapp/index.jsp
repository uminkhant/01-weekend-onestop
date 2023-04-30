<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container mt-4">
		<h1 class="text-primary">Hello JSTL</h1>
		<ul>
			<li><a href="expression">Go Expression Test</a></li>
			<li><a href="jstlCoreTest">Go JSTL  Core Test</a></li>
			<li><a href="jstlFormatTest">Go JSTL  Format Test</a></li>
		</ul>
	</div>

	<c:if test="${ param.message ne null}">
		<p class=" text-primary mx-4"><c:out value="${param.message }"></c:out></p>	
	</c:if>
</body>
</html>