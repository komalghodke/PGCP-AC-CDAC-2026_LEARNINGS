package com.vehicleDemo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.vehicleDemo.dao.VehicleDao;
import com.vehicleDemo.model.Vehicle;

public class VehicleDaoImpl implements VehicleDao {

	static Set<Vehicle> vset;

	static {
		vset = new HashSet<>();
		vset.add(new Vehicle(12, "Activa", 80000, "l1", LocalDate.of(2023, 11, 23)));
		vset.add(new Vehicle(13, "Santro", 1000000, "sports", LocalDate.of(2068, 11, 23)));
		vset.add(new Vehicle(14, "I10", 1500000, "Asta", LocalDate.of(2000, 11, 23)));
	}

	@Override
	public boolean save(Vehicle vehicle) {
		return vset.add(vehicle);
	}

	@Override
	public Set<Vehicle> getAll() {
		return vset;
	}

	@Override
	public Vehicle getById(int id) {
		Optional<Vehicle> op = vset.stream().filter(v -> v.getVid() == id).findFirst();
		return op.orElse(null);
	}

	@Override
	public boolean removeById(int id) {
		return vset.remove(new Vehicle(id));
	}

	@Override
	public boolean updatePrice(int id, double nprice) {
		Vehicle v = getById(id);
		if (v != null) {
			v.setPrice(nprice);
			return true;
		}
		return false;
	}

	@Override
	public List<Vehicle> getByPrice(double p) {
		List<Vehicle> vlst = vset.stream().filter(v -> v.getPrice() > p).collect(Collectors.toList());
		return vlst.size() > 0 ? vlst : null;
	}

	@Override
	public List<Vehicle> sortByPrice() {
		List<Vehicle> lst = new ArrayList<>();
		Comparator<Vehicle> vc = (v1, v2) -> {
			System.out.println("in price comparator " + v1.getPrice() + "-------" + v2.getPrice());
			return (int) (v1.getPrice() - v2.getPrice());
		};

		for (Vehicle v : vset) {
			lst.add(v);
		}
		lst.sort(vc);
		return lst;
	}

	@Override
	public List<Vehicle> sortByName() {
		Comparator<Vehicle> cv = (o1, o2) -> {
			System.out.println("in name comparator " + o1.getVname() + "-------" + o2.getVname());
			return o1.getVname().compareTo(o2.getVname());
		};
		List<Vehicle> lst = new ArrayList<>();
		for (Vehicle v : vset) {
			lst.add(v);
		}
		lst.sort(cv);
		return lst;
	}

	@Override
	public List<Vehicle> sortById() {
		Comparator<Vehicle> cv = (o1, o2) -> {
			System.out.println("in Id comparator " + o1.getVid() + "-------" + o2.getVid());
			return o1.getVid() - o2.getVid();
		};
		List<Vehicle> lst = new ArrayList<>();
		for (Vehicle v : vset) {
			lst.add(v);
		}
		lst.sort(cv);
		return lst;
	}

	@Override
	public List<Vehicle> sortByDate() {
		Comparator<Vehicle> cv = (o1, o2) -> {
			System.out.println("in Date comparator " + o1.getMfgdate() + "-------" + o2.getMfgdate());
			return o1.getMfgdate().compareTo(o2.getMfgdate());
		};
		List<Vehicle> lst = new ArrayList<>();
		for (Vehicle v : vset) {
			lst.add(v);
		}
		lst.sort(cv);
		return lst;
	}

}
