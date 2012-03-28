package com.stx.s2.p197;

/**
 * 线程类Thread 示例类
 * 
 * @author getan
 * 
 */
public class P198SayHello {

	public static void main(String[] args) {
		// 创建线程类Thread的子类的对象
		SayHelloThread thread = new SayHelloThread();
		// 启动一个线程
		thread.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("run main!" + i);
		}

	}

}
