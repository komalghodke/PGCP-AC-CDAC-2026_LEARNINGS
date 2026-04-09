package com.assignments.q3;
/*
SalariedEmployee class
Adds basic salary and calculates net salary using DA, HRA, PF.
*/
public class SalariedEmployee extends Employee {
    private double basic;

    public SalariedEmployee(String n, String m, String e, String d, String des, String doj, double b) {
        super(n,m,e,d,des,doj);
        this.basic = b;
    }

    @Override
    public double calculateSalary() {
        double da = 0.10 * basic;
        double hra = 0.15 * basic;
        double pf = 0.12 * basic;
        return basic + da + hra - pf;
    }
}
