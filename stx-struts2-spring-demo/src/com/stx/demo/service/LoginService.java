package com.stx.demo.service;

import com.stx.demo.vo.StudentVo;

public interface LoginService {

	/**
	 * 判断用户名及密码是否合法
	 * 
	 * @param username
	 * @param password
	 * @return StudentVo
	 */
	StudentVo validateAuth(String username, String password);

}
