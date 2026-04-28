package com.practice.q1.ui;

import java.util.Scanner;

import com.practice.q1.model.ElectricVehicle;
import com.practice.q1.model.PetrolVehicle;
import com.practice.q1.service.VehicleService;
import com.practice.q1.service.VehicleServiceImpl;

/* 
 * Q1. Design Java application for the following:  
Create a class Vehicle to store following details 
vehicleId, vehicleName, price, status 
Vehicles are of 2 types 
Electric Vehicle, Petrol Vehicle 
For Electric Vehicle store batteryCapacity, chargingTime 
For Petrol Vehicle add fuelType and mileage 
Store details of vehicles in a HashSet, 2 vehicles cannot have same vehicleId. 
Display following menu 
a. Add new Vehicle 
b. Remove vehicle using vehicleId 
c. Update vehicle price 
d. Sell vehicle 
e. Purchase vehicle 
f. Display all vehicles 
g. Display vehicles by type 
h. Display vehicles within price range 
i. Sort vehicles by price 
j. Search vehicle by name 
k. Exit 
 */

public class VehicleApp {
	public static void main(String[] args) {
		VehicleService service = new VehicleServiceImpl();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("a. Add new Vehicle");
			System.out.println("b. Remove vehicle using vehicleId");
			System.out.println("c. Update vehicle price");
			System.out.println("d. Sell vehicle");
			System.out.println("e. Purchase vehicle");
			System.out.println("f. Display all vehicles");
			System.out.println("g. Sort vehicles by price");
			System.out.println("h. Exit");
			System.out.print("Enter choice: ");
			String choice = sc.next();

			switch (choice) {
			case "a":
				System.out.print("Type (Electric/Petrol): ");
				String type = sc.next();
				System.out.print("ID: ");
				int id = sc.nextInt();
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				if (type.equalsIgnoreCase("E")) {
					System.out.print("Battery Capacity: ");
					int bc = sc.nextInt();
					System.out.print("Charging Time: ");
					int ct = sc.nextInt();
					service.addVehicle(new ElectricVehicle(id, name, price, "Available", bc, ct));
				} else {
					System.out.print("Fuel Type: ");
					String fuel = sc.next();
					System.out.print("Mileage: ");
					double mil = sc.nextDouble();
					service.addVehicle(new PetrolVehicle(id, name, price, "Available", fuel, mil));
				}
				break;
			case "b":
				System.out.print("Enter ID to remove: ");
				service.removeVehicle(sc.nextInt());
				break;
			case "c":
				System.out.print("Enter ID: ");
				int uid = sc.nextInt();
				System.out.print("Enter new Price: ");
				service.updatePrice(uid, sc.nextDouble());
				break;
			case "d":
				System.out.print("Enter ID: ");
				service.sellVehicle(sc.nextInt());
				break;
			case "e":
				System.out.print("Enter ID: ");
				service.purchaseVehicle(sc.nextInt());
				break;
			case "f":
				service.getAllVehicles().forEach(System.out::println);
				break;
			case "g":
				service.sortByPrice().forEach(System.out::println);
				break;
			case "h":
				System.exit(0);
			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
