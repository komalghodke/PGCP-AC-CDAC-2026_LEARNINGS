package com.practice.q9.model;

/*
 * Q9. Design Java application for the following 
Design Java application for the following 
Create a class HotelRoom to store following details 
roomId, roomType, price, status 
Rooms are of 2 types 
AC Room, Non-AC Room 
For AC Room store ACType and numberOfBeds 
For Non-AC Room add fanCount and floorNumber 
Store details of rooms in an ArrayList. 
Display following menu 
a. Add new Room 
b. Remove room using roomId 
c. Update room price 
d. Book room ---- change status from available to booked 
e. Cancel booking ---- change status from booked to available 
f. Display all rooms 
g. Display rooms by type 
h. Display rooms within price range 
i. Sort rooms by price 
j. Search room by roomType 
k. Exit
 */
public abstract class HotelRoom {
	protected int roomId;
	protected String roomType;
	protected double price;
	protected String status; // Available / Booked

	public HotelRoom(int roomId, String roomType, double price, String status) {
		this.roomId = roomId;
		this.roomType = roomType;
		this.price = price;
		this.status = status;
	}

	public int getRoomId() {
		return roomId;
	}

	public String getRoomType() {
		return roomType;
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

	@Override
	public String toString() {
		return "RoomID: " + roomId + ", Type: " + roomType + ", Price: " + price + ", Status: " + status;
	}
}
