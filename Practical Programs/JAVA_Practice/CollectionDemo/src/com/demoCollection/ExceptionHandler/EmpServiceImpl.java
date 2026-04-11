package com.demoCollection.ExceptionHandler;

import java.util.Scanner;

import com.demoCollection.ExceptionHandler.Exception.AgeException;
import com.demoCollection.ExceptionHandler.Exception.InvalidSalaryException;

public class EmpServiceImpl implements EmpService {

	@Override
	public boolean addNewEmployee() throws InvalidSalaryException, AgeException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter salary");
		double s = sc.nextDouble();
		if (s < 10000) {
			throw new InvalidSalaryException("salary shoud be > 10000");
		}
		System.out.println("Enter age");
		int age = sc.nextInt();
		if ((age < 18) || (age > 60)) {
			throw new AgeException("age should be in range 10 and 60");
		}
		return true;

	}

}
