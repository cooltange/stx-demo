package com.stx.s2.p134;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * �ַ���������(��)�� ʾ��
 * 
 * @author getan
 * 
 */
public class P136BufferedReader {

	/**
	 * ʹ���ַ���������(��)�� �����ļ�
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// �����ַ�������
		Reader reader = new FileReader("d:\\1.txt");
		BufferedReader bfReader = new BufferedReader(reader);

		// �����ַ������
		Writer writer = new FileWriter("d:\\2.txt");
		BufferedWriter bfWriter = new BufferedWriter(writer);

		try {
			// ���ڱ���ÿ�ζ�ȡ���ַ�����
			String str = null;
			// ʹ��ѭ�����ظ���ȡÿ���ַ�
			while ((str = bfReader.readLine()) != null) {
				// ��ָ�����ַ�д��˻���������
				bfWriter.write(str);
				// ����
				bfWriter.newLine();
			}
		} finally {
			// ��֤�����Թر��ַ���������(��)��
			bfReader.close();
			bfWriter.close();
		}

	}
}