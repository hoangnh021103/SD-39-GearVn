
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.8.2/angular.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../css/Home.css">
    <link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
        integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />

</head>

<body>


    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01"
                aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
                <a class="navbar-brand" style="width: 150px;" href="#"><img
                        src="https://file.hstatic.net/200000636033/file/logo_fd11946b31524fbe98765f34f3de0628.svg"
                        alt=""></a>
                <ul class="navbar-nav">
                    <li class="nav-item" style="width:14%;">
                        <button class="btn" style="width: 100%;" data-bs-theme="dark" type="button"
                            data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown"
                            aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                            <svg style="width: 20%;" stroke="white" xmlns="http://www.w3.org/2000/svg" width="16"
                                height="16" fill="currentColor" class="bi bi-list" viewBox="0 0 16 16">
                                <path fill-rule="evenodd"
                                    d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5m0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5m0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5" />
                            </svg>
                            Danh mục
                        </button>
                    </li>
                    <li class="nav-item" style="width: 400px;">
                        <div class="input-group rounded">
                            <input type="search" style="width: 88%;" class="form-control rounded"
                                placeholder="Bạn cần tìm gì" aria-label="Search" aria-describedby="search-addon" />
                            <span style="padding: 0px;" class="input-group-text border-0" id="search-addon">
                                <button class="search-icon">
                                    <i class="fas fa-search"></i>
                                </button>
                            </span>
                        </div>
                    </li>
                    <li class="nav-item">
                        <button class="btn" data-bs-theme="dark" type="button" data-bs-toggle="collapse"
                            data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false"
                            aria-label="Toggle navigation">
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                class="bi bi-headset" viewBox="0 0 16 16">
                                <path
                                    d="M8 1a5 5 0 0 0-5 5v1h1a1 1 0 0 1 1 1v3a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V6a6 6 0 1 1 12 0v6a2.5 2.5 0 0 1-2.5 2.5H9.366a1 1 0 0 1-.866.5h-1a1 1 0 1 1 0-2h1a1 1 0 0 1 .866.5H11.5A1.5 1.5 0 0 0 13 12h-1a1 1 0 0 1-1-1V8a1 1 0 0 1 1-1h1V6a5 5 0 0 0-5-5" />
                            </svg>
                            Hotline <br> 1900.5301
                        </button>
                    </li>
                    <li class="nav-item">
                        <button class="btn" data-bs-theme="dark" type="button" data-bs-toggle="collapse"
                            data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false"
                            aria-label="Toggle navigation">
                            <svg style="width: 20%;" xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                                fill="currentColor" class="bi bi-geo-alt" viewBox="0 0 16 16">
                                <path
                                    d="M12.166 8.94c-.524 1.062-1.234 2.12-1.96 3.07A32 32 0 0 1 8 14.58a32 32 0 0 1-2.206-2.57c-.726-.95-1.436-2.008-1.96-3.07C3.304 7.867 3 6.862 3 6a5 5 0 0 1 10 0c0 .862-.305 1.867-.834 2.94M8 16s6-5.686 6-10A6 6 0 0 0 2 6c0 4.314 6 10 6 10" />
                                <path d="M8 8a2 2 0 1 1 0-4 2 2 0 0 1 0 4m0 1a3 3 0 1 0 0-6 3 3 0 0 0 0 6" />
                            </svg>
                            Hệ thống <br> showroom
                        </button>
                    </li>
                    <li class="nav-item" style="width: 11%;">
                        <button class="btn" style="width: 100%;" data-bs-theme="dark" type="button"
                            data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown"
                            aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                            <svg style="width: 20%;" xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                                fill="currentColor" class="bi bi-clipboard2" viewBox="0 0 16 16">
                                <path
                                    d="M3.5 2a.5.5 0 0 0-.5.5v12a.5.5 0 0 0 .5.5h9a.5.5 0 0 0 .5-.5v-12a.5.5 0 0 0-.5-.5H12a.5.5 0 0 1 0-1h.5A1.5 1.5 0 0 1 14 2.5v12a1.5 1.5 0 0 1-1.5 1.5h-9A1.5 1.5 0 0 1 2 14.5v-12A1.5 1.5 0 0 1 3.5 1H4a.5.5 0 0 1 0 1z" />
                                <path
                                    d="M10 .5a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 0-.5.5.5.5 0 0 1-.5.5.5.5 0 0 0-.5.5V2a.5.5 0 0 0 .5.5h5A.5.5 0 0 0 11 2v-.5a.5.5 0 0 0-.5-.5.5.5 0 0 1-.5-.5" />
                            </svg>
                            Tra cứu <br> đơn hàng
                        </button>
                    </li>
                    <li class="nav-item">
                        <button class="btn" data-bs-theme="dark" type="button" data-bs-toggle="collapse"
                            data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false"
                            aria-label="Toggle navigation">
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                class="bi bi-cart" viewBox="0 0 16 16">
                                <path
                                    d="M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .491.592l-1.5 8A.5.5 0 0 1 13 12H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5M3.102 4l1.313 7h8.17l1.313-7zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4m7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4m-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2m7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2" />
                            </svg>
                            Giỏ <br> hàng
                        </button>
                    </li>
                    <li class="nav-item">
                        <div class="dropdown">
                            <button type="button" class="btn" data-bs-theme="dark" data-bs-toggle="dropdown"
                                aria-expanded="false" data-bs-auto-close="outside">
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                    class="bi bi-person" viewBox="0 0 16 16">
                                    <path
                                        d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6m2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0m4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4m-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10s-3.516.68-4.168 1.332c-.678.678-.83 1.418-.832 1.664z" />
                                </svg>
                                Đăng <br> nhập
                            </button>
                            <form style="width: 400px;" class="dropdown-menu dropdown-menu-lg-end p-4">
                                <div class="uf-form-signin">
                                    <div class="text-center">
                                        <h1 class="text-black h3">Account Login</h1>
                                    </div>
                                    <form class="mt-4">
                                        <div class="input-group uf-input-group input-group-lg mb-3">
                                            <span class="input-group-text fa fa-user"></span>
                                            <input type="text" class="form-control"
                                                placeholder="Username or Email address">
                                        </div>
                                        <div class="input-group uf-input-group input-group-lg mb-3">
                                            <span class="input-group-text fa fa-lock"></span>
                                            <input type="password" class="form-control" placeholder="Password">
                                        </div>
                                        <div class="d-flex mb-3 justify-content-between">
                                            <div class="form-check">
                                                <input type="checkbox" class="form-check-input uf-form-check-input"
                                                    id="exampleCheck1">
                                                <label class="form-check-label text-black" for="exampleCheck1">Remember
                                                    Me</label>
                                            </div>
                                            <a class="text-black" href="#">Forgot password?</a>
                                        </div>
                                        <div class="d-grid mb-4">
                                            <button type="submit" class="btn uf-btn-primary btn-lg"
                                                style="justify-content: center; font-size: 100%; ">Login</button>
                                        </div>
                                        <div class="d-flex mb-3">
                                            <div class="dropdown-divider m-auto w-25"></div>
                                            <small class="text-nowrap text-black">Or login with</small>
                                            <div class="dropdown-divider m-auto w-25"></div>
                                        </div>
                                        <div class="uf-social-login d-flex justify-content-center">
                                            <a href="#" class="uf-social-ic" style="color: blue;"
                                                title="Login with Facebook">
                                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                                                    fill="currentColor" class="bi bi-facebook" viewBox="0 0 16 16">
                                                    <path
                                                        d="M16 8.049c0-4.446-3.582-8.05-8-8.05C3.58 0-.002 3.603-.002 8.05c0 4.017 2.926 7.347 6.75 7.951v-5.625h-2.03V8.05H6.75V6.275c0-2.017 1.195-3.131 3.022-3.131.876 0 1.791.157 1.791.157v1.98h-1.009c-.993 0-1.303.621-1.303 1.258v1.51h2.218l-.354 2.326H9.25V16c3.824-.604 6.75-3.934 6.75-7.951" />
                                                </svg>
                                            </a>
                                            <a href="#" class="uf-social-ic" style="color: aqua; padding: 0px 15px;"
                                                title="Login with Twitter"><i class="fab fa-twitter"></i></a>
                                            <a href="#" class="uf-social-ic" style="color: red;"
                                                title="Login with Google"><i class="fab fa-google"></i></a>
                                        </div>
                                        <div class="mt-4 text-center">
                                            <span class="text-black">Don't have an account?</span>
                                            <a class="text-black" href="register.html">Sign Up</a>
                                        </div>
                                    </form>
                                </div>
                            </form>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="body-content">
        <div class="border-content">
            <div class="container-fluid">
                <div class="content">
                    <ul class="menu">
                        <div class="left-content">
                            <li class="menu-con">
                                <a class="menu-title" href="">
                                    <div class="left-btn">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                                            fill="currentColor" class="bi bi-laptop" viewBox="0 0 16 16">
                                            <path
                                                d="M13.5 3a.5.5 0 0 1 .5.5V11H2V3.5a.5.5 0 0 1 .5-.5zm-11-1A1.5 1.5 0 0 0 1 3.5V12h14V3.5A1.5 1.5 0 0 0 13.5 2zM0 12.5h16a1.5 1.5 0 0 1-1.5 1.5h-13A1.5 1.5 0 0 1 0 12.5" />
                                        </svg>
                                        Labtop
                                    </div>
                                    <div class="right-btn">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                                            fill="currentColor" class="bi bi-caret-right-fill" viewBox="0 0 16 16">
                                            <path
                                                d="m12.14 8.753-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 0 1 1.659-.753l5.48 4.796a1 1 0 0 1 0 1.506z" />
                                        </svg>
                                    </div>
                                </a>
                                <div class="menu-content">
                                    <div class="card">
                                        <div class="card-body-menu">
                                            <ul class="list-card">
                                                <li class="card-title"><a href="">Thương hiệu</a></li>
                                                <li class="card-content"><a href="">ASUS</a></li>
                                                <li class="card-content"><a href="">ACER</a></li>
                                            </ul>
                                            <ul class="list-card">
                                                <li class="card-title"><a href="">Giá bán</a></li>
                                                <li class="card-content"><a href="">Dưới 15 triệu</a></li>
                                                <li class="card-content"><a href="">Từ 15 đến 20 triệu</a></li>
                                            </ul>
                                            <ul class="list-card">
                                                <li class="card-title"><a href="">CPU Intel - AMD</a></li>
                                                <li class="card-content"><a href="">Intel Core i3</a></li>
                                                <li class="card-content"><a href="">Intel Core i5</a></li>
                                            </ul>
                                            <ul class="list-card">
                                                <li class="card-title"><a href="">Nhu cầu sử dụng</a></li>
                                                <li class="card-content"><a href="">Đồ họa - Studio</a></li>
                                                <li class="card-content"><a href="">Học sinh - Sinh viên</a></li>
                                            </ul>
                                            <ul class="list-card">
                                                <li class="card-title"><a href="">Link phụ kiện Labtop</a></li>
                                                <li class="card-content"><a href="">Ram Labtop</a></li>
                                                <li class="card-content"><a href="">SSD labtop</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="menu-con">
                                <a href="">
                                    <div class="left-btn">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                                            fill="currentColor" class="bi bi-laptop" viewBox="0 0 16 16">
                                            <path
                                                d="M13.5 3a.5.5 0 0 1 .5.5V11H2V3.5a.5.5 0 0 1 .5-.5zm-11-1A1.5 1.5 0 0 0 1 3.5V12h14V3.5A1.5 1.5 0 0 0 13.5 2zM0 12.5h16a1.5 1.5 0 0 1-1.5 1.5h-13A1.5 1.5 0 0 1 0 12.5" />
                                        </svg>
                                        Laptop Gaming
                                    </div>
                                    <div class="right-btn">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                                            fill="currentColor" class="bi bi-caret-right-fill" viewBox="0 0 16 16">
                                            <path
                                                d="m12.14 8.753-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 0 1 1.659-.753l5.48 4.796a1 1 0 0 1 0 1.506z" />
                                        </svg>
                                    </div>
                                </a>
                                <div class="menu-content">
                                    <div class="card">
                                        <div class="card-body-menu">
                                            <ul class="list-card">
                                                <li class="card-title"><a href="">Thương hiệu</a></li>
                                                <li class="card-content"><a href="">ACER/PREDATOR</a></li>
                                                <li class="card-content"><a href="">MSI</a></li>
                                            </ul>
                                            <ul class="list-card">
                                                <li class="card-title"><a href="">Giá bán</a></li>
                                                <li class="card-content"><a href="">Dưới 20 triệu</a></li>
                                                <li class="card-content"><a href="">Từ 20 đến 25 triệu</a></li>
                                            </ul>
                                            <ul class="list-card">
                                                <li class="card-title"><a href="">Card đồ họa</a></li>
                                                <li class="card-content"><a href="">RTX 3050/3050Ti</a></li>
                                                <li class="card-content"><a href="">RTX 3060</a></li>
                                            </ul>
                                            <ul class="list-card">
                                                <li class="card-title"><a href="">Linh - Phụ kiện Laptop</a></li>
                                                <li class="card-content"><a href="">Ram laptop</a></li>
                                                <li class="card-content"><a href="">SSD laptop</a></li>
                                            </ul>
                                            <ul class="list-card">
                                                <li class="card-title"><a href="">Nhu cầu sử dụng</a></li>
                                                <li class="card-content"><a href="">Văn phòng - Studio</a></li>
                                                <li class="card-content"><a href="">Học sinh - Sinh viên</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="menu-con">
                                <a href="">
                                    <div class="left-btn">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                                            fill="currentColor" class="bi bi-laptop" viewBox="0 0 16 16">
                                            <path
                                                d="M13.5 3a.5.5 0 0 1 .5.5V11H2V3.5a.5.5 0 0 1 .5-.5zm-11-1A1.5 1.5 0 0 0 1 3.5V12h14V3.5A1.5 1.5 0 0 0 13.5 2zM0 12.5h16a1.5 1.5 0 0 1-1.5 1.5h-13A1.5 1.5 0 0 1 0 12.5" />
                                        </svg>
                                        Ổ cứng , Ram , Thẻ nhớ
                                    </div>
                                    <div class="right-btn">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                                            fill="currentColor" class="bi bi-caret-right-fill" viewBox="0 0 16 16">
                                            <path
                                                d="m12.14 8.753-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 0 1 1.659-.753l5.48 4.796a1 1 0 0 1 0 1.506z" />
                                        </svg>
                                    </div>
                                </a>
                                <div class="menu-content">
                                    <div class="card">
                                        <div class="card-body-menu">
                                            <ul class="list-card">
                                                <li class="card-title"><a href="">Dung lượng RAM</a></li>
                                                <li class="card-content"><a href="">8 GB</a></li>
                                                <li class="card-content"><a href="">16 GB</a></li>
                                            </ul>
                                            <ul class="list-card">
                                                <li class="card-title"><a href="">Loại RAM</a></li>
                                                <li class="card-content"><a href="">DDR4</a></li>
                                                <li class="card-content"><a href="">DDR5</a></li>
                                            </ul>
                                            <ul class="list-card">
                                                <li class="card-title"><a href="">Hãng RAM</a></li>
                                                <li class="card-content"><a href="">Corsair</a></li>
                                                <li class="card-content"><a href="">Kingston</a></li>
                                            </ul>
                                            <ul class="list-card">
                                                <li class="card-title"><a href="">Dung lượng HDD</a></li>
                                                <li class="card-content"><a href="">HDD 1 TB</a></li>
                                                <li class="card-content"><a href="">HDD 2 TB</a></li>
                                            </ul>
                                            <ul class="list-card">
                                                <li class="card-title"><a href="">Hãng HDD</a></li>
                                                <li class="card-content"><a href="">Western Digital</a></li>
                                                <li class="card-content"><a href="">Seagate</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </div>
                        <div class="right-content">
                            <div class="content">
                                <div id="customCarousel" class="custom-slider">
                                    <div class="custom-indicators">
                                        <button type="button" data-bs-target="#customCarousel" data-bs-slide-to="0"
                                            class="active" aria-current="true" aria-label="Slide 1"></button>
                                        <button type="button" data-bs-target="#customCarousel" data-bs-slide-to="1"
                                            aria-label="Slide 2"></button>
                                        <button type="button" data-bs-target="#customCarousel" data-bs-slide-to="2"
                                            aria-label="Slide 3"></button>
                                    </div>
                                    <div class="custom-inner">
                                        <div class="custom-item active">
                                            <img src="https://file.hstatic.net/200000722513/file/banner_homepage_msi_rtx_5000.jpg"
                                                class="img-fluid full-width" alt="...">
                                        </div>
                                        <div class="custom-item">
                                            <img src="https://file.hstatic.net/200000722513/file/thang_02_pc_gvn_banner_web_slider_800x400.jpg"
                                                class="img-fluid full-width" alt="...">
                                        </div>
                                        <div class="custom-item">
                                            <img src="https://file.hstatic.net/200000722513/file/thang_12_thu_cu_ve_sinh_banner_web_slider_800x400.png"
                                                class="img-fluid full-width" alt="...">
                                        </div>
                                    </div>
                                    <button class="custom-control-prev" type="button" data-bs-target="#customCarousel"
                                        data-bs-slide="prev">
                                        <span class="custom-control-prev-icon" aria-hidden="true"></span>
                                        <span class="visually-hidden">Previous</span>
                                    </button>
                                    <button class="custom-control-next" type="button" data-bs-target="#customCarousel"
                                        data-bs-slide="next">
                                        <span class="custom-control-next-icon" aria-hidden="true"></span>
                                        <span class="visually-hidden">Next</span>
                                    </button>
                                </div>
                                <div style="width: 31%; height: auto;">
                                    <a href="">
                                        <img style="width: 100%;"
                                            src="https://file.hstatic.net/200000722513/file/thang_02_layout_web_-01.png"
                                            alt="">
                                    </a>
                                    <a href="">
                                        <img style="width: 100%;"
                                            src="https://file.hstatic.net/200000722513/file/thang_02_layout_web_-02.png"
                                            alt="">
                                    </a>
                                </div>
                            </div>
                        </div>
                    </ul>
                </div>
                <div class="sp-banchay">
                    <div class="container">
                        <a href="" class="sp-title">
                            <h3>PC bán chạy</h3>
                        </a>
                        <div class="text-center my-3">
                            <div class="row mx-auto my-auto justify-content-center">
                                <div id="recipeCarousel" class="carousel slide" data-bs-ride="carousel">
                                    <div class="carousel-inner" role="listbox">
                                       
                                    </div>
                                    <a class="carousel-control-prev bg-transparent w-aut" href="#recipeCarousel"
                                        role="button" data-bs-slide="prev">
                                        <i class="fas fa-arrow-left" aria-hidden="true"></i>
                                        <span class="sr-only">Previous</span>
                                    </a>
                                    <a class="carousel-control-next bg-transparent w-aut" href="#recipeCarousel"
                                        role="button" data-bs-slide="next">
                                        <i class="fas fa-arrow-right" aria-hidden="true"></i>
                                        <span class="sr-only">Next</span>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="lab-banchay">
                    <div class="container">
                        <a href="" class="sp-title">
                            <h3>Labtop bán chạy</h3>
                        </a>
                        <div class="text-center my-3">
                            <div class="row mx-auto my-auto justify-content-center">
                                <div id="recipeCarousel1" class="carousel slide" data-bs-ride="carousel">
                                    <div class="carousel-inner" role="listbox">
                                       
                                    </div>
                                    <a class="carousel-control-prev bg-transparent w-aut" href="#recipeCarousel1"
                                        role="button" data-bs-slide="prev">
                                        <i class="fas fa-arrow-left" aria-hidden="true"></i>
                                        <span class="sr-only">Previous</span>
                                    </a>
                                    <a class="carousel-control-next bg-transparent w-aut" href="#recipeCarousel1"
                                        role="button" data-bs-slide="next">
                                        <i class="fas fa-arrow-right" aria-hidden="true"></i>
                                        <span class="sr-only">Next</span>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="sp-danhmuc">
                    <div class="container">
                        <a href="" class="sp-title">
                            <h3>Danh mục sản phẩm</h3>
                        </a>
                        <ul class="danh-muc-menu">
                            <li>
                                <a href="">
                                    <img src="https://file.hstatic.net/200000636033/file/icon1_ce115f32db874a8e9b5af39517176e96.png"
                                        alt="">
                                    <span>Laptop</span>
                                </a>
                            </li>
                            <li>
                                <a href="">
                                    <img src="https://file.hstatic.net/200000636033/file/icon3_5c59c1dc52ec4b81a94a3edba293e895.png"
                                        alt="">
                                    <span>PC Gaming</span>
                                </a>
                            </li>
                            <li>
                                <a href="">
                                    <img src="https://file.hstatic.net/200000636033/file/icon5_71200675c9e64c32a11730486ba04b32.png"
                                        alt="">
                                    <span>Chuột</span>
                                </a>
                            </li>
                            <li>
                                <a href="">
                                    <img src="https://file.hstatic.net/200000636033/file/icon6_056974287cd84e0d82eac05809b7e5d5.png"
                                        alt="">
                                    <span>Bàn phím</span>
                                </a>
                            </li>
                            <li>
                                <a href="">
                                    <img src="https://file.hstatic.net/200000722513/file/asus-rog-strix-rtx4090-o24g-gaming-03_c948a4c2a9cf4adcbd522319bfcd4846.jpg"
                                        alt="">
                                    <span>Card đồ họa</span>
                                </a>

                            </li>
                            <li>
                                <a href="">
                                    <img src="https://file.hstatic.net/200000636033/file/icon13_708c31c3ba56430dbec3f4cc7e1b14f0.png"
                                        alt="">
                                    <span>Tai nghe</span>
                                </a>
                            </li>
                            <li>
                                <a href="">
                                    <img src="https://file.hstatic.net/200000636033/file/icon11_2f0ea4c77ae3482f906591cec8f24cea.png"
                                        alt="">
                                    <span>Loa</span>
                                </a>
                            </li>
                            <li>
                                <a href="">
                                    <img src="https://file.hstatic.net/200000636033/file/icon7_cdd85eba03974cb99a3941d076bf5d1b.png"
                                        alt="">
                                    <span>Màn hình</span>
                                </a>
                            </li>
                            <li>
                                <a href="">
                                    <img src="https://file.hstatic.net/200000636033/file/icon8_8f7b3fe2e8fb450b805857be9bb14edc.png"
                                        alt="">
                                    <span>Ghế gaming</span>
                                </a>
                            </li>
                            <li>
                                <a href="">
                                    <img src="https://file.hstatic.net/200000636033/file/icon9_ffd172460eb24c4d8bab6a7cd9a8cc46.png"
                                        alt="">
                                    <span>Bộ nguồn</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>

            </div>
        </div>
    </div>
        <footer class="footer-39201">
            <div class="container">
                <div class="row">
                    <div class="col-md mb-4 mb-md-0">
                        <h3>Store</h3>
                        <ul class="list-unstyled nav-links">
                            <li><a href="#">Men</a></li>
                            <li><a href="#">Women</a></li>
                            <li><a href="#">Children</a></li>
                            <li><a href="#">New Arrivals</a></li>
                            <li><a href="#">Top Brands</a></li>
                            <li><a href="#">Special Offers</a></li>
                        </ul>
                    </div>
                    <div class="col-md mb-4 mb-md-0">
                        <h3>About</h3>
                        <ul class="list-unstyled nav-links">
                            <li><a href="#">About us</a></li>
                            <li><a href="#">Clients</a></li>
                            <li><a href="#">Services</a></li>
                            <li><a href="#">Best sellers</a></li>
                            <li><a href="#">Blog</a></li>
                            <li><a href="#">Contact</a></li>
                        </ul>
                    </div>
                    <div class="col-md mb-4 mb-md-0">
                        <h3>Legal</h3>
                        <ul class="list-unstyled nav-links">
                            <li><a href="#">Terms &amp; Conditions</a></li>
                            <li><a href="#">Privacy Policy</a></li>
                            <li><a href="#">Legality</a></li>
                            <li><a href="#">Author License</a></li>
                        </ul>
                    </div>
                    <div class="col-md-4 mb-4 mb-md-0">
                        <h3>Subscribe</h3>
                        <p class="mb-4">Lorem ipsum dolor sit amet consectetur adipisicing elit. Eaque dolor ducimus
                            doloremque earum ullam. Architecto voluptatum odio magni.</p>
                        <form action="#" class="subscribe">
                            <input type="text" class="form-control" placeholder="Enter your e-mail">
                            <input type="submit" class="btn btn-submit" value="Send">
                        </form>
                    </div>
                </div>

                <div class="row align-items-center">
                    <div class="col-12">
                        <div class="border-top my-5"></div>
                    </div>
                    <div class="col-md-6">
                        <p><small>© 2019 All Rights Reserved.</small></p>
                    </div>
                    <div class="col-md-6 text-md-right">
                        <ul class="social list-unstyled">
                            <li><a href=""><i class="bi bi-facebook" style="color: deepskyblue;"></i></a></li>
                            <li><a href="#"><i class="bi bi-twitter" style="color: deepskyblue;"></i></a></li>
                            <li><a href="#"><i class="bi bi-pinterest" style="color: red;"></i></a></li>
                            <li><a href="#"><i class="bi bi-instagram" style="color: rebeccapurple;"></i></a></li>
                            <li><a href="#"><i class="bi bi-behance" style="color: deepskyblue;"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </footer>
        <script src="../js/sanpham.js"></script>
        
</body>
    
</html>