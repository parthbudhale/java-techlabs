<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="entity.User" %>
<%
	User user = (User) session.getAttribute("user");
	if (user == null || !user.getRole().equals("customer")) {
		response.sendRedirect("login.jsp");
		return;
	}
	String success = request.getParameter("success");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Edit Profile</title>
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
		.form-container {
			max-width: 500px;
			margin: 0 auto;
			padding: 30px;
			border-radius: 10px;
			box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
			background-color: white;
		}
		.form-title {
			color: #2c3e50;
			margin-bottom: 30px;
			text-align: center;
			font-weight: 600;
		}
		.btn-primary {
			background-color: #3498db;
			border-color: #3498db;
		}
		.btn-danger {
			background-color: #e74c3c;
			border-color: #e74c3c;
		}
		.alert-success {
			background-color: #d4edda;
			color: #155724;
			border-color: #c3e6cb;
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

	<div class="container">
		<div class="form-container">
			<h2 class="form-title"><i class="fas fa-user-edit"></i> Edit Profile</h2>

			<% if ("true".equals(success)) { %>
				<div class="alert alert-success text-center">
					<i class="fas fa-check-circle"></i> Profile updated successfully!
				</div>
			<% } %>

			<form action="EditProfileController" method="post">
				<div class="mb-3">
					<label for="email" class="form-label">Email</label>
					<input type="email" class="form-control" id="email" name="email" value="<%= user.getEmail() %>" required>
				</div>
				<div class="mb-3">
					<label for="password" class="form-label">Password</label>
					<input type="password" class="form-control" id="password" name="password" required>
				</div>
				<div class="d-grid gap-2">
					<button type="submit" class="btn btn-primary">
						<i class="fas fa-save"></i> Update
					</button>
					<a href="CustomerHomeController?page=home" class="btn btn-danger">
						<i class="fas fa-arrow-left"></i> Go Back
					</a>
				</div>
			</form>
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