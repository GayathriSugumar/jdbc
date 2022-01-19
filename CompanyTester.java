package com.xworkz.Company.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class CompanyTester {

	static String url="jdbc:mysql://localhost:3306/Company";
	static String userName="root";
	static String password="Gayathri@0312";
	static String sqlStatement ="insert into Company.dairymilk value('Munch',30,'France',121000.000,500,'o')";
	static String updateQuery = "update from Company.dairymilk set grade='a' where cname='munch'";
	static String deleteQuery = "delete from Company.dairymilk where cId=11";

	public static void main(String args[]) {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println(connection + url);
			Statement statement = connection.createStatement();
			statement.executeUpdate(deleteQuery);
		} catch (SQLException e) {
			System.out.println("query is not executed" + e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
					System.out.println("connection is closed");
				} else

				{
					System.out.println("connection is not created");
				}
			}

			catch (SQLException e) {

			}

		}
	}
}



