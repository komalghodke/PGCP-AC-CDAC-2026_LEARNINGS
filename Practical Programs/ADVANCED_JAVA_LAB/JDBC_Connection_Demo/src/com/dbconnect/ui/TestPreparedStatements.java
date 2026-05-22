package com.dbconnect.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestPreparedStatements {

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

			// STEP 3 : Prepared Statement
			PreparedStatement pst = conn.prepareStatement("select * from dummy1");

			// STEP 4 : Execute the Statement
			ResultSet rs = pst.executeQuery();

			// STEP 5 : Navigate through Resultset
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt(1));
				System.out.println("Name: " + rs.getString(2));
			}

			// To insert data
			int id = 2;
			String name = "Second";
			PreparedStatement pst1 = conn.prepareStatement("insert into dummy1 values(?,?)");
			pst1.setInt(1, id);
			pst1.setString(2, name);

			int n = pst1.executeUpdate();
			if (n > 0) {
				System.out.println("insertion done");
			} else {
				System.out.println("insertion not done");
			}
			
			conn.close();
		} catch (SQLException e) {
			System.out.println("Connection couldn't be Established!");
			e.printStackTrace();
		}
	}

}
