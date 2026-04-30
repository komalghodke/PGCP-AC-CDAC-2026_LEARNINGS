package com.practice.q5;

class GroceryProduct extends Product {
    String expiryDate;
    double weight;

    public GroceryProduct(int id, String name, double price, int quantity, String status,
                          String expiryDate, double weight) {
        super(id, name, price, quantity, status);
        this.expiryDate = expiryDate;
        this.weight = weight;
    }
}
