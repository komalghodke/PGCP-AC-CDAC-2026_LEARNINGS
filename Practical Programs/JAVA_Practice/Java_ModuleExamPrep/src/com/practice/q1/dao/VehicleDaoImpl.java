package com.practice.q1.dao;

import java.util.HashSet;
import java.util.Set;

import com.practice.q1.model.Vehicle;

public class VehicleDaoImpl implements VehicleDao {
	private Set<Vehicle> vehicles = new HashSet<>();

	@Override
	public boolean addVehicle(Vehicle v) {
		return vehicles.add(v);
	}

	@Override
	public boolean removeVehicle(int id) {
		return vehicles.removeIf(v -> v.getVehicleId() == id);
	}

	@Override
	public Set<Vehicle> getAllVehicles() {
		return vehicles;
	}
}
