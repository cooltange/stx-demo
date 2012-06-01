package com.stx.wonder.entity;



public class Blogger implements java.io.Serializable {


	private Long bid;
	private Long users_id;
	private String title;
	private String content;
	private Integer levels;
	private Integer readable;
	private Integer delflag=0;
	public Long getBid() {
		return bid;
	}
	public void setBid(Long bid) {
		this.bid = bid;
	}
	public Long getUsers_id() {
		return users_id;
	}
	public void setUsers_id(Long users_id) {
		this.users_id = users_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getLevels() {
		return levels;
	}
	public void setLevels(Integer levels) {
		this.levels = levels;
	}
	public Integer getReadable() {
		return readable;
	}
	public void setReadable(Integer readable) {
		this.readable = readable;
	}
	public Integer getDelflag() {
		return delflag;
	}
	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
	}



}