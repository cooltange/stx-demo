package com.stx.demo.struts1.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends ActionForm {

	private String myName = null;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors() ;
		if(myName == null || "".equals(myName)){
			ActionMessage message = new ActionMessage("error.required","username");
			errors.add("username",message);
		}
		
		return errors;
		
	}

}
