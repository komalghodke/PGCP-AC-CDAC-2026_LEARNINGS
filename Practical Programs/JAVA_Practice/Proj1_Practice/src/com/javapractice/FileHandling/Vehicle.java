package com.javapractice.FileHandling;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vehicle implements Comparable<Vehicle>, Serializable {
	private int id;
	private double price;
	private String vname;
	// transient private String vname;
	// add transient keyword before data member, which should need to be excluded
	// from serialization
	private String model;
	private LocalDate mfdt;

	public Vehicle() {
		super();
	}

	public Vehicle(int id, String vname, double price, String model, LocalDate mfdt) {
		super();
		this.id = id;
		this.price = price;
		this.vname = vname;
		this.model = model;
		this.mfdt = mfdt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public LocalDate getMfdt() {
		return mfdt;
	}

	public void setMfdt(LocalDate mfdt) {
		this.mfdt = mfdt;
	}

	@Override
	public String toString() {
		// convert LocalDate to dd/MM/yyyy format
		String str = mfdt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return "Vehicle [id=" + id + ", price=" + price + ", vname=" + vname + ", model=" + model
				+ ", mfdt=" + str + "]";
	}

	@Override
	public int compareTo(Vehicle o) {

		return this.vname.compareTo(o.vname);
	}

}
