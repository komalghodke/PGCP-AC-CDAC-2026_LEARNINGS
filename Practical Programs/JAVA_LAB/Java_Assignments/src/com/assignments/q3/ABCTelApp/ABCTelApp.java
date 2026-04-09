package com.assignments.q3.ABCTelApp;
/*
ABCTelApp class
Main driver to create vendors and customers and display their info.
*/
import java.util.*;

public class ABCTelApp {
    public static void main(String[] args) {

        Vendor v1 = new Vendor("TechSupply","tech@abc.com","9999999999",
                               Arrays.asList("Routers","Switches"));
        Vendor v2 = new Vendor("NetWorld","net@abc.com","8888888888",
                               Arrays.asList("Cables","Servers"));


        IndividualCustomer c1 = new IndividualCustomer("KG","kg@abc.com","A",10,"Prepaid","7777777777");
        CompanyCustomer c2 = new CompanyCustomer("XYZ Ltd","xyz@abc.com","B",15,"Corporate",
                                                 "Mr. abc",500000,50,
                                                 Arrays.asList("1111111111","2222222222"));

        System.out.println("---- Vendors ----");
        v1.display();
        v2.display();

        System.out.println("\n---- Customers ----");
        c1.display();
        c2.display();
    }
}