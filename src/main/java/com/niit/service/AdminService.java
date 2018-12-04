package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.niit.dao.AdminDAO;
import com.niit.model.Address;
import com.niit.model.Cart;
import com.niit.model.Customer;
import com.niit.model.Logistic;
import com.niit.model.Order;
import com.niit.model.Product;

@Service
@Transactional
public class AdminService {

	@Autowired
	private AdminDAO adminDAO;

	public List<Customer> getAllUser() {
		return adminDAO.getAllUser();
	}

	public List<Product> getAllProduct() {
		return adminDAO.getAllProduct();
	}

	public void deleteUser(int id) {
		adminDAO.deleteUser(id);
	}

	public void deleteProduct(int id) {
		adminDAO.deleteProduct(id);
	}

	public Customer getUser(int id) {
		return adminDAO.getUser(id);
	}

	public Product getProductById(int id) {
		return adminDAO.getProductById(id);
	}

	public void updateProduct(Product product) {
		adminDAO.updateProduct(product);
	}

	public void addProduct(Product product) {
		adminDAO.addProduct(product);
	}

	public Customer block(int id) {
		return adminDAO.block(id);
	}

	public void active(int id) {
		adminDAO.active(id);
	}

	public List<Order> getAllOrder() {
		return adminDAO.getAllOrder();
	}

	public void approve(int id) {
		adminDAO.approve(id);
	}

	public void reject(int id) {
		adminDAO.reject(id);
	}

	public void deleteorder(int id) {
		adminDAO.deleteorder(id);
	}

	public List<Cart> getAllItems() {
		return adminDAO.getAllItems();
	}

	public List<Address> getAllAddress() {
		// TODO Auto-generated method stub
		return adminDAO.getAllAddress();
	}

	public List<Order> getAllOrderByFlag(int flag) {
		// TODO Auto-generated method stub
		return adminDAO.getAllOrderByFlag(flag);
	}

	public List<Address> getAllAddress(String username) {
		// TODO Auto-generated method stub
		return adminDAO.getAllAddress(username);
	}

	public void saveLogistic(Logistic logistic) {
		adminDAO.saveLogistic(logistic);
	}

	public List<Logistic> getLogistic() {
		// TODO Auto-generated method stub
		return adminDAO.getLogistic();
	}

	public Logistic getLogisticById(int id) {
		// TODO Auto-generated method stub
		return adminDAO.getLogisticById(id);
	}

	public void saveLogisticEdit(Logistic logistic) {
		// TODO Auto-generated method stub
		adminDAO.saveLogisticEdit(logistic);
	}

	
}
