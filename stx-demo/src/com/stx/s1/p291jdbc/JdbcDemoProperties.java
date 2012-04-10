package com.stx.s1.p291jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcDemoProperties {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException, IOException {

		// ����Properties����
		Properties ptes = new Properties();
		// ptes.load(new FileReader("d:\\dbcfg.properties"));
		// ����properties�����ļ�
		ptes.load(ClassLoader
				.getSystemResourceAsStream("com\\stx\\s1\\p291jdbc\\dbcfg.properties"));
		// ��ȡ������·��
		String driver = ptes.getProperty("driver");
		// ��ȡ���ݿ�url
		String url = ptes.getProperty("url");
		// ��ȡ���ݿ��û���
		String username = ptes.getProperty("username");
		// ��ȡ���ݿ�����
		String password = ptes.getProperty("password");

		// 1.��������
		Class.forName(driver);
		// 2.ʹ��DriverManager��ȡ���ݿ�����
		Connection connection = DriverManager.getConnection(url, username,
				password);
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
