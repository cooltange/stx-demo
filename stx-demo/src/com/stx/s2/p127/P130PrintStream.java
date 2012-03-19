package com.stx.s2.p127;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * ��ӡ���ֽ������
 * 
 * @author getan
 * 
 */
public class P130PrintStream {
	public static void main(String[] args) throws IOException {
		PrintStream ps = null;
		try {
			// ����һ���ڵ��������FileOutputStream
			FileOutputStream fos = new FileOutputStream("d:\\PrintStream.txt");

			// ��PrintStream����װFileOutputStream�����
			ps = new PrintStream(fos);

			// ʹ��PrintStreamִ�����
			ps.print("��ͨ�ַ���");

		} catch (IOException ioe) {
			ioe.printStackTrace(ps);
		} finally {
			ps.close();
		}
	}
}
