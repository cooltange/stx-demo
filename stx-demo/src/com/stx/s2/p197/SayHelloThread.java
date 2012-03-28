package com.stx.s2.p197;

/**
 * 多线程编程<BR>
 * 使用继承线程类Thread方式实现
 * 
 * @author getan
 * 
 */
public class SayHelloThread extends Thread {

	@Override
	public void run() {// 重写父类方法
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello Thread!" + i);
		}
	}
}
