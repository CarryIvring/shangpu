package com.niit.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



import com.niit.model.Address;
import com.niit.model.Cart;
import com.niit.model.CartProduct;
import com.niit.model.Customer;
import com.niit.model.Logistic;
import com.niit.model.Order;
import com.niit.model.Product;
import com.niit.model.Remark;
import com.niit.model.Wishlist;
import com.niit.model.Wishproduct;
import com.niit.service.CustomerService;
import com.niit.supportclass.GeneralSupport;



@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/")
	public ModelAndView firstPage(ModelAndView model) {
		Customer customer = new Customer();
		model.addObject("customer",customer);
		model.setViewName("index");
		return model;
	}
	
	//go to login-register.jsp page
	@RequestMapping(value="/loginregister",method=RequestMethod.GET)
	public ModelAndView Home(ModelAndView model) {
		Customer customer = new Customer();
		model.addObject("customer",customer);
		model.setViewName("login-register");
		return model;
	}
	
	//go to myaccount.jsp page
	@RequestMapping(value="/myaccount",method=RequestMethod.GET)
	public ModelAndView MyAccount(ModelAndView model) {
		Customer customer = new Customer();
		model.addObject("customer",customer);
		model.setViewName("my-account");
		return model;
	}
	
	//go to wishlist.jsp page
	@RequestMapping(value="/wishlist",method=RequestMethod.GET)
	public ModelAndView WishList(ModelAndView model,HttpServletRequest request) {
		Customer c = (Customer) request.getSession().getAttribute("customer_session");
		List<Wishproduct> listWish = customerService.getWish(c.getUsername());
		Map<String ,Object> map=new HashMap<String,Object>();
		map.put("listWish",listWish);
		map.put("customer", c);
		return new ModelAndView("wishlist", "data", map);
	}
	
	@RequestMapping(value="/singleproduct",method=RequestMethod.GET)
	public ModelAndView SingleProduct(ModelAndView model) {
		Customer customer = new Customer();
		model.addObject("customer",customer);
		model.setViewName("single-product");
		return model;
	}
	
	//go to index.jsp page
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView Index(ModelAndView model) {
		Customer customer = new Customer();
		model.addObject("customer",customer);
		model.setViewName("index");
		return model;
	}
	
	//go to about.jsp page
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public ModelAndView About(ModelAndView model) {
		Customer customer = new Customer();
		model.addObject("customer",customer);
		model.setViewName("about");
		return model;
	}
	
	//go to contact.jsp page
	@RequestMapping(value="/contact",method=RequestMethod.GET)
	public ModelAndView Contact(ModelAndView model) {
		Customer customer = new Customer();
		model.addObject("customer",customer);
		model.setViewName("contact");
		return model;
	}
	
	//go to shop.jsp
	@RequestMapping(value="/shop",method=RequestMethod.GET)
	public ModelAndView Shop(ModelAndView model) {
		List<Product> listProduct = customerService.getAllProducts();
		model.addObject("listProduct", listProduct);
		Customer customer = new Customer();
		model.addObject("customer",customer);
		model.setViewName("shop");
		return model;
	}
	
	
	
	//go to cart.jsp page
	@RequestMapping(value="/cart",method=RequestMethod.GET)
	public ModelAndView Cart(ModelAndView model,HttpServletRequest request) {
		Customer c = (Customer) request.getSession().getAttribute("customer_session");
		List<CartProduct> listCart = customerService.getCart(c.getUsername());
		Map<String ,Object> map=new HashMap<String,Object>();
		map.put("listCart",listCart);
		map.put("customer", c);
		return new ModelAndView("cart", "data", map);
	}
	
	//customer register
	@RequestMapping(value="/CustomerRegister",method=RequestMethod.POST)
	public ModelAndView NewUser(@ModelAttribute Customer customer) {
		customer.setFlag(1);
		customer.setCreatedate(GeneralSupport.getDate());
		customerService.addCustomer(customer);
		return new ModelAndView("login-register");
	}
	
	//customer login
	@RequestMapping(value="/CustomerLogin",method=RequestMethod.POST)
	public ModelAndView UserLogin(@ModelAttribute Customer customer,HttpServletRequest request) {
		int i = customerService.login(customer);
		if(1==i) {
			Customer customer1 = customerService.getCustomer(customer);
			HttpSession session = request.getSession();
			session.setAttribute("customer_session", customer1);
			ModelAndView model = new ModelAndView();
			model.setViewName("index");
			return model;
			
		}else if(i==4){
			ModelAndView model = new ModelAndView();
			model.setViewName("admin");
			return model;
		}
		
		else {
			ModelAndView model = new ModelAndView();
			model.addObject("customer",customer);
			model.setViewName("login");
			return model;
		}
	}
	
	//Customer get all products
	/*@RequestMapping(value="/")
	public ModelAndView listProduct(ModelAndView model) throws IOException {
		List<Product> listProduct = customerService.getAllProducts();
		model.addObject("listProduct", listProduct);
		model.setViewName("shop");
		return model;
	}*/
	
	//customer add to cart function
	@RequestMapping(value="/addtocart",method=RequestMethod.GET)
	public ModelAndView AddToCart(@ModelAttribute Cart cart, HttpServletRequest request) {
		Customer c = (Customer) request.getSession().getAttribute("customer_session");
		cart.setDate(GeneralSupport.getDate());
		cart.setProduct_id(Integer.parseInt(request.getParameter("id")));
		cart.setCustomer_name(c.getUsername());
		customerService.addToCart(cart);
		return new ModelAndView("redirect:/cart");
	}
	
	//delete from cart
	@RequestMapping(value="/deletefromcart",method=RequestMethod.GET)
	public ModelAndView DelefeFromCart(@ModelAttribute Cart cart, HttpServletRequest request) {
		int cartid=Integer.parseInt(request.getParameter("id"));
		customerService.deleteFromCart(cartid);
		return new ModelAndView("redirect:/cart");
	}
	
	//delete from wish-list function
	@RequestMapping(value="/deletefromwish",method=RequestMethod.GET)
	public ModelAndView DelefeFromWish(@ModelAttribute Wishlist wishlist, HttpServletRequest request) {
		int wishid=Integer.parseInt(request.getParameter("id"));
		customerService.deleteFromWish(wishid);
		return new ModelAndView("redirect:/wishlist");
	}
	
	//customer add to wish-list function
	@RequestMapping(value="/addtowishlist",method=RequestMethod.GET)
	public ModelAndView AddToWishlist(@ModelAttribute Wishlist wishlist, HttpServletRequest request) {
		Customer c = (Customer) request.getSession().getAttribute("customer_session");
		wishlist.setDate(GeneralSupport.getDate());
		wishlist.setPid(Integer.parseInt(request.getParameter("id")));
		wishlist.setCname(c.getUsername());
		customerService.addToWishlist(wishlist);
		return new ModelAndView("redirect:/wishlist");
	}
	
	//go to checkout.jsp
	@RequestMapping(value="/gotopay",method=RequestMethod.GET)
	public ModelAndView CheckOut(@ModelAttribute("address")Address address,ModelAndView model, HttpServletRequest request) {
		String totalprice = request.getParameter("totalprice");
		HttpSession session = request.getSession();
		session.setAttribute("price_session", totalprice);
		model.addObject("order",new Order());
		Customer c = (Customer) request.getSession().getAttribute("customer_session");
		List<CartProduct> listCart = customerService.getCart(c.getUsername());
		List<Address> listAddress = customerService.getAddress(c.getUsername());
		session.setAttribute("cartSession", listCart);
		Map<String ,Object> map=new HashMap<String,Object>();
		map.put("listCart",listCart);
		map.put("listAddress",listAddress);
		map.put("customer", c);
		model.addObject("data",map);
		model.setViewName("checkout");
		return model;
	}
	
	//go to address detail
	@RequestMapping(value="/addressinfo",method=RequestMethod.GET)
	public ModelAndView AddressEdit(@ModelAttribute("address")Address address,ModelAndView model, HttpServletRequest request) {
		Customer c = (Customer) request.getSession().getAttribute("customer_session");
		List<Address> listAddress = customerService.getAddress(c.getUsername());
		Map<String ,Object> map=new HashMap<String,Object>();
		map.put("listAddress",listAddress);
		map.put("customer", c);
		return new ModelAndView("addressedit", "data", map);
	}
	
	//edit address detail
	@RequestMapping(value="/EditAddress",method=RequestMethod.GET)
	public ModelAndView AddressEdit(@ModelAttribute("address")Address address, HttpServletRequest request) {
		int id=Integer.parseInt(request.getParameter("id"));
		Address address1 = customerService.getAddressById(id);
		ModelAndView model = new ModelAndView("updateaddress");
		model.addObject("address",address1);
		return model;
	}
	
	//save address update
	@RequestMapping(value="/SaveAddressUpdate",method=RequestMethod.POST)
	public ModelAndView SaveAddressEdit(@ModelAttribute Address address, HttpServletRequest request) {
		Customer c = (Customer) request.getSession().getAttribute("customer_session");
		if(address.getId()==0) {
			address.setDate(GeneralSupport.getDate());
			address.setCustomer_name(c.getUsername());
			customerService.saveAddress(address);
		}else {
			address.setCustomer_name(c.getUsername());
			address.setDate(GeneralSupport.getDate());
			customerService.update(address);
		}
		return new ModelAndView("redirect:/addressinfo");
	}
	
	//add new address
	@RequestMapping(value="/AddNewAddress",method=RequestMethod.GET)
	public ModelAndView AddNewAddress(ModelAndView model,HttpServletRequest request) {
		Address address = new Address();
		model.addObject("address",address);
		model.setViewName("updateaddress");
		return model;
	}
	
	//delete address
	@RequestMapping(value="/deleteaddress",method=RequestMethod.GET)
	public ModelAndView DeleteAddress(@ModelAttribute("address") Address address,HttpServletRequest request) {
		int id=Integer.parseInt(request.getParameter("id"));
		customerService.deleteAddress(id);
		return new ModelAndView("redirect:/addressinfo");
	}
	
	//default address
	@RequestMapping(value="/defaultaddress",method=RequestMethod.GET)
	public ModelAndView DefaultAddress(@ModelAttribute("address") Address address,HttpServletRequest request) {
		int id=Integer.parseInt(request.getParameter("id"));
		customerService.defaultAddress(id);
		return new ModelAndView("redirect:/addressinfo");
	}
	
	//normal address
		@RequestMapping(value="/normaladdress",method=RequestMethod.GET)
		public ModelAndView NormalAddress(@ModelAttribute("address") Address address,HttpServletRequest request) {
			int id=Integer.parseInt(request.getParameter("id"));
			customerService.normalAddress(id);
			return new ModelAndView("redirect:/addressinfo");
		}
	
	//go to view product details
	@RequestMapping(value="/viewdetail",method=RequestMethod.GET)
	public ModelAndView ViewDetail(ModelAndView model, HttpServletRequest request) {
		int id=Integer.parseInt(request.getParameter("id"));
		Product productDetail =  customerService.getSingleProduct(id);
		String imageArray[]=productDetail.getSub_img().split(",");
		List<String> imageList=Arrays.asList(imageArray);
		model.addObject("productDetail",productDetail);
		model.addObject("imageList",imageList);
		model.setViewName("single-product");
		return model;
	}
	
	//save receiver address info
	@RequestMapping(value="/saveaddress",method=RequestMethod.POST)
	public ModelAndView SaveAddress(@ModelAttribute("address") Address address,HttpServletRequest request) {
		Customer c = (Customer) request.getSession().getAttribute("customer_session");
		address.setDate(GeneralSupport.getDate());
		address.setCustomer_name(c.getUsername());
		customerService.saveAddress(address);
		return new ModelAndView("checkout","address",address);
	}
	
	//go to account detail
	@RequestMapping(value="/accountinfo",method=RequestMethod.GET)
	public ModelAndView AccountEdit(ModelAndView model, HttpServletRequest request) {
		Customer c = (Customer) request.getSession().getAttribute("customer_session");
		Customer customer = customerService.getCustomerById(c.getId());
		model.addObject("customer",customer);
		model.setViewName("accountdetail");
		return model;
	}
	
	//edit account detail
	@RequestMapping(value="/UpdateAccount",method=RequestMethod.GET)
	public ModelAndView UpdateAccount(ModelAndView model, HttpServletRequest request) {
		Customer c = (Customer) request.getSession().getAttribute("customer_session");
		Customer customer = customerService.getCustomerById(c.getId());
		model.addObject("customer",customer);
		model.setViewName("edituser");
		return model;
	}
	
	//save account edit
	@RequestMapping(value="/SaveAccountEdit",method=RequestMethod.POST)
	public ModelAndView SaveAccountEdit(@ModelAttribute Customer customer,ModelAndView model, HttpServletRequest request) {
		Customer c = (Customer) request.getSession().getAttribute("customer_session");
		customer.setUpdateby(c.getUsername());
		customer.setUpdatedate(GeneralSupport.getDate());
		customer.setFlag(1);
		customerService.updateAccount(customer);
		return new ModelAndView("redirect:/accountinfo");
	}
	
/*	//search product
	@RequestMapping(value="/searchproduct",method=RequestMethod.POST)
	public ModelAndView SearchProduct(@ModelAttribute("product") Product product,ModelAndView model,HttpServletRequest request) {
		String content = request.getParameter("search");
		System.out.println(content);
		List<Product> product1 = customerService.searchProduct(content);
		Map<String ,Object> map=new HashMap<String,Object>();
		map.put("product", product1);
		return new ModelAndView("searchresult","data",map);
	}*/
	
	//place order
	@RequestMapping(value="/placeorder",method=RequestMethod.POST)
	public ModelAndView PlaceOrder(@ModelAttribute("order")Order ord,ModelAndView model,HttpServletRequest request,HttpSession session) {
		Customer c = (Customer) request.getSession().getAttribute("customer_session");
		String totalprice = (String) request.getSession().getAttribute("price_session");
		List<CartProduct> listCArt=(List<CartProduct>) session.getAttribute("cartSession");
		StringBuffer sb=new StringBuffer();
		for(CartProduct cp:listCArt) {
			sb.append(cp.getPname()+",");
		}
		String pname=sb.toString();
		ord.setTotal(totalprice);
		ord.setCustomer_name(c.getUsername());
		ord.setPname(pname);
		ord.setFlag(2);
		ord.setReceived(0);
		ord.setDate(GeneralSupport.getDate());
		customerService.placeOrder(ord);
		model.setViewName("orders");
		return model;
	}
	
	//get all order
	@RequestMapping(value="/orderinfo",method=RequestMethod.GET)
	public ModelAndView OrderInfo(ModelAndView model,HttpServletRequest request) {
		Customer c = (Customer) request.getSession().getAttribute("customer_session");
		List<Order> listOrder = customerService.getOrder(c.getUsername());
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("listOrder", listOrder);
		return new ModelAndView("orders","data",map);
	}
	
	//get logistic info
	@RequestMapping(value="/logisticinfo",method=RequestMethod.GET)
	public ModelAndView LogisticInfo(ModelAndView model,HttpServletRequest request) {
		Customer c = (Customer) request.getSession().getAttribute("customer_session");
		List<Logistic> listLogistic = customerService.getLogistic(c.getUsername());
		List<Order> listOrder = customerService.getApprovedOrder(c.getUsername());
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("listLogistic", listLogistic);
		map.put("listOrder", listOrder);
		return new ModelAndView("userlogistic","data",map);
	}
	
	//search product
	@RequestMapping(value="/searchproduct",method=RequestMethod.POST)
	public ModelAndView SearchProduct(ModelAndView model,HttpServletRequest request) {
		String content = request.getParameter("content");
		List<Product> product = customerService.searchProduct(content);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("product", product);
		return new ModelAndView("searchresult","data",map);
	}
	
	//sort product
	@RequestMapping(value="/sort",method=RequestMethod.POST)
	public ModelAndView SortProduct(ModelAndView model,HttpServletRequest request) {
		String sort = request.getParameter("sort");
		System.out.println(sort);
		if(sort==null||sort.equals("Position")) {
			List<Product> listProduct = customerService.getAllProducts();
			model.addObject("listProduct", listProduct);
			model.setViewName("shop");
		}else if(sort.equals("Name Ascen")) {
			List<Product> listProduct = customerService.orderByNameAZ();
			model.addObject("listProduct", listProduct);
			model.setViewName("shop");
		}else if(sort.equals("Name Decen")) {
			List<Product> listProduct = customerService.orderByNameZA();
			model.addObject("listProduct", listProduct);
			model.setViewName("shop");
		}else if(sort.equals("Price Ascen")) {
			List<Product> listProduct = customerService.orderByPriceLH();
			model.addObject("listProduct", listProduct);
			model.setViewName("shop");
		}else {
			List<Product> listProduct = customerService.orderByPriceHL();
			model.addObject("listProduct", listProduct);
			model.setViewName("shop");
		}
		return model;
	}
	
	//receive product and rate
	@RequestMapping(value="/receiveproduct",method=RequestMethod.GET)
	public ModelAndView AcceptProduct(ModelAndView model,HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		customerService.setProductReceived(id);
		Customer c = (Customer) request.getSession().getAttribute("customer_session");
		List<CartProduct> listCart = customerService.getCart(c.getUsername());
		Map<String ,Object> map=new HashMap<String,Object>();
		map.put("listCart",listCart);
		return new ModelAndView("rating-return","data",map);
	}
	
	//go to rating page
	@RequestMapping(value="/rating",method=RequestMethod.GET)
	public ModelAndView RateProduct(@ModelAttribute("remark") Remark remark,ModelAndView model,HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		Product product = customerService.getProductById(id);
		model.addObject("product",product);
		model.setViewName("rating");
		return model;
	}
	
	//send remark
	@RequestMapping(value="/SendRemarks",method=RequestMethod.POST)
	public ModelAndView SendRemark(ModelAndView model,HttpServletRequest request) {
		System.out.println("34234");
		Customer c = (Customer) request.getSession().getAttribute("customer_session");
		String pname=request.getParameter("pname");
		System.out.println(pname);
		String pimg=request.getParameter("pimg");
		String content = request.getParameter("content");
		Remark remark2 = new Remark();
		remark2.setPname(pname);
		remark2.setPimg(pimg);
		remark2.setCreatedate(GeneralSupport.getDate());
		remark2.setFlag(1);
		remark2.setRemark(content);
		remark2.setUsername(c.getUsername());
		customerService.saveRemark(remark2);
		List<Remark> remarkList = customerService.getRemark(c.getUsername());
		model.addObject("remarkList",remarkList);
		model.setViewName("usersideremark");
		return model;
	}
	
	//go to remark page
	@RequestMapping(value="/remarkinfo",method=RequestMethod.GET)
	public ModelAndView ReturnProduct(ModelAndView model,HttpServletRequest request) {
		model.setViewName("usersideremark");
		return model;
	}
	
	/*//go to return product page
	@RequestMapping(value="/receiveproduct",method=RequestMethod.GET)
	public ModelAndView ReturnProduct(ModelAndView model,HttpServletRequest request) {
		model.setViewName("return");
		return model;
	}*/
	
}
