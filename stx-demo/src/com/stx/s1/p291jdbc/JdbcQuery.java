package com.stx.s1.p291jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcQuery {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "stx", "stx");

			stmt = connection.createStatement();

			String sql = "select sno,sname from STUDENT";

			rs = stmt.executeQuery(sql);

			// 遍历查询结果集
			while (rs.next()) {
				System.out.println(rs.getString("sno") + " , "
						+ rs.getString("sname"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
