package com.stx.demo.service;

import java.util.List;

import com.stx.demo.entity.StudentEntity;
import com.stx.demo.vo.StudentVo;

public interface StudentService {
	/**
	 * 获得学生信息列表
	 * 
	 * @param vo
	 * @return 学生信息列表
	 */
	List<StudentVo> list(StudentVo vo);

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
	StudentVo findStudentForUpdate(String sno);

	/**
	 * 更新学生信息
	 * 
	 * @param student
	 */
	void updateStudent(StudentVo student);

}
