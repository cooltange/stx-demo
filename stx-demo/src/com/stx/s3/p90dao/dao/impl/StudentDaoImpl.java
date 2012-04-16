package com.stx.s3.p90dao.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.stx.s3.p90dao.dao.StudentDao;
import com.stx.s3.p90dao.entity.StudentEntity;
import com.stx.s3.p90dao.util.JdbcUtil;

/**
 * ѧ�����ݷ��ʶ���ӿ�ʵ����(jdbc��ʽ)<BR>
 * ��ʵ�������ʵ����StudentDao�ӿڶ���� ѧ����ص�CRUD���󷽷�<BR>
 * ֻʵ���� ����ѧ������,��������δʵ��,ֻ�� "��ʵ��".
 * 
 * @author getan
 * 
 */
public class StudentDaoImpl implements StudentDao {
	/**
	 * ����ѧ����Ϣ
	 * 
	 * @param entity
	 * @return �����Ƿ�ɹ�
	 * @throws SQLException
	 */
	@Override
	public boolean insertStudent(StudentEntity entity) throws SQLException {

		Connection con = JdbcUtil.getConnection();
		PreparedStatement ps = con
				.prepareStatement("insert into student values(?,?,?,?)");

		ps.setString(1, entity.getSno());
		ps.setString(2, entity.getSname());
		ps.setInt(3, entity.getSage());
		ps.setString(4, entity.getSsex());

		int count = ps.executeUpdate();

		// �ж��Ƿ������ɹ�
		if (count > 0) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean deleteStudent(String sno) {

		return false;
	}

	@Override
	public List<StudentEntity> queryStudent(StudentEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateStudent(StudentEntity entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
