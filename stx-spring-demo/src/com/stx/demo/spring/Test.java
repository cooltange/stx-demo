package com.stx.demo.spring;

import com.stx.demo.spring.cpu.AmdCPU;
import com.stx.demo.spring.cpu.InterCPU;
import com.stx.demo.spring.cpu.CPU;
import com.stx.demo.spring.monitor.CRT;
import com.stx.demo.spring.monitor.LCD;
import com.stx.demo.spring.monitor.Monitor;

/**
 * 普通装配方式
 * 
 * @author getan
 * 
 */
public class Test {

	public static void main(String[] args) {
		// 选购显示器
		Monitor monitor = new LCD();

		// 选购CPU
		CPU cpu = new AmdCPU();

		// 装配
		Computer computer = new Computer();
		computer.setCpu(cpu);
		computer.setMonitor(monitor);

		// 罗列装配清单
		System.out.println(computer);

	}

}
