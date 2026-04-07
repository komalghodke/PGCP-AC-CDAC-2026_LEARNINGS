package com.demoCollection.dao;

import java.util.List;

import com.demoCollection.model.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> findAll();

	Employee findById(int id);

	List<Employee> findByName(String nm);

	boolean removeById(int id);

	boolean modifySalById(int id, double s);

	List<Employee> sortById();

	List<Employee> sortByName();

	List<Employee> sortBySalary();

	double calcSalary(int id);
}
