package com.xworkz.Company.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class CompanyDaoImpl implements CompanyDao{
	static String url="jdbc:mysql://localhost:3306/Company";
	static String userName="root";
	static String password="Gayathri@0312";

	@Override
	public void saveCompanyEntity() {
		String sqlStatement="insert into Company.dairymilk value('Munch',30,'France',121000.000,500,'o')";
		Connection connection=null;
		try {
			 connection=DriverManager.getConnection(url,userName,password);
			System.out.println(connection+url);
			Statement statement=connection.createStatement();
			statement.executeUpdate(sqlStatement);
		}catch (SQLException e) {
			System.out.println("Query not executed"+e.getMessage());
		}finally {
			try {
				if(connection!=null) {
					connection.close();
					System.out.println("connection closed");
				} 
			
			else {
				System.out.println("connection is not created");
			}
		}
		catch(SQLException e) {
		}
		}
	}

	@Override
	public void deleteCompanyEntity() {
		String deleteQuery="delete from Company.dairymilk where cId=11";
		Connection connection=null;
		try {
			 connection=DriverManager.getConnection(url,userName,password);
			System.out.println(connection+url);
			Statement statement=connection.createStatement();
			statement.executeUpdate(deleteQuery);
		}catch (SQLException e) {
			System.out.println("Query not executed"+e.getMessage());
		}finally {
			try {
				if(connection!=null) {
					connection.close();
					System.out.println("connection closed");
				} 
			
			else {
				System.out.println("connection is not created");
			}
		}
		catch(SQLException e) {
		}
		}
		
		
	}

	@Override
	public void updateCompanyEntity() {
		String updateQuery="update from Company.dairymilk set grade='a' where cname='munch'";
		Connection connection=null;
		try {
			 connection=DriverManager.getConnection(url,userName,password);
			System.out.println(connection);
			Statement statement=connection.createStatement();
			statement.executeUpdate(updateQuery);
		}catch (SQLException e) {
			System.out.println("Query not executed"+e.getMessage());
		}finally {
			try {
				if(connection!=null) {
					connection.close();
					System.out.println("connection closed");
				} 
			
			else {
				System.out.println("connection is not created");
			}
		}
		catch(SQLException e) {
		}
		}
		
	}

	@Override
	public void readCompanyEntity() {
		String readCompanyEntity="select*from Company.dairymilk where cname='munch'";
		Connection connection=null;
		try {
			 connection=DriverManager.getConnection(url,userName,password);
			System.out.println(connection+url);
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(readCompanyEntity);
		while(resultSet.next()) {
			System.out.println(resultSet.getString(1));
			System.out.println(resultSet.getInt(2));
			System.out.println(resultSet.getString(3));
			System.out.println(resultSet.getInt(4));
			System.out.println(resultSet.getInt(5));
			System.out.println(resultSet.getString(6));
			System.out.println(resultSet.getInt(7));	
		}
		}catch (SQLException e) {
			System.out.println("Query not executed"+e.getMessage());
		}finally {
			try {
				if(connection!=null) {
					connection.close();
					System.out.println("connection closed");
				} 
			
			else {
				System.out.println("connection is not created");
			}
		}
		catch(SQLException e) {
		}
		}
		
	}

	@Override
	public void readAllCompanyEntity() {
		String readAllCompanyEntity="select*from Company.dairymilk ";
		Connection connection=null;
		try {
			 connection=DriverManager.getConnection(url,userName,password);
			System.out.println(connection+url);
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(readAllCompanyEntity);
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1));
				System.out.println(resultSet.getInt(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getInt(4));
				System.out.println(resultSet.getInt(5));
				System.out.println(resultSet.getString(6));
				System.out.println(resultSet.getInt(7));	
		}
		}catch (SQLException e) {
			System.out.println("Query not executed"+e.getMessage());
		}finally {
			try {
				if(connection!=null) {
					connection.close();
					System.out.println("connection closed");
				} 
			
			else {
				System.out.println("connection is not created");
			}
		}
		catch(SQLException e) {
		}
		}
		
	}
	

}
