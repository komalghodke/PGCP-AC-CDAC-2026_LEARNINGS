package com.demoCollection.ExceptionHandler;

import com.demoCollection.ExceptionHandler.Exception.AgeException;
import com.demoCollection.ExceptionHandler.Exception.InvalidSalaryException;

public interface EmpService {

	boolean addNewEmployee() throws InvalidSalaryException, AgeException;

}
