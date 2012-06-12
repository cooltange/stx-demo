package com.stx.demo.service.impl;

import org.springframework.beans.BeanUtils;

import com.stx.demo.dao.LoginDao;
import com.stx.demo.entity.StudentEntity;
import com.stx.demo.service.LoginService;
import com.stx.demo.vo.StudentVo;

public class LoginServiceImpl implements LoginService {

	private LoginDao dao;

	@Override
	public StudentVo validateAuth(String username, String password) {

		StudentEntity entity = dao.findStudentBySnoAndSpassword(username,
				password);

		StudentVo vo = null;

		if (entity != null) {
			vo = new StudentVo();

			// 对象属性值拷贝 entity => vo
			BeanUtils.copyProperties(entity, vo);
		}

		return vo;
	}

	public void setDao(LoginDao dao) {
		this.dao = dao;
	}

}
