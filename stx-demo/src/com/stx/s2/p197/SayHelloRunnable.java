package com.stx.s2.p197;

/**
 * ���̱߳��<BR>
 * ʹ��ʵ��Runnable�ӿڷ�ʽʵ��
 * 
 * @author getan
 * 
 */
public class SayHelloRunnable implements Runnable{

	@Override
	public void run() {// ��д���෽��
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello Runnable!" + i);
		}
	}
}
