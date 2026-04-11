package com.demoCollection.ExceptionHandler;

import com.demoCollection.ExceptionHandler.Exception.AgeException;
import com.demoCollection.ExceptionHandler.Exception.InvalidSalaryException;

public class TestException2 {

	public static void main(String[] args) {
		EmpService eservice = new EmpServiceImpl();
		boolean status;
		try {
			status = eservice.addNewEmployee();
			if (status) {
				System.out.println("employee added");
			}
		} catch (InvalidSalaryException | AgeException e) {
			System.out.println("employee not generated" + e.getMessage());
		}
	}
}
