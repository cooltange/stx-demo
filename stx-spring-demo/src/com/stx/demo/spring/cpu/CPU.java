package com.stx.demo.spring.cpu;

/**
 * CPU ≥ÈœÛ¿‡
 * 
 * @author getan
 * 
 */
public abstract class CPU {
	private int coreNo;
	private int frq;
	private String name;

	public CPU(int coreNo, String name) {
		this.coreNo = coreNo;
		this.name = name;
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

	public int getFrq() {
		return frq;
	}

	public void setFrq(int frq) {
		this.frq = frq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
