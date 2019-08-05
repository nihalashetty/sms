<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<table>
		<tr>
			<td>Welcome user ${firstname}</td>
		</tr>
		<tr>
			<td><a href="home.jsp">Home</a></td>
		</tr>
	</table>
	
	<table border="1">
		<th>count</th>
		<th>Name</th>
		<th>Manufacturing Cost</th>
		<th>selling price</th>

		<c:forEach var="cat" items="${cat}" varStatus="status">
			<tr>
				<td>${status.index + 1}</td>
				<td>${cat.categoryName}</td>
				<td>${cat.categoryManufacturingPrice}</td>
				<td>${cat.categoryTotalEarnings}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>