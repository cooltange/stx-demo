package com.stx.s2.p81;

/**
 * �����ڲ���ʾ����
 * 
 * @author getan
 * 
 */
public class TestAnonymous {
	public void test(Product p) {
		System.out.println("������һ��" + p.getName() + "��������" + p.getPrice());
	}

	public static void main(String[] args) {
		TestAnonymous ta = new TestAnonymous();
		// ��������ʽ
		GraphicCard gc = new GraphicCard();
		ta.test(new GraphicCard());

		// ����test����ʱ����Ҫ����һ��Product�������˴�����������ʵ�����ʵ��
		ta.test(new Product() {
			public double getPrice() {
				return 567.8;
			}

			public String getName() {
				return "NVIDIA�Կ�";
			}
		});
	}
}
