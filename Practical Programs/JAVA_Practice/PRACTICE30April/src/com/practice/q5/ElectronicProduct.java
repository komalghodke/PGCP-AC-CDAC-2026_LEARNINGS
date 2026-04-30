package com.practice.q5;

class ElectronicProduct extends Product {
	int warrantyPeriod;
	String brand;

	public ElectronicProduct(int id, String name, double price, int quantity, String status, int warrantyPeriod,
			String brand) {
		super(id, name, price, quantity, status);
		this.warrantyPeriod = warrantyPeriod;
		this.brand = brand;
	}
}
