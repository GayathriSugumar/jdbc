package com.xworkz.jdbc;
import java.sql.*;
public class tester {
static String url="jdbc:mysql://localhost:3306/school";
static String userName="root";
static String password="Gayathri@0312";
static String sqlquery="insert into Auxllium value('josheph','trichy')";


	public static void main(String[] args) throws Exception{
		Connection connection=DriverManager.getConnection(url,userName,password);
		System.out.println(connection);
		Statement statement=connection.createStatement();
		statement.executeUpdate(sqlquery);
		System.out.println("quary executed");
	}

}
