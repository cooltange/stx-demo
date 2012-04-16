package com.stx.s3.p82transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 模拟转账 <BR>
 * 事务 演示类<BR>
 * 数据库脚本请参照 ACCOUNT.sql
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

			// 取消自动提交事务(手动处理异常提交及回滚)
			connection.setAutoCommit(false);
			System.out.println("当前事务是否自动提交:" + connection.getAutoCommit());

			stmt = connection.createStatement();

			String sql1 = "update account set balance = balance -100 where ano = 1";
			stmt.executeUpdate(sql1);

			// int i = 1 / 0;

			String sql2 = "update account set balance = balance +100 where ano = 2";
			stmt.executeUpdate(sql2);

			// 事务提交
			connection.commit();
			System.out.println("转账成功,事务已提交");

		} catch (Exception ex) {
			try {
				// 事务回滚
				connection.rollback();
				System.out.println("转账失败,事务已回滚");
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
