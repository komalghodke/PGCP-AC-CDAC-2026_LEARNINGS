package com.practice.q13.model;

public abstract class Flight {
	private int flightId;
	private String flightName;
	private int capacity;
	private double fare;
	private String status; // "Available" or "Booked"

	public Flight(int flightId, String flightName, int capacity, double fare, String status) {
		this.flightId = flightId;
		this.flightName = flightName;
		this.capacity = capacity;
		this.fare = fare;
		this.status = status;
	}

	// Getters and Setters
	public int getFlightId() {
		return flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "FlightId: " + flightId + ", Name: " + flightName + ", Capacity: " + capacity + ", Fare: " + fare
				+ ", Status: " + status;
	}
}
