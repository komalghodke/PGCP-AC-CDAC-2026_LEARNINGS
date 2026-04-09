package com.vehicleDemo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.vehicleDemo.dao.VehicleDao;
import com.vehicleDemo.dao.VehicleDaoImpl;
import com.vehicleDemo.model.Vehicle;

public class VehicleServiceImpl implements VehicleService {

	VehicleDao vdao;

	public VehicleServiceImpl() {
		super();
		vdao = new VehicleDaoImpl();
	}

	public VehicleServiceImpl(VehicleDao vdao) {
		super();
		this.vdao = vdao;
	}

	@Override
	public boolean addNewVehicle() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Vehicle id: ");
		int id=sc.nextInt();
		System.out.println("Enter Vehicle Name: ");
		String nm= sc.next();
		System.out.println("Enter Vehicle model: ");
		String model= sc.next();
		System.out.println("Enter Vehicle price: ");
		double price=sc.nextDouble();
		System.out.println("Enter the date (dd/MM/yyyy)");
		String date=sc.next();
		LocalDate ldt = LocalDate.parse(date, DateTimeFormatter.ofPattern("d/M/yyyy"));
		return vdao.addNewVehicle(new Vehicle(id,nm,price,model,ldt));
	}

	@Override
	public boolean DeleteById(int id) {
		return vdao.DeleteById(id);
	}

	@Override
	public boolean updatePrice(int id, double nprice) {
		return vdao.updatePrice(id, nprice);
	}

	@Override
	public List<Vehicle> getAll() {
		return vdao.getAll();
	}

	@Override
	public List<Vehicle> getByPrice(double p) {
		return vdao.getByPrice(p);
	}

	@Override
	public Vehicle getById(int id) {
		return vdao.getById(id);
	}

	@Override
	public List<Vehicle> getByName(String nm) {
		return vdao.getByName(nm);
	}

	@Override
	public Map<Integer, Vehicle> sortById() {
		return vdao.sortById();
	}

	@Override
	public List<Vehicle> sortByName() {
		return vdao.sortByName();
	}

	@Override
	public List<Vehicle> sortByPrice() {
		return vdao.sortByPrice();
	}

}
