package com.practice.q9;

class ACRoom extends HotelRoom {
	String ACType;
	int numberOfBeds;

	public ACRoom(int id, String type, double price, String status, String ACType, int beds) {
		super(id, type, price, status);
		this.ACType = ACType;
		this.numberOfBeds = beds;
	}
}
