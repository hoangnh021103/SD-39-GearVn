<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="ListProduct.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Red+Hat+Text:ital,wght@0,300..700;1,300..700&display=swap" rel="stylesheet">
    <title>My card</title>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.8.2/angular.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="Home.css">
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
                        <button class="btn" style="width: 100%;" data-bs-theme="dark" type="button" data-bs-toggle="collapse"
                            data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false"
                            aria-label="Toggle navigation">
                            <svg style="width: 20%;"  stroke="white" xmlns="http://www.w3.org/2000/svg" width="16"
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
                            <svg style="width: 20%;" xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                class="bi bi-geo-alt" viewBox="0 0 16 16">
                                <path
                                    d="M12.166 8.94c-.524 1.062-1.234 2.12-1.96 3.07A32 32 0 0 1 8 14.58a32 32 0 0 1-2.206-2.57c-.726-.95-1.436-2.008-1.96-3.07C3.304 7.867 3 6.862 3 6a5 5 0 0 1 10 0c0 .862-.305 1.867-.834 2.94M8 16s6-5.686 6-10A6 6 0 0 0 2 6c0 4.314 6 10 6 10" />
                                <path d="M8 8a2 2 0 1 1 0-4 2 2 0 0 1 0 4m0 1a3 3 0 1 0 0-6 3 3 0 0 0 0 6" />
                            </svg>
                            Hệ thống <br> showroom
                        </button>
                    </li>
                    <li class="nav-item" style="width: 11%;">
                        <button class="btn" style="width: 100%;" data-bs-theme="dark" type="button" data-bs-toggle="collapse"
                            data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false"
                            aria-label="Toggle navigation">
                            <svg style="width: 20%;" xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                class="bi bi-clipboard2" viewBox="0 0 16 16">
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
                            <button type="button" class="btn" data-bs-theme="dark" data-bs-toggle="dropdown" aria-expanded="false" data-bs-auto-close="outside">
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
                                    <input type="text" class="form-control" placeholder="Username or Email address">
                                  </div>
                                  <div class="input-group uf-input-group input-group-lg mb-3">
                                    <span class="input-group-text fa fa-lock"></span>
                                    <input type="password" class="form-control" placeholder="Password">
                                  </div>
                                  <div class="d-flex mb-3 justify-content-between">
                                    <div class="form-check">
                                      <input type="checkbox" class="form-check-input uf-form-check-input" id="exampleCheck1">
                                      <label class="form-check-label text-black" for="exampleCheck1">Remember Me</label>
                                    </div>
                                    <a class="text-black" href="#">Forgot password?</a>
                                  </div>
                                  <div class="d-grid mb-4">
                                    <button type="submit" class="btn uf-btn-primary btn-lg" style="justify-content: center; font-size: 100%; ">Login</button>
                                  </div>
                                  <div class="d-flex mb-3">
                                      <div class="dropdown-divider m-auto w-25"></div>
                                      <small class="text-nowrap text-black">Or login with</small>
                                      <div class="dropdown-divider m-auto w-25"></div>
                                  </div>
                                  <div class="uf-social-login d-flex justify-content-center">
                                    <a  href="#" class="uf-social-ic" style="color: blue;" title="Login with Facebook">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-facebook" viewBox="0 0 16 16">
                                            <path d="M16 8.049c0-4.446-3.582-8.05-8-8.05C3.58 0-.002 3.603-.002 8.05c0 4.017 2.926 7.347 6.75 7.951v-5.625h-2.03V8.05H6.75V6.275c0-2.017 1.195-3.131 3.022-3.131.876 0 1.791.157 1.791.157v1.98h-1.009c-.993 0-1.303.621-1.303 1.258v1.51h2.218l-.354 2.326H9.25V16c3.824-.604 6.75-3.934 6.75-7.951"/>
                                          </svg>    
                                    </a>
                                    <a href="#" class="uf-social-ic" style="color: aqua; padding: 0px 15px;"  title="Login with Twitter"><i class="fab fa-twitter"></i></a>
                                    <a href="#" class="uf-social-ic" style="color: red;" title="Login with Google"><i class="fab fa-google"></i></a>
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
    <header class="product-listings-mobile-header">
        <h1>Desserts</h1>

        <div class="mini-cart">
            <svg width="28" height="28" class="mini-cart-icon" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path fill-rule="evenodd" clip-rule="evenodd" d="M2 1C1.44772 1 1 1.44772 1 2C1 2.55228 1.44772 3 2 3H3.21922L6.78345 17.2569C5.73276 17.7236 5 18.7762 5 20C5 21.6569 6.34315 23 8 23C9.65685 23 11 21.6569 11 20C11 19.6494 10.9398 19.3128 10.8293 19H15.1707C15.0602 19.3128 15 19.6494 15 20C15 21.6569 16.3431 23 18 23C19.6569 23 21 21.6569 21 20C21 18.3431 19.6569 17 18 17H8.78078L8.28078 15H18C20.0642 15 21.3019 13.6959 21.9887 12.2559C22.6599 10.8487 22.8935 9.16692 22.975 7.94368C23.0884 6.24014 21.6803 5 20.1211 5H5.78078L5.15951 2.51493C4.93692 1.62459 4.13696 1 3.21922 1H2ZM18 13H7.78078L6.28078 7H20.1211C20.6742 7 21.0063 7.40675 20.9794 7.81078C20.9034 8.9522 20.6906 10.3318 20.1836 11.3949C19.6922 12.4251 19.0201 13 18 13ZM18 20.9938C17.4511 20.9938 17.0062 20.5489 17.0062 20C17.0062 19.4511 17.4511 19.0062 18 19.0062C18.5489 19.0062 18.9938 19.4511 18.9938 20C18.9938 20.5489 18.5489 20.9938 18 20.9938ZM7.00617 20C7.00617 20.5489 7.45112 20.9938 8 20.9938C8.54888 20.9938 8.99383 20.5489 8.99383 20C8.99383 19.4511 8.54888 19.0062 8 19.0062C7.45112 19.0062 7.00617 19.4511 7.00617 20Z"/>
            </svg>
            <span class="mini-cart-value" id="mini-cart-value-mobile">0</span>
        </div>
    </header>

    <section class="products-container">

        <main class="product-listings">
            <div class="product-listings-header">
                <h1>Desserts</h1>

                <div class="mini-cart">
                    <svg width="28" height="28" class="mini-cart-icon" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                        <path fill-rule="evenodd" clip-rule="evenodd" d="M2 1C1.44772 1 1 1.44772 1 2C1 2.55228 1.44772 3 2 3H3.21922L6.78345 17.2569C5.73276 17.7236 5 18.7762 5 20C5 21.6569 6.34315 23 8 23C9.65685 23 11 21.6569 11 20C11 19.6494 10.9398 19.3128 10.8293 19H15.1707C15.0602 19.3128 15 19.6494 15 20C15 21.6569 16.3431 23 18 23C19.6569 23 21 21.6569 21 20C21 18.3431 19.6569 17 18 17H8.78078L8.28078 15H18C20.0642 15 21.3019 13.6959 21.9887 12.2559C22.6599 10.8487 22.8935 9.16692 22.975 7.94368C23.0884 6.24014 21.6803 5 20.1211 5H5.78078L5.15951 2.51493C4.93692 1.62459 4.13696 1 3.21922 1H2ZM18 13H7.78078L6.28078 7H20.1211C20.6742 7 21.0063 7.40675 20.9794 7.81078C20.9034 8.9522 20.6906 10.3318 20.1836 11.3949C19.6922 12.4251 19.0201 13 18 13ZM18 20.9938C17.4511 20.9938 17.0062 20.5489 17.0062 20C17.0062 19.4511 17.4511 19.0062 18 19.0062C18.5489 19.0062 18.9938 19.4511 18.9938 20C18.9938 20.5489 18.5489 20.9938 18 20.9938ZM7.00617 20C7.00617 20.5489 7.45112 20.9938 8 20.9938C8.54888 20.9938 8.99383 20.5489 8.99383 20C8.99383 19.4511 8.54888 19.0062 8 19.0062C7.45112 19.0062 7.00617 19.4511 7.00617 20Z"/>
                    </svg>
                    <span class="mini-cart-value" id="mini-cart-value">0</span>
                </div>
            </div>

            <div class="products" id="products">
            </div>
        </main>

        <aside class="cart">
            <h3>
                Your Cart(<span class="cart-amount" id="cart-quantity">0</span>)
            </h3>

            <div class="cart-contents" id="cart-contents">
                <img src="https://bantool.net/images/cart/empty-cart.png"
                    class="empty-cart"
                    alt="empty-cart"
                >
                <p class="empty-cart-message">
                    Your added items will appear here
                </p>
            </div>
            
            <div class="checkout-container" id="checkout-container">
                <div class="order-total">
                    <p>
                        Order Total
                    </p>

                    <h3 class="total-price">
                        <span class="currency" id="currency">$</span>
                        <span id="total-price-value">0</span>
                    </h3>
                </div>

                <div class="checkout">

                    <span class="carbon-neutral">
                        <svg xmlns="http://www.w3.org/2000/svg" class="carbon-neutral-icon" width="21" height="20" viewBox="0 0 21 20">
                            <path d="M8 18.75H6.125V17.5H8V9.729L5.803 8.41l.644-1.072 2.196 1.318a1.256 1.256 0 0 1 .607 1.072V17.5A1.25 1.25 0 0 1 8 18.75Z" fill-rule="evenodd" />
                            <path d="M14.25 18.75h-1.875a1.25 1.25 0 0 1-1.25-1.25v-6.875h3.75a2.498 2.498 0 0 0 2.488-2.747 2.594 2.594 0 0 0-2.622-2.253h-.99l-.11-.487C13.283 3.56 11.769 2.5 9.875 2.5a3.762 3.762 0 0 0-3.4 2.179l-.194.417-.54-.072A1.876 1.876 0 0 0 5.5 5a2.5 2.5 0 1 0 0 5v1.25a3.75 3.75 0 0 1 0-7.5h.05a5.019 5.019 0 0 1 4.325-2.5c2.3 0 4.182 1.236 4.845 3.125h.02a3.852 3.852 0 0 1 3.868 3.384 3.75 3.75 0 0 1-3.733 4.116h-2.5V17.5h1.875v1.25Z" fill-rule="evenodd" />
                        </svg>
                        <span>This is a&nbsp;<b>carbon-neutral</b>&nbsp;delivery</span>
                    </span>

                    <button type="button" class="confirm-order" id="confirm-order">
                        Confirm Order
                    </button>
                </div>
            </div>
        </aside>

    </section>

    <div class="modal-container hide">
        <div class="modal">
            
        </div>
    </div>

    <div id="spinner" class="spinner-container hide"> 
        <div class="spinner"></div>
    </div>
    
    <script src="ListProduct.js"></script>
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
    <script src="Home.js"></script>
</body>

</html>