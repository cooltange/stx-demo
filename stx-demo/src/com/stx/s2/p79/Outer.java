package com.stx.s2.p79;

/**
 * 外部类
 * 
 * @author getan
 * 
 */
public class Outer {
	private int i = 1;
	/**
	 * 内部类
	 * @author getan
	 */
	private class Inner {
		int i;

		Inner() {
			// 内部类可以直接访问外部类的成员
			// 与内部类重名时可使用Outer.this引用外部实例
			this.i = Outer.this.i * 2;
		}

	}

	public static void main(String[] args) {
		Outer outer = new Outer();

		Outer.Inner inner = outer.new Inner();

	}

}
