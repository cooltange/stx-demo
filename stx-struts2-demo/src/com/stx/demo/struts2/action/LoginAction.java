package com.stx.demo.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	// 姓名
	private String myName;
	// 密码
	private String myPassword;
	// 年龄
	private Integer myAge;
	// 邮箱
	private String myEmail;

	/**  
	 * 默认的action方法
	 */
	public String execute() {

		return SUCCESS;
	}

	// @Override
	// public void validate() {
	//
	// if(myName == null || myName.trim().length() == 0){
	// addFieldError("myName", "姓名必须输入!");
	// }
	// if(myPassword == null || myPassword.trim().length() == 0){
	// addFieldError("myPassword", "密码必须输入!");
	// }
	//
	// }

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String getMyPassword() {
		return myPassword;
	}

	public void setMyPassword(String myPassword) {
		this.myPassword = myPassword;
	}

	public String getMyEmail() {
		return myEmail;
	}

	public void setMyEmail(String myEmail) {
		this.myEmail = myEmail;
	}

	public Integer getMyAge() {
		return myAge;
	}

	public void setMyAge(Integer myAge) {
		this.myAge = myAge;
	}


}
