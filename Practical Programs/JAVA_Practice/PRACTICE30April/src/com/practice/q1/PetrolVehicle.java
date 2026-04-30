package com.practice.q1;

public class PetrolVehicle extends Vehicle {
	String fuelType;
	int mileage;
	public PetrolVehicle(int vehicleId, String vehicleName, double price, String status, String fuelType, int mileage) {
		super(vehicleId, vehicleName, price, status);
		this.fuelType = fuelType;
		this.mileage = mileage;
	}
}
