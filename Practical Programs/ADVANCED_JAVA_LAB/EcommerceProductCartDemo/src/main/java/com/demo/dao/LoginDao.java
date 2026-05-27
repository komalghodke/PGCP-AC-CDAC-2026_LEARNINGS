package com.demo.dao;

import com.demo.model.MyUser;

public interface LoginDao {

	MyUser authenticateUser(String uname, String pswd);

}
