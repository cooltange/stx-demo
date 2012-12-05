package com.stx.demo.spring.monitor;
/**
 * 液晶显示器
 * 
 * @author getan
 * 
 */
public class LCD extends Monitor {

	@Override
	public String show() {
		return size + "寸的小苗条显示器";
	}

}
