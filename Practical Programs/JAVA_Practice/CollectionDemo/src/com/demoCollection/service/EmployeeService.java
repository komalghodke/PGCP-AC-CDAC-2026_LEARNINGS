package com.demoCollection.service;

import java.util.List;

import com.demoCollection.model.Employee;

public interface EmployeeService {
	boolean addNewEmployee(int ch);

	List<Employee> getAll();

	Employee getById(int id);

	List<Employee> getByName(String nm);

	boolean deleteById(int id);

	boolean updateById(int id, double s);

	List<Employee> sortById();

	List<Employee> sortByName();

	List<Employee> sortBySalary();
	
	double calcSalary(int id);

	double calcBonus(int id, float perc);
}
