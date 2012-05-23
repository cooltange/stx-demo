package com.stx.demo.struts1.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.stx.demo.struts1.form.LoginForm;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// 获得登录form对象
		LoginForm loginForm = (LoginForm) form;
		// 获得用户名
		String myName = loginForm.getMyName();
		// 获得用户密码
		String myPassword = loginForm.getMyPassword();

		// 判断用户名密码是否合法
		if ("admin".equals(myName) && "admin".equals(myPassword)) {
			// 导航forward =>"success"
			return mapping.findForward("success");
		} else {
			// 非法时,添加错误信息
			ActionMessages ams = new ActionMessages();
			ActionMessage am = new ActionMessage("message.namePasswordError");
			ams.add("error", am);
			// 保存错误信息至request中
			saveErrors(request, ams);
			// 导航forward =>"failure"
			return mapping.findForward("failure");
		}

	}

}
