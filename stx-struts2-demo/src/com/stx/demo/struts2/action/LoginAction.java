package com.stx.demo.struts2.action;

public class LoginAction {
	
	private String myName;
	
	public String execute(){
		
		return "success";
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}
	

}
