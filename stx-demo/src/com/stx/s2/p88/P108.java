package com.stx.s2.p88;

/**
 * finally�﷨
 * 
 * @author getan
 * 
 */
public class P108 {

	public static void main(String[] args) {
		try {
			// String str = "100";
			String str = "a";
			// �ַ��� => ����
			int i = Integer.parseInt(str);
			System.out.println(i);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} finally {// �쳣�����ͳһ����
			// ����try���Ƿ��׳��쳣,finally����Ĵ��붼�ᱻִ��
			System.out.println("finally�鱻ִ��");
			
		}
	}

}
