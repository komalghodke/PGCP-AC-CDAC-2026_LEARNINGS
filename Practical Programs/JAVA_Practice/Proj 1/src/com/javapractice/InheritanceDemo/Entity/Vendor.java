package com.javapractice.InheritanceDemo.Entity;

public class Vendor extends Employee {
	private int totalEmp;
	private double charges;

	public Vendor() {
		System.out.println("From Vendor Default Constructor...\n");
	}

	public Vendor(int id, String nm, String mob, String dept, String desg, int totalEmp, double charges) {
		super(id, nm, mob, dept, desg);
		this.totalEmp = totalEmp;
		this.charges = charges;
		System.out.println("From Vendor Parameterized Constructor...\n");
	}

	public int getTotalEmp() {
		return totalEmp;
	}

	public void setTotalEmp(int totalEmp) {
		this.totalEmp = totalEmp;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	@Override
	public String toString() {
		return super.toString() + "Vendor [totalEmp=" + totalEmp + ", charges=" + charges + "]";
	}

	@Override
	public double calculateSal() {
		System.out.println("From Vendor calculateSal...");
		return totalEmp*charges;
	}
}
