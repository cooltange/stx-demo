package com.stx.s2.p88;

/**
 * �쳣 ʾ����
 * 
 * @author getan
 * 
 */
public class P90 {

	void hello(String name) {
		if (name == null) {
			throw new NullPointerException();
		}
		// �쳣���׳�֮��Ĵ��벻�ᱻִ��
		System.out.println("Hello" + name);
	}

	public static void main(String[] args) {
		// ���������ֵ
		P90 p90 = new P90();
		p90.hello(null);

	}

}
