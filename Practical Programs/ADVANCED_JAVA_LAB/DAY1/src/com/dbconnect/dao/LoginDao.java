package com.dbconnect.dao;

public interface LoginDao {

	String authenticateUser(String uname, String passwd);

	void closeMyConnection();

}
