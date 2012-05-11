package com.stx.demo.struts1.form;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm {

	private String myName = null;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

}
