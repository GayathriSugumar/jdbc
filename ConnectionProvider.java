package com.xworkz.Company.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	private static Connection connection;
	static {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Company","root","Gayathri@0312");
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		if(connection!=null) {
		return connection;
		}else {
			System.out.println("connection is not created!try again");
			return connection;
		}
	}
}
