package com.stx.s2.p88;

/**
 * 异常 示例类
 * 
 * @author getan
 * 
 */
public class P90 {

	void hello(String name) {
		if (name == null) {
			throw new NullPointerException();
		}
		// 异常被抛出之后的代码不会被执行
		System.out.println("Hello" + name);
	}

	public static void main(String[] args) {
		// 传入空引用值
		P90 p90 = new P90();
		p90.hello(null);

	}

}
