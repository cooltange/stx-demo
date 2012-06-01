package com.stx.wonder.entity;

public class Comments implements java.io.Serializable {

	private Long id;
	private Long bid;
	private String content;
	private Boolean delflag;
	private Boolean readflag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBid() {
		return bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Boolean getDelflag() {
		return delflag;
	}

	public void setDelflag(Boolean delflag) {
		this.delflag = delflag;
	}

	public Boolean getReadflag() {
		return readflag;
	}

	public void setReadflag(Boolean readflag) {
		this.readflag = readflag;
	}

}