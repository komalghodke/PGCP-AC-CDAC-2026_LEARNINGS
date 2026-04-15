package com.assignments.q15;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String pname;
    int qty;
    double price;

    public Product(int id, String pname, int qty, double price) {
        this.id = id;
        this.pname = pname;
        this.qty = qty;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + ":" + pname + ":" + qty + ":" + price;
    }
}
