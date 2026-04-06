package com.demoCollection.service;

import java.util.List;

import com.demoCollection.model.Employee;

public interface EmployeeService {
	boolean addNewEmployee(int ch);

	List<Employee> getAll();

	Employee getById(int id);
}
