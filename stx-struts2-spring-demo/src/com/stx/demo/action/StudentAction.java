package com.stx.demo.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.stx.demo.entity.StudentEntity;
import com.stx.demo.service.StudentService;
import com.stx.demo.vo.StudentVo;

public class StudentAction extends ActionSupport {

	private StudentService service ;

	// 学生信息列表
	private List<StudentVo> stuList = new ArrayList<StudentVo>();

	// 学生查询条件
	private StudentVo criteria = null;
	
	// 学生信息
	private StudentVo student = null;
	
	// 学号
	private String sno = null;

	public String list() {

		stuList = service.list(new StudentVo());

		return "list";
	}
	
	public String del(){
		
		service.delStudent(sno);
		
		return "list";
	}
	
	public String add(){
		
		service.addStudent(student);
		
		return "list";
	}
	
	public String findStudentBySno(){
		
		student = service.findStudentForUpdate(sno);
		
		return "update";
	}
	
	public String update(){
		
		service.updateStudent(student);
		
		return "list";
	}

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
