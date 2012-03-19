package com.stx.s2.p122;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * �ֽ��ļ������� ʾ��(���ֽڶ�ȡ)
 * 
 * @author getan
 * 
 */
public class P123FileInputStream {

	/**
	 * ��ȡ�ļ���Ϣ
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// �����ֽ�������
		InputStream in = new FileInputStream("d:\\1.txt");

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