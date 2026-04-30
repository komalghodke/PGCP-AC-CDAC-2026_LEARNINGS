package com.practice.q7;

class ContractEmployee extends Employee {
	int contractDuration;
	String agencyName;

	public ContractEmployee(int id, String name, double salary, String dept, String status, int contractDuration,
			String agencyName) {
		super(id, name, salary, dept, status);
		this.contractDuration = contractDuration;
		this.agencyName = agencyName;
	}
}
