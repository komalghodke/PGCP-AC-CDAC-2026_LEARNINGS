package com.practice.q7;

class PermanentEmployee extends Employee {
	String PFNumber;
	String insuranceDetails;

	public PermanentEmployee(int id, String name, double salary, String dept, String status, String PFNumber,
			String insuranceDetails) {
		super(id, name, salary, dept, status);
		this.PFNumber = PFNumber;
		this.insuranceDetails = insuranceDetails;
	}
}
