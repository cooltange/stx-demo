package com.stx.wonder.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Category implements java.io.Serializable {

	private Long cid;
	private String cname;
	private Long users_id;
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getUsers_id() {
		return users_id;
	}
	public void setUsers_id(Long users_id) {
		this.users_id = users_id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
}