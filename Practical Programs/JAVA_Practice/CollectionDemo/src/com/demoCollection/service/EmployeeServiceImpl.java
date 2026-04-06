package com.demoCollection.service;

import java.util.List;
import java.util.Scanner;

import com.demoCollection.dao.EmployeeDao;
import com.demoCollection.dao.EmployeeDaoImpl;
import com.demoCollection.model.ContractEmp;
import com.demoCollection.model.Employee;
import com.demoCollection.model.SalariedEmp;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao edao;

	public EmployeeServiceImpl() {

		this.edao = new EmployeeDaoImpl();
	}

	@Override
	public boolean addNewEmployee(int ch) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr id");
		int id = sc.nextInt();
		System.out.println("enter name");
		String nm = sc.next();
		System.out.println("enter mob");
		String mob = sc.next();
		System.out.println("enter dept");
		String dept = sc.next();
		System.out.println("enter desg");
		String desg = sc.next();
		Employee e = null;
		if (ch == 1) {
			System.out.println("enter salary");
			double s = sc.nextDouble();
			e = new SalariedEmp(id, nm, mob, dept, desg, s);
			edao.save(e);
		} else if (ch == 2) {
			System.out.println("enter hrs");
			float hrs = sc.nextFloat();
			System.out.println("enter charges");
			double c = sc.nextDouble();
			e = new ContractEmp(id, nm, mob, dept, desg, hrs, c);

		} else if (ch == 3) {
			/// add code for vendor
		}
		return edao.save(e);
	}

	@Override
	public List<Employee> getAll() {
		return edao.findAll();
	}

	@Override
	public Employee getById(int id) {
		return edao.findById(id);
	}

}
