package com.stx.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.stx.demo.dao.StudentDao;
import com.stx.demo.entity.StudentEntity;
import com.stx.demo.service.StudentService;
import com.stx.demo.vo.StudentVo;

public class StudentServiceImpl implements StudentService {

	private StudentDao dao = null;

	/**
	 * 获得学生信息列表
	 * 
	 * @param criteria
	 *            查询条件
	 * @return 学生信息列表
	 */
	@Override
	public List<StudentVo> list(StudentVo criteria) {

		List<StudentVo> voList = new ArrayList<StudentVo>();

		List<StudentEntity> entityList = dao.list(criteria);

		for (StudentEntity entity : entityList) {

			StudentVo vo = new StudentVo();

			// 对象属性值拷贝 entity => vo
			BeanUtils.copyProperties(entity, vo);

			voList.add(vo);

		}

		return voList;
	}

	/**
	 * 根据学号删除学生信息
	 * 
	 * @param sno
	 */
	@Override
	public void delStudent(String sno) {

		dao.delStudent(sno);

	}

	/**
	 * 新增学生信息
	 * 
	 * @param student
	 */
	@Override
	public void addStudent(StudentVo student) {

		dao.addStudent(student);

	}

	/**
	 * 根据学号查询学生信息
	 * 
	 * @param sno
	 * @return 单个学生信息
	 */
	@Override
	public StudentVo findStudentForUpdate(String sno) {

		StudentVo studentVo = new StudentVo();

		StudentEntity studentEntity = dao.findStudentBySno(sno);

		// 对象属性值拷贝 entity => vo
		BeanUtils.copyProperties(studentEntity, studentVo);

		return studentVo;
	}

	/**
	 * 更新学生信息
	 * 
	 * @param student
	 */
	@Override
	public void updateStudent(StudentVo student) {

		dao.updateStudent(student);

	}

	// 以下是 get/set 方法区
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

}
