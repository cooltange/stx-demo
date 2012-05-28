package com.stx.demo.spring;

import com.stx.demo.spring.cpu.AmdCPU;
import com.stx.demo.spring.cpu.InterCPU;
import com.stx.demo.spring.cpu.CPU;
import com.stx.demo.spring.monitor.CRT;
import com.stx.demo.spring.monitor.LCD;
import com.stx.demo.spring.monitor.Monitor;

/**
 * ��ͨװ�䷽ʽ
 * 
 * @author getan
 * 
 */
public class Test {

	public static void main(String[] args) {
		// ѡ����ʾ��
		Monitor monitor = new LCD();

		// ѡ��CPU
		CPU cpu = new AmdCPU();

		// װ��
		Computer computer = new Computer();
		computer.setCpu(cpu);
		computer.setMonitor(monitor);

		// ����װ���嵥
		System.out.println(computer);

	}

}
