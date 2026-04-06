package com.demoCollection.model;

public class ContractEmp extends Employee {

	private float hrs;
	private double charges;

	public ContractEmp() {
		super();
	}

	public ContractEmp(float hrs, String nm, String mob, String dept, String desg, double charges, double c) {
		super();
		this.hrs = hrs;
		this.charges = charges;
	}

	@Override
	public double calculateSal() {
		System.out.println("in contractemp calcculatesal");
		return hrs*charges;
	}

}
