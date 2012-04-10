package com.stx.s1.p291jdbc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties��ȡ�����ļ�ʾ��
 * 
 * @author getan
 * 
 */
public class PropertiesTest {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		// ����Properties����
		Properties ptes = new Properties();
		// ����properties�����ļ�
		ptes.load(ClassLoader
				.getSystemResourceAsStream("com\\stx\\s1\\p291jdbc\\dbcfg.properties"));
		// �ڿ���̨��������ļ��и���key��Ӧ��value
		System.out.println(ptes.getProperty("driver"));
		System.out.println(ptes.getProperty("url"));
		System.out.println(ptes.getProperty("password"));
		System.out.println(ptes.getProperty("username"));
	}

}
