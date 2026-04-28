package com.practice.q9.ui;

import java.util.Scanner;

import com.practice.q9.model.ACRoom;
import com.practice.q9.model.NonACRoom;
import com.practice.q9.service.RoomService;

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
public class HotelApp {
	public static void main(String[] args) {
		RoomService service = new RoomService();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("a. Add new Room");
			System.out.println("b. Remove room using roomId");
			System.out.println("c. Update room price");
			System.out.println("d. Book room");
			System.out.println("e. Cancel booking");
			System.out.println("f. Display all rooms");
			System.out.println("g. Display rooms by type");
			System.out.println("h. Display rooms within price range");
			System.out.println("i. Sort rooms by price");
			System.out.println("j. Search room by roomType");
			System.out.println("k. Exit");
			System.out.print("Enter choice: ");
			String choice = sc.next();

			switch (choice) {
			case "a":
				System.out.print("Type (AC/Non-AC): ");
				String type = sc.next();
				System.out.print("ID: ");
				int id = sc.nextInt();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				if (type.equalsIgnoreCase("AC")) {
					System.out.print("AC Type: ");
					String acType = sc.next();
					System.out.print("Beds: ");
					int beds = sc.nextInt();
					service.addRoom(new ACRoom(id, price, "Available", acType, beds));
				} else {
					System.out.print("Fan Count: ");
					int fans = sc.nextInt();
					System.out.print("Floor Number: ");
					int floor = sc.nextInt();
					service.addRoom(new NonACRoom(id, price, "Available", fans, floor));
				}
				break;
			case "b":
				System.out.print("ID: ");
				service.removeRoom(sc.nextInt());
				break;
			case "c":
				System.out.print("ID: ");
				int uid = sc.nextInt();
				System.out.print("New Price: ");
				service.updatePrice(uid, sc.nextDouble());
				break;
			case "d":
				System.out.print("ID: ");
				service.bookRoom(sc.nextInt());
				break;
			case "e":
				System.out.print("ID: ");
				service.cancelBooking(sc.nextInt());
				break;
			case "f":
				service.displayAll();
				break;
			case "g":
				System.out.print("Type (AC/Non-AC): ");
				service.displayByType(sc.next());
				break;
			case "h":
				System.out.print("Min Price: ");
				double min = sc.nextDouble();
				System.out.print("Max Price: ");
				double max = sc.nextDouble();
				service.displayByPriceRange(min, max);
				break;
			case "i":
				service.sortByPrice();
				break;
			case "j":
				System.out.print("Room Type (AC/Non-AC): ");
				service.searchByType(sc.next());
				break;
			case "k":
				System.out.println("Exiting...");
				System.exit(0);
			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
