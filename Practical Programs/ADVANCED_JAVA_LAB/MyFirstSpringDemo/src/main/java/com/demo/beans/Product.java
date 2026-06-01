package com.demo.beans;

import java.time.LocalDate;

public class Product {
	private int pid;
    private String pname;
    private int qty;
    private double price;
    private LocalDate mfgDate;
	public Product() {
		super();
	}
	public Product(int pid, String pname, int qty, double price, LocalDate mfgDate) {
		super();
		System.out.println("in product parametrised constructor");
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.mfgDate = mfgDate;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public LocalDate getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", mfgDate=" + mfgDate
				+ "]";
	}
    
}
