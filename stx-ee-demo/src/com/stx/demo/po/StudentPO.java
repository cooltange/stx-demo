package com.stx.demo.po;

/**
 * 学生数据库持久对象
 * 
 * @author getan
 * 
 */
public class StudentPO {

	private String sno;
	private String sname;
	private int sage;
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
