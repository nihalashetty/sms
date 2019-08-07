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
	<h1>Insert New Category</h1>
	<hr>
	<div class="container">
		<form id="insertcat" modelAttribute="category"
			action="updatecatprocess" method="post">
			<table>
				<tr>
					<td><label path="categoryName">Category Name </label></td>
					<td><input path="categoryName" name="categoryName"
						id="categoryName" type="text" required></td>
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
	<hr width="10px">
	<h1>Edit Existing Category</h1>
	<hr>
	<h4>Choose Category</h4>
	<div class="container">
		<form id="search" modelAttribute="category" action="searchcategory"
			method="post">
			<table>
				<tr>
					<td><label path="Category"></label></td>
					<td><select name="categoryId">
							<c:forEach var="cat" items="${cat}">
								<option value="${cat.categoryId}">${cat.categoryName}
									${cat.categoryId}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>
						<button class="btn btn-primary" id="submitBtn" type="submit">Search</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
	
</body>