package com.stx.s1.p291jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		// 1.��������
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2.ʹ��DriverManager��ȡ���ݿ�����
		Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "stx", "stx");
		// 3.ʹ��Connection����������Statment����
		Statement stmt = connection.createStatement();
		// SQL���
		String sql = "select sno,sname from STUDENT";
		// 4.ִ��SQL���
		ResultSet rs = stmt.executeQuery(sql);

		// ������ѯ�����
		while (rs.next()) {
			System.out.println(rs.getString("sno") + " , "
					+ rs.getString("sname"));
		}

		// �ͷ���Դ
		rs.close();
		stmt.close();
		connection.close();
	}

}
