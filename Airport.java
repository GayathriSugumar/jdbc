package com.xworkz.jdbc;
import java.sql.*;
public class Airport {

	static String url="jdbc:mysql://localhost:3306/Airport";
	static String userName="root";
	static String password="Gayathri@0312";
	static String insert="(9,'madhurai_airport','meenambakkam',100000,'0')";
	static String insert1="(31,'coimbatore_airport','ap_road',8000,'Ap')";
	static String insert2="(8,'selam_airport','peelamedu',5000,'A')";
	static String insert3="(27,'trichy_airport','trichirrapalli',7000,'Ap')";
	static String update="(update chennai_AP set no_of_emp=4000 where AP_id=9)";
	static String delete="(delete from chennai_AP where AP_id=8)";
	
	public static void main(String[] args) {
		Connection connection=null;
		try {
			 connection=DriverManager.getConnection(url,userName,password);
			System.out.println(connection);
			Statement statement=connection.createStatement();
			
			statement.executeUpdate(insert);
			//statement.executeUpdate(insert1);
			//statement.executeUpdate(insert2);
			//statement.executeUpdate(insert3);
			//statement.exceptionUpdate(update);
			//statement.executeLargeUpdate(delete);
			System.out.println("quary executed");
		}catch (SQLException e) {
			System.out.println("Query not executed"+e.getMessage());
		}finally {
			try {
				if(connection!=null) {
					connection.close();
				} 
			}catch (SQLException e2) {
			}
		
		}
	}
}


