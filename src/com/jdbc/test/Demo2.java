package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ����ִ��SQL��䣬�Լ�SQLע������
 * @author Administrator
 *
 */
public class Demo2 {

	public static void main(String[] args) {

		try {
			// ����������
			Class.forName("com.mysql.jdbc.Driver");
			// ��������
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			//ִ��sql���
			Statement stmt = connection.createStatement();
			String sql = "insert into user (realname,username,pwd) values ('lgt','lf',123)";
			stmt.execute(sql);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
