package com.practice.q9.service;

import java.util.ArrayList;
import java.util.Comparator;

import com.practice.q9.model.HotelRoom;

public class RoomService {
	private ArrayList<HotelRoom> rooms = new ArrayList<>();

	public void addRoom(HotelRoom r) {
		rooms.add(r);
	}

	public void removeRoom(int id) {
		rooms.removeIf(r -> r.getRoomId() == id);
	}

	public void updatePrice(int id, double newPrice) {
		for (HotelRoom r : rooms) {
			if (r.getRoomId() == id) {
				r.setPrice(newPrice);
				break;
			}
		}
	}

	public void bookRoom(int id) {
		for (HotelRoom r : rooms) {
			if (r.getRoomId() == id && r.getStatus().equalsIgnoreCase("Available")) {
				r.setStatus("Booked");
				break;
			}
		}
	}

	public void cancelBooking(int id) {
		for (HotelRoom r : rooms) {
			if (r.getRoomId() == id && r.getStatus().equalsIgnoreCase("Booked")) {
				r.setStatus("Available");
				break;
			}
		}
	}

	public void displayAll() {
		for (HotelRoom r : rooms)
			System.out.println(r);
	}

	public void displayByType(String type) {
		for (HotelRoom r : rooms) {
			if (r.getRoomType().equalsIgnoreCase(type))
				System.out.println(r);
		}
	}

	public void displayByPriceRange(double min, double max) {
		for (HotelRoom r : rooms) {
			if (r.getPrice() >= min && r.getPrice() <= max)
				System.out.println(r);
		}
	}

	public void sortByPrice() {
		rooms.sort(Comparator.comparingDouble(HotelRoom::getPrice));
		displayAll();
	}

	public void searchByType(String type) {
		for (HotelRoom r : rooms) {
			if (r.getRoomType().equalsIgnoreCase(type))
				System.out.println(r);
		}
	}
}
