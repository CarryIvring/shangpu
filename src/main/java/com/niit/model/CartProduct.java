package com.niit.model;

public class CartProduct {
	
	private int id,cid;
	private String pname,img,customer_name;
	private double price;
	
	
	public CartProduct() {
		
	}
	
	


	public int getCid() {
		return cid;
	}




	public void setCid(int cid) {
		this.cid = cid;
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

}
