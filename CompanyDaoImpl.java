package com.xworkz.Company.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.Company.CompanyEntity.CompanyEntity;
import com.xworkz.Company.util.ConnectionProvider;

public class CompanyDaoImpl implements CompanyDao {
	/*
	 * static String url = "jdbc:mysql://localhost:3306/Company"; static String
	 * userName = "root"; static String password = "Gayathri@0312";
	 */

	@Override
	public void saveCompanyEntity(CompanyEntity companyEntity) {
		String sqlStatement = "insert into Company.dairymilk value(?,?,?,?,?,?)";
		Connection connection = null;
		try {
			connection = ConnectionProvider.getConnection();
			System.out.println(connection);
			PreparedStatement prepareStatement = connection.prepareStatement(sqlStatement);
			prepareStatement.setString(1, companyEntity.getCname());
			prepareStatement.setInt(2, companyEntity.getcId());
			prepareStatement.setString(3, companyEntity.getLocation());
			prepareStatement.setFloat(4, companyEntity.getNo_Of_emp());
			prepareStatement.setFloat(5, companyEntity.getNo_of_branches());
			prepareStatement.setString(6, companyEntity.getGrade());
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
	public void deleteCompanyEntity(int cId) {
		String deleteQuery = "delete from Company.dairymilk where cId=11";
		Connection connection = null;
		try {
			connection = ConnectionProvider.getConnection();
			System.out.println(connection);
			// Statement statement = connection.createStatement();
			PreparedStatement prepareStatement = connection.prepareStatement(deleteQuery);
			prepareStatement.setInt(2, cId);
			prepareStatement.executeUpdate();
			System.out.println("query is executed");
			// statement.executeUpdate(deleteQuery);
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
	public void updateCompanyEntity(String cname, String grade) {
		String updateQuery = "update from Company.dairymilk set grade='a' where cname='munch'";
		Connection connection = null;
		try {
			connection = ConnectionProvider.getConnection();
			System.out.println(connection);
			PreparedStatement prepareStatement = connection.prepareStatement(updateQuery);
			prepareStatement.setString(6, grade);
			prepareStatement.setString(1, cname);
			prepareStatement.executeUpdate();
			// Statement statement = connection.createStatement();
			// statement.executeUpdate(updateQuery);
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
	public void readCompanyEntity() {
		String readCompanyEntity = "select*from Company.dairymilk where cname='munch'";
		Connection connection = null;
		try {
			connection = ConnectionProvider.getConnection();
			System.out.println(connection);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readCompanyEntity);
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));
				System.out.println(resultSet.getInt(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getFloat(4));
				System.out.println(resultSet.getFloat(5));
				System.out.println(resultSet.getString(6));

			}
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
	public void readAllCompanyEntity() {
		String readAllCompanyEntity = "select*from Company.dairymilk ";
		Connection connection = null;
		try {
			connection = ConnectionProvider.getConnection();
			System.out.println(connection);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readAllCompanyEntity);
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));
				System.out.println(resultSet.getInt(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getFloat(4));
				System.out.println(resultSet.getFloat(5));
				System.out.println(resultSet.getString(6));
			}
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
