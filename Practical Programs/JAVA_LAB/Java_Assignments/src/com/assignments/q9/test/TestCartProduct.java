package com.assignments.q9.test;

import java.util.Scanner;

import com.assignments.q9.model.Product;
import com.assignments.q9.service.CartService;

/*
TestCartProduct class
Main driver with menu:
1. Buy Products
2. Send the delivery of cart
3. Exit
*/

public class TestCartProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CartService service = new CartService();

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Buy Products");
			System.out.println("2. Send the delivery of cart");
			System.out.println("3. Exit");
			System.out.print("Enter choice: ");
			int ch = sc.nextInt();
			sc.nextLine();

			switch (ch) {
			case 1:
				System.out.print("Enter username: ");
				String uname = sc.nextLine();
				System.out.println("Available Products:");
				for (Product p : Product.productList) {
					System.out.println(p);
				}
				System.out.print("Enter product ID: ");
				int pid = sc.nextInt();
				System.out.print("Enter quantity: ");
				int qty = sc.nextInt();
				sc.nextLine();
				service.buyProduct(uname, pid, qty);
				break;

			case 2:
				service.displayUsers();
				System.out.print("Enter username: ");
				String user = sc.nextLine();
				service.sendDelivery(user);
				break;

			case 3:
				System.out.println("Exiting...");
				return;
			}
		}
	}
}
