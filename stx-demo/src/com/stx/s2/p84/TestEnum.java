package com.stx.s2.p84;

/**
 * ö���� ʾ����
 * 
 * 
 * @author getan
 * 
 */
public class TestEnum {

	public void test(SeasonEnum s) {
		// jdk5֮��,switch�����ı��ʽ������ö��ֵ
		switch (s) {
		case SPRING:
			System.out.println("��ů����������̤��");
			break;
		case SUMMER:
			System.out.println("�������ף��ʺ���Ӿ");
			break;
		case FALL:
			System.out.println("�����ˬ��������ʱ");
			break;
		case WINTER:
			System.out.println("����ѩƮ��Χ¯��ѩ");
			break;
		}
	}

	public static void main(String[] args) {
		// ����ö���඼��һ��values���������ظ�ö���������ʵ��
		for (SeasonEnum s : SeasonEnum.values()) {
			System.out.println(s);
		}

		new TestEnum().test(SeasonEnum.SPRING);
	}
}