package com.stx.s3.p90dao.entity;

/**
 * ѧ��ʵ����
 * 
 * @author getan
 * 
 */
public class StudentEntity {
	// ѧ��
	private String sno;
	// ����
	private String sname;
	// ����
	private int sage;
	// �Ա�
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
