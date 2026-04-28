package com.practice.q5.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import com.practice.q5.model.ElectronicProduct;
import com.practice.q5.model.GroceryProduct;
import com.practice.q5.model.Product;

public class ProductService {
	private HashMap<Integer, Product> products = new HashMap<>();

	public void addProduct(Product p) {
		products.put(p.getProductId(), p);
	}

	public void removeProduct(int id) {
		products.remove(id);
	}

	public void updateProduct(int id, double newPrice, int newQty) {
		Product p = products.get(id);
		if (p != null) {
			p.setPrice(newPrice);
			p.setQuantity(newQty);
		}
	}

	public void markUnavailable(int id) {
		Product p = products.get(id);
		if (p != null)
			p.setStatus("Unavailable");
	}

	public void purchaseByTypeAndPrice(String type, double minPrice, double maxPrice) {
		for (Product p : products.values()) {
			if (type.equalsIgnoreCase("Electronic") && p instanceof ElectronicProduct && p.getPrice() >= minPrice
					&& p.getPrice() <= maxPrice) {
				System.out.println("Purchased: " + p);
			} else if (type.equalsIgnoreCase("Grocery") && p instanceof GroceryProduct && p.getPrice() >= minPrice
					&& p.getPrice() <= maxPrice) {
				System.out.println("Purchased: " + p);
			}
		}
	}

	public void displayAll() {
		for (Product p : products.values())
			System.out.println(p);
	}

	public void displayByType(String type) {
		for (Product p : products.values()) {
			if (type.equalsIgnoreCase("Electronic") && p instanceof ElectronicProduct)
				System.out.println(p);
			else if (type.equalsIgnoreCase("Grocery") && p instanceof GroceryProduct)
				System.out.println(p);
		}
	}

	public void displayByQuantity(int maxQty) {
		for (Product p : products.values()) {
			if (p.getQuantity() < maxQty)
				System.out.println(p);
		}
	}

	public void sortByPrice() {
		List<Product> list = new ArrayList<>(products.values());
		list.sort(Comparator.comparingDouble(Product::getPrice));
		for (Product p : list)
			System.out.println(p);
	}

	public void searchByName(String name) {
		for (Product p : products.values()) {
			if (p.getProductName().equalsIgnoreCase(name))
				System.out.println(p);
		}
	}
}
