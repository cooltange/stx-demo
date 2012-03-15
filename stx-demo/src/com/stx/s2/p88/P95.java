package com.stx.s2.p88;

/**
 * try/catchʹ�÷���
 * 
 * @author getan
 * 
 */
public class P95 {
	public static void main(String[] args) {
		// eclipse�и�main������args���鴫�����ķ���
		// �˵�Run => Run Configurations =>
		// Main class��ѡ�и�����
		// �л���Argumentsѡ�
		// ��program arguments ������������main������args�������
		int numValue = 0;
		try {
			String number = args[0];
			numValue = Integer.parseInt(number);

			if (numValue < 0) {
				throw new Exception("̫С");
			}
		} catch (ArrayIndexOutOfBoundsException e) { // �����±�Խ���쳣��
			e.printStackTrace();
		} catch (NumberFormatException e) {// ���ݸ�ʽ�쳣��
			e.printStackTrace();
		} catch (Exception e) { // �쳣��
			e.printStackTrace();
		}

		System.out.println("result:" + numValue * numValue);

	}
}
