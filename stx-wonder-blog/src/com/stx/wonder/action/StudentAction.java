package com.stx.wonder.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.stx.wonder.service.StudentService;
import com.stx.wonder.vo.StudentVo;

public class StudentAction extends ActionSupport {

	private StudentService service ;

	private List<StudentVo> stuList = new ArrayList<StudentVo>();

	// 学生查询条件
	private StudentVo criteria = null;

	public String list() {

		stuList = service.list(new StudentVo());

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


}
