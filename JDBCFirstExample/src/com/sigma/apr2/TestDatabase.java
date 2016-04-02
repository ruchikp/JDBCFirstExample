package com.sigma.apr2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Load the driver
		Class.forName("com.mysql.jdbc.Driver");
		//Create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Password");
		//Create statement
		Statement st = con.createStatement();
		//Execute SQL statement
		ResultSet rs = st.executeQuery("select * from employee");
		while(rs.next()){
			int empid = rs.getInt(1);
			int salary=rs.getInt(4);
			String firstname = rs.getString(2);
			String lastname = rs.getString(3);
			String address=rs.getString(5);
			
			System.out.println("employee id="+empid);
			System.out.println("first name="+lastname);
		}
	}
}
