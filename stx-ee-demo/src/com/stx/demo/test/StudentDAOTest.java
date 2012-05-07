package com.stx.demo.test;

import java.sql.SQLException;

import com.stx.demo.dao.StudentDao;
import com.stx.demo.dao.impl.StudentDaoImpl;
import com.stx.demo.vo.StudentVO;

public class StudentDAOTest {

	public static void main(String[] args) throws Exception {

		StudentDao dao = new StudentDaoImpl();

		StudentVO vo = new StudentVO();

		vo.setSno("s104");
		vo.setSname("谭舸");
		vo.setSage(20);
		vo.setSsex("男");

		int count = dao.insertStudent(vo);
		
		System.out.println(count);

	}

}
