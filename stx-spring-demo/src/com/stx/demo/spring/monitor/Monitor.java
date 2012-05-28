package com.stx.demo.spring.monitor;

/**
 * 显示器 抽象类
 * 
 * @author getan
 * 
 */
public abstract class Monitor {
	double size;
	String name;

	public abstract String show();

	public Monitor(double size, String name) {
		this.size = size;
		this.name = name;
	}

	public Monitor() {
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
