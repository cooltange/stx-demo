package com.stx.s2.p197;

/**
 * 多线程编程<BR>
 * 使用实现线程接口Runnable方式实现
 * 
 * @author getan
 * 
 */
public class P200SayHelloRunnable {

	public static void main(String[] args) {
		/** main方法的主线程开始 */

		// 创建线程接口Runnable的子类的对象
		SayHelloRunnable runnable = new SayHelloRunnable();

		// 创建一个线程对象,启动一个新线程
		new Thread(runnable).start();

		// 在main方法的主线程中 循环输出1-1000的整数
		for (int i = 0; i < 1000; i++) {
			System.out.println("main thread!" + i);
		}

		/** main方法的主线程结束 */
	}
}

/**
 * 多线程编程<BR>
 * 使用实现Runnable接口方式实现
 * 
 * @author getan
 * 
 */
class SayHelloRunnable implements Runnable {
	@Override
	public void run() {// 重写父类方法
		// 循环输出1-1000的整数
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello Runnable!" + i);
		}
	}
}