package com.practice.q5.model;

public class ElectronicProduct extends Product {
	private int warrantyPeriod;
	private String brand;

	public ElectronicProduct(int id, String name, double price, int qty, String status, int warrantyPeriod,
			String brand) {
		super(id, name, price, qty, status);
		this.warrantyPeriod = warrantyPeriod;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return super.toString() + ", Warranty: " + warrantyPeriod + " months, Brand: " + brand;
	}
}
