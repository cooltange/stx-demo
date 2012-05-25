package com.stx.demo.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.stx.demo.service.StudentService;
import com.stx.demo.vo.StudentVo;

public class StudentAction extends ActionSupport {

	private StudentService service ;

	private List<StudentVo> stuList = new ArrayList<StudentVo>();

	private StudentVo vo = null;

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

	public StudentVo getVo() {
		return vo;
	}

	public void setVo(StudentVo vo) {
		this.vo = vo;
	}

}