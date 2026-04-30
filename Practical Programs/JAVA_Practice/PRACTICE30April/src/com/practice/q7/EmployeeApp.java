package com.practice.q7;

import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Employee> set = new TreeSet<>();
		while (true) {
			System.out.println("1 Add 2 Remove 3 Update Salary 4 Change Status 5 Display 6 Exit");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("1 Permanent 2 Contract");
				int type = sc.nextInt();

				System.out.println("Enter id name salary department status");
				int id = sc.nextInt();
				String name = sc.next();
				double salary = sc.nextDouble();
				String dept = sc.next();
				String status = sc.next();

				if (type == 1) {
					String pf = sc.next();
					String ins = sc.next();
					set.add(new PermanentEmployee(id, name, salary, dept, status, pf, ins));
				} else {
					int dur = sc.nextInt();
					String ag = sc.next();
					set.add(new ContractEmployee(id, name, salary, dept, status, dur, ag));
				}
				break;

			case 2:
				int rid = sc.nextInt();
				set.removeIf(e -> e.empId == rid);
				break;

			case 3:
				int uid = sc.nextInt();
				double ns = sc.nextDouble();

				for (Employee e : set) {
					if (e.empId == uid) {
						e.salary = ns;
					}
				}
				break;

			case 4:
				int sid = sc.nextInt();

				for (Employee e : set) {
					if (e.empId == sid) {
						e.status = "resigned";
					}
				}
				break;

			case 5:
				for (Employee e : set) {
					System.out.println(e);
				}
				break;

			case 6:
				System.exit(0);

			}
		}
	}
}
