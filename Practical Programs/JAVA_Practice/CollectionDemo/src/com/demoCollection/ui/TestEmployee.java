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
			System.out.println("1. add new employee\n 2. delete by id\n 3. update salary\n 4. find by id");
			System.out.println("5. display all\n 6. display by name\n 7. calculate net sal\n 8. calculate bonus\n");
			System.out.println("9. sort by id\n 10. sort by name\n 11. sort by sal\n 12 exit\n Enter your Choice:");
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
				System.out.println("Enter id: ");
				int id = sc.nextInt();
				boolean status = eservice.deleteById(id);
				if (status) {
					System.out.println("Deleted successfully : ");
				} else {
					System.out.println("not deleted");
				}

			}

			case 3 -> {
				System.out.println("Enter id:");
				int id = sc.nextInt();
				System.out.println("Enter new salary: ");
				double s = sc.nextDouble();
				boolean status = eservice.updateById(id, s);
				if (status) {
					System.out.println("Updated successfully");
				} else {
					System.out.println("not found");
				}
			}

			case 4 -> {
				System.out.println("Enter id to search: ");
				int id = sc.nextInt();
				Employee e = eservice.getById(id);
				if (e != null) {
					System.out.println(e);
				} else {
					System.out.println("Not found");
				}
			}

			case 5 -> {
				List<Employee> lst = eservice.getAll();
				// java 1.6
				// listiterators are iterators using which we can navigate in both direction

				/*
				 * Iterator<Employee> it=lst.iterator(); while(it.hasNext()) { Employee
				 * e=it.next(); if(e.getPname().equals(name)) { it.remove(); }
				 * System.out.println(e); }
				 */

				// java 1.7
				// foreach loop is only for navigation, it is readonly loop,
				// we cannot add object or delete object from the list, because it will change
				// its length
				/*
				 * for(Employee e:lst) { //10 System.out.println(e); }
				 */

				// java 1.8
				lst.forEach(System.out::println);
			}

			case 6 -> {
				System.out.println("Enter name: ");
				String nm = sc.next();
				List<Employee> lst = eservice.getByName(nm);
				if (lst.isEmpty()) {
					System.out.println("No employees found with name: " + nm);
				} else {
					lst.forEach(System.out::println);
				}
			}

			case 7 -> {
				System.out.println("Enter Id: ");
				int id = sc.nextInt();
				double netSal = eservice.calcSalary(id);
				if (netSal == -1) {
					System.out.println("Employee not found");
				} else {
					System.out.println("Salary for Emp " + id + " is: " + netSal);
				}
			}

			case 8 -> {
				System.out.println("Enter Id: ");
				int id = sc.nextInt();
				System.out.println("Enter bonus percentage: ");
				float perc = sc.nextFloat();
				double bonus = eservice.calcBonus(id, perc);
				System.out.println("Bonus for Emp " + id + " is: " + bonus);
			}

			case 9 -> {
				List<Employee> lst = eservice.sortById();
				lst.forEach(System.out::println);
			}

			case 10 -> {
				List<Employee> lst = eservice.sortByName();
				lst.forEach(System.out::println);
			}

			case 11 -> {
				List<Employee> lst = eservice.sortBySalary();
				lst.forEach(System.out::println);
			}

			case 12 -> {
				sc.close();
				System.out.println("Thank you for visiting...........");
			}

			default -> {
				System.out.println("Wrong choice");
			}
			}

		} while (choice != 12);
	}

}
