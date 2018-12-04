package com.niit.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Address;
import com.niit.model.Cart;
import com.niit.model.Customer;
import com.niit.model.Logistic;
import com.niit.model.Order;
import com.niit.model.Product;

@Repository
public class AdminDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Customer> getAllUser() {
		return sessionFactory.getCurrentSession().createQuery("from Customer").list();
	}

	@SuppressWarnings("unchecked")
	public List<Product> getAllProduct() {
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}

	public void deleteUser(int id) {
		sessionFactory.getCurrentSession().createQuery("delete from Customer where id='"+id+"'").executeUpdate();
	}

	public void deleteProduct(int id) {
		sessionFactory.getCurrentSession().createQuery("delete from Product where id='"+id+"'").executeUpdate();
	}

	public Customer getUser(int id) {
		return (Customer) sessionFactory.getCurrentSession().get(Customer.class, id);
	}

	public Product getProductById(int id) {
		return (Product) sessionFactory.getCurrentSession().createQuery("from Product where id='"+id+"'").uniqueResult();
	}

	public void updateProduct(Product product) {
		sessionFactory.getCurrentSession().update(product);
	}

	public void addProduct(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
	}

	public Customer block(int id) {
		Customer customer=(Customer) sessionFactory.getCurrentSession().get(Customer.class, id);
		customer.setFlag(2);
		sessionFactory.getCurrentSession().update(customer);
		return null;
	}

	public void active(int id) {
		Customer customer=(Customer) sessionFactory.getCurrentSession().get(Customer.class, id);
		customer.setFlag(1);
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
	}

	@SuppressWarnings("unchecked")
	public List<Order> getAllOrder() {
		return sessionFactory.getCurrentSession().createQuery("from Order").list();
	}

	public void approve(int id) {
		Order order = (Order) sessionFactory.getCurrentSession().get(Order.class, id);
		order.setFlag(1);
		sessionFactory.getCurrentSession().saveOrUpdate(order);
	}

	public void reject(int id) {
		Order order = (Order) sessionFactory.getCurrentSession().get(Order.class, id);
		order.setFlag(3);
		sessionFactory.getCurrentSession().saveOrUpdate(order);
	}

	public void deleteorder(int id) {
		sessionFactory.getCurrentSession().createQuery("delete from Order where id='"+id+"'").executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<Cart> getAllItems() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Cart").list();
	}

	@SuppressWarnings("unchecked")
	public List<Address> getAllAddress() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Address").list();
	}

	@SuppressWarnings("unchecked")
	public List<Order> getAllOrderByFlag(int flag) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Order where flag='"+flag+"'").list();
	}

	@SuppressWarnings("unchecked")
	public List<Address> getAllAddress(String username) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Address where customer_name='"+username+"' and flag=2").list();
	}

	public void saveLogistic(Logistic logistic) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(logistic);
	}

	@SuppressWarnings("unchecked")
	public List<Logistic> getLogistic() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Logistic").list();
	}

	public Logistic getLogisticById(int id) {
		// TODO Auto-generated method stub
		return (Logistic) sessionFactory.getCurrentSession().createQuery("from Logistic where id='"+id+"'").uniqueResult();
	}

	public void saveLogisticEdit(Logistic logistic) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(logistic);
	}

	
}
