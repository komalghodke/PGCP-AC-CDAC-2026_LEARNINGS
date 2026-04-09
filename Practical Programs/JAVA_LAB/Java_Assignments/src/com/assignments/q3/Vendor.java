package com.assignments.q3;

/*
Vendor class
Adds number of employees and amount.
Salary = amount + 18% GST.
*/
public class Vendor extends Employee {
    private int numEmp;
    private double amount;

    public Vendor(String n, String m, String e, String d, String des, String doj, int ne, double amt) {
        super(n,m,e,d,des,doj);
        this.numEmp = ne;
        this.amount = amt;
    }

    @Override
    public double calculateSalary() {
        return amount + amount * 0.18;
    }
}
