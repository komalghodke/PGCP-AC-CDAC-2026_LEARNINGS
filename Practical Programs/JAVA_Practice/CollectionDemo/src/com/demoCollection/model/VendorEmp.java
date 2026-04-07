package com.demoCollection.model;

public class VendorEmp extends Employee{
	    private int noOfEmp;
	    private double charges;
	    private double bonus;

	    public VendorEmp() {
	        super();
	    }

	    public VendorEmp(int id, String nm, String mob, String dept, String desg, int noOfEmp, double charges) {
	        super(id, nm, mob, dept, desg);
	        this.noOfEmp = noOfEmp;
	        this.charges = charges;
	    }

	    public int getNoOfEmp() {
	        return noOfEmp;
	    }

	    public void setNoOfEmp(int noOfEmp) {
	        this.noOfEmp = noOfEmp;
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
	        System.out.println("in vendoremp calculateSal");
	        return noOfEmp * charges;
	    }

	    public double calculateBonus(float perc) {
	        bonus = noOfEmp * charges * perc;
	        return bonus;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + 
	               " VendorEmp [noOfEmp=" + noOfEmp + ", charges=" + charges + ", bonus=" + bonus + "]";
	    }

}
