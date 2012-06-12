package com.stx.demo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.stx.demo.dao.LoginDao;
import com.stx.demo.entity.StudentEntity;

public class LoginDaoImpl extends JdbcDaoSupport implements LoginDao {

	/**
	 * 通过用户名及密码返回学生实体对象
	 * 
	 * @param username
	 * @param password
	 * @return StudentEntity
	 */
	@Override
	public StudentEntity findStudentBySnoAndSpassword(String username,
			String password) {
		JdbcTemplate jt = getJdbcTemplate();

		String sql = "select * from student where sno = ? and spassword = ?";

		Object[] args = { username, password };

		List<StudentEntity> stuList = jt.query(sql, args,
				new StudentRowMapper());

		StudentEntity entity = null;

		if (stuList.isEmpty()) {
			return null;
		} else {
			entity = (StudentEntity) stuList.get(0);
			return entity;
		}

	}

	/**
	 * ResultSet记录 =>Entity对象
	 * 
	 * 该类是内部类,类中实现了mapRow方法,其中就是实现 如何具体<BR>
	 * 将每一条学生表的记录转换为 学生entity对象
	 * 
	 * @author getan
	 * 
	 */
	class StudentRowMapper implements RowMapper {
		@Override
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			// 创建学生实体对象用于保存一个学生的信息
			StudentEntity entity = new StudentEntity();

			// 学生实体对象.学号 <= 学生记录.学号
			entity.setSno(rs.getString("sno"));
			// 学生实体对象.姓名 <= 学生记录.姓名
			entity.setSname(rs.getString("sname"));
			// 学生实体对象.年龄 <= 学生记录.年龄
			entity.setSage(rs.getInt("sage"));
			// 学生实体对象.性别 <= 学生记录.性别
			entity.setSsex(rs.getString("ssex"));

			// 返回已经完成 "Entity对象 <= ResultSet记录"操作后 的 学生Entity对象
			return entity;
		}
	}

}
