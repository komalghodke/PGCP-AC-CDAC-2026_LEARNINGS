package com.javapractice.stdmngment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentService {

	public static Student[] sarr;
	public static int count;

	static {
		sarr = new Student[100];
		sarr[0] = new Student(9, "GK", 99, 96, 90, new Date());	
		sarr[1] = new Student(1, "KG", 90, 89, 80, new Date());
		sarr[2] = new Student(2, "CG", 97, 76, 89, new Date());
		count = 3;
	}

	public static boolean addNewStudent() {

		Scanner sc = new Scanner(System.in);
		System.out.println("To add New student, Please Enter the required Details: ");
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		System.out.println("Enter Name: ");
		sc.next();
		String nm = sc.nextLine();
		System.out.println("Enter M1 Marks: ");
		float m1 = sc.nextFloat();
		System.out.println("Enter M2 Marks: ");
		float m2 = sc.nextFloat();
		System.out.println("Enter M3 Marks: ");
		float m3 = sc.nextFloat();
		System.out.println("Enter Joining Date (dd/MM/yyyy): ");
		String dt = sc.next();

		SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
		Date jdt = null;

		try {
			jdt = sdt.parse(dt);
		} catch (ParseException e) {
			System.out.println("You Entered Invalid Date Format!");
			e.printStackTrace();
		}

		if(count<sarr.length) {
			sarr[count] = new Student(id, nm, m1, m2, m3, jdt);
			count++;
			return true;
			
		}
		System.out.println("Array is already Full!");
		return false;
	}

	public static Student[] displayAll() {
		return sarr;
	}

	public static Student diplayById(int id) {
		for(Student st : sarr) {
			if(st!=null) {
				if(st.getSid()==id) {
					System.out.println("Student with Id :" + id);
					return st;
				}
			}
		}
		return null;
	}

	public static Student[] diplayByName(String name) {
		Student[] studs =  new Student[count];
		int i = 0;
		for(Student s : sarr) {
			if(s!=null ) {
				if (s.getSname().equals(name)) {
					studs[i] = s;
					i++;
				}
			}
			else {
				break;
			}
		}
		if(i>0) {
			return studs;
		}
		return null;
	}

	public static int deleteById(int id) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<count; i++)
		{
			if(sarr[i]!=null && sarr[i].getSid()==id) {
				System.out.println(sarr[i] + "Are you sure, you want delete it? (Y/N) ");
				String c = sc.next();
				if(c.equals("Y")) {
					for(Student s : sarr) {
						sarr[i] = sarr[i+1];
					}
					sarr[count] = null;
					count--;
					return 0;
				}
				else {
					return 1;
					}
			}
		}
		return 2;
	}

	public static boolean updateById(int id, float m1, float m2, float m3) {
		Student s = diplayById(id);
		if(s!=null) {
			s.setM1(m1);
			s.setM2(m2);
			s.setM3(m3);
			return true;
		}
		return false;
	}

}
