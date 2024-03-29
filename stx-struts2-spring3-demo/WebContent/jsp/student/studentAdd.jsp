<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息列表</title>
<!-- ${pageContext.request.contextPath}可以获得该项目的部署后的Web应用名,常用于获取项目资源(css,js,图片等)的绝对路径 -->
<!-- ${pageContext.request.contextPath}/css/yui.css 即路径 /stx-ee-demo/css/yui.css -->
<link href="${pageContext.request.contextPath}/css/yui.css" type="text/css"
	rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/style.css" type="text/css"
	rel="stylesheet" />
</head>
<body>
	<h3>新增学生信息</h3>
	<s:actionmessage  cssClass="success"/>
	<s:actionerror cssClass="error" />
	<s:fielderror cssClass="error" />
	<s:form action="addStudent" method="post">
		<table>
			<tr>
				<td>学号</td>
				<td>
					<s:textfield  name="student.sno"/>
				</td>
			</tr>
			<tr>
				<td>姓名</td>
				<td>
					<s:textfield  name="student.sname"/>
				</td>
			</tr>
			<tr>
				<td>年龄</td>
				<td>
					<s:textfield  name="student.sage"/>
				</td>
			</tr>
			<tr>
				<td>性别</td>
				<td>
					<!-- 
					<input type="radio" name="student.ssex" value="男" checked="checked">男
					<input type="radio" name="student.ssex" value="女">女 --> 
					<s:radio list="{'男','女'}" name="student.ssex" value="'男'"></s:radio>
				</td>
			</tr>
	
		</table>
			<!-- 
			<input type="submit" value="提交">
			<input type="reset" value="重填">
			 -->
			 <s:submit value="提交"></s:submit>
			 <s:reset value="重填"></s:reset>
	</s:form>
</body>
</html>