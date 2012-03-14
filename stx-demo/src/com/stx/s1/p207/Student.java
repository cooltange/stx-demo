package com.stx.s1.p207;


public class Student {
	private int id;
	private String name;
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(obj instanceof Student)
		return this.id==((Student)obj).id&&this.name==((Student)obj).name;
		return false;
	}
	
	public int hashCode() {
		
		return id*1024;
	}
	
	
	
	
}
