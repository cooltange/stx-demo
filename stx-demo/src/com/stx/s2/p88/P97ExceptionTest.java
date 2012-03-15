package com.stx.s2.p88;

/**
 * 方法的调用栈
 * 
 * @author getan
 * 
 */
public class P97ExceptionTest {

	void a() {
		b();
	}

	void b() {
		c();
	}

	void c() {
		throw new RuntimeException();
	}

	public static void main(String[] args) {
		new P97ExceptionTest().a();

	}
}
