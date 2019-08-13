<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>STOCK MANAGEMENT SYSTEM</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta Http-Equiv="Cache-Control" Content="no-cache">
<meta Http-Equiv="Pragma" Content="no-cache">
<meta Http-Equiv="Expires" Content="0">
<META HTTP-EQUIV="Cache-Control"
	CONTENT="No-Cache,Must-Revalidate,No-Store">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
	function myDFunction() {
		document.getElementById("myDropdown").classList.toggle("show");
	}

	// Close the dropdown if the user clicks outside of it
	window.onclick = function(event) {
		if (!event.target.matches('.dropbtn')) {
			var dropdowns = document.getElementsByClassName("dropdown-content");
			var i;
			for (i = 0; i < dropdowns.length; i++) {
				var openDropdown = dropdowns[i];
				if (openDropdown.classList.contains('show')) {
					openDropdown.classList.remove('show');
				}
			}
		}
	}
	$(document).ready(function() {
		$("#cust").click(function() {
			$("#div1").load("customers");
		});
		$("#cat").click(function() {
			$("#div1").load("admincat");
		});
		$("#prod").click(function() {
			$("#div1").load("adminproduct");
		});
		$("#addprod").click(function() {
			$("#div1").load("updateprod");
		});
		$("#addcat").click(function() {
			$("#div1").load("updatecat");
		});
		$("#supp").click(function() {
			$("#div1").load("viewsuppliers");
		});
		$("#pord").click(function() {
			$("#div1").load("pendingorders");
		});
		$("#dord").click(function() {
			$("#div1").load("dispatchedorders");
		});

	});
</script>
<style>
.dropbtn {
	background-color: black;
	color: white;
	padding: 16px;
	font-size: 16px;
	border: none;
	cursor: pointer;
}

.dropbtn:hover, .dropbtn:focus {
	background-color: #2980B9;
}

.dropdown {
	position: relative;
	display: inline-block;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f1f1f1;
	min-width: 160px;
	overflow: auto;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown-content a {
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
}

.dropdown a:hover {
	background-color: #ddd;
}

.show {
	display: block;
}

/* Remove the navbar's default margin-bottom and rounded borders */
.navbar {
	margin-bottom: 0;
	border-radius: 0;
}

/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
.row.content {
	height: 450px
}

/* Set gray background color and 100% height */
.sidenav {
	padding-top: 20px;
	background-color: #f1f1f1;
	height: 100%;
}

/* Set black background color, white text and some padding */
footer {
	background-color: #555;
	color: white;
	padding: 15px;
}

/* On small screens, set height to 'auto' for sidenav and grid */
@media screen and (max-width: 767px) {
	.sidenav {
		height: auto;
		padding: 15px;
	}
	.row.content {
		height: auto;
	}
}
</style>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setDateHeader("Expires", 0);
		if (session.getAttribute("name") == null) {
			response.sendRedirect("login");
		}
		System.out.print(session.getAttribute("name"));
	%>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand"
					style="color: red; text-transform: uppercase;">${firstname}</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li><a id="cust">Customers</a></li>
					<li><a id="cat">Category</a></li>
					<li><a id="prod">Products</a></li>
					<li><a id="addprod">Add Products</a></li>
					<li><a id="addcat">Add Category</a></li>
					<li><a id="supp">Suppliers</a></li>
					<div class="dropdown">
						<button onclick="myDFunction()" class="dropbtn">Orders</button>
						<div id="myDropdown" class="dropdown-content">
							<a id="pord">Pending Orders</a> <a id="dord">Dispatched
								Orders</a>
						</div>
					</div>
				</ul>
				<form id="search" class="navbar-form navbar-left"
					action="searchcategory" method="post">
					<div class="form-group">
						<select name="productCategory">
							<c:forEach var="cat" items="${cat}">
								<option value="${cat.categoryId}">${cat.categoryName}
									${cat.categoryId}</option>
							</c:forEach>
						</select>
					</div>
					<button type="submit" class="btn btn-default">Search</button>
				</form>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="login"><span
							class="glyphicon glyphicon-log-in"></span> Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-fluid text-center">
		<div class="row content">

			<div class="col-sm-12 text-left">
				<div id="div1">
					<h2>Welcome Admin</h2>
					<h3>Total Profit To Company</h3>
					<h4>${profit}</h4>
				</div>

			</div>

		</div>
	</div>

	<footer class="container-fluid text-center">
		<p>&copy Valtech</p>
	</footer>

</body>
</html>
