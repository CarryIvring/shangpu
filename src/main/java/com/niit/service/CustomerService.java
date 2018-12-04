package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.niit.dao.CustomerDAO;
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


@Service
@Transactional
public class CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	
	public void addCustomer(Customer customer) {
		customerDAO.addCustomer(customer);
	}

	public int login(Customer customer) {
		int i=customerDAO.login(customer);
		return i;
	}

	public Customer getCustomer(Customer customer) {
		return customerDAO.getCustomer(customer);
	}

	public List<Product> getAllProducts() {
		return customerDAO.getAllProducts();
	}

	public void addToCart(Cart cart) {
		customerDAO.addToCart(cart);
	}

	public List<CartProduct> getCart(String cname) {
		return customerDAO.getCart(cname);
	}

	public void addToWishlist(Wishlist wishlist) {
		customerDAO.addToWishlist(wishlist);
	}

	public List<Wishproduct> getWish(String username) {
		return customerDAO.getWish(username);
	}

	public void deleteFromCart(int cartid) {
		customerDAO.deleteFromCart(cartid);
	}

	public void deleteFromWish(int wishid) {
		customerDAO.deleteFromWish(wishid);
	}

	public Product getSingleProduct(Integer id) {
		Product model = customerDAO.getSingleProduct(id);
		return model;
		
	}

	public void saveAddress(Address address) {
		customerDAO.saveAddress(address);
	}

	public List<Address> getAddress(String username) {
		return customerDAO.getAddress(username);
	}

	public Customer getSelfInfo(String username) {
		return customerDAO.getSelfInfo(username);
	}

	public List<Product> searchProduct(String content) {
		return customerDAO.searchProduct(content);
	}

	public void deleteAddress(Integer id) {
		customerDAO.deleteAddress(id);
	}

	public void placeOrder(Order order) {
		customerDAO.placeOrder(order);
	}

	public List<Order> getOrder(String username) {
		return customerDAO.getOrder(username);
	}

	public Address getAddressById(int id) {
		return customerDAO.getAddressById(id);
	}

	public void update(Address address) {
		customerDAO.update(address);
	}


	public Customer getCustomerById(int id) {
		return customerDAO.getCustomerById(id);
	}

	public void updateAccount(Customer customer) {
		customerDAO.updateAccount(customer);
	}

	public void defaultAddress(int id) {
		customerDAO.defaultAddress(id);
	}

	public void normalAddress(int id) {
		customerDAO.normalAddress(id);
	}

	public List<Logistic> getLogistic(String username) {
		// TODO Auto-generated method stub
		return customerDAO.getLogistic(username);
	}

	public List<Product> orderByNameAZ() {
		// TODO Auto-generated method stub
		return customerDAO.orderNameAZ();
	}
	
	public List<Product> orderByNameZA() {
		// TODO Auto-generated method stub
		return customerDAO.orderNameZA();
	}
	
	public List<Product> orderByPriceHL() {
		// TODO Auto-generated method stub
		return customerDAO.orderPriceHL();
	}

	public List<Product> orderByPriceLH() {
		// TODO Auto-generated method stub
		return customerDAO.orderPriceLH();
	}

	public void setProductReceived(int id) {
		// TODO Auto-generated method stub
		customerDAO.setProductReceived(id);
	}

	public List<Order> getApprovedOrder(String username) {
		// TODO Auto-generated method stub
		return customerDAO.getApprovedOrder(username);
	}

	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return customerDAO.getProductById(id);
	}

	public void saveRemark(Remark remark) {
		// TODO Auto-generated method stub
		customerDAO.saveRemark(remark);
	}

	public List<Remark> getRemark(String username) {
		// TODO Auto-generated method stub
		return customerDAO.getRemark(username);
	}

	

}
