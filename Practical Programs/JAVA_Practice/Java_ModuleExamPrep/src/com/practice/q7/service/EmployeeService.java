package com.practice.q7.service;

import java.util.TreeSet;

import com.practice.q7.model.ContractEmployee;
import com.practice.q7.model.Employee;
import com.practice.q7.model.PermanentEmployee;

public class EmployeeService {
	private TreeSet<Employee> employees = new TreeSet<>();

	public void addEmployee(Employee e) {
		employees.add(e);
	}

	public void removeEmployee(int id) {
		employees.removeIf(e -> e.getEmpId() == id);
	}

	public void updateSalary(int id, double newSalary) {
		for (Employee e : employees) {
			if (e.getEmpId() == id) {
				e.setSalary(newSalary);
				break;
			}
		}
	}

	public void changeStatus(int id, String status) {
		for (Employee e : employees) {
			if (e.getEmpId() == id) {
				e.setStatus(status);
				break;
			}
		}
	}

	public void assignByDepartment(String dept) {
		for (Employee e : employees) {
			if (e.getDepartment().equalsIgnoreCase(dept))
				System.out.println(e);
		}
	}

	public void displayAll() {
		for (Employee e : employees)
			System.out.println(e);
	}

	public void displayByType(String type) {
		for (Employee e : employees) {
			if (type.equalsIgnoreCase("Permanent") && e instanceof PermanentEmployee)
				System.out.println(e);
			else if (type.equalsIgnoreCase("Contract") && e instanceof ContractEmployee)
				System.out.println(e);
		}
	}

	public void displayBySalary(double minSalary) {
		for (Employee e : employees) {
			if (e.getSalary() > minSalary)
				System.out.println(e);
		}
	}

	public void sortBySalary() {
		// TreeSet is already sorted by salary
		displayAll();
	}

	public void searchByName(String name) {
		for (Employee e : employees) {
			if (e.getEmpName().equalsIgnoreCase(name))
				System.out.println(e);
		}
	}
}
