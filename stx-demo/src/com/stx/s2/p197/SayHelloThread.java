package com.stx.s2.p197;

/**
 * ���̱߳��<BR>
 * ʹ�ü̳��߳���Thread��ʽʵ��
 * 
 * @author getan
 * 
 */
public class SayHelloThread extends Thread {

	@Override
	public void run() {// ��д���෽��
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello Thread!" + i);
		}
	}
}
