package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addressmodel")
public class Address {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		
		@Column
		private int flag;
		
		@Column
		private String receiver_name;
		
		@Column
		private String city;
		
		@Column
		private String state;
		
		@Column
		private String street;
		
		@Column
		private String phone;
		
		@Column
		private String customer_name;
		
		@Column
		private String date;
		
		public Address() {
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getReceiver_name() {
			return receiver_name;
		}

		public void setReceiver_name(String receiver_name) {
			this.receiver_name = receiver_name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getCustomer_name() {
			return customer_name;
		}

		public void setCustomer_name(String customer_name) {
			this.customer_name = customer_name;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public int getFlag() {
			return flag;
		}

		public void setFlag(int flag) {
			this.flag = flag;
		}
		

}
