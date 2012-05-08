package com.stx.demo.dao;

import java.util.List;

import com.stx.demo.vo.StudentVO;

/**
 * 学生数据访问对象的接口
 * 
 * @author getan
 *
 */
public interface StudentDao {
	/**
	 * 根据查询条件查询学生信息列表
	 * 
	 * @param stuPO
	 * @return 
	 * @throws Exception
	 */
	List<StudentVO> queryStudent(StudentVO stuPO) throws Exception;

	int insertStudent(StudentVO stuPO) throws Exception;

	boolean deleteStudent(String sno) throws Exception;

	boolean updateStudent(StudentVO stuPO) throws Exception;
}
