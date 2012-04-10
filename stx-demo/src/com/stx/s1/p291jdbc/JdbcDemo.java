package com.stx.s1.p291jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "stx2", "stx2");

		Statement stmt = connection.createStatement();

		String sql = "select sno,sname from STUDENT";

		ResultSet rs = stmt.executeQuery(sql);

		// 遍历查询结果集
		while (rs.next()) {
			System.out.println(rs.getString("sno") + " , "
					+ rs.getString("sname"));
		}

		rs.close();
		stmt.close();
		connection.close();
	}

}
