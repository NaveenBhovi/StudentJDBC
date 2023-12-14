package com.jdbc.Studentcrud;

import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException;
import java.sql.Statement;

public class Creatdatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
	Statement s=c.createStatement();
	s.execute("create database studentjdbc");
	System.out.println("database created");
	c.close();
	}

}
