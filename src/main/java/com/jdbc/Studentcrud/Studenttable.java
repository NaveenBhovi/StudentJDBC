package com.jdbc.Studentcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Studenttable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentjdbc","root","root");
		Statement s=c.createStatement();
		s.execute("create table student(id integer primary key,name varchar(15) not null,phone integer not null,address varchar(15) not null)");
		System.out.println("table is created");
		c.close(); 
	}

}
