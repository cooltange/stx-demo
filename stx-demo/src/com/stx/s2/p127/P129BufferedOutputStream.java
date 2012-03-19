package com.stx.s2.p127;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * �ֽڻ�������(��)�� ʾ��
 * 
 * @author getan
 * 
 */
public class P129BufferedOutputStream {

	/**
	 * ʹ���ֽڻ�������(��)�� �����ļ�
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// �����ֽ�������
		InputStream in = new FileInputStream("d:\\1.txt");
		BufferedInputStream bis = new BufferedInputStream(in);

		// �����ֽ������
		OutputStream out = new FileOutputStream("d:\\2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(out);

		try {
			// ���ڱ����ȡ�ĵ��ֽ�ֵ
			int n = 0;
			// ʹ��ѭ�����ظ���ȡ�ֽ���
			while ((n = bis.read()) != -1) {
				// ��ָ�����ֽ�д��˻���������
				bos.write(n);
			}
		} finally {
			// ��֤�����Թر��ֽڻ�������(��)��
			bis.close();
			bos.close();
		}
	}
}