package com.stx.demo.dao;

import java.util.List;

import com.stx.demo.entity.StudentEntity;
import com.stx.demo.vo.StudentVo;

public interface StudentDao {
	/**
	 * 获得学生信息列表
	 * 
	 * @param criteria
	 *            查询条件
	 * @return 学生信息列表
	 */
	List<StudentEntity> findStudent(StudentVo vo);

	/**
	 * 根据学号删除学生信息
	 * 
	 * @param sno
	 */
	void delStudent(String sno);

	/**
	 * 新增学生信息
	 * 
	 * @param student
	 */
	void addStudent(StudentVo student);

	/**
	 * 根据学号查询学生信息
	 * 
	 * @param sno
	 * @return 单个学生信息
	 */
	StudentEntity findStudentBySno(String sno);

	/**
	 * 更新学生信息
	 * 
	 * @param student
	 */
	void updateStudent(StudentVo student);

}
