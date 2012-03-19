package com.stx.s2.p122;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * �ֽ��ļ������� ʾ��(�ֽ������ȡ)
 * 
 * @author getan
 * 
 */
public class P123FileInputStreamWithBytes {

	/**
	 * ��ȡ�ļ���Ϣ
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// �����ֽ�������
		InputStream in = new FileInputStream("d:\\1.txt");

		// ����һ������Ϊ1024���ֽ�����
		byte[] bbuf = new byte[1024];

		try {
			// ���ڱ���ʵ�ʶ�ȡ���ֽ���
			int hasRead = 0;
			// ʹ��ѭ�����ظ���ȡ�ֽ���
			while ((hasRead = in.read(bbuf)) != -1) {
				// ȡ���ֽ������ֽ�(����)�����ֽ�����ת�����ַ������
				System.out.print(new String(bbuf, 0, hasRead));
			}
		} finally {
			// ��֤�����Թر��ֽ��ļ�������
			in.close();
		}

	}
}