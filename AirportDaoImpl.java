package com.xworkz.Company.AirportDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.Company.AirportDao.AirportEntity.AirportEntity;
import com.xworkz.Company.AirportDao.util.ConnectionProvider;

public class AirportDaoImpl implements AirportDao {

	@Override
	public void saveAirportEntity(AirportEntity airportEntity) {
		String sqlStatement = "insert into Airport.chennai_AP value(?,?,?,?,?)";
		Connection connection = null;
		try {
			connection = ConnectionProvider.getConnection();
			System.out.println(connection);
			PreparedStatement prepareStatement = connection.prepareStatement(sqlStatement);
			prepareStatement.setInt(1, airportEntity.getAP_id());
			prepareStatement.setString(2, airportEntity.getAP_name());
			prepareStatement.setString(3, airportEntity.getLocation());
			prepareStatement.setFloat(4, airportEntity.getNo_of_emp());
			prepareStatement.setInt(5, airportEntity.getGrade());
			prepareStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Query not executed" + e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
					System.out.println("connection closed");
				}

				else {
					System.out.println("connection is not created");
				}
			} catch (SQLException e) {
			}
		}

	}

	@Override
	public void deleteAirportEntity(int AP_id) {
		String deleteQuery = "delete from Airport.chennai_AP where AP_id=8";
		Connection connection = null;
		try {
			connection = ConnectionProvider.getConnection();
			System.out.println(connection);
			// connection=DriverManager.getConnection(url,userName,password);
			PreparedStatement prepareStatement = connection.prepareStatement(deleteQuery);
			prepareStatement.setInt(1, AP_id);
			prepareStatement.executeUpdate();
			System.out.println("query is executed");
			// Statement statement=connection.createStatement();
		} catch (SQLException e) {
			System.out.println("Query not executed" + e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
					System.out.println("connection closed");
				}

				else {
					System.out.println("connection is not created");
				}
			} catch (SQLException e) {
			}
		}
	}

	@Override
	public void updateAirportEntity(float no_of_emp, int AP_id) {
		String updateQuery = "update from Airport.chennai_AP set no_of_emp=4000 where AP_id=9";
		Connection connection = null;
		try {
			// connection=DriverManager.getConnection();
			// Statement statement=connection.createStatement();
			// statement.executeUpdate(updateQuery);
			connection = ConnectionProvider.getConnection();
			System.out.println(connection);
			PreparedStatement prepareStatement = connection.prepareStatement(updateQuery);
			prepareStatement.setFloat(4, no_of_emp);
			prepareStatement.setInt(1, AP_id);
			prepareStatement.executeUpdate();
			System.out.println("query is executed");
		} catch (SQLException e) {
			System.out.println("Query not executed" + e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
					System.out.println("connection closed");
				}

				else {
					System.out.println("connection is not created");
				}
			} catch (SQLException e) {
			}
		}

	}

	@Override
	public void readAirportEntity() {
		String readAirportEntity = "select*from Airport.chennai_AP where grade='o'";
		Connection connection = null;
		try {
			// connection=DriverManager.getConnection();
			// Statement statement=connection.createStatement();
			connection = ConnectionProvider.getConnection();
			System.out.println(connection);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readAirportEntity);
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getInt(4));
				System.out.println(resultSet.getInt(5));
			}
			System.out.println("Query is executed");
		} catch (SQLException e) {
			System.out.println("Query not executed" + e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
					System.out.println("connection closed");
				}

				else {
					System.out.println("connection is not created");
				}
			} catch (SQLException e) {
			}
		}

	}

	@Override
	public void readAllAirportEntity() {
		String readAllAirportEntity = "select*from Airport.chennai_AP ";
		Connection connection = null;
		try {
			// connection=DriverManager.getConnection();
			connection = ConnectionProvider.getConnection();
			System.out.println(connection);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readAllAirportEntity);
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getInt(4));
				System.out.println(resultSet.getInt(5));
			}
			System.out.println("Query is executed");
		} catch (SQLException e) {
			System.out.println("Query not executed" + e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
					System.out.println("connection closed");
				}

				else {
					System.out.println("connection is not created");
				}
			} catch (SQLException e) {
			}
		}

	}

}
