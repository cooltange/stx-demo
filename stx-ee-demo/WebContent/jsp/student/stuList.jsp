<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*,com.stx.demo.vo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息列表</title>
<link href="${pageContext.request.contextPath}/css/yui.css"
	type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/style.css"
	type="text/css" rel="stylesheet" />
</head>
<body>
	<table>
		<%
		ArrayList<StudentVO> stuList = (ArrayList<StudentVO>)request.getAttribute("stuList");
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
</body>
</html>