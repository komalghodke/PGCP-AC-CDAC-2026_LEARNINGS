package com.practice.q5.ui;

import java.util.Scanner;

import com.practice.q5.model.ElectronicProduct;
import com.practice.q5.model.GroceryProduct;
import com.practice.q5.service.ProductService;

/*
 * Q5. Design Java application for the following 
Design Java application for the following 
Create a class Product to store following details 
productId, productName, price, quantity, status 
Products are of 2 types 
Electronic Product, Grocery Product 
For Electronic Product store warrantyPeriod, brand 
For Grocery Product add expiryDate and weight 
Store details of products in a HashMap where productId is the key. 
Display following menu 
a. Add new Product 
b. Remove product using productId 
c. Update product price and quantity 
d. Mark product unavailable 
e. Purchase product based on type and price range 
f. Display all products 
g. Display products by type 
h. Display products with quantity less than given value 
i. Sort products by price 
j. Search product by name 
k. Exit
 */
public class ProductApp {
	public static void main(String[] args) {
		ProductService service = new ProductService();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("a. Add new Product");
			System.out.println("b. Remove product using productId");
			System.out.println("c. Update product price and quantity");
			System.out.println("d. Mark product unavailable");
			System.out.println("e. Purchase product by type and price range");
			System.out.println("f. Display all products");
			System.out.println("g. Display products by type");
			System.out.println("h. Display products with quantity less than given value");
			System.out.println("i. Sort products by price");
			System.out.println("j. Search product by name");
			System.out.println("k. Exit");
			System.out.print("Enter choice: ");
			String choice = sc.next();

			switch (choice) {
			case "a":
				System.out.print("Type (Electronic/Grocery): ");
				String type = sc.next();
				System.out.print("ID: ");
				int id = sc.nextInt();
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				System.out.print("Quantity: ");
				int qty = sc.nextInt();
				if (type.equalsIgnoreCase("Electronic")) {
					System.out.print("Warranty (months): ");
					int w = sc.nextInt();
					System.out.print("Brand: ");
					String brand = sc.next();
					service.addProduct(new ElectronicProduct(id, name, price, qty, "Available", w, brand));
				} else {
					System.out.print("Expiry Date: ");
					String exp = sc.next();
					System.out.print("Weight (kg): ");
					double wt = sc.nextDouble();
					service.addProduct(new GroceryProduct(id, name, price, qty, "Available", exp, wt));
				}
				break;
			case "b":
				System.out.print("ID: ");
				service.removeProduct(sc.nextInt());
				break;
			case "c":
				System.out.print("ID: ");
				int uid = sc.nextInt();
				System.out.print("New Price: ");
				double np = sc.nextDouble();
				System.out.print("New Quantity: ");
				int nq = sc.nextInt();
				service.updateProduct(uid, np, nq);
				break;
			case "d":
				System.out.print("ID: ");
				service.markUnavailable(sc.nextInt());
				break;
			case "e":
				System.out.print("Type (Electronic/Grocery): ");
				String t = sc.next();
				System.out.print("Min Price: ");
				double min = sc.nextDouble();
				System.out.print("Max Price: ");
				double max = sc.nextDouble();
				service.purchaseByTypeAndPrice(t, min, max);
				break;
			case "f":
				service.displayAll();
				break;
			case "g":
				System.out.print("Type (Electronic/Grocery): ");
				service.displayByType(sc.next());
				break;
			case "h":
				System.out.print("Max Quantity: ");
				service.displayByQuantity(sc.nextInt());
				break;
			case "i":
				service.sortByPrice();
				break;
			case "j":
				System.out.print("Name: ");
				service.searchByName(sc.next());
				break;
			case "k":
				System.out.println("Exiting...");
				System.exit(0);
			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
