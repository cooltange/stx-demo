package com.stx.s2.p81;

/**
 * 显卡类 (实现了产品Product接口)
 * 
 * @author getan
 * 
 */
class GraphicCard implements Product {

	public double getPrice() {
		return 567.8;
	}

	public String getName() {
		return "NVIDIA显卡";
	}
}