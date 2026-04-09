package com.assignments.q4.productAssig;

/*
Q. Product Assignment
Class Product:
- id, name, type (perishable/nonperishable), mfgDate
For perishable: expDate, price
For nonperishable: category (furniture, stationery, utensils), price
Function: calculateTax()
- If product is perishable → tax = 5% of price
- Otherwise → tax = 15% of price + 100
*/

abstract class Product {
    static int counter = 1;
    int id;
    String name;
    String type;
    String mfgDate;
    double price;

    public Product(String name, String type, String mfgDate, double price) {
        this.id = counter++;
        this.name = name;
        this.type = type;
        this.mfgDate = mfgDate;
        this.price = price;
    }

    public abstract double calculateTax();

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Type: " + type +
                           ", MfgDate: " + mfgDate + ", Price: " + price);
    }
}
