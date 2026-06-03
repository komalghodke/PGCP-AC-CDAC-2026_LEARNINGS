package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.MyUser;
import com.demo.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
    private LoginDao ldao;

	@Override
	public MyUser validateUser(String u1, String pass) {
		System.out.println("ValidateUser");
		return ldao.authenticateUSer(u1,pass);
	}
}
