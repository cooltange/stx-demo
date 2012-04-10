package com.stx.s1.p291jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDelete {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = null;
		Statement stmt = null;
		int count = 0;
		try {
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "stx", "stx");
			stmt = connection.createStatement();

			String sql = "delete from STUDENT";
			count = stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

			// 输出删除操作的结果数
			System.out.printf("共影响记录:%d条。\n", count);
		}

	}
}
