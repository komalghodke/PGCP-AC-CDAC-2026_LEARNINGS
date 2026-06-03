package com.demo.beans;

public class MyUser {

	private String uname;
	private String role;

	public MyUser() {
		super();
	}

	public MyUser(String uname, String role) {
		super();
		this.uname = uname;
		this.role = role;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "MyUser [uname=" + uname + ", role=" + role + "]";
	}
}
