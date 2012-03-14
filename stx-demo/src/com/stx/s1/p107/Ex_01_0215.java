package com.stx.s1.p107;

import java.util.Scanner;

/**
 * 
 * 计算某年某月有多少天。
 * 
 * @author qinguoqiang
 *
 */
public class Ex_01_0215 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		boolean isTrue = true;
		System.out.println("按任意键启动程序,输入“exit”结束程序");
		if ("exit".equals(s.next()))
			isTrue = false;
		while (isTrue) {
			System.out.println("请输入年：");
			int year = s.nextInt();
			System.out.println("请输入月：");
			int month = s.nextInt();
			System.out.print(getDays(year, month));
			isTrue = false;
			System.out.println("按任意键继续程序,输入“exit”结束程序");
			if ("exit".equals(s.next()))
				isTrue = false;
			else
				isTrue = true;
		}
	}

	public static int getDays(int year, int month) {
		int day = 0;
		boolean isR = false;

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			isR = true;

		switch (month) {
		case 1:
			day = 31;
			break;
		case 2: {
			if (isR)
				day = 29;
			else
				day = 28;
			break;
		}
		case 3:
			day = 31;
			break;
		case 4:
			day = 30;
			break;
		case 5:
			day = 31;
			break;
		case 6:
			day = 30;
			break;
		case 7:
			day = 31;
			break;
		case 8:
			day = 31;
			break;
		case 9:
			day = 30;
			break;
		case 10:
			day = 31;
			break;
		case 11:
			day = 30;
			break;
		case 12:
			day = 31;
			break;
		default:
			System.out.println("请输入正确的数值");
		}
		return day;
	}
}
