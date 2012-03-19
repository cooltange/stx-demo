package com.stx.s2.p127;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �ֽ��ļ������ ʾ��(�ֽ������ȡ)
 * 
 * @author getan
 * 
 */
public class P128FileOutputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// �����ֽ�������
			fis = new FileInputStream("d:\\1.txt");
			// �����ֽ�������
			fos = new FileOutputStream("d:\\3.txt"); // ����ģʽ(Ĭ��)
			//fos = new FileOutputStream("d:\\3.txt",true); // ׷��ģʽ
			// ���������ֽ�����
			byte[] bbuf = new byte[32];
			// ÿ�ζ�ȡ�ֽ���
			int hasRead = 0;
			// ѭ������������ȡ������
			while ((hasRead = fis.read(bbuf)) != -1) {
				// ÿ��ȡһ�Σ���д���ļ�����������˶��٣���д���١�
				fos.write(bbuf, 0, hasRead);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			// ʹ��finally�����ر��ļ�������
			if (fis != null) {
				fis.close();
			}
			// ʹ��finally�����ر��ļ������
			if (fos != null) {
				fos.close();
			}
		}
	}
}
