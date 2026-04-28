package com.practice.q7.model;

public class PermanentEmployee extends Employee {
	private String pfNumber;
	private String insuranceDetails;

	public PermanentEmployee(int id, String name, double salary, String dept, String status, String pfNumber,
			String insuranceDetails) {
		super(id, name, salary, dept, status);
		this.pfNumber = pfNumber;
		this.insuranceDetails = insuranceDetails;
	}

	@Override
	public String toString() {
		return super.toString() + ", PF: " + pfNumber + ", Insurance: " + insuranceDetails;
	}
}
