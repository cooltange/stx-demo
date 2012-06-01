package com.stx.wonder.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.stx.demo.entity.StudentEntity;
import com.stx.wonder.dao.StudentDao;
import com.stx.wonder.vo.StudentVo;

public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao {

	@Override
	public List<StudentEntity> list(StudentVo vo) {

		String sql = "select * from student";

		List stuList = getJdbcTemplate().query(sql, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

				StudentEntity entity = new StudentEntity();

				entity.setSno(rs.getString("sno"));
				entity.setSname(rs.getString("sname"));
				entity.setSage(rs.getInt("sage"));
				entity.setSsex(rs.getString("ssex"));

				return entity;
			}
		});

		return stuList;
	}

}
