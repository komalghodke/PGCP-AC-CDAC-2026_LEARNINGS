package com.practice.q1.model;

import java.util.Objects;

public abstract class Vehicle {

	protected int vehicleId;
	protected String vehicleName;
	protected double price;
	protected String status;

	public Vehicle() {
	}

	public Vehicle(int vehicleId, String vehicleName, double price, String status) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.price = price;
		this.status = status;
	}

	@Override
    public int hashCode() { return Objects.hash(vehicleId); }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        return vehicleId == ((Vehicle)o).vehicleId;
    }

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", price=" + price + ", status="
				+ status + "]";
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
