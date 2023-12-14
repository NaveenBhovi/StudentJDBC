package com.jdbc.Studentcrud;

import java.sql.*;


public class Deletevalue {

	public static void main(String[] args) 
	{
		try {
			
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentjdbc","root","root");
		Statement s=c.createStatement();
		s.execute("delete from student where id in(3,5)");
		System.out.println("The values are deleted");
		c.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}

}
