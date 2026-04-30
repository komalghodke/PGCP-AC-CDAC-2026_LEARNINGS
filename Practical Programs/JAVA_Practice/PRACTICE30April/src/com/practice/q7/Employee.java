package com.practice.q7;

class Employee implements Comparable<Employee> {
	int empId;
	String empName;
	double salary;
	String department;
	String status;

	public Employee(int empId, String empName, double salary, String department, String status) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.department = department;
		this.status = status;
	}

	public int compareTo(Employee e) {
		return Double.compare(this.salary, e.salary);
	}

	public String toString() {
		return empId + " " + empName + " " + salary + " " + department + " " + status;
	}
}
