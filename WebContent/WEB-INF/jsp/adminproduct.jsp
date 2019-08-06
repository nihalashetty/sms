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
					<th>Product Name</th>
					<th>Product Category</th>
					<th>Product Quantity</th>
					<th>Product Cost Price</th>
					<th>Product Selling Price</th>
					<th>Product Orders Made</th>
					<th>Product Earnings</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="prod" items="${prod}" varStatus="status">
					<tr>
						<td>${prod.productId}</td>
						<td>${prod.productName}</td>
						<td>${prod.productCategory}</td>
						<td>${prod.productQuantity}</td>
						<td>${prod.productCostPrice}</td>
						<td>${prod.productSellingPrice}</td>
						<td>${prod.productOrdersMade}</td>
						<td>${prod.productEarnings}</td>
						<td><button type="button">Edit</button></td>
					</tr>


				</c:forEach>
		</table>
	</div>
</body>
</html>