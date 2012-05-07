package com.stx.demo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stx.demo.dao.StudentDao;
import com.stx.demo.dao.impl.StudentDaoImpl;
import com.stx.demo.vo.StudentVO;

/**
 * Servlet implementation class StudentQueryServlet
 */
public class StudentQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	StudentDao dao = null;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		dao = new StudentDaoImpl();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 创建学生数据视图对象
		StudentVO vo = new StudentVO();

		// 从页面获取查询条件
		// request.getParameter("");

		try {
			// 调用dao中查询学生信息列表方法,获得学生对象的集合
			List<StudentVO> stuList = dao.queryStudent(vo);
			// 将查询结果保存到request对象中
			request.setAttribute("stuList", stuList);
						
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/student/stuList.jsp");
			
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
