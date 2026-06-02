package com.demo.beans;

import java.util.List;

public class Customer {
	private int cid;
	private String cname;
	private List<String> addrlst;
	private List<Product> orderlst;
	public Customer() {
		super();
	}
	public Customer(int cid, String cname, List<String> addrlst, List<Product> orderlst) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.addrlst = addrlst;
		this.orderlst = orderlst;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<String> getAddrlst() {
		return addrlst;
	}
	public void setAddrlst(List<String> addrlst) {
		this.addrlst = addrlst;
	}
	public List<Product> getOrderlst() {
		return orderlst;
	}
	public void setOrderlst(List<Product> orderlst) {
		this.orderlst = orderlst;
	}
	@Override
	public String toString() {
		return "Custormer [cid=" + cid + ", cname=" + cname + ", addrlst=" + addrlst + ", orderlst=" + orderlst + "]";
	}
	
	

}
