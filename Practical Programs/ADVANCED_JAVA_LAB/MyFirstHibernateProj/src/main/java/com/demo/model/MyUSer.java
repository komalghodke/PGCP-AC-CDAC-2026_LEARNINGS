package com.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="myuser11")
public class MyUSer {
	@Id
	private int uid;
	@Column(nullable=false,unique=true)
	private String name;
	private String mobile;
	private String email;
	public MyUSer() {
		super();
	}
	public MyUSer(int uid, String name, String mobile, String email) {
		super();
		this.uid = uid;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MyUSer [uid=" + uid + ", name=" + name + ", mobile=" + mobile + ", email=" + email + "]";
	}
	

}
