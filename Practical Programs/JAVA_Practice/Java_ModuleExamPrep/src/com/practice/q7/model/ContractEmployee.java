package com.practice.q7.model;

public class ContractEmployee extends Employee {
	private int contractDuration;
	private String agencyName;

	public ContractEmployee(int id, String name, double salary, String dept, String status, int contractDuration,
			String agencyName) {
		super(id, name, salary, dept, status);
		this.contractDuration = contractDuration;
		this.agencyName = agencyName;
	}

	@Override
	public String toString() {
		return super.toString() + ", Contract: " + contractDuration + " months, Agency: " + agencyName;
	}
}
