<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html class="no-js" lang="zxx">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="meta description">

    <title>Single Product</title>

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
                            <li><a href="my-account.jsp">My Account</a></li>
                            <li><a href="wishlist.jsp">Wishlist</a></li>
                            <li><a href="login-register.jsp">Sign In</a></li>
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
                <div class="col-12 col-md-3 col-xl-2 m-auto text-center text-lg-right mt-xs-15">
                    <div class="minicart-wrapper">
                        <button class="btn btn-minicart">My Cart <sup class="cart-count">3</sup></button>
                        <div class="minicart-content">
                            <div class="mini-cart-body">
                                <!-- Single Cart Item Start -->
                                <div class="single-cart-item d-flex">
                                    <figure class="product-thumb">
                                        <a href="single-product.jsp"><img src="assets/img/product-1.jpg"
                                                                           alt="Products"/></a>
                                    </figure>

                                    <div class="product-details">
                                        <h2><a href="single-product.jsp">Sprite Yoga Companion</a></h2>
                                        <div class="cal d-flex align-items-center">
                                            <span class="quantity">3</span>
                                            <span class="multiplication">X</span>
                                            <span class="price">$77.00</span>
                                        </div>
                                    </div>
                                    <a href="#" class="remove-icon"><i class="fa fa-trash-o"></i></a>
                                </div>
                                <!-- Single Cart Item End -->

                                <!-- Single Cart Item Start -->
                                <div class="single-cart-item d-flex">
                                    <figure class="product-thumb">
                                        <a href="single-product.jsp"><img src="assets/img/product-2.jpg"
                                                                           alt="Products"/></a>
                                    </figure>
                                    <div class="product-details">
                                        <h2><a href="single-product.jsp">Yoga Companion Kit</a></h2>
                                        <div class="cal d-flex align-items-center">
                                            <span class="quantity">2</span>
                                            <span class="multiplication">X</span>
                                            <span class="price">$6.00</span>
                                        </div>
                                    </div>
                                    <a href="#" class="remove-icon"><i class="fa fa-trash-o"></i></a>
                                </div>
                                <!-- Single Cart Item End -->

                                <!-- Single Cart Item Start -->
                                <div class="single-cart-item d-flex">
                                    <figure class="product-thumb">
                                        <a href="single-product.jsp"><img src="assets/img/product-3.jpg"
                                                                           alt="Products"/></a>
                                    </figure>
                                    <div class="product-details">
                                        <h2><a href="#">Sprite Yoga Companion Kit</a></h2>
                                        <div class="cal d-flex align-items-center">
                                            <span class="quantity">1</span>
                                            <span class="multiplication">X</span>
                                            <span class="price">$116.00</span>
                                        </div>
                                    </div>
                                    <a href="single-product.jsp" class="remove-icon"><i class="fa fa-trash-o"></i></a>
                                </div>
                                <!-- Single Cart Item End -->
                            </div>
                            <div class="mini-cart-footer">
                                <a href="checkout.jsp" class="btn">Checkout</a>
                            </div>
                        </div>
                    </div>
                </div>
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
                <div class="col-10 col-lg-3">
                    <div class="categories-list-wrap">
                        <button class="btn btn-category d-none d-lg-inline-block"><i class="fa fa-bars"></i> Categories
                        </button>
                        <ul class="category-list-menu">
                            <li class="category-item-parent dropdown-show">
                                <a href="#" class="category-item arrow-toggle">
                                    <img src="assets/img/icons/desktop.png" alt="Computer"/>
                                    <span>Computer</span>
                                </a>
                                <ul class="mega-menu-wrap dropdown-nav">
                                    <li class="mega-menu-item"><a href="#" class="mega-item-title">Laptop</a>
                                        <ul>
                                            <li><a href="#">Has Laptop Price</a></li>
                                            <li><a href="#">Has Laptop Ram</a></li>
                                            <li><a href="#">Has Laptop Rom</a></li>
                                            <li><a href="#">Has Laptop SSD</a></li>
                                        </ul>
                                    </li>

                                    <li class="mega-menu-item"><a href="#" class="mega-item-title">Desktop</a>
                                        <ul>
                                            <li><a href="#">Has Laptop Price</a></li>
                                            <li><a href="#">Has Laptop Ram</a></li>
                                            <li><a href="#">Has Laptop Rom</a></li>
                                            <li><a href="#">Has Laptop SSD</a></li>
                                        </ul>
                                    </li>

                                    <li class="mega-menu-item"><a href="#" class="mega-item-title">Notebook</a>
                                        <ul>
                                            <li><a href="#">Has Laptop Price</a></li>
                                            <li><a href="#">Has Laptop Ram</a></li>
                                            <li><a href="#">Has Laptop Rom</a></li>
                                            <li><a href="#">Has Laptop SSD</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>

                            <li class="category-item-parent dropdown-show">
                                <a href="#" class="category-item arrow-toggle">
                                    <img src="assets/img/icons/mobile.png" alt="Mobile"/>
                                    <span>Mobile</span>
                                </a>
                                <ul class="mega-menu-wrap dropdown-nav">
                                    <li class="mega-menu-item"><a href="#" class="mega-item-title">Sumsang</a>
                                        <ul>
                                            <li><a href="#">Sumsang S6</a></li>
                                            <li><a href="#">Sumsang S7</a></li>
                                            <li><a href="#">Sumsang Prime</a></li>
                                            <li><a href="#">Sumsang A6</a></li>
                                        </ul>
                                    </li>

                                    <li class="mega-menu-item"><a href="#" class="mega-item-title">Ziaomi</a>
                                        <ul>
                                            <li><a href="#">Ziaomi A2 Pro</a></li>
                                            <li><a href="#">Ziaomi MIX 2</a></li>
                                            <li><a href="#">Ziaomi F1</a></li>
                                            <li><a href="#">Ziaomi Prime</a></li>
                                        </ul>
                                    </li>

                                    <li class="mega-menu-item"><a href="#" class="mega-item-title">Jamila</a>
                                        <ul>
                                            <li><a href="#">Jamila G100</a></li>
                                            <li><a href="#">Jamila i120</a></li>
                                            <li><a href="#">Jamila i15</a></li>
                                            <li><a href="#">Jamila L62</a></li>
                                        </ul>
                                    </li>

                                    <li class="mega-menu-item"><a href="#" class="mega-item-title">Nakoa</a>
                                        <ul>
                                            <li><a href="#">Nakoa Lamia 820</a></li>
                                            <li><a href="#">Nakoa 888 Pro</a></li>
                                            <li><a href="#">Nakoa 81 Sirocco</a></li>
                                            <li><a href="#">Nakoa Lamia 1520</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>
                            <li class="category-item-parent">
                                <a href="#" class="category-item">
                                    <img src="assets/img/icons/camera.png" alt="Camera"/>
                                    <span>Camera</span>
                                </a>
                            </li>
                            <li class="category-item-parent">
                                <a href="#" class="category-item">
                                    <img src="assets/img/icons/fan.png" alt="Camera"/>
                                    <span>Electronics</span>
                                </a>
                            </li>
                            <li class="category-item-parent hidden">
                                <a href="#" class="category-item">
                                    <img src="assets/img/icons/games.png" alt="Camera"/>
                                    <span>Gaming</span>
                                </a>
                            </li>
                            <li class="category-item-parent hidden">
                                <a href="#" class="category-item">
                                    <img src="assets/img/icons/tv.png" alt="Camera"/>
                                    <span>Entertainment</span>
                                </a>
                            </li>
                            <li class="category-item-parent">
                                <a href="#" class="category-item btn-more">More Categories</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <!-- Categories List End -->

                <!-- Main Menu Start -->
                <div class="col-2 col-lg-9 d-none d-lg-block">
                    <div class="main-menu-wrap">
                        <nav class="mainmenu">
    <ul class="main-navbar clearfix">
        <li><a href="index.jsp">Home</a></li>
        <li><a href="about.jsp">About Us</a></li>
        <li><a href="shop.jsp">Shop</a></li>
        <li class="dropdown-show"><a href="#" class="arrow-toggle">Pages</a>
            <ul class="dropdown-nav">
                <li><a href="cart.jsp">Shopping Cart</a></li>
                <li><a href="checkout.jsp">Checkout</a></li>
                <li><a href="compare.jsp">Compare</a></li>
                <li><a href="wishlist.jsp">Wishlist</a></li>
                <li><a href="login-register.jsp">Login & Register</a></li>
                <li><a href="my-account.jsp">My Account</a></li>
                <li><a href="404.jsp">404 Error</a></li>
            </ul>
        </li>
        <li><a href="contact.jsp">Contact Us</a></li>
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
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="shop.jsp">Shop</a></li>
                        <li><a href="#" class="active">MH02-Gray</a></li>
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
            <!-- Single Product Page Content Start -->
            <div class="col-lg-12">
                <div class="single-product-page-content">
                    <div class="row">
                        <!-- Product Thumbnail Start -->
                        <div class="col-lg-5">
                            <div class="product-thumbnail-wrap">
                                <div class="product-thumb-carousel owl-carousel">
                                    <div class="single-thumb-item">
                                        <a href="single-product.jsp"><img class="img-fluid"
                                                                           src="assets/img/single-pro-1.jpg"
                                                                           alt="Product"/></a>
                                    </div>

                                    <div class="single-thumb-item">
                                        <a href="single-product.jsp"><img class="img-fluid"
                                                                           src="assets/img/single-pro-2.jpg"
                                                                           alt="Product"/></a>
                                    </div>

                                    <div class="single-thumb-item">
                                        <a href="single-product.jsp"><img class="img-fluid"
                                                                           src="assets/img/single-pro-3.jpg"
                                                                           alt="Product"/></a>
                                    </div>

                                    <div class="single-thumb-item">
                                        <a href="single-product.jsp"><img class="img-fluid"
                                                                           src="assets/img/single-pro-4.jpg"
                                                                           alt="Product"/></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- Product Thumbnail End -->

                        <!-- Product Details Start -->
                        <div class="col-lg-7">
                            <div class="product-details">
                                <h2><a href="single-product.jsp">MH02-Gray</a></h2>

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
                                    <span class="product-sku-status"><strong>SKU</strong> MH03</span>
                                </div>

                                <div class="sale-countdown-wrap mb-15">
                                    <div class="sale-countdown" data-date="10/20/2019"></div>
                                </div>

                                <p class="products-desc">Ideal for cold-weathered training worked lorem ipsum
                                    outdoors, the Chaz Hoodie promises superior warmth with every wear. Thick
                                    material blocks out the wind as ribbed cuffs and bottom band seal in body
                                    heat
                                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Enim,
                                    reprehenderit.</p>

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
                                        <input type="number" id="qty" min="1" max="100" value="1"/>
                                    </div>

                                    <a href="cart.jsp" class="btn btn-cart-large"><i
                                            class="fa fa-shopping-cart"></i> Add to Cart</a>
                                </div>

                                <div class="product-btn-group">
                                    <a href="wishlist.jsp" class="btn btn-round btn-cart"><i
                                            class="fa fa-heart"></i></a>
                                    <a href="compare.jsp" class="btn btn-round btn-cart"><i
                                            class="fa fa-exchange"></i></a>
                                </div>
                            </div>
                        </div>
                        <!-- Product Details End -->
                    </div>

                    <div class="row">
                        <div class="col-lg-12">
                            <!-- Product Full Description Start -->
                            <div class="product-full-info-reviews">
                                <!-- Single Product tab Menu -->
                                <nav class="nav" id="nav-tab">
                                    <a class="active" id="description-tab" data-toggle="tab"
                                       href="#description">Description</a>
                                    <a id="reviews-tab" data-toggle="tab" href="#reviews">Reviews</a>
                                </nav>
                                <!-- Single Product tab Menu -->

                                <!-- Single Product tab Content -->
                                <div class="tab-content" id="nav-tabContent">
                                    <div class="tab-pane fade show active" id="description">
                                        <p>Stay comfortable and stay in the race no matter what the weather's up
                                            to.
                                            The Bruno Compete Hoodie's water-repellent exterior shields you from
                                            the
                                            elements, while advanced fabric technology inside wicks moisture to
                                            keep
                                            you dry.Stay comfortable and stay in the race no matter what the
                                            weather's up to. The Bruno Compete Hoodie's water-repellent exterior
                                            shields you from the elements, while advanced fabric technology
                                            inside
                                            wicks moisture to keep you dry.Stay comfortable and stay in the race
                                            no
                                            matter what the weather's up to. The Bruno Compete Hoodie's
                                            water-repellent exterior shields you from the elements, while
                                            advanced
                                            fabric technology inside wicks moisture to keep you dry.</p>

                                        <ul>
                                            <li>Adipisicing elitEnim, laborum.</li>
                                            <li>Lorem ipsum dolor sit</li>
                                            <li>Dolorem molestiae quod voluptatem! Sint.</li>
                                            <li>Iure obcaecati odio pariatur quae saepe!</li>
                                        </ul>
                                    </div>

                                    <div class="tab-pane fade" id="reviews">
                                        <div class="row">
                                            <div class="col-lg-7">
                                                <div class="product-ratting-wrap">
                                                    <div class="pro-avg-ratting">
                                                        <h4>4.5 <span>(Overall)</span></h4>
                                                        <span>Based on 9 Comments</span>
                                                    </div>
                                                    <div class="ratting-list">
                                                        <div class="sin-list float-left">
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <span>(5)</span>
                                                        </div>
                                                        <div class="sin-list float-left">
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star-o"></i>
                                                            <span>(3)</span>
                                                        </div>
                                                        <div class="sin-list float-left">
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star-o"></i>
                                                            <i class="fa fa-star-o"></i>
                                                            <span>(1)</span>
                                                        </div>
                                                        <div class="sin-list float-left">
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star-o"></i>
                                                            <i class="fa fa-star-o"></i>
                                                            <i class="fa fa-star-o"></i>
                                                            <span>(0)</span>
                                                        </div>
                                                    </div>
                                                    <div class="rattings-wrapper">

                                                        <div class="sin-rattings">
                                                            <div class="ratting-author">
                                                                <h3>Cristopher Lee</h3>
                                                                <div class="ratting-star">
                                                                    <i class="fa fa-star"></i>
                                                                    <i class="fa fa-star"></i>
                                                                    <i class="fa fa-star"></i>
                                                                    <i class="fa fa-star"></i>
                                                                    <i class="fa fa-star"></i>
                                                                    <span>(5)</span>
                                                                </div>
                                                            </div>
                                                            <p>enim ipsam voluptatem quia voluptas sit
                                                                aspernatur
                                                                aut odit aut fugit, sed quia res eos qui ratione
                                                                voluptatem sequi Neque porro quisquam est, qui
                                                                dolorem ipsum quia dolor sit amet, consectetur,
                                                                adipisci veli</p>
                                                        </div>

                                                        <div class="sin-rattings">
                                                            <div class="ratting-author">
                                                                <h3>Nirob Khan</h3>
                                                                <div class="ratting-star">
                                                                    <i class="fa fa-star"></i>
                                                                    <i class="fa fa-star"></i>
                                                                    <i class="fa fa-star"></i>
                                                                    <i class="fa fa-star"></i>
                                                                    <i class="fa fa-star"></i>
                                                                    <span>(5)</span>
                                                                </div>
                                                            </div>
                                                            <p>enim ipsam voluptatem quia voluptas sit
                                                                aspernatur
                                                                aut odit aut fugit, sed quia res eos qui ratione
                                                                voluptatem sequi Neque porro quisquam est, qui
                                                                dolorem ipsum quia dolor sit amet, consectetur,
                                                                adipisci veli</p>
                                                        </div>

                                                        <div class="sin-rattings">
                                                            <div class="ratting-author">
                                                                <h3>MD.ZENAUL ISLAM</h3>
                                                                <div class="ratting-star">
                                                                    <i class="fa fa-star"></i>
                                                                    <i class="fa fa-star"></i>
                                                                    <i class="fa fa-star"></i>
                                                                    <i class="fa fa-star"></i>
                                                                    <i class="fa fa-star"></i>
                                                                    <span>(5)</span>
                                                                </div>
                                                            </div>
                                                            <p>enim ipsam voluptatem quia voluptas sit
                                                                aspernatur
                                                                aut odit aut fugit, sed quia res eos qui ratione
                                                                voluptatem sequi Neque porro quisquam est, qui
                                                                dolorem ipsum quia dolor sit amet, consectetur,
                                                                adipisci veli</p>
                                                        </div>

                                                    </div>
                                                    <div class="ratting-form-wrapper">
                                                        <h3>Add your Comments</h3>
                                                        <form action="#" method="post">
                                                            <div class="ratting-form row">
                                                                <div class="col-12 mb-4">
                                                                    <h5>Rating:</h5>
                                                                    <div class="ratting-star fix">
                                                                        <i class="fa fa-star-o"></i>
                                                                        <i class="fa fa-star-o"></i>
                                                                        <i class="fa fa-star-o"></i>
                                                                        <i class="fa fa-star-o"></i>
                                                                        <i class="fa fa-star-o"></i>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-6 col-12 mb-4">
                                                                    <label for="name">Name:</label>
                                                                    <input id="name" placeholder="Name"
                                                                           type="text">
                                                                </div>
                                                                <div class="col-md-6 col-12 mb-4">
                                                                    <label for="email">Email:</label>
                                                                    <input id="email" placeholder="Email"
                                                                           type="text">
                                                                </div>
                                                                <div class="col-12 mb-4">
                                                                    <label for="your-review">Your
                                                                        Review:</label>
                                                                    <textarea name="review" id="your-review"
                                                                              placeholder="Write a review"></textarea>
                                                                </div>
                                                                <div class="col-12">
                                                                    <input value="add review" type="submit">
                                                                </div>
                                                            </div>
                                                        </form>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- Single Product tab Content -->
                            </div>
                            <!-- Product Full Description End -->
                        </div>
                    </div>
                </div>
            </div>
            <!-- Single Product Page Content End -->
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
