package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1 {
	
	public static void main(String[] args) {
		
		try {
			//����������
			Class.forName("com.mysql.jdbc.Driver");
			//��������
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
