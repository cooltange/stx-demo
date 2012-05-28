package com.stx.demo.spring;

import com.stx.demo.spring.cpu.CPU;
import com.stx.demo.spring.monitor.Monitor;

/**
 * 电脑类(简化为由CPU及显示器装配)
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
		return "显示器:" + monitor.show() + ";" + "\n" + "CPU:" + cpu.show()
				+ "\n";
	}
}
