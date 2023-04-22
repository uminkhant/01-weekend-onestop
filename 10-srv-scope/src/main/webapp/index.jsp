<%@page import="com.jdc.mkt.Counter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scope Test</title>

<style>
body {
	padding: 0px;
	margin: 0px;
}

table {
	margin: 2em;
	padding: 2px;
}
</style>
</head>
<body>

	<h1>Scope Test</h1>

	<table>
		<tr>
			<th>Scope Type</th>
			<th>Count Value</th>
		</tr>

		<%
		Counter c1 = (Counter) request.getAttribute("counter");
		%>
		<tr>
			<td>Request Scope</td>
			<td><%=null != c1 ? c1.getCount() : "0"%></td>
		</tr>
		<%
		Counter c2 = (Counter) session.getAttribute("counter");
		%>
		<tr>
			<td>Session Scope</td>
			<td><%=null != c2 ? c2.getCount() : "0"%></td>
		</tr>
		<%
		Counter c3 = (Counter) application.getAttribute("counter");
		%>
		<tr>
			<td>Application Scope</td>
			<td><%=null != c3 ? c3.getCount() : "0"%></td>
		</tr>
		<tr>
			<td colspan="2"><a href="counter">Count Up</a></td>
		</tr>
	</table>
</body>
</html>