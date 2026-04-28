package com.practice.q13.ui;

import java.util.Scanner;

import com.practice.q13.Dao.FlightDAOImpl;
import com.practice.q13.Service.FlightService;
import com.practice.q13.Service.FlightServiceImpl;
import com.practice.q13.model.DomesticFlight;
import com.practice.q13.model.InternationalFlight;

/*
 * Q13. Design Java application for the following  
Design Java application for the following 
Create a class Flight to store following details 
flightId, flightName, capacity, fare, status 
Flights are of 2 types 
Domestic, International 
For Domestic store stateName and terminalNumber 
For International add countryName and passportRequired 
Store details of flights in an ArrayList. 
Display following menu 
a. Add new Flight 
b. Remove flight using flightId 
c. Update flight fare 
d. Book flight ---- change status from available to booked 
e. Cancel booking ---- change status from booked to available 
f. Display all flights 
g. Display flights by type 
h. Display flights within fare range 
i. Sort flights by fare 
j. Search flight by name 
k. Exit
 */
public class FlightApp {
	private static Scanner sc = new Scanner(System.in);
	private static FlightService flightService = new FlightServiceImpl(new FlightDAOImpl());

	public static void main(String[] args) {
		while (true) {
			System.out.println("\n--- Flight Menu ---");
			System.out.println("a. Add new Flight");
			System.out.println("b. Remove flight");
			System.out.println("c. Update fare");
			System.out.println("d. Book flight");
			System.out.println("e. Cancel booking");
			System.out.println("f. Display all flights");
			System.out.println("g. Exit");
			System.out.print("Choose option: ");
			char choice = sc.next().charAt(0);

			switch (choice) {
			case 'a':
				addFlight();
				break;
			case 'b':
				removeFlight();
				break;
			case 'c':
				updateFare();
				break;
			case 'd':
				bookFlight();
				break;
			case 'e':
				cancelBooking();
				break;
			case 'f':
				displayAll();
				break;
			case 'g':
				System.exit(0);
			default:
				System.out.println("Invalid choice!");
			}
		}
	}

	private static void addFlight() {
		System.out.print("Enter type (Domestic/International): ");
		String type = sc.next();
		System.out.print("FlightId: ");
		int id = sc.nextInt();
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Capacity: ");
		int cap = sc.nextInt();
		System.out.print("Fare: ");
		double fare = sc.nextDouble();
		String status = "Available";

		if (type.equalsIgnoreCase("Domestic")) {
			System.out.print("State: ");
			String state = sc.next();
			System.out.print("Terminal: ");
			int terminal = sc.nextInt();
			flightService.addFlight(new DomesticFlight(id, name, cap, fare, status, state, terminal));
		} else {
			System.out.print("Country: ");
			String country = sc.next();
			System.out.print("Passport Required (true/false): ");
			boolean passport = sc.nextBoolean();
			flightService.addFlight(new InternationalFlight(id, name, cap, fare, status, country, passport));
		}
	}

	private static void removeFlight() {
		System.out.print("Enter flightId: ");
		int id = sc.nextInt();
		flightService.cancelBooking(id);
	}

	private static void updateFare() {
		System.out.print("Enter flightId: ");
		int id = sc.nextInt();
		System.out.print("Enter new fare: ");
		double fare = sc.nextDouble();
		flightService.updateFare(id, fare);
	}

	private static void bookFlight() {
		System.out.print("Enter flightId: ");
		int id = sc.nextInt();
		flightService.bookFlight(id);
	}

	private static void cancelBooking() {
		System.out.print("Enter flightId: ");
		int id = sc.nextInt();
		flightService.cancelBooking(id);
	}

	private static void displayAll() {
		flightService.getAllFlights().forEach(System.out::println);
	}
}
