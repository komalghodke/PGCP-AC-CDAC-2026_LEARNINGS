package com.vehicleDemo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.vehicleDemo.model.Vehicle;

public class VehicleDaoImpl implements VehicleDao {

	static Map<Integer, Vehicle> vmap;
	static {
		vmap = new HashMap<>();
		vmap.put(1, new Vehicle(9, "Vespa", 200000, "vxl", LocalDate.of(2026, 04, 9)));
		vmap.put(2, new Vehicle(12, "Vespa", 180000, "xxl", LocalDate.of(2026, 04, 23)));
		vmap.put(3, new Vehicle(1, "Jupyter", 160000, "5G", LocalDate.of(2022, 04, 7)));
		vmap.put(4, new Vehicle(2, "Royal Enfield", 160000, "Bullet", LocalDate.of(2024, 03, 18)));
	}

	@Override
	public boolean addNewVehicle(Vehicle vehicle) {
		if (!vmap.containsKey(vehicle.getVid())) {
			vmap.put(vehicle.getVid(), vehicle);
			return true;
		}
		return false;
	}

	@Override
	public boolean DeleteById(int id) {
		Vehicle v = vmap.remove(id);
		if (v != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updatePrice(int id, double nprice) {
		Vehicle v = vmap.get(id);
		if (v != null) {
			v.setPrice(nprice);
			return true;
		}
		return false;
	}

	@Override
	public List<Vehicle> getAll() {
		List<Vehicle> vlst = new ArrayList<Vehicle>();
		for (Integer k : vmap.keySet()) {
			vlst.add(vmap.get(k));
		}
		return vlst;
	}

	@Override
	public List<Vehicle> getByPrice(double p) {
		List<Vehicle> vlist = new ArrayList<>();
		for (Integer k : vmap.keySet()) {
			Vehicle v = vmap.get(k);
			if (v.getPrice() > p) {
				vlist.add(v);
			}
		}
		return vlist;
	}

	@Override
	public Vehicle getById(int id) {
		return vmap.get(id);
	}

	@Override
	public List<Vehicle> getByName(String nm) {
		List<Vehicle> vlist = new ArrayList<>();
		for (Integer k : vmap.keySet()) {
			Vehicle v = vmap.get(k);
			if (v.getVname().equals(nm)) {
				vlist.add(v);
			}

		}
		if (vlist.size() > 0) {
			return vlist;
		}
		return null;
	}
	
	@Override
	public Map<Integer, Vehicle> sortById() {
		Map<Integer, Vehicle> tm= new TreeMap<>();
		for(Map.Entry<Integer, Vehicle> entry:vmap.entrySet()) {
			tm.put(entry.getKey(), entry.getValue());
		}		
		return tm;
	}
	
	@Override
	public List<Vehicle> sortByName() {
		List<Vehicle> vlist = getAll();
		vlist.sort(null);
		return vlist;
	}

	@Override
	public List<Vehicle> sortByPrice() {
		Comparator<Vehicle> cp = (o1, o2) -> {
			return (int) (o1.getPrice() - o2.getPrice());
		};
		List<Vehicle> vlist = getAll();
		vlist.sort(cp);
		return vlist;
	}
}
