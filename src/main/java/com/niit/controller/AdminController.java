package com.niit.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Address;
import com.niit.model.Cart;
import com.niit.model.Customer;
import com.niit.model.Logistic;
import com.niit.model.Order;
import com.niit.model.Product;
import com.niit.service.AdminService;
import com.niit.supportclass.GeneralSupport;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	//go to admin.jsp page
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public ModelAndView Home(ModelAndView model) {
		return new ModelAndView("redirect:/admin");
	}
	
	
	//get all UserInfo
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public ModelAndView GetAllUserInfo(ModelAndView model) {
		List<Customer> customerList = adminService.getAllUser();
		Map<String ,Object> map=new HashMap<String,Object>();
		map.put("customerList",customerList);
		return new ModelAndView("usermanage", "data", map);
	}
	
	//get all Product Info
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public ModelAndView GetAllProductInfo(@ModelAttribute("product")Product product,ModelAndView model) {
		List<Product> productList = adminService.getAllProduct();
		Map<String ,Object> map=new HashMap<String,Object>();
		map.put("productList",productList);
		return new ModelAndView("productmanage", "data", map);
	}
	  
	//delete user from UserModel
	@RequestMapping(value="/deleteuser",method=RequestMethod.GET)
	public ModelAndView DeleteUser(ModelAndView model,HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		adminService.deleteUser(id);
		return new ModelAndView("redirect:/user");
	}
	
	//delete product from ProductModel
	@RequestMapping(value="/deleteproduct",method=RequestMethod.GET)
	public ModelAndView DeleteProduct(ModelAndView model,HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		adminService.deleteProduct(id);
		return new ModelAndView("redirect:/product");
	}
	
	//edit user
	@RequestMapping(value="/edituser",method=RequestMethod.GET)
	public ModelAndView EditUser(@ModelAttribute("customer") Customer c,HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		Customer customer = adminService.getUser(id);
		return new ModelAndView("edituser","customer",customer);
	}
	
	//block user
	@RequestMapping(value="/blockuser",method=RequestMethod.GET)
	public ModelAndView BlockUser(@ModelAttribute("customer") Customer c,ModelAndView model,HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		adminService.block(id);
		return new ModelAndView("redirect:/user");
	}
	
	//active user
	@RequestMapping(value="/activeuser",method=RequestMethod.GET)
	public ModelAndView ActiveUser(@ModelAttribute("customer") Customer c,HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		adminService.active(id);
		return new ModelAndView("redirect:/user");
	}
	
	//edit product
	@RequestMapping(value="/editproduct",method=RequestMethod.GET)
	public ModelAndView EditProduct(@ModelAttribute("product") Product product,ModelAndView model,HttpServletRequest request) {
		int id=Integer.parseInt(request.getParameter("id"));
		Product product1=adminService.getProductById(id);
		model.addObject("product",product1);
		model.setViewName("productedit");
		return model;
	}
	
	//save product update
	@RequestMapping(value="/SaveProductEdit",method=RequestMethod.POST)
	public ModelAndView SaveProductEdit(@ModelAttribute("product") Product product,ModelAndView model,HttpServletRequest request) {
		if(product.getId()==0) {
			adminService.addProduct(product);
		}else {
			adminService.updateProduct(product);
		}
		return new ModelAndView("redirect:/product");
	}
	
	//add new product
	@RequestMapping(value="/AddNewProduct",method=RequestMethod.GET)
	public ModelAndView AddNewProduct(@ModelAttribute Product product,ModelAndView model,HttpServletRequest request) {
		product.setDate(GeneralSupport.getDate());
		model.setViewName("productedit");
		return model;
	}
	
	//go to order management.jsp page
	@RequestMapping(value="/ordermanage",method=RequestMethod.GET)
	public ModelAndView GoOrderManage(ModelAndView model,HttpServletRequest request) {
		List<Order> listOrder = adminService.getAllOrder();
		model.addObject("listOrder",listOrder);
		model.setViewName("ordermanagepage");
		return model;
	}
	
	//delete order 
	@RequestMapping(value="/deleteorder",method=RequestMethod.GET)
	public ModelAndView DeleteOrder(@ModelAttribute("order") Order order,HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		adminService.deleteorder(id);
		return new ModelAndView("redirect:/ordermanage");
	}
	
	//approve order 
	@RequestMapping(value="/approveorder",method=RequestMethod.GET)
	public ModelAndView ApproveOrder(@ModelAttribute("order") Order order,HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		adminService.approve(id);
		return new ModelAndView("redirect:/ordermanage");
	}
	
	//approve order 
	@RequestMapping(value="/rejectorder",method=RequestMethod.GET)
	public ModelAndView RejectOrder(@ModelAttribute("order") Order order,HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		adminService.reject(id);
		return new ModelAndView("redirect:/ordermanage");
	}
	
	//go to logistic.jsp page
	@RequestMapping(value="/logistic",method=RequestMethod.GET)
	public ModelAndView RejectOrder(ModelAndView model,HttpServletRequest request) {
		int flag=1;
		List<Cart> cartList = adminService.getAllItems();
		List<Address> addressList = adminService.getAllAddress();
		List<Order> listOrder = adminService.getAllOrderByFlag(flag);
		model.addObject("listOrder",listOrder);
		model.addObject("cartList",cartList);
		model.addObject("addressList", addressList);
		model.setViewName("logisticmanagepage");
		return model;
	}
	
	//go to set logistic
	@RequestMapping(value="/sendpackage",method=RequestMethod.GET)
	public ModelAndView SetLogistic(@ModelAttribute("logistic") Logistic logistic,ModelAndView model,HttpServletRequest request) {
		String username=request.getParameter("name");
		List<Address> addressList = adminService.getAllAddress(username);
		model.addObject("addressList",addressList);
		model.setViewName("setlogisticpage");
		return model;
	}
	
	//save logistic
	@RequestMapping(value="/savelogistic",method=RequestMethod.POST)
	public ModelAndView SaveLogistic(@ModelAttribute("logistic") Logistic logistic,ModelAndView model,HttpServletRequest request) {
		String username=request.getParameter("customer");
		System.out.println(username);
		String location = request.getParameter("location");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String street = request.getParameter("street");
		String receiver = request.getParameter("receiver");
		StringBuffer add1 = new StringBuffer(city);
		StringBuffer add2 = new StringBuffer(state);
		StringBuffer add3 = new StringBuffer(street);
		add1.append(","+add2+",");
		add1.append(add3);
		String wholeaddress=add1.toString();
		List<Address> addressList = adminService.getAllAddress(username);
		logistic.setCustomername(username);
		logistic.setCreatedate(GeneralSupport.getDate());
		logistic.setCurrentlocation(location);
		logistic.setTelephone(phone);
		logistic.setReceivername(receiver);
		logistic.setDestination(wholeaddress);
		model.addObject("addresslist",addressList);
		adminService.saveLogistic(logistic);
		return new ModelAndView("redirect:/UpdateLogistic");
	}
	
	//update logistic
	@RequestMapping(value="/UpdateLogistic",method=RequestMethod.GET)
	public ModelAndView UpdateLogistic(@ModelAttribute("logistic") Logistic logistic,ModelAndView model,HttpServletRequest request) {
		List<Logistic> logisticList = adminService.getLogistic();
		model.addObject("logisticList", logisticList);
		model.setViewName("updatelogisticpage");
		return model;
	}
	
	//edit logistic
	
	@RequestMapping(value="/editlogistic",method=RequestMethod.GET)
	public ModelAndView EditLogistic(@ModelAttribute("logistic") Logistic logistic,ModelAndView model,HttpServletRequest request) {
		int id=Integer.parseInt(request.getParameter("id"));
		Logistic logistic2=adminService.getLogisticById(id);
		model.addObject("logistic", logistic2);
		model.setViewName("logisticpage");
		return model;
	}
	
	
	//SaveLogisticEdit
	@RequestMapping(value="/SaveLogisticEdit",method=RequestMethod.POST)
	public ModelAndView SaveLogisticEdit(@ModelAttribute("logistic") Logistic logistic,ModelAndView model,HttpServletRequest request) {
		logistic.setUpdatedate(GeneralSupport.getDate());
		adminService.saveLogisticEdit(logistic);
		return new ModelAndView("redirect:/UpdateLogistic");
	}
	
	
}
