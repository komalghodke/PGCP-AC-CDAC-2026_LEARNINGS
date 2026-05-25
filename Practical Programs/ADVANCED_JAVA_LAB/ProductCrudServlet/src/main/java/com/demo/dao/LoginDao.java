package com.demo.dao;

import com.demo.model.MyUser;

public interface LoginDao {
	MyUser authenticateUSer(String uname, String password);
	}
