package com.assignments.q3.ABCTelApp;

/*
Vendor class
Stores vendorid, name, email, phone number, list of products supplied.
Id is auto-generated.
*/
import java.util.List;

public class Vendor {
	private static int counter = 1;
	private int vendorId;
	private String name, email, phone;
	private List<String> products;

	public Vendor(String name, String email, String phone, List<String> products) {
		this.vendorId = counter++;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.products = products;
	}

	public void display() {
		System.out.println("Vendor ID: " + vendorId + ", Name: " + name + ", Email: " + email + ", Phone: " + phone
				+ ", Products: " + products);
	}
}
