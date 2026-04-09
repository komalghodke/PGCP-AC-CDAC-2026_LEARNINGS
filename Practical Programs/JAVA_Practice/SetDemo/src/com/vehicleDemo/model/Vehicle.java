package com.vehicleDemo.model;

import java.time.LocalDate;
import java.util.Objects;

public class Vehicle {
	private int vid;
	private String vname;
	private double price;
	private String model;
	private LocalDate mfgdate;

	public Vehicle() {
		super();
	}

	public Vehicle(int vid, String vname, double price, String model, LocalDate mfgdate) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.price = price;
		this.model = model;
		this.mfgdate = mfgdate;
	}

	public Vehicle(int vid) {
		super();
		this.vid = vid;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(vid);
	}

	@Override
	public boolean equals(Object obj) {
		Vehicle other = (Vehicle) obj;
		System.out.println("in vehicle equals Method " + this.vid + "------" + other.vid);
		return vid == other.vid;// && Objects.equals(vname, other.vname);
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public LocalDate getMfgdate() {
		return mfgdate;
	}

	public void setMfgdate(LocalDate mfgdate) {
		this.mfgdate = mfgdate;
	}

	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vname=" + vname + ", price=" + price + ", model=" + model + ", mfgdate="
				+ mfgdate + "]";
	}
}
