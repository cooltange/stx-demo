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

	/**
	 * 获得学生信息列表
	 * 
	 * @param criteria
	 *            查询条件
	 * @return 学生信息列表
	 */
	public List<StudentEntity> list(StudentVo criteria) {

		String sql = "select * from student";

		JdbcTemplate jt = getJdbcTemplate();

		List<StudentEntity> stuList = jt.query(sql, new StudentRowMapper());

		return stuList;
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

	/**
	 * 根据学号删除学生信息
	 * 
	 * @param sno
	 */
	@Override
	public void delStudent(String sno) {

		JdbcTemplate jt = getJdbcTemplate();

		String sql = "delete from student where sno = ?";

		// 构建参数数组
		Object[] args = { sno };

		jt.update(sql, args);

	}

	/**
	 * 新增学生信息
	 * 
	 * @param student
	 */
	@Override
	public void addStudent(StudentVo student) {

		JdbcTemplate jt = getJdbcTemplate();

		String sql = "insert into student(sno,sname,sage,ssex) values(?,?,?,?)";

		// 构建参数数组
		Object[] args = { student.getSno(), student.getSname(),
				student.getSage(), student.getSsex() };

		jt.update(sql, args);

	}

	/**
	 * 根据学号查询学生信息
	 * 
	 * @param sno
	 * @return 单个学生信息
	 */
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

	/**
	 * 更新学生信息
	 * 
	 * @param student
	 */
	@Override
	public void updateStudent(StudentVo student) {

		JdbcTemplate jt = getJdbcTemplate();

		String sql = "update student set sname= ?, sage = ?, ssex = ? where sno = ?";

		// 构建参数数组
		Object[] args = { student.getSname(), student.getSage(),
				student.getSsex(), student.getSno() };

		jt.update(sql, args);

	}
}
