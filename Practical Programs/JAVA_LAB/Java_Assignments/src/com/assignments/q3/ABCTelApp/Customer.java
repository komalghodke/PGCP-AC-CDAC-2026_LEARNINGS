package com.assignments.q3.ABCTelApp;

/*
Customer base class
Stores custid, name, email, credit class, discounts, plan assigned.
Id is auto-generated.
*/
public abstract class Customer {
	private static int counter = 1;
	protected int custId;
	protected String name, email, creditClass, plan;
	protected double discount;

	public Customer(String name, String email, String creditClass, double discount, String plan) {
		this.custId = counter++;
		this.name = name;
		this.email = email;
		this.creditClass = creditClass;
		this.discount = discount;
		this.plan = plan;
	}

	public abstract void display();
}
