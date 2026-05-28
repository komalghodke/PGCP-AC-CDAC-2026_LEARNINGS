package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="myproduct")
public class Product {
	   @Id
        private int pid;
        private String pname;
        private int qty;
		public Product() {
			super();
		}
		public Product(int pid, String pname, int qty) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.qty = qty;
		}
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		@Override
		public String toString() {
			return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + "]";
		}
        
}
