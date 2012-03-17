package com.stx.s2.p88;

/**
 * finally语法
 * 
 * @author getan
 * 
 */
public class P108 {

	public static void main(String[] args) {
		try {
			// String str = "100";
			String str = "a";
			// 字符串 => 整数
			int i = Integer.parseInt(str);
			System.out.println(i);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} finally {// 异常处理的统一出口
			// 无论try块是否抛出异常,finally块类的代码都会被执行
			System.out.println("finally块被执行");
			
		}
	}

}
