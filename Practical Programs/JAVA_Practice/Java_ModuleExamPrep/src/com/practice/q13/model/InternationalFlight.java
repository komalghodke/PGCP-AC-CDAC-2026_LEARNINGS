package com.practice.q13.model;

public class InternationalFlight extends Flight {
	private String countryName;
	private boolean passportRequired;

	public InternationalFlight(int flightId, String flightName, int capacity, double fare, String status,
			String countryName, boolean passportRequired) {
		super(flightId, flightName, capacity, fare, status);
		this.countryName = countryName;
		this.passportRequired = passportRequired;
	}

	public String getCountryName() {
		return countryName;
	}

	public boolean isPassportRequired() {
		return passportRequired;
	}

	@Override
	public String toString() {
		return super.toString() + ", Country: " + countryName + ", Passport Required: " + passportRequired;
	}
}
