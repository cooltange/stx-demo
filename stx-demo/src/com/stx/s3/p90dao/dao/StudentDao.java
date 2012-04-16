package com.stx.s3.p90dao.dao;

import java.sql.SQLException;
import java.util.List;

import com.stx.s3.p90dao.entity.StudentEntity;

/**
 * ѧ�����ݷ��ʶ���ӿ�<BR>
 * �ýӿ������� ѧ����ص�CRUD���󷽷�<BR>
 * ����ʵ����ΪStudentDaoImpl��
 * 
 * @author getan
 * 
 */
public interface StudentDao {
	/**
	 * ����ѧ����Ϣ
	 * 
	 * @param entity
	 * @return �����Ƿ�ɹ�
	 * @throws SQLException
	 */
	boolean insertStudent(StudentEntity entity) throws SQLException;

	/**
	 * ͨ��ѧ��ɾ��һ��ѧ��
	 * 
	 * @return ɾ���Ƿ�ɹ�
	 */
	boolean deleteStudent(String sno) throws SQLException;

	/**
	 * ͨ����ѯ������ѯѧ����Ϣ����
	 * 
	 * @param entity
	 * @return ѧ����Ϣ����
	 */
	List<StudentEntity> queryStudent(StudentEntity entity) throws SQLException;

	/**
	 * ����ѧ����Ϣ
	 * 
	 * @param entity
	 * @return �����Ƿ�ɹ�
	 */
	boolean updateStudent(StudentEntity entity) throws SQLException;
}
