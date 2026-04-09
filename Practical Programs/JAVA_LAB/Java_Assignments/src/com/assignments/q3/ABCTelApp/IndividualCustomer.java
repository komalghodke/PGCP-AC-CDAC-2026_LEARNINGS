package com.assignments.q3.ABCTelApp;

/*
IndividualCustomer class
Adds phone number for individual customers.
*/
public class IndividualCustomer extends Customer {
	private String phone;

	public IndividualCustomer(String name, String email, String creditClass, double discount, String plan,
			String phone) {
		super(name, email, creditClass, discount, plan);
		this.phone = phone;
	}

	@Override
	public void display() {
		System.out.println("Customer ID: " + custId + ", Name: " + name + ", Email: " + email + ", Credit Class: "
				+ creditClass + ", Discount: " + discount + ", Plan: " + plan + ", Phone: " + phone);
	}
}
