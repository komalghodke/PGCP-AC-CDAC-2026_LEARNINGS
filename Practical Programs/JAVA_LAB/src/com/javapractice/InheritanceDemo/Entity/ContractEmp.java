package com.javapractice.InheritanceDemo.Entity;

public class ContractEmp extends Employee {

	private float hrs;
	private double charges;

	public ContractEmp() {
		System.out.println("From Contract Employee Default Constructor...\n");
	}

	public ContractEmp(int id,String nm,String mob,String dept, String desg,float hrs, double charges) {
		super(id, nm, mob, dept, desg);
		this.hrs = hrs;
		this.charges = charges;
		System.out.println("From Contract Contract Employee Parameterized Constructor...\n");
	}

	public float getHrs() {
		return hrs;
	}

	public void setHrs(float hrs) {
		this.hrs = hrs;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	@Override
	public String toString() {
		return super.toString() + "ContractEmployee [hrs=" + hrs + ", charges=" + charges + "]";
	}

	@Override
	public double calculateSal() {
		System.out.println("from ContractEmployee calculateSal");
		return hrs*charges;
	}
}
