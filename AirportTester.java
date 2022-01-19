package com.xworkz.Company.AirportDao;
import java.sql.*;
public class AirportTester {
	static String url="jdbc:mysql://localhost:3306/Company";
	static String userName="root";
	static String password="Gayathri@0312";
	static String sqlStatement ="insert into Airport.chennai_AP value(08,'Pondicherry_airport','lawspet',7000,'Ap')";
	static String updateQuery = "update from Airport.chennai_AP set no_of_emp=4000 where AP_id=9";
	static String deleteQuery = "delete from Airport.chennai_AP where AP_id=8";
	public static void main(String[] args) {
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
