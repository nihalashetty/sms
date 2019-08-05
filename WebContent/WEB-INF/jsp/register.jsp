<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Registration</title>
</head>
<body>
	<container>
	<div class="jumbotron text-center">
		<form id="regForm" modelAttribute="user" action="registerProcess"
			method="post">
			<table>
				<tr>
					<td><label path="username">Username </label></td>
					<td><input path="username" name="username" id="username"
						type="text" required></td>
				</tr>
				<tr>
					<td><label path="password">Password</label></td>
					<td><input type="password" path="password" name="password"
						id="password" type="text" required></td>
				</tr>
				<tr>
					<td><label path="email">Email</label></td>
					<td><input path="email" name="email" id="email" type="text"
						required></td>
				</tr>
				<tr>
					<td><label path="address">Address</label></td>
					<td><input path="address" name="address" id="address"
						type="text" required></td>
				</tr>
				<tr>
					<td><label path="phone">Phone</label></td>
					<td><input path="phone" name="phone" id="phone" type="number"
						required></td>
				</tr>
				<tr>
					<td><label path="bankname">Bank Name </label></td>
					<td><input path="bankname" name="bankname" id="bankname"
						type="text" required></td>
				</tr>
				<tr>
					<td><label path="accountnumber">Account Number</label></td>
					<td><input path="accountnumber" name="accountnumber" id="accountnumber"
						type="number" required></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>
						<button class="btn btn-primary" id="submitBtn" type="submit">Register</button>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><a href="home.jsp">Home</a></td>
				</tr>

			</table>
		</form>
	</div>
	</coniner>
</body>
</html>