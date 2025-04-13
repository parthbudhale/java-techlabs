<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="entity.User" %>
<%
	User user = (User) session.getAttribute("user");
	if (user == null || !user.getRole().equals("customer")) {
		response.sendRedirect("login.jsp");
		return;
	}
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Customer Dashboard</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
	<style>
		.bank-header {
			background-color: #2c3e50;
			color: white;
			padding: 15px 0;
			margin-bottom: 30px;
		}
		.bank-logo {
			font-size: 24px;
			font-weight: bold;
		}
		.bank-logo i {
			color: #3498db;
			margin-right: 10px;
		}
		.dashboard-container {
			max-width: 1200px;
			margin: 0 auto;
			padding: 20px;
		}
		.dashboard-title {
			color: #2c3e50;
			margin-bottom: 30px;
			text-align: center;
			font-weight: 600;
		}
		.card {
			border: none;
			border-radius: 10px;
			box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
			transition: transform 0.3s;
			height: 100%;
		}
		.card:hover {
			transform: translateY(-5px);
			box-shadow: 0 6px 12px rgba(0, 0, 0, 0.15);
		}
		.card-body {
			text-align: center;
			padding: 30px 20px;
		}
		.card-icon {
			font-size: 40px;
			margin-bottom: 20px;
			color: #3498db;
		}
		.card-title {
			font-weight: 600;
			margin-bottom: 15px;
		}
		.btn-primary {
			background-color: #3498db;
			border-color: #3498db;
		}
		.footer {
			background-color: #2c3e50;
			color: white;
			padding: 20px 0;
			margin-top: 50px;
		}
	</style>
</head>
<body>
	<header class="bank-header">
		<div class="container">
			<div class="d-flex justify-content-between align-items-center">
				<div class="bank-logo">
					<i class="fas fa-university"></i>Swabhav Bank
				</div>
				<div>
					<span class="me-3">Welcome, <%= user.getUsername() %></span>
					<a href="LogoutController" class="btn btn-sm btn-outline-light">
						<i class="fas fa-sign-out-alt"></i> Logout
					</a>
				</div>
			</div>
		</div>
	</header>

	<div class="dashboard-container">
		<h1 class="dashboard-title"><i class="fas fa-tachometer-alt"></i> Customer Dashboard</h1>
		
		<div class="row g-4">
			<div class="col-md-6 col-lg-4">
				<div class="card">
					<div class="card-body">
						<div class="card-icon">
							<i class="fas fa-book"></i>
						</div>
						<h5 class="card-title">View Passbook</h5>
						<a href="CustomerHomeController?page=viewPassbook" class="btn btn-primary">Go</a>
					</div>
				</div>
			</div>
			<div class="col-md-6 col-lg-4">
				<div class="card">
					<div class="card-body">
						<div class="card-icon">
							<i class="fas fa-money-bill-wave"></i>
						</div>
						<h5 class="card-title">New Transaction</h5>
						<a href="CustomerHomeController?page=newTransaction" class="btn btn-primary">Go</a>
					</div>
				</div>
			</div>
			<div class="col-md-6 col-lg-4">
				<div class="card">
					<div class="card-body">
						<div class="card-icon">
							<i class="fas fa-user-edit"></i>
						</div>
						<h5 class="card-title">Edit Profile</h5>
						<a href="CustomerHomeController?page=editProfile" class="btn btn-primary">Go</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<footer class="footer text-center">
		<div class="container">
			<p class="mb-0">© 2025 Swabhav Bank. All Rights Reserved</p>
		</div>
	</footer>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>