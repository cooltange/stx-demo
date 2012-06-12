package com.stx.demo.action;

import com.opensymphony.xwork2.ActionSupport;
import com.stx.demo.service.LoginService;
import com.stx.demo.vo.StudentVo;

public class LoginAction extends ActionSupport {

	private String username;

	private String password;

	private LoginService service;

	/**
	 * 用户登录
	 * 
	 * @return
	 */
	public String login() {

		StudentVo vo = service.validateAuth(username, password);

		if (vo != null) {
			return "success";
		} else {
			addActionError("用户名或密码错误!");
			return INPUT;
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setService(LoginService service) {
		this.service = service;
	}
}
