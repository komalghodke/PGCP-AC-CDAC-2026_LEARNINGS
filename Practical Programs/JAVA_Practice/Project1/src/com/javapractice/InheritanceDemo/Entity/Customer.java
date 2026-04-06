package com.javapractice.InheritanceDemo.Entity;

public class Customer extends Person {

	private String add;
	private String type;

	public Customer() {
		System.out.println("From Customer Default Constructor...\n");
	}

	public Customer(int id, String name, String mob, String add, String type) {
		super(id, name, mob);
		this.add = add;
		this.type = type;
		System.out.println("From Customer Parameterized Constructor...\n");
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return super.toString() + "Customer [add=" + add + ", type=" + type + "]";
	}

}
