package com.javapractice.InheritanceDemo.Entity;

public class SalariedEmp extends Employee {

	private double sal;
	private double bonus;

	public SalariedEmp() {
		System.out.println("From SalariedEmp Default Constructor...\n");
	}

	public SalariedEmp(int id, String nm, String mob, String dept, String desg, double sal) {
		super(id, nm, mob, dept, desg);
		this.sal = sal;
		this.bonus = sal * 0.10;
		System.out.println("From SalariedEmp Parameterized Constructor!\n");
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal2) {
		this.sal = sal2;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return super.toString() + "SalariedEmp [sal=" + sal + ", bonus=" + bonus + "]";
	}

	@Override
	public double calculateSal() {
		System.out.println("From salariedemp calculateSal...");
		return sal + (0.10 * sal) + (0.15 * sal) - (0.08 * sal) + bonus;
	}

	public double calculateBonus(float perc) {
		bonus = sal * perc;
		return bonus;
	}

}
