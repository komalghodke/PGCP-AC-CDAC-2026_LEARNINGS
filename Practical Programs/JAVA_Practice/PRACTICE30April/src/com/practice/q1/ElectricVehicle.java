package com.practice.q1;

public class ElectricVehicle extends Vehicle {
	int batteryCapacity;
	int chargingTime;

	public ElectricVehicle(int vehicleId, String vehicleName, double price, String status, int batteryCapacity,
			int chargingTime) {
		super(vehicleId, vehicleName, price, status);
		this.batteryCapacity = batteryCapacity;
		this.chargingTime = chargingTime;
	}

}
