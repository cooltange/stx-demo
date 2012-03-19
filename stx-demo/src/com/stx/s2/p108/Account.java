package com.stx.s2.p108;

/**
 * 账户类
 * 
 * @author 曾佳文
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
			throw new Exception("转帐金额不能为负");
		}
		if (amount < value) {
			throw new Exception("余额不足");

		} else {
			anotherAccount.amount += value;
			this.amount -= value;

		}
		System.out.println("转帐成功,转帐金额" + value + "元");
	}

}
