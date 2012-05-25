<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息列表(JSTL标签版)</title>
<!-- ${pageContext.request.contextPath}可以获得该项目的部署后的Web应用名,常用于获取项目资源(css,js,图片等)的绝对路径 -->
<!-- ${pageContext.request.contextPath}/css/yui.css 即路径 /stx-ee-demo/css/yui.css -->
<link href="${pageContext.request.contextPath}/css/yui.css" type="text/css"
	rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/style.css" type="text/css"
	rel="stylesheet" />
</head>
<body>
	<h3>学生信息列表(JSTL标签版)</h3>
	<table>
		<tr>
			<th>编号</th>
			<th>学号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
			<th>操作</th>
		</tr>

		<c:forEach var="student" items="${requestScope.stuList}" varStatus="status">
			<!-- 隔行变色效果 -->
			<!-- 判断status.count是否为奇数,如果为奇数设置该行背景颜色为蓝色 -->
			<tr 
				<c:if test="${status.count % 2 == 1}">
					bgcolor="skyblue"
				</c:if>
			>
				<td>${status.count}</td>
				<td>${student.sno}</td>
				<td>${student.sname}</td>
				<td>${student.sage}</td>
				<td>${student.ssex}</td>
				
				<td>&nbsp; 
			<%-- <a href="studentDisp?id=${student.sno}">查看</a> --%>
			<!-- 使用url标签构建由servlet路径与参数列表的拼接后的url路径(更便于维护) -->
			<a href="
				<c:url value="studentDisp">
					<c:param name="id" value="${student.sno}"/>
				</c:url>"
			>查看</a>
			
			&nbsp; 
			<a	href="studentUpdate?id=${student.sno}">修改</a> &nbsp; <a
				href="studentDel?id=${student.sno}">删除</a>
			</td>
			</tr>
			
		</c:forEach>

	</table>
	<!-- 使用js的history(历史对象)的back方法或者go(-1)完成返回功能 -->
	<input type="button" onclick="history.back();" value="返回">

</body>
</html>