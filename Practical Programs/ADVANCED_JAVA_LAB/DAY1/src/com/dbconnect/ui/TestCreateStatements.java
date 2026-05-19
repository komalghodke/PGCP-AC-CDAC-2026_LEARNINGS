package com.dbconnect.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestCreateStatements {
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

			// STEP 3 : Create Statement
			Statement st = conn.createStatement();

			// STEP 4 : Execute the Statement
			ResultSet rs = st.executeQuery("select * from dummy");

			// STEP 5 : Navigate through Resultset
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt(1));
				System.out.println("Name: " + rs.getString(2));
			}

			// To insert data
			int id = 1;
			String name = "second";
			String query = "insert into dummy values(" + id + ",'" + name + "')";
			System.out.println(query);

			int n = st.executeUpdate(query);
			if (n > 0) {
				System.out.println("Insertion Done!");
			} else {
				System.out.println("Insertion not Done");
			}

			conn.close();
		} catch (SQLException e) {
			System.out.println("Connection couldn't be Established!");
			e.printStackTrace();
		}
	}
}
