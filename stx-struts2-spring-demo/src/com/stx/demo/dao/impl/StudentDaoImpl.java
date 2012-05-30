package com.stx.demo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.stx.demo.dao.StudentDao;
import com.stx.demo.entity.StudentEntity;
import com.stx.demo.vo.StudentVo;

public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao {

	@Override
	public List<StudentEntity> list(StudentVo vo) {

		String sql = "select * from student";

		JdbcTemplate jt = getJdbcTemplate();

		List<StudentEntity> stuList = jt.query(sql, new StudentRowMapper());

		return stuList;
	}

	class StudentRowMapper implements RowMapper {

		@Override
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

			StudentEntity entity = new StudentEntity();

			entity.setSno(rs.getString("sno"));
			entity.setSname(rs.getString("sname"));
			entity.setSage(rs.getInt("sage"));
			entity.setSsex(rs.getString("ssex"));

			return entity;
		}

	}

	@Override
	public void delStudent(String sno) {

		JdbcTemplate jt = getJdbcTemplate();

		String sql = "delete from student where sno = ?";

		// ���������������
		Object[] args = { sno };

		jt.update(sql, args);

	}
}
