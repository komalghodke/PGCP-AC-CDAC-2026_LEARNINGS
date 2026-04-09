package com.vehicleDemo.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.vehicleDemo.model.Vehicle;

public interface VehicleDao {

	boolean addNewVehicle(Vehicle vehicle);

	boolean DeleteById(int id);

	boolean updatePrice(int id, double nprice);

	List<Vehicle> getAll();

	List<Vehicle> getByPrice(double p);

	Vehicle getById(int id);

	List<Vehicle> getByName(String nm);

	Map<Integer, Vehicle> sortById();

	List<Vehicle> sortByName();

	List<Vehicle> sortByPrice();
}
