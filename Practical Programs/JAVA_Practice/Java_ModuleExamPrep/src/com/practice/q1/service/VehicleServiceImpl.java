package com.practice.q1.service;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.practice.q1.dao.VehicleDao;
import com.practice.q1.dao.VehicleDaoImpl;
import com.practice.q1.model.Vehicle;

public class VehicleServiceImpl implements VehicleService {
    private VehicleDao dao = new VehicleDaoImpl();

    @Override
    public boolean addVehicle(Vehicle v) { 
        return dao.addVehicle(v); 
    }

    @Override
    public boolean removeVehicle(int id) { 
        return dao.removeVehicle(id); 
    }

    @Override
    public void updatePrice(int id, double price) {
        dao.getAllVehicles().stream()
            .filter(v -> v.getVehicleId() == id)
            .forEach(v -> v.setPrice(price));
    }

    @Override
    public void sellVehicle(int id) {
        dao.getAllVehicles().stream()
            .filter(v -> v.getVehicleId() == id)
            .forEach(v -> v.setStatus("Sold"));
    }

    @Override
    public void purchaseVehicle(int id) {
        dao.getAllVehicles().stream()
            .filter(v -> v.getVehicleId() == id)
            .forEach(v -> v.setStatus("Available"));
    }

    @Override
    public Set<Vehicle> getAllVehicles() { 
        return dao.getAllVehicles(); 
    }

    @Override
    public Set<Vehicle> sortByPrice() {
        return dao.getAllVehicles().stream()
                  .sorted(Comparator.comparingDouble(Vehicle::getPrice))
                  .collect(Collectors.toCollection(HashSet::new));
    }
}