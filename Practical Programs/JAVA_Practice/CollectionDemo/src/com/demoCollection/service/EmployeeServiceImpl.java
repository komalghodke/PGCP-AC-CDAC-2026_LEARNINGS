package com.demoCollection.service;

import java.util.List;
import java.util.Scanner;

import com.demoCollection.dao.EmployeeDao;
import com.demoCollection.dao.EmployeeDaoImpl;
import com.demoCollection.model.ContractEmp;
import com.demoCollection.model.Employee;
import com.demoCollection.model.SalariedEmp;
import com.demoCollection.model.VendorEmp;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao edao;

	public EmployeeServiceImpl() {

		this.edao = new EmployeeDaoImpl();
	}

	@Override
	public boolean addNewEmployee(int ch) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
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
		} else if (ch == 2) {
			System.out.println("enter hrs");
			float hrs = sc.nextFloat();
			System.out.println("enter charges");
			double c = sc.nextDouble();
			e = new ContractEmp(id, nm, mob, dept, desg, hrs, c);
		} else if (ch == 3) {
			System.out.println("enter no of employees");
			int noOfEmp = sc.nextInt();
			System.out.println("enter charges");
			double c = sc.nextDouble();
			e = new VendorEmp(id, nm, mob, dept, desg, noOfEmp, c);
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

	@Override
	public List<Employee> getByName(String nm) {
		return edao.findByName(nm);
	}

	@Override
	public boolean deleteById(int id) {
		return edao.removeById(id);
	}

	@Override
	public boolean updateById(int id, double s) {
		return edao.modifySalById(id, s);
	}

	@Override
	public List<Employee> sortById() {
		return edao.sortById();
	}

	@Override
	public List<Employee> sortByName() {
		return edao.sortByName();
	}

	@Override
	public List<Employee> sortBySalary() {
		return edao.sortBySalary();
	}

	@Override
	public double calcSalary(int id) {
		return edao.calcSalary(id);
	}

	@Override
	public double calcBonus(int id, float perc) {
		Employee e = edao.findById(id);
		if (e instanceof SalariedEmp) {
			return ((SalariedEmp) e).calculateBonus(perc);
		} else if (e instanceof ContractEmp) {
			return ((ContractEmp) e).calculateBonus(perc);
		}
		return 0;
	}

}
