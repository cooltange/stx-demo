package com.stx.s2.p150;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ���ֽ�����ת��Ϊ����
 * 
 * @author getan
 * 
 */
public class P150ObjectInputStream {
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		try {
			// ����һ��ObjectInputStream�����
			ois = new ObjectInputStream(new FileInputStream("d:\\object.txt"));
			// ���������ж�ȡһ��Java���󣬲�����ǿ������ת��ΪPerson��
			Person person = (Person) ois.readObject();
			System.out.println("����Ϊ��" + person.getName() + "\n����Ϊ��" + person.getAge());
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
