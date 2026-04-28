package com.practice.q5.model;

public class GroceryProduct extends Product {
	private String expiryDate;
	private double weight;

	public GroceryProduct(int id, String name, double price, int qty, String status, String expiryDate, double weight) {
		super(id, name, price, qty, status);
		this.expiryDate = expiryDate;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return super.toString() + ", Expiry: " + expiryDate + ", Weight: " + weight + "kg";
	}
}
