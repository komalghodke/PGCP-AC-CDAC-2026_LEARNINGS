package com.assignments.q4.productAssig;

//Step 3: NonPerishableProduct subclass
class NonPerishableProduct extends Product {
	String category;

	public NonPerishableProduct(String name, String mfgDate, double price, String category) {
		super(name, "NonPerishable", mfgDate, price);
		this.category = category;
	}

	@Override
	public double calculateTax() {
		return (0.15 * price) + 100;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Category: " + category + ", Tax: " + calculateTax());
	}
}