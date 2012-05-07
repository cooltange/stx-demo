package com.stx.demo.dao;

import java.util.List;

import com.stx.demo.vo.StudentVO;

public interface StudentDao {
	List<StudentVO> queryStudent(StudentVO stuPO) throws Exception;

	int insertStudent(StudentVO stuPO) throws Exception;

	boolean deleteStudent(String sno) throws Exception;

	boolean updateStudent(StudentVO stuPO) throws Exception;
}
