package com.javapractice.InheritanceDemo;

import java.util.Scanner;

import com.javapractice.InheritanceDemo.Entity.Employee;
import com.javapractice.InheritanceDemo.Service.EmployeeService;

public class TestEmployeeArray {

	public static void main(String[] args) {

		int choice = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1.Add new employee \n 2. Delete employee by id\n 3. Search employee by id\n"
					+ "4. Update employee salary \n 5. Display All\n 6. Display by name\n 7. Calculate net salary\n "
					+ "8. Exit\n Enter your Choice: ");

			choice = sc.nextInt();
			switch (choice) {
			case 1 -> {
				System.out.println("1. SalariedEmp \n2. ContractEmp \n3.Vendor");
				int ch = sc.nextInt();
				boolean status = EmployeeService.addNewEmployee(ch);
				if (status) {
					System.out.println("Employee is Successfully added!");
				} else {
					System.out.println("Employee Not added");
				}
			}
			case 2->{
				System.out.println("Enter id: ");
				int id=sc.nextInt();
				boolean status=EmployeeService.deleteById(id);
				if(status) {
					System.out.println("Employee deleted Successfully");
				}else {
					System.out.println("Employee not found");
				}
			}
			case 3->{
				System.out.println("Enter id: ");
				int id=sc.nextInt();
				Employee e=EmployeeService.findById(id);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("Employee not found");
				}
			}
			case 4->{
				System.out.println("Enter id: ");
				int id=sc.nextInt();
				System.out.println("Enter new salary");
				double sal=sc.nextDouble();
				boolean status=EmployeeService.updateById(id,sal);
				if(status) {
					System.out.println("Employee salary updated successfully");
				}else {
					System.out.println("Employee Not found");
				}
			}
			case 5->{
				Employee[] emparr=EmployeeService.getAll();
				for(Employee e:emparr) {
					if(e!=null) {
						  System.out.println(e);
					}else {
						break;
					}
				}
			}
			case 6->{
				System.out.println("Enter Name: ");
				String nm=sc.next();
				Employee[] arr=EmployeeService.findByName(nm);
				if(arr!=null){
					for(Employee e:arr) {
						if(e!=null) {
							  System.out.println(e);
						}else {
							break;
						}
					}
				}
				else
					System.out.println("Name not found");
			}
			case 7->{
				System.out.println("Enter id: ");
				int id=sc.nextInt();
				double netsal=EmployeeService.findNetSalary(id);
				if(netsal!=-1) {
					  System.out.println("Net salary for: "+id+ " : " +netsal);
				}else {
					System.out.println("Employee not found");
				}
			}
			case 8->{
				sc.close();
				System.out.println("Thank you for visiting...............");
			}
			default->{
				  System.out.println("Wrong choice");
			}
			}
		} while (choice != 8);
	}

}
