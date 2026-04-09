package com.assignments.q9.service;
import com.assignments.q9.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
CartService class
Manages user carts using Map<String, List<Product>>.
Key = username, Value = list of products in cart.
*/

public class CartService {
	private Map<String, List<Product>> userCarts = new HashMap<>();

	public void buyProduct(String username, int productId, int qty) {
		Product selected = null;
		for (Product p : Product.productList) {
			if (p.getId() == productId) {
				selected = new Product(p.getId(), p.getName(), p.getPrice(), qty);
				break;
			}
		}
		if (selected == null) {
			System.out.println("Invalid product ID.");
			return;
		}
		double amount = selected.getPrice() * qty;
		System.out.println("Amount: " + amount + "/-");

		userCarts.putIfAbsent(username, new ArrayList<>());
		userCarts.get(username).add(selected);
	}

	public void sendDelivery(String username) {
		if (!userCarts.containsKey(username)) {
			System.out.println("No cart found for user.");
			return;
		}
		List<Product> cart = userCarts.get(username);
		double total = 0;
		System.out.println("Bill for " + username + ":");
		for (Product p : cart) {
			double amt = p.getPrice() * p.getQty();
			total += amt;
			System.out.println(p.getName() + " x " + p.getQty() + " = " + amt);
		}
		System.out.println("Total: " + total);

		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to deliver? (y/n): ");
		String ans = sc.nextLine();
		if (ans.equalsIgnoreCase("y")) {
			System.out.println("Order delivered!");
			userCarts.remove(username);
		} else {
			System.out.println("Returning to menu...");
		}
	}

	public void displayUsers() {
		if (userCarts.isEmpty()) {
			System.out.println("No users have carts.");
		} else {
			System.out.println("Users with carts:");
			for (String user : userCarts.keySet()) {
				System.out.println(user);
			}
		}
	}
}
