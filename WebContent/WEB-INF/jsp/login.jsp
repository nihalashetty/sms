
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
<title>Login</title>
<script>
//swindow.history.forward()
</script>
</head>
<body>
<%
	response.setHeader("Cache-Control","no-store,must-revalidate");
	response.setHeader("Pragma","no-cache");
	response.setHeader("Expires","0");
	
%>
	<container>
	<div class="jumbotron text-center">
		<form id="loginForm" modelAttribute="login" action="loginProcess"
			method="post">
			<table>
				<tr>
					<td><label path="username">Username: </label></td>
					<td><input path="username" name="username" id="username"
						type="text" required></td>
				</tr>
				<tr>
					<td><label path="password">Password:</label></td>
					<td><input type="password" path="password" name="password"
						id="password" type="text" required></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>
						<button class="btn btn-primary" id="submitBtn" type="submit">Login</button>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><a href="home.jsp">Home</a></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>
						<a style="font-style: italic; color: red;">${message}</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
	</container>
</body>
</html>