package com.practice.q1;

public class Vehicle {
	int vehicleId;
	String vehicleName;
	double price;
	String status;
	public Vehicle(int vehicleId, String vehicleName, double price, String status) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.price = price;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", price=" + price + ", status="
				+ status + "]";
	}

}
