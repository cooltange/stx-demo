package com.stx.wonder.entity;



public class Message implements java.io.Serializable {

	private Long mid;
	private Long receiver;
	private Long sender;
	private String title;
	private String message;
	private Integer readflag;
	private Integer delflag;
	private Long parentid;

	public Long getMid() {
		return mid;
	}

	public void setMid(Long mid) {
		this.mid = mid;
	}

	public Long getReceiver() {
		return receiver;
	}

	public void setReceiver(Long receiver) {
		this.receiver = receiver;
	}

	public Long getSender() {
		return sender;
	}

	public void setSender(Long sender) {
		this.sender = sender;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getReadflag() {
		return readflag;
	}

	public void setReadflag(Integer readflag) {
		this.readflag = readflag;
	}

	public Integer getDelflag() {
		return delflag;
	}

	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
	}

	public Long getParentid() {
		return parentid;
	}

	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}

}