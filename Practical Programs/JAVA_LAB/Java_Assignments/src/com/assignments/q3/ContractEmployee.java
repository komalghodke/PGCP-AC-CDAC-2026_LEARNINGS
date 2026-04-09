package com.assignments.q3;
/*
ContractEmployee class
Adds hours worked and rate per hour.
Salary = hours * rate.
*/
public class ContractEmployee extends Employee {
    private int hours;
    private double rate;

    public ContractEmployee(String n, String m, String e, String d, String des, String doj, int h, double r) {
        super(n,m,e,d,des,doj);
        this.hours = h;
        this.rate = r;
    }

    @Override
    public double calculateSalary() {
        return hours * rate;
    }
}
