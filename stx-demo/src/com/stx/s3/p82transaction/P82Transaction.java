package com.stx.s3.p82transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ģ��ת�� <BR>
 * ���� ��ʾ��<BR>
 * ���ݿ�ű������ ACCOUNT.sql
 * 
 * @author getan
 * 
 */
public class P82Transaction {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = null;
		Statement stmt = null;

		try {
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "stx2", "stx2");

			// ȡ���Զ��ύ����(�ֶ������쳣�ύ���ع�)
			connection.setAutoCommit(false);
			System.out.println("��ǰ�����Ƿ��Զ��ύ:" + connection.getAutoCommit());

			stmt = connection.createStatement();

			String sql1 = "update account set balance = balance -100 where ano = 1";
			stmt.executeUpdate(sql1);

			// int i = 1 / 0;

			String sql2 = "update account set balance = balance +100 where ano = 2";
			stmt.executeUpdate(sql2);

			// �����ύ
			connection.commit();
			System.out.println("ת�˳ɹ�,�������ύ");

		} catch (Exception ex) {
			try {
				// ����ع�
				connection.rollback();
				System.out.println("ת��ʧ��,�����ѻع�");
			} catch (SQLException se) {
				se.printStackTrace();
			}
			ex.printStackTrace();
		}

		finally {
			try {
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
