package com.stx.demo.spring.cpu;

/**
 * Inter CPU类
 * 
 * @author getan
 * 
 */
public class InterCPU extends CPU {

	@Override
	public String show() {
		return coreNo + "核的高性能的英特尔";
	}

}
