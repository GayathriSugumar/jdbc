package com.xworkz.jdbc;
import java.sql.*;
public class Company {
	static String url="jdbc:mysql://localhost:3306/Company";
	static String userName="root";
	static String password="Gayathri@0312";
	static String insert="('cadbury',12,'england',200000.000,2000,'o')";
	static String insert1="('fivestar',10,'philippines',30000.000,1000,'Aplus')";
	static String insert2="('kitkat',9,'US',10000.000,500,'A')";
	static String insert3="('nestle',11,'US',110000.000,700,'Aplus')";
	static String insert4="('ferreroRocher1',79,'italy',130000.000,500,'o')";
	static String update="(update dairymilk set grade='o' where cname='nestle')";
	static String delete="(delete from dairymilk where cname='ferreroRocher1')";
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
			//statement.executeUpdate(insert4);
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
