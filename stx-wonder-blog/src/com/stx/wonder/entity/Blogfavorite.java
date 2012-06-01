package com.stx.wonder.entity;

public class Blogfavorite implements java.io.Serializable {

	private Long id;
	private Long bid;
	private Long users_id;
	private Integer delflag = 0;

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

	public Integer getDelflag() {
		return delflag;
	}

	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}