package com.xworkz.Company.AirportDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AirportTester {
	//static String url="jdbc:mysql://localhost:3306/Airport";
	//static String userName="root";
	//static String password="Gayathri@0312";
	//static String sqlStatement ="insert into Airport.chennai_AP value(08,'Pondicherry_airport','lawspet',7000,'Ap')";
	//static String updateQuery = "update from Airport.chennai_AP set no_of_emp=4000 where AP_id=9";
	//static String deleteQuery = "delete from Airport.chennai_AP where AP_id=8";
	public static void main(String[] args) throws SQLException {
		/*AirportDaoImpl airportDaoImpl=new AirportDaoImpl();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter AP_id :");
		int AP_id=scanner.nextInt();
		
		System.out.println("Enter the AP_name");
		String AP_name=scanner.next();
		
		System.out.println("Enter the Location");
		String location=scanner.next(); 
		
		System.out.println("Enter the No_of_emp");
		String No_of_emp=scanner.next(); 
		
		System.out.println("Enter the Grade");
		String Grade=scanner.next(); 
		
		AirportEntity entity=new AirportEntity();
		AirportEntity.saveAirportEntity(entity);
		AirportEntity.updateAirportEntity(entity);
		scanner.close();*/
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airport","root","Gayathri@0312");
		connection.setAutoCommit(false);
		String insertStatement1="insert into Airport.chennai_AP value(21,'Pondicherry_airport','airport road',5000,'A')";
		String insertStatement2="insert into Airport.chennai_AP value(23,'Pondicherry_airport','airport road',5000,'A')";
		String insertStatement3="insert into Airport.chennai_AP value(25,'Pondicherry_airport','airport road',5000,'A')";
		Statement statement = connection.createStatement();
		statement.executeUpdate(insertStatement1);
		statement.executeUpdate(insertStatement2);
		//int a=1/0;
		statement.executeUpdate(insertStatement3);
		connection.commit();
		
	}

}
