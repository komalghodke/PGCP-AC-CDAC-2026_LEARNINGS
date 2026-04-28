package com.practice.q7.model;

public abstract class Employee implements Comparable<Employee> {
	protected int empId;
	protected String empName;
	protected double salary;
	protected String department;
	protected String status; // Working / Resigned

	public Employee(int empId, String empName, double salary, String department, String status) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.department = department;
		this.status = status;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int compareTo(Employee other) {
		return Double.compare(this.salary, other.salary);
	}

	@Override
	public String toString() {
		return "ID: " + empId + ", Name: " + empName + ", Salary: " + salary + ", Dept: " + department + ", Status: "
				+ status;
	}
}
