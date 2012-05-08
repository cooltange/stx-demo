package com.stx.demo.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.stx.demo.dao.impl.StudentDaoImpl;
import com.stx.demo.vo.StudentVO;

/**
 * 学生数据访问对象 测试类
 * 
 * @author getan
 *
 */
public class StudentDaoTest {

	@Test
	public void testQueryStudent() throws Exception {
		StudentDaoImpl dao = new StudentDaoImpl();

		List<StudentVO> stuList = dao.queryStudent(new StudentVO());
		// 测试"查询学生信息列表"功能是否正常
		assertTrue(stuList.size() > 0);
	}

}
