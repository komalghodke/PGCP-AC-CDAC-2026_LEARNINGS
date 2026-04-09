package com.assignments.q4.productAssig;

class PerishableProduct extends Product {
	String expDate;

	public PerishableProduct(String name, String mfgDate, String expDate, double price) {
		super(name, "Perishable", mfgDate, price);
		this.expDate = expDate;
	}

	@Override
	public double calculateTax() {
		return 0.05 * price;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("ExpDate: " + expDate + ", Tax: " + calculateTax());
	}
}