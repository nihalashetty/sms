<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>Insert Category</title>
<script>
	function myFunction() {
		alert("Successfully Inserted");
	}
</script>


</head>
<body>
	<div class="container">
		<form id="insertcat" modelAttribute="category"
			action="updatecatprocess" method="post">
			<table>
				<tr>
					<td><label path="productName">Product Name </label></td>
					<td><input path="productName" name="productName"
						id="productName" type="text" required></td>
				</tr>
				<tr>
					<select name="categoryId">
						<c:forEach var="cat" items="${cat}">
							<option value=${cat.categoryId}>${cat.categoryName}</option>
						</c:forEach>
					</select>
				</tr>
				<tr>
					<td><label path="productQuantity">Product Quantity</label></td>
					<td><input path="productQuantity" name="productQuantity"
						id="productQuantity" type="number" required></td>
				</tr>
				<tr>
					<td><label path="productCostPrice">Product Cost Price</label></td>
					<td><input path="productCostPrice" name="productCostPrice"
						id="productCostPrice" type="number" required></td>
				</tr>
				<tr>
					<td><label path="productSellingPrice">Product Selling Price</label></td>
					<td><input path="productSellingPrice" name="productSellingPrice"
						id="productSellingPrice" type="number" required></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>
						<button onclick="myFunction()" class="btn btn-primary"
							id="submitBtn" type="submit">Add Category</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>