package com.stx.demo.entity;

/**
 * 学生数据实体对象
 * 
 * @author getan
 * 
 */
public class StudentEntity {
	// 学号
	private String sno;
	// 姓名
	private String sname;
	// 年龄
	private int sage;
	// 性别
	private String ssex;
	// 密码
	private String spassword;

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public String getSsex() {
		return ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public String getSpassword() {
		return spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

}
