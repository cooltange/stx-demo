package com.stx.demo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.stx.demo.dao.StudentDao;
import com.stx.demo.util.JdbcUtil;
import com.stx.demo.vo.StudentVO;

/**
 * 学生数据访问对象接口的实现类(jdbc)
 * 
 * @author getan
 *
 */
public class StudentDaoImpl implements StudentDao {
	/**
	 * 根据查询条件查询学生信息列表
	 * 
	 * @param stuPO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<StudentVO> queryStudent(StudentVO stuVO) throws Exception {
		// 获取connection对象
		Connection con = JdbcUtil.getConnection();
		
		PreparedStatement ps = con.prepareStatement("select * from student");

		ResultSet rs = ps.executeQuery();
		
		// 创建学生信息列表对象(用于存放从数据库查询出的多个学生信息)
		List<StudentVO> stuList = new ArrayList<StudentVO>();

		while (rs.next()) {
			// 创建学生数据视图对象
			StudentVO vo = new StudentVO();
			
			// 将数据库记录的每一个字段的值 赋值给 "学生对象"对应的属性.
			// 即 学生对象.学号  <= 该条学生记录的学号
			vo.setSno(rs.getString("sno"));
			vo.setSname(rs.getString("sname"));
			vo.setSage(rs.getInt("sage"));
			vo.setSsex(rs.getString("ssex"));

			// 将该学生对象 添入 学生信息列表对象
			stuList.add(vo);
		}
		// 释放数据库连接资源
		JdbcUtil.release();
		
		// 返回学生信息列表对象(给servlet)
		return stuList;
	}

	@Override
	public int insertStudent(StudentVO stuVO) throws Exception {

		Connection con = JdbcUtil.getConnection();
		PreparedStatement ps = con
				.prepareStatement("insert into student values(?,?,?,?)");

		ps.setString(1, stuVO.getSno());
		ps.setString(2, stuVO.getSname());
		ps.setInt(3, stuVO.getSage());
		ps.setString(4, stuVO.getSsex());

		int count = ps.executeUpdate();

		return count;
	}

	@Override
	public boolean deleteStudent(String sno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateStudent(StudentVO stuVO) {
		// TODO Auto-generated method stub
		return false;
	}

}
