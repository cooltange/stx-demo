package com.stx.demo.dao;

import com.stx.demo.entity.StudentEntity;

public interface LoginDao {

	/**
	 * 通过用户名及密码返回学生实体对象
	 * 
	 * @param username
	 * @param password
	 * @return StudentEntity
	 */
	StudentEntity findStudentBySnoAndSpassword(String username, String password);

}
