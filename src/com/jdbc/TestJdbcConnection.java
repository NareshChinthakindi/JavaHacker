/**
 * 
 */
package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class TestJdbcConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.
					getConnection("jdbc:mysql://localhost:3306/bootdb?useSSL=false", "root", "root123$");
		
		
			System.out.println(connection);
			connection.close();
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
