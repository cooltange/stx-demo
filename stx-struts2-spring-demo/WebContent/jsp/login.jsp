<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
		<h1>login演示</h1>
		<h3>(默认密码:123456)</h3>
		<s:actionerror cssClass="error" />

		<s:form action="login.action" method="post">
			<table>
				<tr>
					<td>学号:</td>
					<td><s:textfield name="username" value="s002"/>
					</td>
				</tr>
				<tr>
					<td>密码:</td>
					<td><s:password name="password" /></td>
				</tr>
				<tr>
					<td colspan="2">
						<s:submit value="登录" />
					</td>
				</tr>
			</table>
		</s:form>
	</div>
</body>
</html>