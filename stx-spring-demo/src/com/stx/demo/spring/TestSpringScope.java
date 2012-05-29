package com.stx.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring scope 演示类
 * 
 * @author getan
 * 
 */
public class TestSpringScope {

	public static void main(String[] args) {
		// 使用spring上下文对象加载spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		// 接收spring已创建并装配好后的Computer对象
		Computer computer1 = (Computer) context.getBean("cpt");
		Computer computer2 = (Computer) context.getBean("cpt");

		// 罗列装配清单
		System.out.println(computer1);
		System.out.println(computer2);

		// 通过==判断两个对象是否是一个对象
		System.out.println("两台电脑配置一样,可是否是同一台电脑?");
		System.out.println(computer1 == computer2);

	}

}
