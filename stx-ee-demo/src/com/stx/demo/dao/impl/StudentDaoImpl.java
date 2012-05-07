package com.stx.demo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.stx.demo.dao.StudentDao;
import com.stx.demo.util.JdbcUtil;
import com.stx.demo.vo.StudentVO;

public class StudentDaoImpl implements StudentDao {

	@Override
	public List<StudentVO> queryStudent(StudentVO stuVO) throws Exception {
		Connection con = JdbcUtil.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from student");

		ResultSet rs = ps.executeQuery();

		List<StudentVO> stuList = new ArrayList<StudentVO>();
		
		while (rs.next()) {

			StudentVO vo = new StudentVO();

			vo.setSno(rs.getString("sno"));
			vo.setSname(rs.getString("sname"));
			vo.setSage(rs.getInt("sage"));
			vo.setSsex(rs.getString("ssex"));

			stuList.add(vo);

		}
		
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
