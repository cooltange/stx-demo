package com.stx.s2.p197;

/**
 * ���̱߳��<BR>
 * ʹ�ü̳��߳���Thread��ʽʵ��
 * 
 * @author getan
 * 
 */
class SayHelloThread extends Thread {
	@Override
	public void run() {// ��д���෽��
		// ѭ�����1-1000������
		for (int i = 0; i < 1000; i++) {
			System.out.println("Hello World,thread0!" + i);
		}
	}
}

/**
 * �߳���Thread ʾ����
 * 
 * @author getan
 * 
 */
public class P198SayHello {

	public static void main(String[] args) {
		/** main���������߳̿�ʼ */

		// �����߳���Thread������Ķ���
		SayHelloThread thread0 = new SayHelloThread();
		// ����һ�����߳�
		thread0.start();

		// ��main���������߳��� ѭ�����1-1000������
		for (int i = 0; i < 1000; i++) {
			System.out.println("main thread!" + i);
		}

		/** main���������߳̽��� */
	}

}
