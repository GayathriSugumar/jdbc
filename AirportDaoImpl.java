package com.xworkz.Company.AirportDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AirportDaoImpl implements AirportDao {
	static String url="jdbc:mysql://localhost:3306/Airport";
	static String userName="root";
	static String password="Gayathri@0312";
	
	@Override
	public void saveAirportEntity() {
		String sqlStatement="insert into Airport.chennai_AP value(08,'Pondicherry_airport','lawspet',7000,'Ap')";
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
	public void deleteAirportEntity() {
		String deleteQuery="delete from Airport.chennai_AP where AP_id=8";
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
	public void updateAirportEntity() {
		String updateQuery="update from Airport.chennai_AP set no_of_emp=4000 where AP_id=9";
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
	public void readAirportEntity() {
		String readAirportEntity="select*from Airport.chennai_AP where grade='o'";
		Connection connection=null;
		try {
			 connection=DriverManager.getConnection(url,userName,password);
			System.out.println(connection+url);
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(readAirportEntity);
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
	public void readAllAirportEntity() {
		String readAllAirportEntity="select*from Airport.chennai_AP ";
		Connection connection=null;
		try {
			 connection=DriverManager.getConnection(url,userName,password);
			System.out.println(connection+url);
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(readAllAirportEntity);
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
