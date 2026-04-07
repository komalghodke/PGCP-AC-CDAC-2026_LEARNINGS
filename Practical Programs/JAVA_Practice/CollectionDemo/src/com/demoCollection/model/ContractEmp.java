package com.demoCollection.model;

public class ContractEmp extends Employee {

	private float hrs;
	private double charges;
	private double bonus;

	public ContractEmp() {
		super();
	}

	public ContractEmp(int id, String nm, String m, String dept, String desg, float hrs, double charges) {
		super(id, nm, m, dept, desg);
		this.hrs = hrs;
		this.charges = charges;
	}

	public float getHrs() {
		return hrs;
	}

	public void setHrs(float hrs) {
		this.hrs = hrs;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double calculateSal() {
		System.out.println("in contractemp calcculatesal");
		return hrs * charges;
	}

	public double calculateBonus(float perc) {
		System.out.println("in contractemp calcculatesal");
		bonus = hrs * charges * perc;
		return bonus;
	}

	@Override
	public String toString() {
		return super.toString() + "ContractEmp [hrs=" + hrs + ", charges=" + charges + ", bonus=" + bonus + "]";
	}

}
