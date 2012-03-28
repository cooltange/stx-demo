package com.stx.s2.p197;

/**
 * 线程接口Runnable 示例类
 * 
 * @author getan
 * 
 */
public class P200SayHelloRunnable {

	public static void main(String[] args) {
		// 创建线程接口Runnable的子类的对象
		SayHelloRunnable runnable = new SayHelloRunnable();
		// 启动一个线程
		new Thread(runnable).start();

		for (int i = 0; i < 100; i++) {
			System.out.println("run main!" + i);
		}

	}

}
