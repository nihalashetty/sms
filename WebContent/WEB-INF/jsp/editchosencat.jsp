<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

</head>
<body>
	<div class="container">
		<c:forEach var="cat" items="${cat}">

			<form action="editcategorys" method="post">
				Category Id :<input type="text" name="categoryId" value="${cat.categoryId}" readonly><br>
				Category Name :<input type="text" name="categoryName" value="${cat.categoryName}"><br>
				Category Manufacturing Price :<input type="text" name="categoryManufacturingPrice" value="${categoryManufacturingPrice}"><br> 
				<input type="submit" value="Submit form">
			</form>
		</c:forEach>

	</div>
</body>
</html>