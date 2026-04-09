package com.assignments.q3.ABCTelApp;
/*
CompanyCustomer class
Adds relationship manager, credit line, extensions, list of numbers.
*/
import java.util.List;

public class CompanyCustomer extends Customer {
    private String relationshipManager;
    private double creditLine;
    private int extensions;
    private List<String> numbers;

    public CompanyCustomer(String name, String email, String creditClass,
                           double discount, String plan, String manager,
                           double creditLine, int extensions, List<String> numbers) {
        super(name, email, creditClass, discount, plan);
        this.relationshipManager = manager;
        this.creditLine = creditLine;
        this.extensions = extensions;
        this.numbers = numbers;
    }

    @Override
    public void display() {
        System.out.println("Customer ID: " + custId + ", Name: " + name +
                           ", Email: " + email + ", Credit Class: " + creditClass +
                           ", Discount: " + discount + ", Plan: " + plan +
                           ", Relationship Manager: " + relationshipManager +
                           ", Credit Line: " + creditLine + ", Extensions: " + extensions +
                           ", Numbers: " + numbers);
    }
}
