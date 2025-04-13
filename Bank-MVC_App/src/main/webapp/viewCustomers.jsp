<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="entity.User" %>
<%
	User user = (User) session.getAttribute("user");
	if (user == null || !user.getRole().equals("admin")) {
		response.sendRedirect("login.jsp");
		return;
	}
%>
<!DOCTYPE html>
<html>
<head>
	<title>Admin | Customers</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
	<style>
		body {
			background-color: #f8f9fa;
		}
		.container-custom {
			max-width: 1100px;
			margin: 2rem auto;
			padding: 2rem;
			background: white;
			border-radius: 10px;
			box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
		}
		.table thead {
			background-color: #343a40;
			color: white;
		}
		.footer {
			background-color: #343a40;
			color: white;
			padding: 1rem;
			margin-top: 3rem;
			text-align: center;
		}
		.no-account {
			color: #dc3545;
			font-weight: bold;
		}
	</style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="#"><i class="fas fa-user-shield me-2"></i>Admin Panel</a>
		<span class="text-white">
			<i class="fas fa-user-circle me-1"></i>Welcome, <%= user.getUsername() %>
		</span>
	</div>
</nav>

<!-- Main Container -->
<div class="container-custom">
	<h2 class="text-center mb-4"><i class="fas fa-users me-2"></i>Customer List</h2>

	<!-- Search and Sort Form -->
	<form action="ViewCustomersController" method="GET" class="row g-3 mb-4">
		<div class="col-md-6">
			<input type="text" name="search" value="${search}" class="form-control" placeholder="Search by Username">
		</div>
		<div class="col-md-3">
			<select name="sort" class="form-select">
				<option value="">Sort By</option>
				<option value="username" ${sort == "username" ? "selected" : ""}>Username</option>
			</select>
		</div>
		<div class="col-md-3">
			<button type="submit" class="btn btn-primary w-100">
				<i class="fas fa-filter me-1"></i>Apply
			</button>
		</div>
	</form>

	<!-- Customer Table -->
	<div class="table-responsive">
		<table class="table table-hover align-middle">
			<thead>
			<tr>
				<th>User ID</th>
				<th>Username</th>
				<th>Email</th>
				<th>Bank Accounts</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var="customer" items="${customers}">
				<tr>
					<td>${customer.userId}</td>
					<td>${customer.username}</td>
					<td>${customer.email}</td>
					<td>
						<c:choose>
							<c:when test="${not empty customerAccounts[customer.userId]}">
								<c:forEach var="account" items="${customerAccounts[customer.userId]}">
									<div class="mb-1">
										<i class="fas fa-university me-1 text-secondary"></i>
										Account No: <strong>${account.accountNo}</strong>, Balance: ₹${account.balance}
									</div>
								</c:forEach>
							</c:when>
							<c:otherwise>
								<span class="no-account"><i class="fas fa-exclamation-circle me-1"></i>No Account Available</span>
							</c:otherwise>
						</c:choose>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>

	<div class="text-center mt-4">
		<a href="AdminHomeController?page=home" class="btn btn-secondary">
			<i class="fas fa-arrow-left me-1"></i>Back to Dashboard
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
