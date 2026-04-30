package com.practice.q1;

import java.util.HashSet;
import java.util.Scanner;

public class VehicelApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Vehicle> set = new HashSet<>();
		while (true) {
			System.out.println("1 Add 2 Remove 3 Update 4 Sell 5 Purchase 6 Display 7 Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("1 Electric 2 Petrol");
				int type = sc.nextInt();

				System.out.println("Enter id name price status");
				int id = sc.nextInt();
				String name = sc.next();
				double price = sc.nextDouble();
				String status = sc.next();

				if (type == 1) {
					System.out.println("Enter batteryCapacity chargingTime");
					int b = sc.nextInt();
					int c = sc.nextInt();
					set.add(new ElectricVehicle(id, name, price, status, b, c));
				} else {
					System.out.println("Enter fuelType mileage");
					String f = sc.next();
					int m = sc.nextInt();
					set.add(new PetrolVehicle(id, name, price, status, f, m));
				}
				break;

			case 2:
				System.out.println("Enter a id to remove vehicle: ");
				int rid = sc.nextInt();
				set.removeIf(v -> v.vehicleId == rid);
				break;

			case 3:
				System.out.println("Enter a id to update vehicle: ");
				int uid = sc.nextInt();
				System.out.println("Enter new price to update: ");
				double np = sc.nextDouble();

				for (Vehicle v : set) {
					if (v.vehicleId == uid) {
						v.price = np;
					}
				}
				break;

			case 4:
				System.out.println("Enter a id: ");
				int sid = sc.nextInt();

				for (Vehicle v : set) {
					if (v.vehicleId == sid) {
						v.status = "sold";
					}
				}
				break;

			case 5:
				System.out.println("Enter a id: ");
				int pid = sc.nextInt();

				for (Vehicle v : set) {
					if (v.vehicleId == pid) {
						v.status = "available";
					}
				}
				break;

			case 6:
				System.out.println("------------------- Vehicle--------------------");
				for (Vehicle v : set) {
					System.out.println(v);
				}
				break;
				
			case 7:
			    sc.close();
				System.out.println("GOOD BYE");
			    System.exit(0);
			    break;
			    
			default: {
				System.out.println("INVALID CHOICE!!!!");
			}
			}
		}

	}

}
