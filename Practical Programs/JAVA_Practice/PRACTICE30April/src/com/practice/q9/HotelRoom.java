package com.practice.q9;

class HotelRoom {
	int roomId;
	String roomType;
	double price;
	String status;

	public HotelRoom(int roomId, String roomType, double price, String status) {
		this.roomId = roomId;
		this.roomType = roomType;
		this.price = price;
		this.status = status;
	}

	public String toString() {
		return roomId + " " + roomType + " " + price + " " + status;
	}
}
