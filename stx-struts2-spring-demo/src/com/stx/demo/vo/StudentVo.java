package com.stx.demo.vo;

/**
 * 学生数据视图对象
 * 
 * @author getan
 * 
 */
public class StudentVo {
	// 学号
	private String sno;
	// 姓名
	private String sname;
	// 年龄
	private Integer sage;
	// 性别
	private String ssex;

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

}
