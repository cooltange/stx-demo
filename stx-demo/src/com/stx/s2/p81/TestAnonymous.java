package com.stx.s2.p81;

/**
 * 匿名内部类示例类
 * 
 * @author getan
 * 
 */
public class TestAnonymous {
	public void test(Product p) {
		System.out.println("购买了一个" + p.getName() + "，花掉了" + p.getPrice());
	}

	public static void main(String[] args) {
		TestAnonymous ta = new TestAnonymous();
		// 非匿名方式
		GraphicCard gc = new GraphicCard();
		ta.test(new GraphicCard());

		// 调用test方法时，需要传入一个Product参数，此处传入其匿名实现类的实例
		ta.test(new Product() {
			public double getPrice() {
				return 567.8;
			}

			public String getName() {
				return "NVIDIA显卡";
			}
		});
	}
}
