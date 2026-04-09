package com.assignments.q4;

import java.util.*;

/* 	Q4. Use employee class to store id,name,sal,dept and designation.  
	a. Use HashSet to store multiple employee objects. Add required functions in the appropriate 
	class. 
	No duplicate employee entries are allowed. -2 Employee objects are same if their id is same b    
	b. Use Treemap to store multiple Employee objects. Add required functions in the 
	appropriate class. 
 */
public class EmployeeApp {
	public static void main(String[] args) {
		Set<Employee> empSet = new HashSet<>();
		empSet.add(new Employee(1, "Komal", 50000, "IT", "Developer"));
		empSet.add(new Employee(2, "KG", 60000, "HR", "Manager"));
		empSet.add(new Employee(1, "Komal Duplicate", 70000, "IT", "Tester"));

		System.out.println("Employees in HashSet (no duplicates by id):");
		for (Employee e : empSet) {
			System.out.println(e);
		}

		Map<Integer, Employee> empMap = new TreeMap<>();
		empMap.put(3, new Employee(3, "Sneha", 55000, "Finance", "Analyst"));
		empMap.put(4, new Employee(4, "Amit", 65000, "IT", "Lead"));
		empMap.put(2, new Employee(2, "KG", 60000, "HR", "Manager"));

		System.out.println("\nEmployees in TreeMap (sorted by id):");
		for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
			System.out.println(entry.getValue());
		}
	}
}
