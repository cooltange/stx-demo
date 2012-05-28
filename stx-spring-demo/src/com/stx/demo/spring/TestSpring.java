package com.stx.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ����spring��װ�䷽ʽ
 * 
 * @author getan
 * 
 */
public class TestSpring {

	public static void main(String[] args) {
		// ʹ��spring�����Ķ������spring�����ļ�
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		
		// ����spring�Ѵ�����װ��ú��Computer����
		Computer computer = (Computer) context.getBean("cpt");

		// ����װ���嵥
		System.out.println(computer);

	}

}
