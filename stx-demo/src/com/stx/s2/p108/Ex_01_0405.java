package com.stx.s2.p108;

import java.util.Date;

/**
 * EX_01_0405
 * 
 * @author 曾佳文
 * 
 */
public class Ex_01_0405 {
	public static void main(String[] args) {
		Account one = new Account("杜伟", 500);
		Account two = new Account("张三", 400);

		try {
			one.transfer(two, 600);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Date d = new Date();
			System.out.println(one.getName() + d.toLocaleString() + "进行了转帐操作");
		}

	}
}
