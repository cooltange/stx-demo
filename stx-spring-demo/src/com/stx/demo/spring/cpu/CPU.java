package com.stx.demo.spring.cpu;

/**
 * CPU 抽象类
 * 
 * @author getan
 * 
 */
public abstract class CPU {
	protected int coreNo;
	public CPU(int coreNo) {
		this.coreNo = coreNo;
	}

	public abstract String show();

	public CPU() {
	}

	public int getCoreNo() {
		return coreNo;
	}

	public void setCoreNo(int coreNo) {
		this.coreNo = coreNo;
	}

}
