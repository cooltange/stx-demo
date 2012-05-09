<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*,com.stx.demo.vo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息列表</title>
<!-- request.getContextPath()可以获得该项目的部署后的Web应用名,常用于获取项目资源(css,js,图片等)的绝对路径 -->
<!-- <%=request.getContextPath()%>/css/yui.css 即路径 /stx-ee-demo/css/yui.css -->
<link href="<%=request.getContextPath()%>/css/yui.css"
	type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/css/style.css"
	type="text/css" rel="stylesheet" />
</head>
<body>
	<h3>学生信息列表</h3>
		<table>
		<tr>
		<th>编号</th>
		<th>姓名</th>
		<th>年龄</th>
		<th>性别</th>
		<th>操作</th>
		</tr>
		<%
		// 从request中获取学生信息列表对象
		ArrayList<StudentVO> stuList = (ArrayList<StudentVO>)request.getAttribute("stuList");
		// 遍历学生信息列表
		for(StudentVO stuVO : stuList)
		{
		%>
		<tr>
			<td><%=stuVO.getSno()%>&nbsp;</td>
			<td><%=stuVO.getSname()%>&nbsp;</td>
			<td><%=stuVO.getSage()%>&nbsp;</td>
			<td><%=stuVO.getSsex()%>&nbsp;</td>
			<td>&nbsp; <a href="studentDisp?id=<%=stuVO.getSno()%>">查看</a>&nbsp; <a
				href="studentUpdate?id=<%=stuVO.getSno()%>">修改</a> &nbsp; <a
				href="studentDel?id=<%=stuVO.getSno()%>">删除</a>
			</td>
		</tr>
		<%} %>
	</table>
	<!-- 使用js的history(历史对象)的back方法或者go(-1)完成返回功能 -->
	<input type="button" onclick="history.back();" value="返回">
	
</body>
</html>