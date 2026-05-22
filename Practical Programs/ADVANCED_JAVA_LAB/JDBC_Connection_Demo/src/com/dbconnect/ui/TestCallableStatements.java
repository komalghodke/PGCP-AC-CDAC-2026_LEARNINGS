package com.dbconnect.ui;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class TestCallableStatements {
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

			// STEP 3 : Callable Statement
			int num = 1; // input parameter
			CallableStatement cst = conn.prepareCall("{call getcnt(?,?)}");
			cst.setInt(1, num); // IN parameter
			cst.registerOutParameter(2, Types.INTEGER); // OUT parameter
			cst.execute();
			System.out.println("Count for ID " + num + " ----> " + cst.getInt(2));

//			DELIMITER $
//			CREATE PROCEDURE getcnt(IN given_id INT, OUT cnt INT)
//			BEGIN
//			    SELECT COUNT(*) INTO cnt
//			    FROM dummy
//			    WHERE id = given_id;
//			END $
//			DELIMITER ;

			conn.close();
		} catch (SQLException e) {
			System.out.println("Connection couldn't be Established!");
			e.printStackTrace();
		}
	}
}
