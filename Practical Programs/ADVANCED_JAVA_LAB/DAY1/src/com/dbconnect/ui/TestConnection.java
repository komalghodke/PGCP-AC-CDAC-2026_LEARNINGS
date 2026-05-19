package com.dbconnect.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) {
		// STEP 1 : Registered Driver
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url = "jdbc:mysql://localhost:3306/dummy?useSSL=false&allowPublicKeyRetrieval=true";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			if (conn != null) {
				System.out.println("Coonection Established!");
			} else {
				System.out.println("Connection not Established!");
			}
			conn.close();
		} catch (SQLException e) {
			System.out.println("Connection not Established!");
			e.printStackTrace();
		}
	}
}
