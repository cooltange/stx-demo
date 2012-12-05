package com.stx.demo.spring.cpu;

/**
 * AMD CPU类
 * 
 * @author getan
 * 
 */
public class AmdCPU extends CPU {

	@Override
	public String show() {
		return coreNo + "核的高性价比的AMD";
	}

}
