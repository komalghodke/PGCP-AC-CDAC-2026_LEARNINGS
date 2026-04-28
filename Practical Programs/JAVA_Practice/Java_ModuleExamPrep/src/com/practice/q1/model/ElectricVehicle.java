package com.practice.q1.model;

public class ElectricVehicle extends Vehicle {
    private int batteryCapacity;
    private int chargingTime;

    public ElectricVehicle(int id, String name, double price, String status,
                           int batteryCapacity, int chargingTime) {
        super(id, name, price, status);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Battery: " + batteryCapacity + "kWh, Charging: " + chargingTime + "h";
    }
}
