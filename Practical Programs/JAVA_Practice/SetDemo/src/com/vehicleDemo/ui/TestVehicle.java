package com.vehicleDemo.ui;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.vehicleDemo.model.Vehicle;
import com.vehicleDemo.service.VehicleService;
import com.vehicleDemo.service.VehicleServiceImpl;

public class TestVehicle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		VehicleService vservice = new VehicleServiceImpl();
		do {
			System.out.println("1. Add new Vehicle\n 2. Delete vehicle\n 3. Modify vehicle Price \n"
					+ "4. Display all\n 5.Display by id\n 6.display by price\n 7. Sort by price\n"
					+ "8. Sort by name\n 9. Sort by id 10. \n Sort by Date\n 11. exit \n Enter choice :");
			choice = sc.nextInt();
			switch (choice) {
			case 1 -> {
				boolean status = vservice.addNewVehicle();
				if (status) {
					System.out.println("Vehicle Successfully Added");
				} else {
					System.out.println("Vehicle Can't be Added!");
				}
			}

			case 2 -> {
				System.out.println("Enter the Vehicle Id to delete it! ");
				int id = sc.nextInt();
				boolean status = vservice.DeleteById(id);
				if (status) {
					System.out.println("Vehicle Deleted Successfully");
				} else {
					System.out.println("Id doesn't exists so, Not Deleted!");
				}
			}

			case 3 -> {
				System.out.println("Enter the Vehicle Id! ");
				int id = sc.nextInt();

				System.out.println("Enter the New Price, to update it! ");
				double nprice = sc.nextDouble();

				boolean status = vservice.updatePrice(id, nprice);
				if (status) {
					System.out.println("Vehicle Price Updated Successfully");
				} else {
					System.out.println("Vehicle doesn't exists!");
				}

			}

			case 4 -> {
				Set<Vehicle> vs = vservice.getAll();
				vs.forEach(System.out::println);
			}

			case 5 -> {
				System.out.println("Enter Vehicle Id to search! ");
				int id = sc.nextInt();
				Vehicle v = vservice.getById(id);
				if (v != null) {
					System.out.println(v);
				} else {
					System.out.println("Vehicle with id " + id + " Don't Exists");
				}
			}

			case 6 -> {
				System.out.println("Enter the Price! ");
				double p = sc.nextDouble();
				List<Vehicle> lst = vservice.getByPrice(p);
				if (lst != null) {
					lst.forEach(System.out::println);
				} else {
					System.out.println("Vehicle with Price " + p + " Don't Exists");
				}
			}

			case 7 -> {
				List<Vehicle> vList =vservice.sortByPrice();
				vList.forEach(System.out::println);
			}

			case 8 -> {
				List<Vehicle> vlist = vservice.sortByName();
				vlist.forEach(System.out::println);
			}

			case 9 -> {
				List<Vehicle> vlist = vservice.sortById();
				vlist.forEach(System.out::println);
			}

			case 10 -> {
				List<Vehicle> vlist = vservice.sortByDate();
				vlist.forEach(System.out::println);
			}

			case 11 -> {
				sc.close();
				System.out.println("Thanks for Visiting...");
			}

			default -> {
				System.out.println("Invalid Choice, Try Again!");
			}

			}
		} while (choice != 11);
	}

}
