package com.stx.s2.p150;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ������ת��Ϊ�ֽ�����
 * 
 * @author getan
 * 
 */
public class P150ObjectOutputStream {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		try {
			// ����һ��ObjectOutputStream�����
			oos = new ObjectOutputStream(new FileOutputStream("d:\\object.txt"));
			// ����Peron��Ķ���
			Person peron = new Person("��˽�", 2000);
			// ��peron����д�������
			oos.writeObject(peron);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
