package com.stx.s1.p291jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Statement 示例类<BR>
 * 一个Statement对象 处理多个 ResultSet对象
 * 
 * @author getan
 * 
 */
public class JdbcStatementTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = null;
		Statement stmt = null;
		ResultSet rsStudent = null;
		ResultSet rsTeacher = null;
		try {
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "stx2", "stx2");

			stmt = connection.createStatement();

			rsStudent = stmt.executeQuery("select sno,sname from STUDENT");
			// 遍历查询结果集
			while (rsStudent.next()) {
				System.out.println(rsStudent.getString("sno") + " , "
						+ rsStudent.getString("sname"));
			}

			System.out.println("=========================");

			rsTeacher = stmt.executeQuery("select tno,tname from TEACHER");
			// 遍历查询结果集
			while (rsTeacher.next()) {
				System.out.println(rsTeacher.getString("tno") + " , "
						+ rsTeacher.getString("tname"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rsStudent.close();
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
