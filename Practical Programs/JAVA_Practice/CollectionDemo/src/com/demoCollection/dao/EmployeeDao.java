package com.demoCollection.dao;

import java.util.List;

import com.demoCollection.model.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> findAll();

	Employee findById(int id);
}
