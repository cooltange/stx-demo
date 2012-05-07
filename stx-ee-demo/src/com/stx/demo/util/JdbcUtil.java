package com.stx.demo.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtil {

	private static ResultSet rs;
	private static Statement stmt;
	private static Connection con;

	private static String driver;
	private static String url;
	private static String username;
	private static String password;

	static {
		try {
			Properties ptes = new Properties();
			ptes.load(JdbcUtil.class.getResourceAsStream("/dbcfg.properties"));

			driver = ptes.getProperty("driver");
			url = ptes.getProperty("url");
			username = ptes.getProperty("username");
			password = ptes.getProperty("password");

			Class.forName(driver);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cfe){
			cfe.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void release() {
		try {
			if (rs != null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (stmt != null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (con != null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}