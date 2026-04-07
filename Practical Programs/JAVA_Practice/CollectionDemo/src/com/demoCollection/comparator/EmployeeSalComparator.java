package com.demoCollection.comparator;

import java.util.Comparator;

import com.demoCollection.model.ContractEmp;
import com.demoCollection.model.Person;
import com.demoCollection.model.SalariedEmp;

public class EmployeeSalComparator implements Comparator<Person> {

	public int compare(Person o1, Person o2) {
		double s1 = 0.0, s2 = 0.0;
		if (o1 instanceof SalariedEmp) {
			s1 = ((SalariedEmp) o1).getSal();
		} else if (o1 instanceof ContractEmp) {
			s1 = ((ContractEmp) o1).getCharges();
		}

		if (o2 instanceof SalariedEmp) {
			s2 = ((SalariedEmp) o2).getSal();
		} else if (o2 instanceof ContractEmp) {
			s2 = ((ContractEmp) o2).getCharges();
		}
		
		System.out.println("in salary comparator " + s1 + "---------" + s2);
		
		if (s1 < s2) {
			return -1;
		} else if (s1 == s2)
			return 0;
		else
			return 1;

	}
}
