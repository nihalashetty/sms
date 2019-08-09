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
					<th>Order Id</th>
					<th>Category Id</th>
					<th>Customer Id</th>
					<th>Product Id</th>
					<th>Quantity</th>
					<th>City</th>
					<th>Delivery City</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ord" items="${ord}" varStatus="status">
					<tr>
						<td>${ord.orderId}</td>
						<td>${ord.categoryId}</td>
						<td>${ord.customerId}</td>
						<td>${ord.productId}</td>
						<td>${ord.quantity}</td>
						<td>${ord.city}</td>
						<td>${ord.deliveryStatus}</td>
					</tr>


				</c:forEach>
		</table>
	</div>
</body>
</html>