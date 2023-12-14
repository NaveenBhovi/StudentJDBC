package com.jdbc.Studentcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Tableinsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentjdbc","root","root");
		Statement s=c.createStatement();
		s.execute("Insert into student values( 5, 'komal',786676, 'Dharwad')");
		System.out.println("the values are inserted");
		

	}

}
