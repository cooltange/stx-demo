package com.stx.s2.p134;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * �ֽ��� => �ַ��� �ۺ�ʵ�� (���ļ���Ϣ���������̨��ʾ)
 * 
 * @author getan
 * 
 */
public class P143InputStreamReaderAndWriter {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			// �ֽ������� => �ַ�������
			Reader reader = new InputStreamReader(new FileInputStream(
					"d:\\1.txt")); // �ļ�
			// ����ͨReader��װ��BufferedReader
			br = new BufferedReader(reader);

			// �ֽ������ => �ַ������
			Writer writer = new OutputStreamWriter(System.out); // ����̨
			// ����ͨWriter��װ��BufferedWriter
			bw = new BufferedWriter(writer);

			// ���ڱ���ÿ�ζ�ȡ��һ���ַ���
			String str = null;
			// ʹ��ѭ�����ظ���ȡÿ���ַ�
			while ((str = br.readLine()) != null) {
				// ��ָ�����ַ�д��˻���������
				bw.write(str);
				// ����
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// �ر�������
		finally {
			try {
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}
