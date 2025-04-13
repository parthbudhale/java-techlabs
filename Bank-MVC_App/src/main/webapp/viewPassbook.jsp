<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Passbook | Swabhav Bank</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .passbook-container {
            max-width: 1000px;
            margin: 2rem auto;
            padding: 2rem;
            background: white;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        .balance-card {
            background: linear-gradient(135deg, #2c3e50 0%, #3498db 100%);
            color: white;
            border-radius: 10px;
            padding: 1.5rem;
            margin-bottom: 2rem;
            text-align: center;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        .balance-amount {
            font-size: 2.5rem;
            font-weight: bold;
            margin: 0.5rem 0;
        }
        .filter-container {
            background-color: #f8f9fa;
            padding: 1.5rem;
            border-radius: 8px;
            margin-bottom: 2rem;
        }
        .transaction-table {
            margin-top: 2rem;
        }
        .transaction-table th {
            background-color: #2c3e50;
            color: white;
        }
        .deposit-row {
            background-color: rgba(40, 167, 69, 0.1);
        }
        .withdraw-row {
            background-color: rgba(220, 53, 69, 0.1);
        }
        .transfer-row {
            background-color: rgba(23, 162, 184, 0.1);
        }
        .nav-sidebar {
            background-color: #2c3e50;
            min-height: calc(100vh - 56px);
        }
        .nav-sidebar .nav-link {
            color: rgba(255, 255, 255, 0.8);
            border-radius: 0.25rem;
            margin-bottom: 0.5rem;
        }
        .nav-sidebar .nav-link:hover, .nav-sidebar .nav-link.active {
            background-color: rgba(255, 255, 255, 0.1);
            color: white;
        }
        .nav-sidebar .nav-link i {
            margin-right: 0.5rem;
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
            <div class="col-md-3 col-lg-2 d-md-block nav-sidebar p-0">
                <div class="p-3">
                    <h5 class="text-white mb-4">Customer Menu</h5>
                    <ul class="nav flex-column">
                        <li class="nav-item">
                            <a class="nav-link text-white" href="CustomerHomeController?page=home">
                                <i class="fas fa-home me-1"></i>Dashboard
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active text-white" href="CustomerHomeController?page=viewPassbook">
                                <i class="fas fa-book me-1"></i>Passbook
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white" href="CustomerHomeController?page=newTransaction">
                                <i class="fas fa-exchange-alt me-1"></i>New Transaction
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white" href="CustomerHomeController?page=editProfile">
                                <i class="fas fa-user-edit me-1"></i>Edit Profile
                            </a>
                        </li>
                    </ul>
                </div>
            </div>

            <!-- Main Content -->
            <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4 py-4">
                <div class="passbook-container">
                    <h2 class="mb-4">
                        <i class="fas fa-book me-2"></i>Account Passbook
                    </h2>

                    <c:if test="${not empty message}">
                        <div class="alert alert-danger alert-dismissible fade show" role="alert">
                            ${message}
                            <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                        </div>
                    </c:if>

                    <c:if test="${empty message}">
                        <!-- Balance Card -->
                        <div class="balance-card">
                            <h4 class="mb-3">
                                <i class="fas fa-wallet me-2"></i>Current Balance
                            </h4>
                            <div class="balance-amount">₹ ${balance}</div>
                        </div>

                        <!-- Filter Section -->
                        <div class="filter-container">
                            <h5 class="mb-3">
                                <i class="fas fa-filter me-2"></i>Filter Transactions
                            </h5>
                            <form method="get" action="ViewPassbookController" class="row g-3">
                                <input type="hidden" name="page" value="viewPassbook">
                                <div class="col-md-6">
                                    <select name="filter" class="form-select">
                                        <option value="">All Transactions</option>
                                        <option value="deposit" ${filter == 'deposit' ? 'selected' : ''}>Deposit</option>
                                        <option value="withdraw" ${filter == 'withdraw' ? 'selected' : ''}>Withdraw</option>
                                        <option value="transfer" ${filter == 'transfer' ? 'selected' : ''}>Transfer</option>
                                    </select>
                                </div>
                                <div class="col-md-6">
                                    <button type="submit" class="btn btn-primary w-100">
                                        <i class="fas fa-filter me-1"></i>Apply Filter
                                    </button>
                                </div>
                            </form>
                        </div>

                        <!-- Transactions Table -->
                        <div class="table-responsive transaction-table">
                            <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <th><i class="fas fa-id-card me-1"></i>Transaction ID</th>
                                        <th><i class="fas fa-exchange-alt me-1"></i>Type</th>
                                        <th><i class="fas fa-money-bill-wave me-1"></i>Amount</th>
                                        <th><i class="fas fa-calendar-day me-1"></i>Date</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="transaction" items="${transactions}">
                                        <tr class="${transaction.type == 'deposit' ? 'deposit-row' : 
                                                      transaction.type == 'withdraw' ? 'withdraw-row' : 
                                                      'transfer-row'}">
                                            <td>${transaction.transactionId}</td>
                                            <td>
                                                <c:choose>
                                                    <c:when test="${transaction.type == 'deposit'}">
                                                        <span class="badge bg-success">
                                                            <i class="fas fa-arrow-down me-1"></i>Deposit
                                                        </span>
                                                    </c:when>
                                                    <c:when test="${transaction.type == 'withdraw'}">
                                                        <span class="badge bg-danger">
                                                            <i class="fas fa-arrow-up me-1"></i>Withdraw
                                                        </span>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <span class="badge bg-info">
                                                            <i class="fas fa-exchange-alt me-1"></i>Transfer
                                                        </span>
                                                    </c:otherwise>
                                                </c:choose>
                                            </td>
                                            <td>₹ ${transaction.amount}</td>
                                            <td>${transaction.transactionDate}</td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </c:if>

                    <div class="text-center mt-4">
                        <a href="CustomerHomeController?page=home" class="btn btn-secondary">
                            <i class="fas fa-arrow-left me-1"></i>Back to Dashboard
                        </a>
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