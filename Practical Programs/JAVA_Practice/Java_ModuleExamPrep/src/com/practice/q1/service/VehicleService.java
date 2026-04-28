package com.practice.q1.service;

import java.util.Set;

import com.practice.q1.model.Vehicle;

public interface VehicleService {
	boolean addVehicle(Vehicle v);

	boolean removeVehicle(int id);

	void updatePrice(int id, double price);

	void sellVehicle(int id);

	void purchaseVehicle(int id);

	Set<Vehicle> getAllVehicles();

	Set<Vehicle> sortByPrice();
}
