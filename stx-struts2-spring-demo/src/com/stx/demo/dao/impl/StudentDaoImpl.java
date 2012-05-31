package com.stx.demo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
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

		// 构建参数数组
		Object[] args = { sno };

		jt.update(sql, args);

	}

	@Override
	public void addStudent(StudentVo student) {

		JdbcTemplate jt = getJdbcTemplate();

		String sql = "insert into student(sno,sname,sage,ssex) values(?,?,?,?)";

		// 构建参数数组
		Object[] args = { student.getSno(), student.getSname(),
				student.getSage(), student.getSsex() };

		jt.update(sql, args);

	}

	@Override
	public StudentEntity findStudentBySno(String sno) {

		JdbcTemplate jt = getJdbcTemplate();

		String sql = "select * from student where sno = ?";

		// 构建参数数组
		Object[] args = { sno };

		StudentEntity studentEntity = (StudentEntity) jt.queryForObject(sql,
				args, new StudentRowMapper());

		return studentEntity;
	}

	@Override
	public void updateStudent(StudentVo student) {

		JdbcTemplate jt = getJdbcTemplate();

		String sql = "update student set sno = ?, sname= ?, sage = ?, ssex = ? where sno = ?";

		// 构建参数数组
		Object[] args = { student.getSno(), student.getSname(),
				student.getSage(), student.getSsex() ,student.getSno()};

		jt.update(sql, args);

	}
}
