package com.vehicleDemo.service;

import java.util.List;
import java.util.Set;

import com.vehicleDemo.dao.VehicleDao;
import com.vehicleDemo.dao.VehicleDaoImpl;
import com.vehicleDemo.model.Vehicle;

public class VehicleServiceImpl implements VehicleService {

	VehicleDao vdao = new VehicleDaoImpl();

	public VehicleServiceImpl() {
		super();
	}

	public VehicleServiceImpl(VehicleDao vdao) {
		super();
		this.vdao = vdao;
	}

	@Override
	public boolean addNewVehicle() {
		return false;
	}

	@Override
	public boolean DeleteById(int id) {
		return false;
	}

	@Override
	public boolean updatePrice(int id, double nprice) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Vehicle> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehicle> getByPrice(double p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vehicle getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehicle> getByName(String nm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehicle> sortById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehicle> sortByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehicle> sortByPrice() {
		// TODO Auto-generated method stub
		return null;
	}

}
