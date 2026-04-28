package com.practice.q1.model;

public class PetrolVehicle extends Vehicle {
    private String fuelType;
    private double mileage;

    public PetrolVehicle(int id, String name, double price, String status,
                         String fuelType, double mileage) {
        super(id, name, price, status);
        this.fuelType = fuelType;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Fuel: " + fuelType + ", Mileage: " + mileage + " km/l";
    }
}

