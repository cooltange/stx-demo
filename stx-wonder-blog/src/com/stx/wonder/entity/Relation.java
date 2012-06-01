package com.stx.wonder.entity;

import java.util.Date;


public class Relation implements java.io.Serializable {


	private Long id;
	private Integer users_id;
	private Integer friendid;
	private Integer delflag;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getUsers_id() {
		return users_id;
	}
	public void setUsers_id(Integer users_id) {
		this.users_id = users_id;
	}
	public Integer getFriendid() {
		return friendid;
	}
	public void setFriendid(Integer friendid) {
		this.friendid = friendid;
	}
	public Integer getDelflag() {
		return delflag;
	}
	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
	}


}