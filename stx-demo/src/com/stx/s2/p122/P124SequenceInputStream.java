package com.stx.s2.p122;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

/**
 * ���������� ʾ��(���ֽڶ�ȡ)
 * 
 * @author getan
 * 
 */
public class P124SequenceInputStream {

	/**
	 * ��ȡ�ļ���Ϣ
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		InputStream in1 = new FileInputStream("d:\\1.txt");
		InputStream in2 = new FileInputStream("d:\\2.txt");

		// ���������������ϲ�����������
		InputStream in = new SequenceInputStream(in1,in2);

		try {
			// ���ڱ����ȡ�ĵ��ֽ�ֵ
			int n = 0;
			// ʹ��ѭ�����ظ���ȡ�ֽ���
			while ((n = in.read()) != -1) {
				// ѭ��ȡ���ֽ����е��ֽڣ������ֽ�ת�����ַ������
				System.out.print((char) n);
			}
		} finally {
			// ��֤�����Թر��ֽ��ļ�������
			in.close();
		}

	}
}