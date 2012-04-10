package com.stx.s1.p291jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		// 1.加载驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2.使用DriverManager获取数据库连接
		Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "stx", "stx");
		// 3.使用Connection对象来创建Statment对象
		Statement stmt = connection.createStatement();
		// SQL语句
		String sql = "select sno,sname from STUDENT";
		// 4.执行SQL语句
		ResultSet rs = stmt.executeQuery(sql);

		// 遍历查询结果集
		while (rs.next()) {
			System.out.println(rs.getString("sno") + " , "
					+ rs.getString("sname"));
		}

		// 释放资源
		rs.close();
		stmt.close();
		connection.close();
	}

}
