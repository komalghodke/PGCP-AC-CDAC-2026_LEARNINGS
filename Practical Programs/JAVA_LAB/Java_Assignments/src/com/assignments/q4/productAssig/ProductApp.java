package com.assignments.q4.productAssig;

public class ProductApp {
	public static void main(String[] args) {
		Product p1 = new PerishableProduct("Milk", "2026-04-01", "2026-04-07", 50);
		Product p2 = new NonPerishableProduct("Chair", "2026-03-15", 2000, "Furniture");

		System.out.println("---- Products ----");
		p1.display();
		p2.display();
	}
}
