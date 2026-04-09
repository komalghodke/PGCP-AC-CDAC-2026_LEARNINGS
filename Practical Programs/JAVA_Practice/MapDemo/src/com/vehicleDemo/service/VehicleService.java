package com.vehicleDemo.service;

import java.util.List;
import java.util.Set;

import com.vehicleDemo.model.Vehicle;

public interface VehicleService {

	boolean addNewVehicle();

	boolean DeleteById(int id);

	boolean updatePrice(int id, double nprice);

	Set<Vehicle> getAll();

	List<Vehicle> getByPrice(double p);

	Vehicle getById(int id);

	List<Vehicle> getByName(String nm);

	List<Vehicle> sortById();

	List<Vehicle> sortByName();

	List<Vehicle> sortByPrice();

}
