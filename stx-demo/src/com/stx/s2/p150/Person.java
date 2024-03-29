package com.stx.s2.p150;

/**
 * 可序列化类(实现Serializable接口)
 * 
 * @author getan
 * 
 */
public class Person implements java.io.Serializable {
	/** serialVersionUID */
	private static final long serialVersionUID = 6697951477123891119L;

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
}