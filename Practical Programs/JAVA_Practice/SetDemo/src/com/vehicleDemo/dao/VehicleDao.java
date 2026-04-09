package com.vehicleDemo.dao;

import java.util.List;
import java.util.Set;

import com.vehicleDemo.model.Vehicle;

public interface VehicleDao {

	boolean save(Vehicle vehicle);

	Set<Vehicle> getAll();

	Vehicle getById(int id);

	boolean removeById(int id);

	boolean updatePrice(int id, double nprice);

	List<Vehicle> getByPrice(double p);

	List<Vehicle> sortByPrice();

	List<Vehicle> sortByName();

	List<Vehicle> sortById();

	List<Vehicle> sortByDate();
}
