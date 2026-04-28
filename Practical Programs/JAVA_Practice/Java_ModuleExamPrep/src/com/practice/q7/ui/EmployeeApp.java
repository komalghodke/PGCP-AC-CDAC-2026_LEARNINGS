package com.practice.q7.ui;

import java.util.Scanner;

import com.practice.q7.model.ContractEmployee;
import com.practice.q7.model.PermanentEmployee;
import com.practice.q7.service.EmployeeService;

/*
 * Q7. Design Java application for the following 
Create a class Employee to store following details 
empId, empName, salary, department, status 
Employees are of 2 types 
Permanent Employee, Contract Employee 
For Permanent Employee store PFNumber, insuranceDetails 
For Contract Employee add contractDuration and agencyName 
Store details of employees in a TreeSet sorted by salary. 
Display following menu 
a. Add new Employee 
b. Remove employee using empId 
c. Update salary 
d. Change employee status (working/resigned) 
e. Assign employee based on department 
f. Display all employees 
g. Display employees by type 
h. Display employees with salary greater than given value 
i. Sort employees by salary 
j. Search employee by name 
k. Exit
 */
public class EmployeeApp {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("a. Add new Employee");
			System.out.println("b. Remove employee using empId");
			System.out.println("c. Update salary");
			System.out.println("d. Change employee status");
			System.out.println("e. Assign employee by department");
			System.out.println("f. Display all employees");
			System.out.println("g. Display employees by type");
			System.out.println("h. Display employees with salary greater than given value");
			System.out.println("i. Sort employees by salary");
			System.out.println("j. Search employee by name");
			System.out.println("k. Exit");
			System.out.print("Enter choice: ");
			String choice = sc.next();

			switch (choice) {
			case "a":
				System.out.print("Type (Permanent/Contract): ");
				String type = sc.next();
				System.out.print("ID: ");
				int id = sc.nextInt();
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Salary: ");
				double sal = sc.nextDouble();
				System.out.print("Department: ");
				String dept = sc.next();
				if (type.equalsIgnoreCase("Permanent")) {
					System.out.print("PF Number: ");
					String pf = sc.next();
					System.out.print("Insurance: ");
					String ins = sc.next();
					service.addEmployee(new PermanentEmployee(id, name, sal, dept, "Working", pf, ins));
				} else {
					System.out.print("Contract Duration (months): ");
					int dur = sc.nextInt();
					System.out.print("Agency Name: ");
					String agency = sc.next();
					service.addEmployee(new ContractEmployee(id, name, sal, dept, "Working", dur, agency));
				}
				break;
			case "b":
				System.out.print("ID: ");
				service.removeEmployee(sc.nextInt());
				break;
			case "c":
				System.out.print("ID: ");
				int uid = sc.nextInt();
				System.out.print("New Salary: ");
				service.updateSalary(uid, sc.nextDouble());
				break;
			case "d":
				System.out.print("ID: ");
				int sid = sc.nextInt();
				System.out.print("Status (Working/Resigned): ");
				service.changeStatus(sid, sc.next());
				break;
			case "e":
				System.out.print("Department: ");
				service.assignByDepartment(sc.next());
				break;
			case "f":
				service.displayAll();
				break;
			case "g":
				System.out.print("Type (Permanent/Contract): ");
				service.displayByType(sc.next());
				break;
			case "h":
				System.out.print("Min Salary: ");
				service.displayBySalary(sc.nextDouble());
				break;
			case "i":
				service.sortBySalary();
				break;
			case "j":
				System.out.print("Name: ");
				service.searchByName(sc.next());
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