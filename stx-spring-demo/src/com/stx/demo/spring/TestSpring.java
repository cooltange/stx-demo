package com.stx.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 采用spring的装配方式
 * 
 * @author getan
 * 
 */
public class TestSpring {

	public static void main(String[] args) {
		// 使用spring上下文对象加载spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		
		// 接收spring已创建并装配好后的Computer对象
		Computer computer = (Computer) context.getBean("cpt");

		// 罗列装配清单
		System.out.println(computer);

	}

}
