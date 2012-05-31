package com.stx.demo.dao;

import java.util.List;

import com.stx.demo.entity.StudentEntity;
import com.stx.demo.vo.StudentVo;

public interface StudentDao {
	
	List<StudentEntity> list(StudentVo vo);
	
	void delStudent(String sno);
	
	void addStudent(StudentVo student);

}
