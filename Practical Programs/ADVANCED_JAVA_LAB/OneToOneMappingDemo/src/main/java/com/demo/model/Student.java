package com.demo.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student1")
public class Student {
	@Id
	private int sid;
	private String sname;
	private String mobile;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="addid")
	private Address addr;
	public Student() {
		super();
	}
	public Student(int sid, String sname, String mobile, Address addr) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.mobile = mobile;
		this.addr = addr;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", mobile=" + mobile + ", addr=" + addr + "]";
	}
	

}
