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
		// 通过学号及密码 获取 学生视图对象
		StudentVo vo = service.validateAuth(username, password);
		// 通过返回的 学生视图对象 ,判断用户名及密码是否正确
		if (vo != null) {
			// 用户名及密码合法
			return "success";
		} else {
			// 用户名及密码非法
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
