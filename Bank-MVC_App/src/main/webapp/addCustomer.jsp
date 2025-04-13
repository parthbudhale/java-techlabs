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
    <title>Add Customer | Swabhav Bank</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .form-container {
            max-width: 600px;
            margin: 2rem auto;
            padding: 2rem;
            background: white;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        .form-title {
            color: #2c3e50;
            border-bottom: 2px solid #3498db;
            padding-bottom: 0.5rem;
            margin-bottom: 1.5rem;
        }
        .form-control:focus {
            border-color: #3498db;
            box-shadow: 0 0 0 0.25rem rgba(52, 152, 219, 0.25);
        }
        .btn-submit {
            background-color: #2c3e50;
            border: none;
        }
        .btn-submit:hover {
            background-color: #3498db;
        }
    </style>
</head>
<body>
    <!-- Top Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">
                <i class="fas fa-university me-2"></i>Swabhav Bank
            </a>
            <div class="d-flex align-items-center">
                <span class="text-white me-3">
                    <i class="fas fa-user-circle me-1"></i>Welcome, <%= user.getUsername() %>
                </span>
                <a href="LogoutController" class="btn btn-outline-light btn-sm">
                    <i class="fas fa-sign-out-alt me-1"></i>Logout
                </a>
            </div>
        </div>
    </nav>

    <!-- Sidebar and Main Content -->
    <div class="container-fluid">
        <div class="row">
            <!-- Sidebar -->
            <div class="col-md-3 col-lg-2 d-md-block sidebar p-0" style="background-color: #2c3e50;">
                <div class="p-3">
                    <h5 class="text-white mb-4">Admin Menu</h5>
                    <ul class="nav flex-column">
                        <li class="nav-item">
                            <a class="nav-link text-white" href="AdminHomeController?page=home">
                                <i class="fas fa-tachometer-alt me-1"></i>Dashboard
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active text-white" href="AdminHomeController?page=addCustomer">
                                <i class="fas fa-user-plus me-1"></i>Add Customer
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white" href="AdminHomeController?page=addAccount">
                                <i class="fas fa-piggy-bank me-1"></i>Add Account
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white" href="AdminHomeController?page=viewCustomers">
                                <i class="fas fa-users me-1"></i>View Customers
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white" href="AdminHomeController?page=viewTransactions">
                                <i class="fas fa-exchange-alt me-1"></i>View Transactions
                            </a>
                        </li>
                    </ul>
                </div>
            </div>

            <!-- Main Content -->
            <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4 py-4">
                <div class="form-container">
                    <h3 class="form-title">
                        <i class="fas fa-user-plus me-2"></i>Add New Customer
                    </h3>

                    <c:if test="${not empty error}">
                        <div class="alert alert-danger alert-dismissible fade show" role="alert">
                            ${error}
                            <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                        </div>
                    </c:if>
                    <c:if test="${not empty success}">
                        <div class="alert alert-success alert-dismissible fade show" role="alert">
                            ${success}
                            <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                        </div>
                    </c:if>

                    <form action="AddCustomerController" method="post">
                        <div class="mb-3">
                            <label for="username" class="form-label">
                                <i class="fas fa-user me-1"></i>Username
                            </label>
                            <input type="text" class="form-control" id="username" name="username" required>
                        </div>

                        <div class="mb-3">
                            <label for="email" class="form-label">
                                <i class="fas fa-envelope me-1"></i>Email
                            </label>
                            <input type="email" class="form-control" id="email" name="email" required>
                        </div>

                        <div class="mb-3">
                            <label for="password" class="form-label">
                                <i class="fas fa-lock me-1"></i>Password
                            </label>
                            <input type="password" class="form-control" id="password" name="password" required>
                        </div>

                        <div class="d-grid gap-2 d-md-flex justify-content-md-end">
                            <a href="AdminHomeController?page=home" class="btn btn-danger me-md-2">
                                <i class="fas fa-arrow-left me-1"></i>Go Back
                            </a>
                            <button type="submit" class="btn btn-primary btn-submit">
                                <i class="fas fa-user-plus me-1"></i>Add Customer
                            </button>
                        </div>
                    </form>
                </div>
            </main>
        </div>
    </div>

    <footer class="bg-dark text-white py-3">
        <div class="container-fluid text-center">
            <p class="mb-0">© 2025 Swabhav Bank. All Rights Reserved</p>
        </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>