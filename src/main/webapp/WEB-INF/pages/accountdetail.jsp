<%@page import="com.niit.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html class="no-js" lang="zxx">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="meta description">

    <title>Account Detail</title>

    <!--=== Favicon ===-->
<link rel="shortcut icon" href="assets/img/favicon.ico" type="image/x-icon"/>

<!--== Google Fonts ==-->
<link href="https://fonts.googleapis.com/css?family=Poppins:300,400,400i,500,600,700" rel="stylesheet">

<!--=== Bootstrap CSS ===-->
<link href="assets/css/vendor/bootstrap.min.css" rel="stylesheet">
<!--=== Font-Awesome CSS ===-->
<link href="assets/css/vendor/font-awesome.css" rel="stylesheet">
<!--=== Plugins CSS ===-->
<link href="assets/css/plugins.css" rel="stylesheet">
<!--=== Helper CSS ===-->
<link href="assets/css/helper.min.css" rel="stylesheet">
<!--=== Main Style CSS ===-->
<link href="assets/css/style.css" rel="stylesheet">

<!-- Modernizer JS -->
<script src="assets/js/vendor/modernizr-2.8.3.min.js"></script>

    <!--[if lt IE 9]>
    <script src="http://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="http://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
 
<!--== Start Header Section ==-->
<header id="header-area">
    <!-- Start PreHeader Area -->
    <div class="preheader-area">
        <div class="container">
            <div class="row">
                <div class="col-md-5 col-lg-6">
                    <div class="preheader-contact-info d-flex align-items-center justify-content-between justify-content-md-start">
                        <div class="single-contact-info">
                            <span class="contact-icon">
                                <i class="fa fa-envelope"></i>
                            </span>
                            <a href="mailto:your@example.com" class="contact-text">
                                <strong>Email:</strong> your@email.here
                            </a>
                        </div>
                        <div class="single-contact-info">
                            <span class="contact-icon">
                                <i class="fa fa-phone"></i>
                            </span>
                            <a href="" class="contact-text">
                                <strong>Phone:</strong> (+1) 866-540-3229
                            </a>
                        </div>
                    </div>
                </div>

                <div class="col-md-7 col-lg-6 mt-xs-10">
                    <div class="site-setting-menu">
                        <ul class="nav justify-content-center justify-content-md-end">
                            <li><a href="myaccount">My Account</a></li>
                            <li><a href="wishlist">Wishlist</a></li>
                            <li><a href="loginregister">Sign In</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- End PreHeader Area -->

    <!-- Start Header Middle Area -->
    <div class="header-middle-area">
        <div class="container">
            <div class="row">
                <!-- Logo Area Start -->
                <div class="col-4 col-md-2 col-xl-3 m-auto text-center text-lg-left">
                    <a href="index.jsp" class="logo-wrap d-block">
                        <img src="assets/img/logo.png" alt="Logo" class="img-fluid"/>
                    </a>
                </div>
                <!-- Logo Area End -->

                <!-- Search Box Area Start -->
                <div class="col-8 col-md-7 col- m-auto ">
                    <div class="search-box-wrap">
                        <form class="search-form d-flex" action="#" method="get">
                            <input type="search" name="search" placeholder="type and hit enter"/>
                            <button class="btn btn-search"><img src="assets/img/icons/icon-search.png"
                                                                alt="Search Icon"/>
                            </button>
                        </form>
                    </div>
                </div>
                <!-- Search Box Area End -->

                <!-- Mini Cart Area Start -->
                
                <!-- Mini Cart Area End -->
            </div>
        </div>
    </div>
    <!-- End Header Middle Area -->

    <!-- Start Main Menu Area -->
    <div class="navigation-area" id="fixheader">
        <div class="container">
            <div class="row">
                <!-- Categories List Start -->
                
                <!-- Categories List End -->

                <!-- Main Menu Start -->
                <div class="col-2 col-lg-9 d-none d-lg-block">
                    <div class="main-menu-wrap">
                        <nav class="mainmenu">
    <ul class="main-navbar clearfix">
        <li><a href="index">Home</a></li>
        <li><a href="about">About Us</a></li>
        <li><a href="shop">Shop</a></li>
        
        <li><a href="contact">Contact Us</a></li>
    </ul>
</nav>
                    </div>
                </div>
                <!-- Main Menu End -->
            </div>
        </div>
    </div>
    <!-- End Main Menu Area -->
</header>
<!--== End Header Section ==-->

<!--== Start Page Breadcrumb ==-->
<div class="page-breadcrumb-wrap">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="page-breadcrumb">
                    <ul class="nav">
                        <li><a href="index">Home</a></li>
                        <li>Dashboard</li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!--== End Page Breadcrumb ==-->

<!--== Page Content Wrapper Start ==-->
<div id="page-content-wrapper">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <!-- My Account Page Start -->
                <div class="myaccount-page-wrapper">
                    <!-- My Account Tab Menu Start -->
                    <div class="row">
                        <div class="col-lg-3">
                            <div class="myaccount-tab-menu nav" role="tablist">
                               
                                <a href="orderinfo"><i class="fa fa-cart-arrow-down"></i> Orders</a>
                                
                                <a href="logisticinfo"><i class="fa fa-cart-arrow-down"></i> Logistic</a>

                                <a href="addressinfo"><i class="fa fa-map-marker"></i> Address</a>

                                <a href="accountinfo" class="active"><i class="fa fa-user"></i> Account Details</a>

                                <a href="loginregister"><i class="fa fa-sign-out"></i> Logout</a>
                            </div>
                        </div>
                        <!-- My Account Tab Menu End -->

                        <!-- My Account Tab Content Start -->
                        <div class="col-lg-9 mt-15 mt-lg-0">
                            <div class="tab-content">
                                

                                <!-- Single Tab Content Start -->
                                        <h3>Account Details</h3>

                                        <div class="account-details-form">
                                        
                                        	<c:form action="" method="post" modelAttribute="customer">
					                        	<c:hidden path="id"/>
					                        	<div class="single-input-item">
					                                <c:input path="username" disabled="true"/>
					                            </div>
					
					                            <div class="single-input-item">
					                                <c:input path="email" disabled="true" />
					                            </div>
					
					                            <div class="single-input-item">
					                                <c:input path="telephone" disabled="true" />
					                            </div>
					                            
					                            <div class="single-input-item">
					                                <c:input path="password" disabled="true" />
					                            </div>
					                        </c:form>
                                            <a href="UpdateAccount" class="fa fa-edit"></a>
                                        
                                        </div>
                                <!-- Single Tab Content End -->
                            </div>
                        </div>
                        <!-- My Account Tab Content End -->
                    </div>
                </div>
                <!-- My Account Page End -->
            </div>
        </div>
    </div>
</div>
<!--== Page Content Wrapper End ==-->

<!--== Start Newsletter Area ==-->
<div class="newsletter-area">
    <div class="container">
        <div class="row">
            <div class="col-lg-9 m-auto">
                <!-- Newsletter Content Start -->
                <div class="newsletter-content-wrap text-center text-lg-left d-lg-flex">
                    <h2><i class="fa fa-envelope-square"></i> Sign up for Newsletter</h2>
                    <div class="newsletter-form-wrap">
                        <form id="subscribe-form" action="assets/php/subscribe.php" method="post">
                            <input type="email" name="newsletter_email" id="address" placeholder="Enter Your Email Address" required />
                            <button class="btn" type="submit">Subscribe</button>
                        </form>
                        <!-- Show Error & Success Message -->
                        <div id="subscribeResult"></div>
                    </div>
                </div>
                <!-- Newsletter Content End -->
            </div>

            <div class="col-lg-3 m-auto text-center text-lg-right">
                <!-- Social Icons Area Start -->
                <div class="social-icons">
                    <a href="#"><i class="fa fa-facebook"></i></a>
                    <a href="#"><i class="fa fa-twitter"></i></a>
                    <a href="#"><i class="fa fa-linkedin"></i></a>
                    <a href="#"><i class="fa fa-youtube"></i></a>
                </div>
                <!-- Social Icons Area End -->
            </div>
        </div>
    </div>
</div>
<!--== End Newsletter Area ==-->

<!--== Start Footer Area ==-->
<footer id="footer-area">
    <!-- Footer Widget Area Start -->
    <div class="footer-widget-area">
        <div class="container">
            <div class="footer-widget-content">
                <div class="row">
                    <!-- Single Widget-item Start -->
                    <div class="col-lg-3 col-sm-6">
                        <div class="single-widget-item">
                            <h3 class="widget-title">About Market</h3>
                            <div class="widget-body">
                                <ul class="footer-list">
                                    <li><a href="#">My Account</a></li>
                                    <li><a href="#">Order History</a></li>
                                    <li><a href="#">Returns</a></li>
                                    <li><a href="#">Specials</a></li>
                                    <li><a href="#">Site Map</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <!-- Single Widget-item End -->

                    <!-- Single Widget-item Start -->
                    <div class="col-lg-3 col-sm-6">
                        <div class="single-widget-item">
                            <h3 class="widget-title">Customer Service</h3>
                            <div class="widget-body">
                                <ul class="footer-list">
                                    <li><a href="#">Returns</a></li>
                                    <li><a href="#">Order History</a></li>
                                    <li><a href="#">My Account</a></li>
                                    <li><a href="#">Site Map</a></li>
                                    <li><a href="#">Specials</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <!-- Single Widget-item End -->

                    <!-- Single Widget-item Start -->
                    <div class="col-lg-3 col-sm-6">
                        <div class="single-widget-item">
                            <h3 class="widget-title">Information</h3>
                            <div class="widget-body">
                                <ul class="footer-list">
                                    <li><a href="#">Order History</a></li>
                                    <li><a href="#">Site Map</a></li>
                                    <li><a href="#">Returns</a></li>
                                    <li><a href="#">Specials</a></li>
                                    <li><a href="#">My Account</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <!-- Single Widget-item End -->

                    <!-- Single Widget-item Start -->
                    <div class="col-lg-3 col-sm-6">
                        <div class="single-widget-item">
                            <h3 class="widget-title">Contact Us</h3>
                            <div class="widget-body">
                                <div class="contact-info">
                                    <div class="single-contact-info">
                                    <span class="contact-icon">
                                        <i class="fa fa-home"></i>
                                    </span>
                                        <a href="mailto:your@example.com" class="contact-text">
                                            <strong>Address:</strong> 15/C, Uttara, Dhaka
                                        </a>
                                    </div>
                                    <div class="single-contact-info">
                                    <span class="contact-icon">
                                        <i class="fa fa-phone"></i>
                                    </span>
                                        <a href="mailto:your@example.com" class="contact-text">
                                            <strong>Phone:</strong> (+1) 866-540-3229
                                        </a>
                                    </div>
                                    <div class="single-contact-info">
                                    <span class="contact-icon">
                                        <i class="fa fa-envelope"></i>
                                    </span>
                                        <a href="mailto:your@example.com" class="contact-text">
                                            <strong>Email:</strong> your@email.here
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- Single Widget-item End -->
                </div>
            </div>
        </div>
    </div>
    <!-- Footer Widget Area End -->

    <!-- Footer Bottom Area -->
    <div class="footer-bttom-area">
        <div class="container">
            <div class="row">
                <!-- Copyright Text Area -->
                <div class="col-md-6 m-auto text-center text-md-left order-last order-md-first">
                    <p>Copyright &copy; 2018.Company name All rights reserved.</p>
                </div>
                <!-- Copyright Text Area -->

                <!-- Payment Method Area -->
                <div class="col-md-6 m-auto text-center text-md-right">
                    <div class="payment-support">
                        <img src="assets/img/payment.png" alt="Payment" class="d-inline-block" />
                    </div>
                </div>
                <!-- Payment Method Area -->
            </div>
        </div>
    </div>
    <!-- Footer Bottom Area -->
</footer>
<!--== End Footer Area ==-->

<!-- Scroll to Top Start -->
<a href="#" class="scrolltotop"><i class="fa fa-angle-up"></i></a>
<!-- Scroll to Top End -->

<!--== Product Quick View Modal Area Wrap ==-->
<div class="modal" id="quickView" tabindex="-1" role="dialog">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true"><img src="assets/img/icons/cancel.png" alt="Close" class="img-fluid" /></span>
            </button>
            <div class="modal-body">
                <div class="quick-view-content single-product-page-content">
                    <div class="row">
                        <!-- Product Thumbnail Start -->
                        <div class="col-lg-5 col-md-6">
                            <div class="product-thumbnail-wrap">
                                <div class="product-thumb-carousel owl-carousel">
                                    <div class="single-thumb-item">
                                        <a href="single-product.jsp"><img class="img-fluid" src="assets/img/single-pro-1.jpg" alt="Product" /></a>
                                    </div>

                                    <div class="single-thumb-item">
                                        <a href="single-product.jsp"><img class="img-fluid" src="assets/img/single-pro-2.jpg" alt="Product" /></a>
                                    </div>

                                    <div class="single-thumb-item">
                                        <a href="single-product.jsp"><img class="img-fluid" src="assets/img/single-pro-3.jpg" alt="Product" /></a>
                                    </div>

                                    <div class="single-thumb-item">
                                        <a href="single-product.jsp"><img class="img-fluid" src="assets/img/single-pro-4.jpg" alt="Product" /></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- Product Thumbnail End -->

                        <!-- Product Details Start -->
                        <div class="col-lg-7 col-md-6 mt-5 mt-md-0">
                            <div class="product-details">
                                <h2><a href="single-product.jsp">Crown Summit Backpack</a></h2>

                                <div class="rating">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star-half"></i>
                                    <i class="fa fa-star-o"></i>
                                </div>

                                <span class="price">$52.00</span>

                                <div class="product-info-stock-sku">
                                    <span class="product-stock-status text-success">In Stock</span>
                                    <span class="product-sku-status ml-5"><strong>SKU</strong> MH03</span>
                                </div>

                                <p class="products-desc">Ideal for cold-weathered training worked lorem ipsum outdoors, the Chaz Hoodie promises superior warmth with every wear. Thick material blocks out the wind as ribbed cuffs and bottom band seal in body heat Lorem ipsum dolor sit amet, consectetur adipisicing elit. Enim, reprehenderit.</p>
                                <div class="shopping-option-item">
                                    <h4>Color</h4>
                                    <ul class="color-option-select d-flex">
                                        <li class="color-item black">
                                            <div class="color-hvr">
                                                <span class="color-fill"></span>
                                                <span class="color-name">Black</span>
                                            </div>
                                        </li>

                                        <li class="color-item green">
                                            <div class="color-hvr">
                                                <span class="color-fill"></span>
                                                <span class="color-name">green</span>
                                            </div>
                                        </li>

                                        <li class="color-item orange">
                                            <div class="color-hvr">
                                                <span class="color-fill"></span>
                                                <span class="color-name">Orange</span>
                                            </div>
                                        </li>
                                    </ul>
                                </div>

                                <div class="product-quantity d-flex align-items-center">
                                    <div class="quantity-field">
                                        <label for="qty">Qty</label>
                                        <input type="number" id="qty" min="1" max="100" value="1" />
                                    </div>

                                    <a href="cart.jsp" class="btn">Add to Cart</a>
                                </div>
                            </div>
                        </div>
                        <!-- Product Details End -->
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--== Product Quick View Modal Area End ==-->


<!--=======================Javascript============================-->
<!--=== Jquery Min Js ===-->
<script src="assets/js/vendor/jquery-3.3.1.min.js"></script>
<!--=== Jquery Migrate Min Js ===-->
<script src="assets/js/vendor/jquery-migrate-1.4.1.min.js"></script>
<!--=== Popper Min Js ===-->
<script src="assets/js/vendor/popper.min.js"></script>
<!--=== Bootstrap Min Js ===-->
<script src="assets/js/vendor/bootstrap.min.js"></script>
<!--=== Ajax Mail Js ===-->
<script src="assets/js/ajax-mail.js"></script>
<!--=== Plugins Min Js ===-->
<script src="assets/js/plugins.js"></script>

<!--=== Active Js ===-->
<script src="assets/js/active.js"></script>
</body>
</html>
