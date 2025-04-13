<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register | Swabhav Bank</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .register-container {
            max-width: 500px;
            margin: 5rem auto;
            padding: 2rem;
            background: white;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        .bank-logo {
            text-align: center;
            margin-bottom: 2rem;
        }
        .bank-logo i {
            font-size: 3rem;
            color: #2c3e50;
        }
        .form-control:focus {
            border-color: #3498db;
            box-shadow: 0 0 0 0.25rem rgba(52, 152, 219, 0.25);
        }
        .btn-register {
            background-color: #2c3e50;
            border: none;
            padding: 10px;
        }
        .btn-register:hover {
            background-color: #3498db;
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="#">
                <i class="fas fa-university me-2"></i>Swabhav Bank
            </a>
        </div>
    </nav>

    <div class="container">
        <div class="register-container">
            <div class="bank-logo">
                <i class="fas fa-university"></i>
                <h2 class="mt-3">Create Your Account</h2>
            </div>

            <% String error = (String) request.getAttribute("error"); %>
            <% if (error != null) { %>
                <div class="alert alert-danger alert-dismissible fade show" role="alert">
                    <%= error %>
                    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                </div>
            <% } %>

            <form action="RegisterController" method="post">
                <div class="mb-3">
                    <label for="username" class="form-label">
                        <i class="fas fa-user me-1"></i>Username
                    </label>
                    <input type="text" class="form-control" id="username" name="username" placeholder="Enter Username" required>
                </div>

                <div class="mb-3">
                    <label for="email" class="form-label">
                        <i class="fas fa-envelope me-1"></i>Email
                    </label>
                    <input type="email" class="form-control" id="email" name="email" placeholder="Enter Email" required>
                </div>

                <div class="mb-3">
                    <label for="password" class="form-label">
                        <i class="fas fa-lock me-1"></i>Password
                    </label>
                    <input type="password" class="form-control" id="password" name="password" placeholder="Enter Password" required>
                </div>

                <div class="mb-3">
                    <label for="role" class="form-label">
                        <i class="fas fa-user-tag me-1"></i>Role
                    </label>
                    <select class="form-select" id="role" name="role">
                        <option value="customer">Customer</option>
                    </select>
                </div>

                <div class="d-grid gap-2">
                    <button type="submit" class="btn btn-primary btn-register">
                        <i class="fas fa-user-plus me-1"></i>Register
                    </button>
                </div>

                <div class="text-center mt-3">
                    <a href="HomeController?page=login" class="text-decoration-none">
                        <i class="fas fa-sign-in-alt me-1"></i>Already have an account? Login
                    </a>
                </div>
            </form>
        </div>
    </div>

    <footer class="bg-dark text-white py-4 mt-5">
        <div class="container text-center">
            <p class="mb-0">© 2025 Swabhav Bank. All Rights Reserved</p>
        </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>