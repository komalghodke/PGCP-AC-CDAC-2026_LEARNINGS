package com.dbconnect.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) {
		try {
			// STEP 1 : Registered Driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			// STEP 2 : Create Connection
			String url = "jdbc:mysql://localhost:3306/dummy?useSSL=false";
			// &allowPublicKeyRetrieval=true
			Connection conn = DriverManager.getConnection(url, "root", "root");
			if (conn != null) {
				System.out.println("Connection Established!");
			} else {
				System.out.println("Connection not Established!");
			}
			conn.close();
		} catch (SQLException e) {
			System.out.println("Connection couldn't be Established!");
			e.printStackTrace();
		}
	}
}
