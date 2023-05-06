<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<jsp:include page="../commons/header.jsp" />

	<div class="container">

	<h3>User Table</h3>
		<c:choose>
			<c:when test="${null != userList }">

				<table class="table">
					<tr>
						<th class="col">No.</th>
						<th class="col">LoginId</th>
						<th class="col">Password</th>
						<th class="col">Role</th>
						<th class="col"></th>
						<th class="col"></th>
					</tr>

					<c:forEach var="u" items="${userList }"  varStatus="n" >
						<tr>
							<td class="col"> <c:out value="${n.index+1 }"></c:out> </td>
							<td class="col"> <c:out value="${u.getLoginId()}"/> </td>
							<td class="col"> <c:out value="${u.getPassword() }"/> </td>
							<td class="col"> <c:out value="${u.getRole() }"/> </td>
							<td class="col"></td>
							<td class="col"></td>
						</tr>
					</c:forEach>
				</table>
			</c:when>
			<c:otherwise>
				<p class="text-success">There is no user !</p>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>