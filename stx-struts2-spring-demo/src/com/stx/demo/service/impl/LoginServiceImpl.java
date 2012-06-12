package com.stx.demo.service.impl;

import org.springframework.beans.BeanUtils;

import com.stx.demo.dao.LoginDao;
import com.stx.demo.entity.StudentEntity;
import com.stx.demo.service.LoginService;
import com.stx.demo.vo.StudentVo;

public class LoginServiceImpl implements LoginService {

	private LoginDao dao;

	/**
	 * 判断用户名及密码是否合法
	 * 
	 * @param username
	 * @param password
	 * @return StudentVo
	 */
	@Override
	public StudentVo validateAuth(String username, String password) {
		// 通过学号及用户名 返回 学生实体对象
		StudentEntity entity = dao.findStudentBySnoAndSpassword(username,
				password);
		// 声明学生视图对象
		StudentVo vo = null;

		// 判断学生实体对象是否为空
		if (entity != null) {
			// 学生实体对象不为空的情况(合法)
			// 创建新的学生视图对象
			vo = new StudentVo();

			// 对象属性值拷贝 entity => vo
			BeanUtils.copyProperties(entity, vo);

			// 返回已经进行完属性拷贝后的 学生视图对象
			return vo;
		} else {
			// 学生实体对象为空的情况(非法),返回null
			return null;
		}
	}

	public void setDao(LoginDao dao) {
		this.dao = dao;
	}

}
