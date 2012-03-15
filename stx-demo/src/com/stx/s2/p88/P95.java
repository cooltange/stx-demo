package com.stx.s2.p88;

/**
 * try/catch使用方法
 * 
 * @author getan
 * 
 */
public class P95 {
	public static void main(String[] args) {
		// eclipse中给main方法的args数组传参数的方法
		// 菜单Run => Run Configurations =>
		// Main class处选中该类名
		// 切换到Arguments选项卡
		// 在program arguments 处输入欲传入main方法的args数组参数
		int numValue = 0;
		try {
			String number = args[0];
			numValue = Integer.parseInt(number);

			if (numValue < 0) {
				throw new Exception("太小");
			}
		} catch (ArrayIndexOutOfBoundsException e) { // 数组下标越界异常类
			e.printStackTrace();
		} catch (NumberFormatException e) {// 数据格式异常类
			e.printStackTrace();
		} catch (Exception e) { // 异常类
			e.printStackTrace();
		}

		System.out.println("result:" + numValue * numValue);

	}
}
