package com.stx.s1.p208;


public class Student {
	private String id;
	private String name;
	Student(String id,String name){
		this.id = id;
		this.name = name;
	}
	public String toString(){
		return "学号为： "+id +"\n"+"姓名为: " + name;
	}
	
	
}
