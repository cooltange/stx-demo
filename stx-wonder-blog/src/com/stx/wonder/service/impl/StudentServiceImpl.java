package com.stx.wonder.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.stx.demo.entity.StudentEntity;
import com.stx.wonder.dao.StudentDao;
import com.stx.wonder.service.StudentService;
import com.stx.wonder.vo.StudentVo;

public class StudentServiceImpl implements StudentService {

	private StudentDao dao = null;

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

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

}
