package com.stx.s1.p291jdbc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties读取配置文件示例
 * 
 * @author getan
 * 
 */
public class PropertiesTest {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		// 创建Properties对象
		Properties ptes = new Properties();
		// 加载properties配置文件
		ptes.load(ClassLoader
				.getSystemResourceAsStream("com\\stx\\s1\\p291jdbc\\dbcfg.properties"));
		// 在控制台输出配置文件中各个key对应的value
		System.out.println(ptes.getProperty("driver"));
		System.out.println(ptes.getProperty("url"));
		System.out.println(ptes.getProperty("password"));
		System.out.println(ptes.getProperty("username"));
	}

}
