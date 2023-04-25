<%@page import="com.jdc.mkt.file_demo.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
<style>
body {
	padding: 5rem;
}

form {
	width: 400px;
}
</style>
</head>
<body>
	<form action="fileUpload" method="post" enctype="multipart/form-data">
		<fieldset>
			<legend>File Upload</legend>
			<input type="file" name="file" />
			<button type="submit">upload</button>
		</fieldset>
	</form>

	<table>
		<thead>
			<tr>
				<th>Category</th>
				<th>Item</th>
				<th>Price</th>
				<th>Qtys</th>
				<th>Total</th>
			</tr>
		</thead>
		<tbody>
			<%
			@SuppressWarnings("unchecked")
			List<Product> list = (List<Product>) request.getAttribute("products");
			if(null != list && !list.isEmpty()){
			for (Product p : list) {
			%>
			<tr>
				<td><%=p.getCategory() %></td>
				<td><%=p.getItem() %></td>
				<td><%=p.getPrice() %></td>
				<td><%=p.getQty() %></td>
				<td><%=p.getTotal() %></td>
			</tr>
			<%
			}}
			%>
		</tbody>


	</table>
</body>
</html>