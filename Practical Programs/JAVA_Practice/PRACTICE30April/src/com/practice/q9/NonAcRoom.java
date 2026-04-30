package com.practice.q9;

class NonACRoom extends HotelRoom {
	int fanCount;
	int floorNumber;

	public NonACRoom(int id, String type, double price, String status, int fanCount, int floorNumber) {
		super(id, type, price, status);
		this.fanCount = fanCount;
		this.floorNumber = floorNumber;
	}
}
