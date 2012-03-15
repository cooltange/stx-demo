package com.stx.s2.p88;

/**
 * try/catchʹ�÷���
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
		} catch (NullPointerException ne) { // �����catch��д��ǰ��
			System.out.println("���ֿ������쳣��");
			ne.getStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("��������");
			e.getStackTrace();
		} catch (Exception e) { //
			System.out.println("������");
			e.getStackTrace();
		}

		System.out.println("END");
	}

	static void hello(String name) {
		// ���name�ǿ�����
		if (name == null) {
			// �׳��������쳣
			throw new NullPointerException();
		}

		// �쳣���׳�֮��Ĵ��벻�ᱻִ��
		System.out.println("Hello" + name);

	}
}
