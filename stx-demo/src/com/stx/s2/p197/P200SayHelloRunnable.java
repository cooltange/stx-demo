package com.stx.s2.p197;

/**
 * �߳̽ӿ�Runnable ʾ����
 * 
 * @author getan
 * 
 */
public class P200SayHelloRunnable {

	public static void main(String[] args) {
		// �����߳̽ӿ�Runnable������Ķ���
		SayHelloRunnable runnable = new SayHelloRunnable();
		// ����һ���߳�
		new Thread(runnable).start();

		for (int i = 0; i < 100; i++) {
			System.out.println("run main!" + i);
		}

	}

}
