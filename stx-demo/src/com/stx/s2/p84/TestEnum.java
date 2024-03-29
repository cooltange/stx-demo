package com.stx.s2.p84;

/**
 * 枚举类 示例类
 * 
 * 
 * @author getan
 * 
 */
public class TestEnum {

	public void test(SeasonEnum s) {
		// jdk5之后,switch语句里的表达式可以是枚举值
		switch (s) {
		case SPRING:
			System.out.println("春暖花开，正好踏青");
			break;
		case SUMMER:
			System.out.println("夏日炎炎，适合游泳");
			break;
		case FALL:
			System.out.println("秋高气爽，进补及时");
			break;
		case WINTER:
			System.out.println("冬日雪飘，围炉赏雪");
			break;
		}
	}

	public static void main(String[] args) {
		// 所有枚举类都有一个values方法，返回该枚举类的所有实例
		for (SeasonEnum s : SeasonEnum.values()) {
			System.out.println(s);
		}

		new TestEnum().test(SeasonEnum.SPRING);
	}
}