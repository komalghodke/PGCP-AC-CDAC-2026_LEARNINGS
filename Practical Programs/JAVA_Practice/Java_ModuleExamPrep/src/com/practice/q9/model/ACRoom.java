package com.practice.q9.model;

public class ACRoom extends HotelRoom {
	private String acType;
	private int numberOfBeds;

	public ACRoom(int id, double price, String status, String acType, int beds) {
		super(id, "AC", price, status);
		this.acType = acType;
		this.numberOfBeds = beds;
	}

	@Override
	public String toString() {
		return super.toString() + ", AC Type: " + acType + ", Beds: " + numberOfBeds;
	}
}
