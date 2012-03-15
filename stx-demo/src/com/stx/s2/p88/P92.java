package com.stx.s2.p88;

/**
 * try/catch使用方法
 * 
 * @author getan
 * 
 */
public class P92 {

	public static void main(String[] args) {
		System.out.println("START");

		String name = null;

		try {
			int i = 1 / 0;
			hello(name);
			System.out.println("OK:" + i);
		} catch (NullPointerException ne) { // 子类的catch块写在前面
			System.out.println("出现空引用异常了");
			ne.getStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("除以零了");
			e.getStackTrace();
		} catch (Exception e) { //
			System.out.println("出错了");
			e.getStackTrace();
		}

		System.out.println("END");
	}

	static void hello(String name) {
		// 如果name是空引用
		if (name == null) {
			// 抛出空引用异常
			throw new NullPointerException();
		}

		// 异常被抛出之后的代码不会被执行
		System.out.println("Hello" + name);

	}
}
