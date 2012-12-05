package com.stx.demo.spring.monitor;

/**
 * 显示器 抽象类
 * 
 * @author getan
 * 
 */
public abstract class Monitor {
	protected double size;

	public abstract String show();

	public Monitor(double size) {
		this.size = size;
	}

	public Monitor() {
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

}
