package com.demoCollection.model;

public class SalariedEmp extends Employee {

	private double sal;
	private double bonus;

	public SalariedEmp() {
		System.out.println("in salariedemp default constructor");
	}

	public SalariedEmp(int id, String nm, String m, String dept, String desg, double sal) {
		super(id, nm, m, dept, desg);
		this.sal = sal;
		this.bonus = sal * 0.10;
	}

	public SalariedEmp(int id) {
		super(id);
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return super.toString()+ "SalariedEmp [sal=" + sal + ", bonus=" + bonus + "]";
	}

	@Override
	public double calculateSal() {
		System.out.println("in salariedemp calcculatesal");
		return sal + 0.10 * sal + 0.15 * sal - 0.08 * sal + bonus;
	}

	public double calculateBonus(float perc) {
		bonus = sal * perc;
		return bonus;
	}

}
