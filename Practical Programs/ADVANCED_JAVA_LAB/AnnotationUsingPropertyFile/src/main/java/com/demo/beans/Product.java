package com.demo.beans;

public class Product {
       private int pid;
       private String pname;
	   public Product() {
		super();
	   }
	   public Product(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
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
	   @Override
	   public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + "]";
	   }
       
}
