package com.javapractice.Entities;

public class Vehicle {
	private static int count;
	static {
		count=0;
	}
	
	private String vid;
	private String vname, vehicleType, color;
	String dummy = "test";

	private String generateVid(String stringvname) {
		count++;
		return "VID_"+count+"_"+vname.substring(0,5);
	}
	
	public Vehicle() {
		vname = "dummy";
		vehicleType = "dummy";
		color = "dummy";
		vid = generateVid("vname");
	}

	public Vehicle(String vnm, String vtype, String clr) {
		vname = vnm;
		vehicleType = vtype;
		color = clr;
		vid = generateVid(vname);
	}
	
	public String getVname() {
		return vname;
	}
	
	public void setVname(String vname) {
		this.vname = vname;
	}
	
	public String getVehicleType()
	{
		return vehicleType;
	}
	
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Vehicle ID: " + vid + "\nVehicle Name: " + vname +"\nVehicle Type: " + vehicleType + "\nVehicle Color: " + color;
		
	}
}
