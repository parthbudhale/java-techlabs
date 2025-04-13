<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Swabhav Bank</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <style>
        .hero-section {
            background: linear-gradient(135deg, #2c3e50 0%, #3498db 100%);
            color: white;
            padding: 5rem 0;
            margin-bottom: 3rem;
        }
        .feature-card {
            transition: transform 0.3s;
            border: none;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            height: 100%;
        }
        .feature-card:hover {
            transform: translateY(-5px);
        }
        .feature-icon {
            font-size: 2.5rem;
            margin-bottom: 1rem;
            color: #3498db;
        }
        .navbar-brand {
            font-weight: 700;
        }
        .nav-link {
            font-weight: 500;
        }
    </style>
</head>
<body>
    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="#">
                <i class="fas fa-university me-2"></i>Swabhav Bank
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link active" href="HomeController?page=home">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="HomeController?page=login">Login</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">About</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Hero Section -->
    <section class="hero-section text-center">
        <div class="container">
            <h1 class="display-4 fw-bold mb-4">Welcome to Swabhav Bank</h1>
            <p class="lead">Your trusted partner in financial services</p>
        </div>
    </section>

    <!-- Features Section -->
    <div class="container mb-5">
        <div class="row g-4">
            <div class="col-md-4">
                <div class="feature-card card p-4 text-center">
                    <div class="feature-icon">
                        <i class="fas fa-user-plus"></i>
                    </div>
                    <h3>Register</h3>
                    <p>Create your banking account easily with our simple registration process.</p>
                    <a href="HomeController?page=register" class="btn btn-primary">Register</a>
                </div>
            </div>
            <div class="col-md-4">
                <div class="feature-card card p-4 text-center">
                    <div class="feature-icon">
                        <i class="fas fa-sign-in-alt"></i>
                    </div>
                    <h3>Login</h3>
                    <p>Access your account anytime, anywhere with our secure login.</p>
                    <a href="HomeController?page=login" class="btn btn-primary">Login</a>
                </div>
            </div>
            <div class="col-md-4">
                <div class="feature-card card p-4 text-center">
                    <div class="feature-icon">
                        <i class="fas fa-hand-holding-usd"></i>
                    </div>
                    <h3>Our Services</h3>
                    <p>Explore our wide range of online banking features and services.</p>
                    <a href="#" class="btn btn-primary">Learn More</a>
                </div>
            </div>
        </div>
    </div>

    <!-- Footer -->
    <footer class="bg-dark text-white py-4">
        <div class="container text-center">
            <p class="mb-0">© 2025 Swabhav Bank. All Rights Reserved</p>
        </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>