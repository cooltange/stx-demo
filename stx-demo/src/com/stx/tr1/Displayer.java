package com.stx.tr1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * ����"display"�� Demo
 * 
 * @author stx
 * 
 */
public class Displayer {

	/**
	 * ��ȡ�ļ�������ʾ�ڿ�����̨�������ʽ����:<br>
	 * display [�ļ�ȫ·��]<br>
	 * ������δ����IO���쳣,�׸������ߴ���<br>
	 * 
	 * @param file
	 * @throws IOException
	 */
	public static void displayFileInfo(String file) throws IOException {
		// �����ַ���������������
		BufferedReader br = null;
		// �����ַ��������������
		BufferedWriter bw = null;

		Reader reader = null;
		Writer writer = null;

		try {
			// �ֽ������� => �ַ�������
			reader = new InputStreamReader(new FileInputStream(file)); // �ļ�
			// ����ͨReader��װ��BufferedReader
			br = new BufferedReader(reader);

			// �ֽ������ => �ַ������
			writer = new OutputStreamWriter(System.out); // ����̨
			// ����ͨWriter��װ��BufferedWriter
			bw = new BufferedWriter(writer);

			// ���ڱ���ÿ�ζ�ȡ(һ���ַ�)�ַ���
			String strLine = null;
			// ʹ��ѭ�����ظ���ȡ(һ���ַ�)�ַ���
			while ((strLine = br.readLine()) != null) {
				// ���ַ���д��˻���������
				bw.write(strLine);
				// д��һ�к���
				bw.newLine();
			}
		} finally {
			// �ر�������
			if (reader != null) {
				reader.close();
			}
			if (br != null) {
				br.close();
			}
			// ������������
			if (writer != null) {
				writer.flush();
			}
			if (bw != null) {
				bw.flush();
			}
		}
	}
}
