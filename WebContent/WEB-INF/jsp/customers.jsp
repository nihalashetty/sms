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
					<th>User Name</th>
					<th>User Email</th>
					<th>User Address</th>
					<th>User Phone</th>
					<th>User Bank</th>
					<th>User Account Number</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="cust" items="${cust}">
					<tr>
						<td>${cust.userid}</td>
						<td>${cust.username}</td>
						<td>${cust.email}</td>
						<td>${cust.address}</td>
						<td>${cust.phone}</td>
						<td>${cust.bankname}</td>
						<td>${cust.accountnumber}</td>
					</tr>
				</c:forEach>
		</table>
	</div>
</body>
</html>