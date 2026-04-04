package com.javapractice.InheritanceDemo.Service;

import java.util.Scanner;

import com.javapractice.InheritanceDemo.Entity.ContractEmp;
import com.javapractice.InheritanceDemo.Entity.Employee;
import com.javapractice.InheritanceDemo.Entity.SalariedEmp;

public class EmployeeService {

	static Employee[] empArr;
	static int count;
	static {
		empArr = new Employee[100];
		empArr[0] = new SalariedEmp(12, "Emp1", "4444", "hr", "mgr", 45678);
		empArr[1] = new ContractEmp(13, "Emp2", "55555", "hr", "mgr", 67, 4568);
		count = 2;
	}

	public static boolean addNewEmployee(int ch) {
		Scanner sc = new Scanner(System.in);

		if (count < empArr.length) {
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			System.out.println("Enter Name: ");
			String nm = sc.next();
			System.out.println("Enter Mobile No: ");
			String m = sc.next();
			System.out.println("Enter Department: ");
			String dept = sc.next();
			System.out.println("Enter Designation: ");
			String desg = sc.next();
			if (ch == 1) {
				System.out.println("Enter sal: ");
				double sal = sc.nextDouble();
				empArr[count] = new SalariedEmp(id, nm, m, dept, desg, sal);
				count++;
				return true;
			} else if (ch == 2) {
				System.out.println("Enter hrs: ");
				float hrs = sc.nextFloat();
				System.out.println("Enter charges: ");
				double charges = sc.nextDouble();
				empArr[count] = new ContractEmp(id, nm, m, dept, desg, hrs, charges);
				count++;
				return true;
			} else if (ch == 3) {
				count++;
				return true;
			}
		}
		return false;
	}

	public static boolean deleteById(int id) {
		int pos = searchById(id);
		if (pos != -1) {
			for (int i = pos; i < count; i++) {
				empArr[i] = empArr[i + 1];
			}
			count--;
			return true;

		}
		return false;
	}

	public static boolean updateById(int id, double sal) {
		Employee e = findById(id);
		if (e != null) {
			if (e instanceof SalariedEmp) {
				((SalariedEmp) e).setSal(sal);
			} else if (e instanceof ContractEmp) {
				((ContractEmp) e).setCharges(sal);
			}

			return true;
		}
		return false;
	}

	public static Employee[] getAll() {
		return empArr;
	}

	public static Employee[] findByName(String nm) {
		Employee[] arr = new Employee[count];
		int cnt = 0;
		for (int i = 0; i < count; i++) {
			if (empArr[i].getName().equals(nm)) {
				arr[cnt] = empArr[i];
				cnt++;
			}
		}
		if (cnt > 0) {
			return arr;
		}
		return null;
	}

	public static double findNetSalary(int id) {
		Employee e = findById(id);
		if (e != null) {
			return e.calculateSal();
		}
		return -1;
	}

	public static Employee findById(int id) {
		int pos = searchById(id);
		if (pos != -1) {
			return empArr[pos];
		}
		return null;
	}

	private static int searchById(int id) {
		for (int i = 0; i < count; i++) {
			if (empArr[i].getPid() == id) {
				return i;
			}
		}
		return -1;
	}

}
