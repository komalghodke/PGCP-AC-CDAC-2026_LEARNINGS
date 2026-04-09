package com.assignments.q9.model;

/*
Product class
Stores id, name, price, qty.
Static block initializes 10 hardcoded products for sale.
*/

import java.util.*;

public class Product {
	private int id;
	private String name;
	private double price;
	private int qty;

	public static List<Product> productList = new ArrayList<>();

	static {
		productList.add(new Product(1, "Shoes", 3000, 50));
		productList.add(new Product(2, "Shirts", 1500, 100));
		productList.add(new Product(3, "Bags", 2500, 40));
		productList.add(new Product(4, "Jeans", 2000, 60));
		productList.add(new Product(5, "Watch", 5000, 30));
		productList.add(new Product(6, "Mobile", 15000, 20));
		productList.add(new Product(7, "Laptop", 55000, 10));
		productList.add(new Product(8, "Headphones", 2000, 25));
		productList.add(new Product(9, "Books", 500, 80));
		productList.add(new Product(10, "Table", 7000, 15));
	}

	public Product(int id, String name, double price, int qty) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return id + ". " + name + " (Price: " + price + ", Qty: " + qty + ")";
	}
}
