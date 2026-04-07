package com.demoCollection.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.demoCollection.model.ContractEmp;
import com.demoCollection.model.Employee;
import com.demoCollection.model.SalariedEmp;

import com.demoCollection.comparator.EmployeeNameComparator;
import com.demoCollection.comparator.EmployeeSalComparator;

public class EmployeeDaoImpl implements EmployeeDao {

	static List<Employee> elist;
	static {
		elist = new ArrayList<>();
		elist.add(new SalariedEmp(12, "Rajesh", "4444", "Hr", "mgr", 45678));
		elist.add(new ContractEmp(13, "Rajani", "55555", "admin", "asst", 45, 6666));
		elist.add(new SalariedEmp(14, "Rajesh", "4444", "Hr", "mgr", 45678));
		elist.add(new ContractEmp(15, "Meenal", "6666", "admin", "asst", 45, 6766));
	}

	@Override
	public boolean save(Employee e) {
		return elist.add(e);

	}

	@Override
	public List<Employee> findAll() {
		return elist;
	}

	@Override
	public Employee findById(int id) {

//		return elist.stream()
//	            .filter(e -> e.getPid() == id)
//	            .findFirst()
//	            .orElse(null);

		int pos = elist.indexOf(new SalariedEmp(id, null, null, null, null, 0));
		if (pos != -1) {
			return elist.get(pos);
		}
		return null;
	}

	@Override
	public List<Employee> findByName(String nm) {
		// java 1.7
		/*
		 * List<Employee> lst=new ArrayList<>(); Iterator<Employee> it=elist.iterator();
		 * while(it.hasNext()) { Employee e=it.next(); if(e.getPname().equals(nm)) {
		 * lst.add(e); } }
		 */
		// java 1.7
		/*
		 * List<Employee> lst=new ArrayList<>(); for(Employee e: elist) {
		 * if(e.getPname().equals(nm)) { ast.add(e); } }
		 */

		// java 1.8 using stream function
		List<Employee> lst = elist.stream().
				filter(e -> e.getPname().equalsIgnoreCase(nm)).collect(Collectors.toList());
		return lst;
	}

	@Override
	public boolean removeById(int id) {
		/*
		 * Iterator<Employee> it=elist.iterator(); while(it.hasNext()) { Employee
		 * e=it.next(); if(e.getPid()==id) { it.remove(); return true; } } return false;
		 */
		/*
		 * int pos=elist.indexOf(new SalariedEmp(id)); if(pos!=-1) { elist.remove(pos);
		 * }
		 */
		// elist.removeIf(e->e.getPname().equals(nm));
		// return elist.removeIf(e -> e.getPid() == id);

		return elist.remove(new SalariedEmp(id));
	}

	@Override
	public boolean modifySalById(int id, double s) {
		Employee e = findById(id);
		if (e != null) {
			if (e instanceof SalariedEmp) {
				((SalariedEmp) e).setSal(s);
			} else if (e instanceof ContractEmp) {
				((ContractEmp) e).setCharges(s);
			} else {
				// vendor check
			}
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> sortById() {
		List<Employee> elst = new ArrayList<>();
		for (Employee e : elist) {
			elst.add(e);
		}
		elst.sort(null);
		return elst;
	}

	@Override
	public List<Employee> sortByName() {
		List<Employee> elst = new ArrayList<>();
		for (Employee e : elist) {
			elst.add(e);
		}
		elst.sort(new EmployeeNameComparator());
		return elst;
	}

	@Override
	public List<Employee> sortBySalary() {
		List<Employee> elst = new ArrayList<>();
		for (Employee e : elist) {
			elst.add(e);
		}
		elst.sort(new EmployeeSalComparator());
		return elst;
	}

	@Override
	public double calcSalary(int id) {
		Employee e = findById(id);
		if (e != null) {
			if (e instanceof SalariedEmp) {
				return e.calculateSal();
			} else if (e instanceof ContractEmp) {
				return e.calculateSal();
			} else {
				// Vendor
				return e.calculateSal();
			}
		}
		System.out.println("Not found");
		return -1;
	}

}
