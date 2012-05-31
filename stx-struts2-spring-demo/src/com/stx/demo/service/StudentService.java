package com.stx.demo.service;

import java.util.List;

import com.stx.demo.entity.StudentEntity;
import com.stx.demo.vo.StudentVo;

public interface StudentService {

	List<StudentVo> list(StudentVo vo);
	
	void delStudent(String sno);
	
	void addStudent(StudentVo student);
	
	StudentVo findStudentBySno(String sno);
	
	void updateStudent(StudentVo student);
	
}
