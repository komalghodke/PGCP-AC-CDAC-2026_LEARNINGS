package com.assignments.q3;

/*
Member class
Stores id, name, mobile, email, membership type, amount paid.
Id is auto-generated.
*/
public class Member {
    private static int counter = 1;
    private int id;
    private String name, mobile, email, type;
    private double amountPaid;

    public Member(String n, String m, String e, String t, double amt) {
        this.id = counter++;
        this.name = n;
        this.mobile = m;
        this.email = e;
        this.type = t;
        this.amountPaid = amt;
    }

    public void display() {
        System.out.println("Member ID: " + id + ", Name: " + name +
                           ", Type: " + type + ", Paid: " + amountPaid);
    }
}

