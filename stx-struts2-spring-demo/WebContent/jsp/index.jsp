<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>stx-struts2-spring演示首页</title>
<link href="${pageContext.request.contextPath}/css/yui.css"
	type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/style.css"
	type="text/css" rel="stylesheet" />
</head>
<body>
	<div id='index'>
		<h1>stx-struts2-spring演示</h1>
		<div><a href="${pageContext.request.contextPath}/listStudent.action">学生信息列表</a></div>
		<div><a href="${pageContext.request.contextPath}/addStudent.action">新增学生信息</a></div>
	</div>
</body>
</html>