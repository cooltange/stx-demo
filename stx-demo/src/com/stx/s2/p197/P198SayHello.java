package com.stx.s2.p197;

/**
 * �߳���Thread ʾ����
 * 
 * @author getan
 * 
 */
public class P198SayHello {

	public static void main(String[] args) {
		// �����߳���Thread������Ķ���
		SayHelloThread thread = new SayHelloThread();
		// ����һ���߳�
		thread.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("run main!" + i);
		}

	}

}
