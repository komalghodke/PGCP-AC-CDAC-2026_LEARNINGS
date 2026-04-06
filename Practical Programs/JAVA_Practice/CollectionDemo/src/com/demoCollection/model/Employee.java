package com.demoCollection.model;

public abstract class Employee extends Person {

	private String dept;
	private String desg;

	public Employee() {
		System.out.println("in Employee default constructor");
	}

	public Employee(int pid, String pname, String mob, String dept, String desg) {
		super(pid, pname, mob);
		this.dept = dept;
		this.desg = desg;
		System.out.println("in Employee parameterised constructor");
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
		return "Employee [dept=" + dept + ", desg=" + desg + "]";
	}

	abstract public double calculateSal();
}
