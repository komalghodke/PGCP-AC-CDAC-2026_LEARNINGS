package com.dbconnect.service;

import com.dbconnect.dao.LoginDao;
import com.dbconnect.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {

	private LoginDao ldao;

	public LoginServiceImpl() {
		super();
		this.ldao = new LoginDaoImpl();
	}

	@Override
	public String validateUser(String uname, String passwd) {
		return ldao.authenticateUser(uname, passwd);
	}

	@Override
	public void closeMyConnection() {
		ldao.closeMyConnection();
	}

}
