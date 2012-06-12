package com.stx.demo.dao;

import com.stx.demo.entity.StudentEntity;

public interface LoginDao {
	
	StudentEntity findStudentBySnoAndSpassword(String username, String password);

}
