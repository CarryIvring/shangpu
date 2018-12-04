package com.niit.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ordermodel")
public class Order {
	

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		
		@Column
		private int received;
		
		@Column
		private int flag;
		
		@Column
		private String pname;
		
		@Column
		private String note;
		
		@Column
		private String customer_name;
		
		@Column
		private String total;

		@Column
		private String date;
		
		
		
		public int getReceived() {
			return received;
		}

		public void setReceived(int received) {
			this.received = received;
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

		public String getNote() {
			return note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public String getCustomer_name() {
			return customer_name;
		}

		public void setCustomer_name(String customer_name) {
			this.customer_name = customer_name;
		}

		public String getTotal() {
			return total;
		}

		public void setTotal(String total) {
			this.total = total;
		}

		
		
		

}
