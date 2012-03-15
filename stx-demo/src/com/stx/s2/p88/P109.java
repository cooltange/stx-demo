package com.stx.s2.p88;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 异常和方法覆盖
 * 
 * @author getan
 * 
 */
public class P109 {
}

class Base {
	public void a() throws Exception { // 在父类方法声明一个顶层的共同父类(推荐)
	}
}

class Child extends Base {
	public void a() throws IOException {
	}
}

class Child2 extends Base {
	public void a() throws FileNotFoundException {
	}
}

class Child3 extends Base {
	public void a() {
	}
}

class Child4 extends Base {
	public void a() throws SQLException {
		throw new SQLException("test");
	}
}