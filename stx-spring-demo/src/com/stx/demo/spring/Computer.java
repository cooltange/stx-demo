package com.stx.demo.spring;

import com.stx.demo.spring.cpu.CPU;
import com.stx.demo.spring.monitor.Monitor;

/**
 * ������(��Ϊ��CPU����ʾ��װ��)
 * 
 * @author getan
 * 
 */
public class Computer {
	private CPU cpu;
	private Monitor monitor;

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	@Override
	public String toString() {
		return "��ʾ��:" + monitor.show() + ";" + "\n" + "CPU:" + cpu.show()
				+ "\n";
	}
}
