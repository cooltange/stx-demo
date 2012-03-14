package com.stx.s1.p112;

/**
 * 计算数组中的前多少个数的和大于20，当大于20时不再继续循环
 * @author qinguoqiang
 *
 */
public class Ex_01_0218 {

	
	public static void main(String[] args) {
		int[] array = {1,3,5,7,9,11,13};
		int i = 0;
		int sum = 0;
		for(i=0;i<array.length;i++){
			sum = sum+array[i];
			if(sum>20) break;
		}
		System.out.print(i);
	}

}
