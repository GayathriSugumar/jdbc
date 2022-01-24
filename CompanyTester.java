package com.xworkz.Company.Dao;

import java.sql.*;


public class CompanyTester {

	/*
	 * static String url="jdbc:mysql://localhost:3306/Company"; static String
	 * userName="root"; static String password="Gayathri@0312"; static String
	 * sqlStatement
	 * ="insert into Company.dairymilk value('Munch',30,'France',121000.000,500,'o')"
	 * ; static String updateQuery =
	 * "update from Company.dairymilk set grade='a' where cname='munch'"; static
	 * String deleteQuery = "delete from Company.dairymilk where cId=11";
	 */

	public static void main(String args[]) throws SQLException {
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company","root","Gayathri@0312");
		connection.setAutoCommit(false);
		String insertStatement1="insert into Company.dairymilk value('munch',03,'Melbourn',1980000.000,700,'A+')";
		String insertStatement2="insert into Company.dairymilk value('milky bar',08,'US',210000.000,700,'o')";
		String insertStatement3="insert into Company.dairymilk value('Gems',06,'US',340000.000,700,'Ap+')";
		Statement statement = connection.createStatement();
		statement.executeUpdate(insertStatement1);
		statement.executeUpdate(insertStatement2);
		statement.executeUpdate(insertStatement3);
		connection.commit();
		/*Connection connection = null;
		try {
			connection = DriverManager.getConnection();
			System.out.println(connection);
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

		}*/
	}
}
