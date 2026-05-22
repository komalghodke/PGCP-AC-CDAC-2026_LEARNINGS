package com.dbconnect.service;

public interface LoginService {

	String validateUser(String uname, String passwd);

	void closeMyConnection();

}
