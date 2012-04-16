package com.stx.s3.p90dao.test;

import java.sql.SQLException;

import com.stx.s3.p90dao.dao.StudentDao;
import com.stx.s3.p90dao.dao.impl.StudentDaoImpl;
import com.stx.s3.p90dao.entity.StudentEntity;

/**
 * DAOģʽ ��ʾ��<BR>
 * ����ѧ�� ֻ��Ҫ���� dao���� ʹ�� ���������������
 * 
 * @author getan
 * 
 */
public class StudentDAOTest {

	public static void main(String[] args) throws SQLException {
		// ����ѧ�����ݷ��ʶ���
		StudentDao dao = new StudentDaoImpl();

		// ����ѧ��ʵ�����
		StudentEntity entity = new StudentEntity();
		// ��ѧ��ʵ�����ֵ
		entity.setSno("s100");
		entity.setSname("����");
		entity.setSage(20);
		entity.setSsex("��");

		// ����ѧ�����ݷ��ʶ��������ѧ������,��ʵ����󱣴浽���ݿ�,���ҷ��ر�����
		boolean result = dao.insertStudent(entity);

		// ���ݱ�������������ʾ��Ϣ
		if (result) {
			// ������������Ľ����
			System.out.printf("����ѧ����Ϣ�ɹ�!");
		} else {
			System.out.printf("����ѧ����Ϣʧ��!");
		}
	}

}
