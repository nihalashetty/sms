<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Supplier Name</th>
					<th>Supplier City</th>
					<th>Supplier Phone</th>
					<th>Supplier Email</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="supp" items="${supp}">
					<tr>
						<td>${supp.supplierId}</td>
						<td>${supp.supplierName}</td>
						<td>${supp.supplierCity}</td>
						<td>${supp.supplierPhone}</td>
						<td>${supp.supplierEmail}</td>
					</tr>
				</c:forEach>
		</table>
	</div>
</body>
</html>