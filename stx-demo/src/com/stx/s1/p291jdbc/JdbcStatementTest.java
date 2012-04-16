package com.stx.s1.p291jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Statement ʾ����<BR>
 * һ��Statement���� ������ ResultSet����
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
			// ������ѯ�����
			while (rsStudent.next()) {
				System.out.println(rsStudent.getString("sno") + " , "
						+ rsStudent.getString("sname"));
			}

			System.out.println("=========================");

			rsTeacher = stmt.executeQuery("select tno,tname from TEACHER");
			// ������ѯ�����
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
