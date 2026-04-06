package com.demoCollection.ui;

import java.util.List;
import java.util.Scanner;

import com.demoCollection.model.Employee;
import com.demoCollection.service.EmployeeService;
import com.demoCollection.service.EmployeeServiceImpl;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService eservice = new EmployeeServiceImpl();
		int choice = 0;
		do {
			System.out.println("1. add new employee\n2. delete by id\n 3. update salary\n4. find by id");
			System.out.println("5. display all\n6. display by name\n7. calculate net sal\n8. calculate bonus\n");
			System.out.println("9. sort by id\n10. sort by name\n11. sort by sal\n12 exit\n choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1 -> {
				System.out.println("1. Salaried\n 2. Contract \n 3. Vendor\n choice:");
				int ch = sc.nextInt();
				boolean status = eservice.addNewEmployee(ch);
				if (status) {
					System.out.println("added successfully");
				} else {
					System.out.println("not added ");
				}
			}
			case 2 -> {
			}
			case 3 -> {
			}
			case 4 -> {
				System.out.println("enetr id to search");
				int id = sc.nextInt();
				Employee e = eservice.getById(id);
				if (e != null) {
					System.out.println(e);
				} else {
					System.out.println("not found");
				}
			}
			case 5 -> {
				List<Employee> lst = eservice.getAll();
				lst.forEach(System.out::println);
			}
			case 6 -> {
			}
			case 7 -> {
			}
			case 8 -> {
			}
			case 9 -> {
			}
			case 10 -> {
			}
			case 11 -> {
			}
			case 12 -> {
				sc.close();
				System.out.println("Thank you for visiting...........");
			}
			default -> {
				System.out.println("wrong choice");
			}
			}

		} while (choice != 12);
	}

}
