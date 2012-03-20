package com.stx.s2.p134;

import java.io.FileReader;
import java.io.IOException;

/**
 * �ַ��ļ������� ʾ��(�ַ������ȡ)
 * 
 * @author getan
 * 
 */
public class P135FileReader {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		try {
			// �����ַ�������
			fr = new FileReader("d:\\1.txt");
			// ����һ������Ϊ32���ַ�����
			char[] cbuf = new char[1024];
			// ���ڱ���ʵ�ʶ�ȡ���ַ���
			int hasRead = 0;
			// ʹ��ѭ�����ظ���ȡ�ַ���
			while ((hasRead = fr.read(cbuf)) != -1) {
				// ȡ���ַ������ַ�(����)�����ַ�����ת�����ַ������
				System.out.print(new String(cbuf, 0, hasRead));
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			// ʹ��finally�����ر��ļ�������
			if (fr != null) {
				fr.close();
			}
		}
	}
}
