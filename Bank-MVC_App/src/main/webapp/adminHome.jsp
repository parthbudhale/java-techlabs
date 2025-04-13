<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="entity.User" %>
<%
    User user = (User) session.getAttribute("user");
    if (user == null || !user.getRole().equals("admin")) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard | Swabhav Bank</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .sidebar {
            background-color: #2c3e50;
            min-height: calc(100vh - 56px);
            color: white;
        }
        .sidebar .nav-link {
            color: rgba(255, 255, 255, 0.8);
            padding: 0.75rem 1rem;
            border-radius: 0.25rem;
            margin-bottom: 0.5rem;
        }
        .sidebar .nav-link:hover, .sidebar .nav-link.active {
            background-color: rgba(255, 255, 255, 0.1);
            color: white;
        }
        .sidebar .nav-link i {
            margin-right: 0.5rem;
        }
        .card-dashboard {
            border: none;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s;
        }
        .card-dashboard:hover {
            transform: translateY(-5px);
        }
        .card-icon {
            font-size: 2rem;
            margin-bottom: 1rem;
        }
        .welcome-card {
            background: linear-gradient(135deg, #2c3e50 0%, #3498db 100%);
            color: white;
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

    <div class="container-fluid">
        <div class="row">
            <!-- Sidebar -->
            <div class="col-md-3 col-lg-2 d-md-block sidebar p-0">
                <div class="p-3">
                    <h5 class="mb-4">Admin Menu</h5>
                    <ul class="nav flex-column">
                        <li class="nav-item">
                            <a class="nav-link active" href="AdminHomeController?page=home">
                                <i class="fas fa-tachometer-alt"></i>Dashboard
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="AdminHomeController?page=addCustomer">
                                <i class="fas fa-user-plus"></i>Add Customer
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="AdminHomeController?page=addAccount">
                                <i class="fas fa-piggy-bank"></i>Add Account
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="AdminHomeController?page=viewCustomers">
                                <i class="fas fa-users"></i>View Customers
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="AdminHomeController?page=viewTransactions">
                                <i class="fas fa-exchange-alt"></i>View Transactions
                            </a>
                        </li>
                    </ul>
                </div>
            </div>

            <!-- Main Content -->
            <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4 py-4">
                <div class="row mb-4">
                    <div class="col-12">
                        <div class="card welcome-card">
                            <div class="card-body">
                                <h2 class="card-title">
                                    <i class="fas fa-tachometer-alt me-2"></i>Admin Dashboard
                                </h2>
                                <p class="card-text">Manage all bank operations from this dashboard</p>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-6 col-lg-3 mb-4">
                        <div class="card card-dashboard h-100">
                            <div class="card-body text-center">
                                <div class="card-icon text-primary">
                                    <i class="fas fa-user-plus"></i>
                                </div>
                                <h5 class="card-title">Add Customer</h5>
                                <a href="AdminHomeController?page=addCustomer" class="btn btn-primary">
                                    <i class="fas fa-arrow-right me-1"></i>Go
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-3 mb-4">
                        <div class="card card-dashboard h-100">
                            <div class="card-body text-center">
                                <div class="card-icon text-primary">
                                    <i class="fas fa-piggy-bank"></i>
                                </div>
                                <h5 class="card-title">Add Account</h5>
                                <a href="AdminHomeController?page=addAccount" class="btn btn-primary">
                                    <i class="fas fa-arrow-right me-1"></i>Go
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-3 mb-4">
                        <div class="card card-dashboard h-100">
                            <div class="card-body text-center">
                                <div class="card-icon text-primary">
                                    <i class="fas fa-users"></i>
                                </div>
                                <h5 class="card-title">View Customers</h5>
                                <a href="AdminHomeController?page=viewCustomers" class="btn btn-primary">
                                    <i class="fas fa-arrow-right me-1"></i>Go
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-3 mb-4">
                        <div class="card card-dashboard h-100">
                            <div class="card-body text-center">
                                <div class="card-icon text-primary">
                                    <i class="fas fa-exchange-alt"></i>
                                </div>
                                <h5 class="card-title">View Transactions</h5>
                                <a href="AdminHomeController?page=viewTransactions" class="btn btn-primary">
                                    <i class="fas fa-arrow-right me-1"></i>Go
                                </a>
                            </div>
                        </div>
                    </div>
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