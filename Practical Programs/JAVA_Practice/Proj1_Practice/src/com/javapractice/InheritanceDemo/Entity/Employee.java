package com.javapractice.InheritanceDemo.Entity;

public abstract class Employee extends Person {

	private String dept;
	private String desg;

	public Employee() {
		System.out.println("From Employee Default Constructor...\n");
	}

	public Employee(int id, String name,  String mob, String dept, String desg) {
		super(id, name, mob);
		this.dept = dept;
		this.desg = desg;
		System.out.println("From Employee Parameterized Constructor...\n");
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	@Override
	public String toString() {
		return super.toString() + "Employee [dept=" + dept + ", desg=" + desg + "]";
	}
	
	abstract public double calculateSal();
	

}
