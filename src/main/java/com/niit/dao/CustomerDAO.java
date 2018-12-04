package com.niit.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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


@Repository
public class CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addCustomer(Customer customer) {
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
	}

	public int login(Customer customer) {
		Customer customer1 = (Customer) sessionFactory.getCurrentSession().createQuery("from Customer where username='"+customer.getUsername()+"'and password='"+customer.getPassword()+"'and flag=1").uniqueResult();
		if(null!=customer1) {
			if(customer.getUsername().equals("Chen")&&customer.getPassword().equals("123456")) {
				return 4;
			}else if(customer.getUsername().equals(customer1.getUsername())&&customer.getPassword().equals(customer1.getPassword())){
				return 1;
			}else {
				return 2;
			}
		}else {
			return 2;
		}
	}
	
	public Customer getCustomer(Customer customer) {
		Customer customer1 = (Customer) sessionFactory.getCurrentSession().createQuery("from Customer where username='"+customer.getUsername()+"'").uniqueResult();
		return customer1;
	}

	//get all products
	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}

	//add to cart function
	public void addToCart(Cart cart) {
		sessionFactory.getCurrentSession().save(cart);
	}

	//show cart product info
	@SuppressWarnings("unchecked")
	public List<CartProduct> getCart(String cname) {
		List<CartProduct> cartProducts=new ArrayList<>();
		List<Object[]> cartlist= sessionFactory.getCurrentSession().createSQLQuery("select p.pname,p.img,p.price,c.id,c.customer_name from productmodel p join cartmodel c on p.id=c.product_id where c.customer_name='"+cname+"'").list();
		for(Object[] model:cartlist) {
			CartProduct cartProduct=new CartProduct();
			cartProduct.setCid(Integer.parseInt(model[3].toString()));
			cartProduct.setPname(model[0].toString());
			cartProduct.setImg(model[1].toString());
			cartProduct.setPrice(Double.parseDouble(model[2].toString()));
			cartProduct.setCustomer_name(model[4].toString());
			cartProducts.add(cartProduct);
		}
		return cartProducts;
	}

	//add to wish-list function
	public void addToWishlist(Wishlist wishlist) {
		sessionFactory.getCurrentSession().save(wishlist);
	}

	//show wish-list info
	@SuppressWarnings("unchecked")
	public List<Wishproduct> getWish(String username) {
		List<Wishproduct> wishProducts=new ArrayList<>();
		List<Object[]> wishlist = sessionFactory.getCurrentSession().createSQLQuery("select p.id as productid,p.pname,p.img,p.price,p.stock,w.id as wishid,w.cname from productmodel p join wishmodel w on p.id=w.pid where w.cname='"+username+"'").list();
		for(Object[] model:wishlist) {
			Wishproduct wishProduct=new Wishproduct();
			wishProduct.setPid(Integer.parseInt(model[0].toString()));
			wishProduct.setPname(model[1].toString());
			wishProduct.setImg(model[2].toString());
			wishProduct.setPrice(Double.parseDouble(model[3].toString()));
			wishProduct.setStock(model[4].toString());
			wishProduct.setWid(Integer.parseInt(model[5].toString()));
			wishProduct.setCustomer_name(model[6].toString());
			wishProducts.add(wishProduct);
		}
		return wishProducts;
	}

	public void deleteFromCart(int cartid) {
		sessionFactory.getCurrentSession().createQuery("delete from Cart where id="+cartid+"").executeUpdate();
	}

	public void deleteFromWish(int wishid) {
		sessionFactory.getCurrentSession().createQuery("delete from Wishlist where id="+wishid+"").executeUpdate();
	}

	public Product getSingleProduct(Integer id) {
		Product model=(Product) sessionFactory.getCurrentSession().createQuery("from Product where id="+id+"").uniqueResult();
		return model;
	}

	public void saveAddress(Address address) {
		sessionFactory.getCurrentSession().saveOrUpdate(address);
	}

	@SuppressWarnings("unchecked")
	public List<Address> getAddress(String username) {
		return sessionFactory.getCurrentSession().createQuery("from Address where customer_name='"+username+"'").list();
	}

	public Customer getSelfInfo(String username) {
		return (Customer) sessionFactory.getCurrentSession().createQuery("from Customer where username='"+username+"'").uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public List<Product> searchProduct(String content) {
		return sessionFactory.getCurrentSession().createQuery("from Product where pname like '%"+content+"%' or type like '%"+content+"%'").list();
	}

	public void deleteAddress(Integer id) {
		sessionFactory.getCurrentSession().createQuery("delete from Address where id='"+id+"'").executeUpdate();
	}

	public void placeOrder(Order order) {
		sessionFactory.getCurrentSession().saveOrUpdate(order);
	}

	@SuppressWarnings("unchecked")
	public List<Order> getOrder(String username) {
		return sessionFactory.getCurrentSession().createQuery("from Order where customer_name='"+username+"'").list();
	}

	public Address getAddressById(int id) {
		return (Address) sessionFactory.getCurrentSession().createQuery("from Address where id='"+id+"'").uniqueResult();
	}

	public void update(Address address) {
		sessionFactory.getCurrentSession().update(address);
	}


	public Customer getCustomerById(int id) {
		return (Customer) sessionFactory.getCurrentSession().createQuery("from Customer where id='"+id+"'").uniqueResult();
	}

	public void updateAccount(Customer customer) {
		sessionFactory.getCurrentSession().update(customer);;
	}

	public void defaultAddress(int id) {
		Address add=(Address) sessionFactory.getCurrentSession().get(Address.class, id);
		add.setFlag(2);
		sessionFactory.getCurrentSession().saveOrUpdate(add);
	}

	public void normalAddress(int id) {
		Address add=(Address) sessionFactory.getCurrentSession().get(Address.class, id);
		add.setFlag(1);
		sessionFactory.getCurrentSession().saveOrUpdate(add);
	}

	@SuppressWarnings("unchecked")
	public List<Logistic> getLogistic(String username) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Logistic where customername='"+username+"'").list();
	}

	@SuppressWarnings("unchecked")
	public List<Product> orderNameAZ() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Product order by pname").list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Product> orderNameZA() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Product order by pname desc").list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Product> orderPriceHL() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Product order by price desc").list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Product> orderPriceLH() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Product order by price").list();
	}

	public void setProductReceived(int id) {
		// TODO Auto-generated method stub
		//received 1, returned 2
		Order order = (Order) sessionFactory.getCurrentSession().get(Order.class, id);
		order.setReceived(1);
		sessionFactory.getCurrentSession().update(order);
	}

	@SuppressWarnings("unchecked")
	public List<Order> getApprovedOrder(String username) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Order where customer_name='"+username+"' and flag=2").list();
	}

	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return (Product) sessionFactory.getCurrentSession().createQuery("from Product where id='"+id+"'").uniqueResult();
	}

	public void saveRemark(Remark remark) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(remark);
	}

	@SuppressWarnings("unchecked")
	public List<Remark> getRemark(String username) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Remark where username='"+username+"'").list();
	}

	

}
