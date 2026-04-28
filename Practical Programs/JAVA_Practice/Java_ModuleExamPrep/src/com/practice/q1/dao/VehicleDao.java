package com.practice.q1.dao;

import java.util.Set;

import com.practice.q1.model.Vehicle;

public interface VehicleDao {
	boolean addVehicle(Vehicle v);

	boolean removeVehicle(int id);

	Set<Vehicle> getAllVehicles();
}