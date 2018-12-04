package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productmodel")
public class Product {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		@Column
		private String pname;
		
		@Column
		private String img;
		
		@Column
		private String sub_img;
		
		@Column
		private double price;
		
		@Column
		private String stock;
		
		@Column
		private String describe;
		
		@Column
		private String date;
		
		@Column
		private String type;
		
		
		
		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}


		public Product() {
			
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


		public String getSub_img() {
			return sub_img;
		}


		public void setSub_img(String sub_img) {
			this.sub_img = sub_img;
		}

		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}


		public String getStock() {
			return stock;
		}


		public void setStock(String stock) {
			this.stock = stock;
		}


		public String getDescribe() {
			return describe;
		}


		public void setDescribe(String describe) {
			this.describe = describe;
		}


		public String getDate() {
			return date;
		}


		public void setDate(String date) {
			this.date = date;
		}
		
		
}
