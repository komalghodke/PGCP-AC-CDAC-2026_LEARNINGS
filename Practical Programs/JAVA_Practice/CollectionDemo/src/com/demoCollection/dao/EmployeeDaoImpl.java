package com.demoCollection.dao;

import java.util.ArrayList;
import java.util.List;

import com.demoCollection.model.ContractEmp;
import com.demoCollection.model.Employee;
import com.demoCollection.model.SalariedEmp;

public class EmployeeDaoImpl implements EmployeeDao {
	static List<Employee> elist;
	static {
		elist = new ArrayList<>();
		elist.add(new SalariedEmp(12, "Rajesh", "4444", "Hr", "mgr", 45678));
		elist.add(new ContractEmp(13, "Rajani", "55555", "admin", "asst", 45, 6666));
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
		int pos = elist.indexOf(new SalariedEmp(id, null, null, null, null, 0));
		if (pos != -1) {
			return elist.get(pos);
		}
		return null;
	}

}
