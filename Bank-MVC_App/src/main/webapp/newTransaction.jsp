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
<html>
<head>
	<title>New Transaction</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
	<style>
		body {
			background-color: #f8f9fa;
		}
		.card-custom {
			max-width: 500px;
			margin: 3rem auto;
			padding: 2rem;
			background: #ffffff;
			border-radius: 10px;
			box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
		}
		.footer {
			text-align: center;
			padding: 1rem;
			margin-top: 4rem;
			background-color: #343a40;
			color: white;
		}
	</style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="#"><i class="fas fa-university me-2"></i>BankApp</a>
		<span class="text-white">
			<i class="fas fa-user me-1"></i>Welcome, <%= user.getUsername() %>
		</span>
	</div>
</nav>

<!-- Transaction Form -->
<div class="card-custom">
	<h3 class="text-center mb-4"><i class="fas fa-exchange-alt me-2"></i>New Transaction</h3>
	<form action="TransactionController" method="post">
		<div class="mb-3">
			<label for="type" class="form-label">Transaction Type</label>
			<select name="type" id="type" class="form-select" required>
				<option value="" disabled selected>Select Type</option>
				<option value="deposit">Deposit</option>
				<option value="withdraw">Withdraw</option>
				<option value="transfer">Transfer</option>
			</select>
		</div>

		<div class="mb-3">
			<label for="receiverId" class="form-label">Receiver Account Number (For Transfer Only)</label>
			<input type="number" name="receiverId" id="receiverId" class="form-control" placeholder="Receiver Account Number">
		</div>

		<div class="mb-3">
			<label for="amount" class="form-label">Amount</label>
			<input type="number" name="amount" id="amount" class="form-control" placeholder="Enter Amount" required>
		</div>

		<button type="submit" class="btn btn-primary w-100">
			<i class="fas fa-paper-plane me-1"></i>Submit
		</button>
	</form>

	<div class="text-center mt-3">
		<a href="CustomerHomeController?page=home" class="btn btn-danger">
			<i class="fas fa-arrow-left me-1"></i>Go Back
		</a>
	</div>
</div>

<!-- Footer -->
<div class="footer">
	<p class="mb-0">© 2025 BankApp | All Rights Reserved</p>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
