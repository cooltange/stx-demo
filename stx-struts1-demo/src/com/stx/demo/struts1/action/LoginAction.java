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
		// ��õ�¼form����
		LoginForm loginForm = (LoginForm) form;
		// ����û���
		String myName = loginForm.getMyName();
		// ����û�����
		String myPassword = loginForm.getMyPassword();

		// �ж��û��������Ƿ�Ϸ�
		if ("admin".equals(myName) && "admin".equals(myPassword)) {
			// ����forward =>"success"
			return mapping.findForward("success");
		} else {
			// �Ƿ�ʱ,��Ӵ�����Ϣ
			ActionMessages ams = new ActionMessages();
			ActionMessage am = new ActionMessage("message.namePasswordError");
			ams.add("error", am);
			// ���������Ϣ��request��
			saveErrors(request, ams);
			// ����forward =>"failure"
			return mapping.findForward("failure");
		}

	}

}
