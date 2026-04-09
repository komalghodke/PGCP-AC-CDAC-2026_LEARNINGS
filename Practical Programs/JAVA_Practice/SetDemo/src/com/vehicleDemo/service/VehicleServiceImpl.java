package com.vehicleDemo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.vehicleDemo.dao.VehicleDao;
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle id: ");
		int vid = sc.nextInt();
		System.out.println("Enter Vehicle name: ");
		String vname = sc.next();
		System.out.println("Enter Price: ");
		double price = sc.nextDouble();
		System.out.println("Enter Model: ");
		String model = sc.next();
		System.out.println("Enter Date: (dd/mm/yyyy)");
		String date = sc.next();
		LocalDate ldt = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		return vdao.save(new Vehicle(vid, vname, price, model, ldt));
	}

	@Override
	public Set<Vehicle> getAll() {
		return vdao.getAll();
	}

	@Override
	public Vehicle getById(int id) {
		return vdao.getById(id);
	}

	@Override
	public boolean DeleteById(int id) {
		return vdao.removeById(id);
	}

	@Override
	public boolean updatePrice(int id, double nprice) {
		return vdao.updatePrice(id, nprice);
	}

	@Override
	public List<Vehicle> getByPrice(double p) {
		return vdao.getByPrice(p);
	}

	@Override
	public List<Vehicle> sortByPrice() {
		return vdao.sortByPrice();
	}

	@Override
	public List<Vehicle> sortByName() {
		return vdao.sortByName();
	}

	@Override
	public List<Vehicle> sortById() {
		return vdao.sortById();
	}

	@Override
	public List<Vehicle> sortByDate() {
		return vdao.sortByDate();
	}

}
