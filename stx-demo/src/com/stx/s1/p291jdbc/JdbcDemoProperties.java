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

		// 创建Properties对象
		Properties ptes = new Properties();
		// ptes.load(new FileReader("d:\\dbcfg.properties"));
		// 加载properties配置文件
		ptes.load(ClassLoader
				.getSystemResourceAsStream("com\\stx\\s1\\p291jdbc\\dbcfg.properties"));
		// 获取驱动类路径
		String driver = ptes.getProperty("driver");
		// 获取数据库url
		String url = ptes.getProperty("url");
		// 获取数据库用户名
		String username = ptes.getProperty("username");
		// 获取数据库密码
		String password = ptes.getProperty("password");

		// 1.加载驱动
		Class.forName(driver);
		// 2.使用DriverManager获取数据库连接
		Connection connection = DriverManager.getConnection(url, username,
				password);
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
