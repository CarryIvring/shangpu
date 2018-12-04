package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cartmodel")
public class Cart {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		@Column
		private String customer_name;
		
		@Column
		private int product_id;
		
		@Column
		private String date;
		
		
		public Cart() {
			
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getCustomer_name() {
			return customer_name;
		}


		public void setCustomer_name(String customer_name) {
			this.customer_name = customer_name;
		}


		public int getProduct_id() {
			return product_id;
		}


		public void setProduct_id(int product_id) {
			this.product_id = product_id;
		}


		public String getDate() {
			return date;
		}


		public void setDate(String date) {
			this.date = date;
		}
		
		
		
}
