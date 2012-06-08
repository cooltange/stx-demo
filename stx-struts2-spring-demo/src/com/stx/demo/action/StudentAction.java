package com.stx.demo.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.stx.demo.service.StudentService;
import com.stx.demo.vo.StudentVo;

public class StudentAction extends ActionSupport {

	private StudentService service;

	// 学生信息列表
	private List<StudentVo> stuList = new ArrayList<StudentVo>();

	// 学生查询条件
	private StudentVo criteria = null;

	// 学生信息
	private StudentVo student = null;

	// 学号
	private String sno = null;

	/**
	 * 学生信息列表
	 * 
	 * @return
	 */
	public String list() {

		// 根据查询条件获得学生信息列表(参数因暂缺查询条件,所以直接new的一个学生vo对象)
		stuList = service.list(new StudentVo());

		return "list";
	}

	/**
	 * 删除学生信息
	 * 
	 * @return
	 */
	public String del() {
		// 根据学号删除学生信息
		service.delStudent(sno);

		return "list";
	}

	/**
	 * 新增学生信息
	 * 
	 * @return
	 */
	public String add() {
		// 添加学生信息
		service.addStudent(student);

		return "list";
	}

	/**
	 * 根据学号查询学生信息
	 * 
	 * @return
	 */
	public String findStudentBySno() {
		// 根据学号查询学生信息
		student = service.findStudentForUpdate(sno);

		return "update";
	}
	
	/**
	 * 更新学生信息
	 * 
	 * @return
	 */
	public String update() {
		//更新学生信息
		service.updateStudent(student);

		return "list";
	}
	
	// 以下是 get/set 方法区

	public void setService(StudentService service) {
		this.service = service;
	}

	public List<StudentVo> getStuList() {
		return stuList;
	}

	public void setStuList(List<StudentVo> stuList) {
		this.stuList = stuList;
	}

	public StudentVo getCriteria() {
		return criteria;
	}

	public void setCriteria(StudentVo criteria) {
		this.criteria = criteria;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public StudentVo getStudent() {
		return student;
	}

	public void setStudent(StudentVo student) {
		this.student = student;
	}

}
