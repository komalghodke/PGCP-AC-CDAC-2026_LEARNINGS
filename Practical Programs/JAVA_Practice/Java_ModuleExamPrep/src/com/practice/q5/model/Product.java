package com.practice.q5.model;

public abstract class Product {
	protected int productId;
	protected String productName;
	protected double price;
	protected int quantity;
	protected String status; // Available / Unavailable

	public Product(int productId, String productName, double price, int quantity, String status) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.status = status;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ID: " + productId + ", Name: " + productName + ", Price: " + price + ", Qty: " + quantity + ", Status: "
				+ status;
	}
}
