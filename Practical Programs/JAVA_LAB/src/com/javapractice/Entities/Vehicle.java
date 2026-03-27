package com.javapractice.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
	private static int count;
	static {
		count=0;
	}
	
	private String vid;
	private String vname, vehicleType, color;
	String dummy = "test";
	private Date mfd;

	private String generateVid(String stringvname) {
		count++;
		return "VID_"+count+"_"+vname.substring(0,5);
	}
	
	public Vehicle() {
		vname = "dummy";
		vehicleType = "dummy";
		color = "dummy";
		vid = generateVid("vname");
		mfd = null;
	}

	public Vehicle(String vnm, String vtype, String clr, Date mfd) {
		vname = vnm;
		vehicleType = vtype;
		color = clr;
		vid = generateVid(vname);
		this.mfd = new Date();
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
	
	public Date getMfd() {
		return mfd;
	}

	public void setMfd(Date mfd) {
		this.mfd = mfd;
	}
	
	public String toString() {
		SimpleDateFormat sdate = new SimpleDateFormat("dd/mm/yyyy");
		String d = sdate.format(mfd);
		return "Vehicle ID: " + vid + "\nVehicle Name: "+ vname +"\nManufactured Date: "+ d+"\nVehicle Type: " + vehicleType + "\nVehicle Color: " + color;
		
	}
}
