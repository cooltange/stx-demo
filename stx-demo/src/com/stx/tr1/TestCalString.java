package com.stx.tr1;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 字符串表达式 =>四则运算
 * 
 * @author getan
 * 
 */
public class TestCalString {

	public static void main(String[] args) throws ScriptException {
		// 已知四则运算表达式
		String expression = "2-1+2*4";
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("javascript");
		// 输出四则运算结果
		System.out.print(engine.eval(expression));
	}

}
