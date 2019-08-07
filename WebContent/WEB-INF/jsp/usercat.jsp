<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Category NAME</th>
					<th>Category Manufacturing Price</th>
					<th> Total Earnings</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="cat" items="${cat}" varStatus="status">
					<tr>
						<td>${cat.categoryId}</td>
						<td>${cat.categoryName}</td>
						<td>${cat.categoryManufacturingPrice}</td>
						<td>${cat.categoryTotalEarnings}</td>
						<td><button type="button">View</button></td>
					</tr>


				</c:forEach>
		</table>
	</div>
</body>
</html>