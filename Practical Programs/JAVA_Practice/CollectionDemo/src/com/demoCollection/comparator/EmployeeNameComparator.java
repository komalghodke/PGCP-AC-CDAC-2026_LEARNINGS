package com.demoCollection.comparator;

import java.util.Comparator;

import com.demoCollection.model.Person;

public class EmployeeNameComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		System.out.println("in compare method "+ o1.getPname()+"---------"+ o2.getPname());
		return o1.getPname().compareTo(o2.getPname());
	}
}
