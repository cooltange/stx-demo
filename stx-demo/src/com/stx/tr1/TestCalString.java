package com.stx.tr1;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * �ַ������ʽ =>��������
 * 
 * @author getan
 * 
 */
public class TestCalString {

	public static void main(String[] args) throws ScriptException {
		// ��֪����������ʽ
		String expression = "2-1+2*4";
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("javascript");
		// �������������
		System.out.print(engine.eval(expression));
	}

}
