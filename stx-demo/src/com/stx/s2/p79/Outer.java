package com.stx.s2.p79;

/**
 * �ⲿ��
 * 
 * @author getan
 * 
 */
public class Outer {
	private int i = 1;

	/**
	 * �ڲ���
	 * 
	 * @author getan
	 */
	private class Inner {
		int i;

		Inner() {
			// �ڲ������ֱ�ӷ����ⲿ��ĳ�Ա
			// ���ڲ����������ⲿ����������ʱ��ʹ��Outer.this�����ⲿʵ��
			this.i = Outer.this.i * 2;
		}

	}

	public static void main(String[] args) {
		Outer outer = new Outer();

		// �����ڲ������
		Outer.Inner inner = outer.new Inner();
	}

}
