package com.practice.q5;

public class Product {
	int productId;
	String productName;
	double price;
	int quantity;
	String status;

	public Product(int productId, String productName, double price, int quantity, String status) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.status = status;
	}

	public String toString() {
		return productId + " " + productName + " " + price + " " + quantity + " " + status;
	}
}
