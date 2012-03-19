package com.stx.s2.p108;

/**
 * �˻���
 * 
 * @author ������
 * 
 */
public class Account {
	private String name;
	private double amount;

	public String getName() {
		return name;
	}

	public Account(String name, double amount) {
		this.name = name;
		this.amount = amount;
	}

	public void transfer(Account anotherAccount, double value) throws Exception {
		if (value < 0) {
			throw new Exception("ת�ʽ���Ϊ��");
		}
		if (amount < value) {
			throw new Exception("����");

		} else {
			anotherAccount.amount += value;
			this.amount -= value;

		}
		System.out.println("ת�ʳɹ�,ת�ʽ��" + value + "Ԫ");
	}

}
