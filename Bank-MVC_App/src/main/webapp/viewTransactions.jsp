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
    <title>Admin | Transactions</title>
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
        .filter-form {
            background-color: #f8f9fa;
            padding: 1.5rem;
            border-radius: 10px;
            margin-bottom: 2rem;
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
    <h2 class="text-center mb-4"><i class="fas fa-list me-2"></i>Transaction List</h2>

    <!-- Filter Form -->
    <form action="ViewTransactionsController" method="get" class="filter-form row g-3">
        <div class="col-md-4">
            <label class="form-label">Transaction Type</label>
            <select name="type" class="form-select">
                <option value="">All</option>
                <option value="deposit">Deposit</option>
                <option value="withdraw">Withdraw</option>
                <option value="transfer">Transfer</option>
            </select>
        </div>
        <div class="col-md-4">
            <label class="form-label">Sort By</label>
            <select name="sort" class="form-select">
                <option value="transaction_date">Date</option>
                <option value="amount">Amount</option>
                <option value="type">Type</option>
            </select>
        </div>
        <div class="col-md-4">
            <label class="form-label">Order</label>
            <select name="order" class="form-select">
                <option value="asc">Ascending</option>
                <option value="desc">Descending</option>
            </select>
        </div>
        <div class="col-12 text-end">
            <button type="submit" class="btn btn-primary mt-2">
                <i class="fas fa-filter me-1"></i>Apply Filter
            </button>
        </div>
    </form>

    <!-- Transactions Table -->
    <div class="table-responsive">
        <table class="table table-hover align-middle">
            <thead>
                <tr>
                    <th>Transaction ID</th>
                    <th>Sender</th>
                    <th>Receiver</th>
                    <th>Type</th>
                    <th>Amount</th>
                    <th>Date</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="transaction" items="${transactions}">
                    <tr>
                        <td>${transaction.transactionId}</td>
                        <td>${transaction.senderId}</td>
                        <td>${transaction.receiverId}</td>
                        <td>
                            <span class="badge 
                                ${transaction.type == 'deposit' ? 'bg-success' : 
                                  transaction.type == 'withdraw' ? 'bg-danger' : 
                                  'bg-info'} text-uppercase">
                                ${transaction.type}
                            </span>
                        </td>
                        <td>₹ ${transaction.amount}</td>
                        <td>${transaction.transactionDate}</td>
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
