package com.stx.s2.p197;

/**
 * ���̱߳��<BR>
 * ʹ��ʵ���߳̽ӿ�Runnable��ʽʵ��
 * 
 * @author getan
 * 
 */
public class P200SayHelloRunnable {

	public static void main(String[] args) {
		/** main���������߳̿�ʼ */

		// �����߳̽ӿ�Runnable������Ķ���
		SayHelloRunnable runnable = new SayHelloRunnable();

		// ����һ���̶߳���,����һ�����߳�
		new Thread(runnable).start();

		// ��main���������߳��� ѭ�����1-1000������
		for (int i = 0; i < 1000; i++) {
			System.out.println("main thread!" + i);
		}

		/** main���������߳̽��� */
	}
}

/**
 * ���̱߳��<BR>
 * ʹ��ʵ��Runnable�ӿڷ�ʽʵ��
 * 
 * @author getan
 * 
 */
class SayHelloRunnable implements Runnable {
	@Override
	public void run() {// ��д���෽��
		// ѭ�����1-1000������
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello Runnable!" + i);
		}
	}
}