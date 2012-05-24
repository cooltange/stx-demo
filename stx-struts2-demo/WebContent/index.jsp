<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>struts2 demo</title>

<link href=${pageContext.request.contextPath}/css/style.css
	type="text/css" rel="stylesheet" />

</head>
<body>
	<s:form action="login" method="post">
	请输入你的姓名:
	<s:textfield name="myName" />
		<span class="formFieldError"> 
			<s:fielderror fieldName="myName" />
		</span>
		<BR>
	请输入你的密码:
	<s:password name="myPassword" />
		<span class="formFieldError"> 
			<s:fielderror fieldName="myPassword" />
		</span>
		<BR>
	请输入你的年龄:
	<s:textfield name="myAge" />
		<span class="formFieldError"> 
			<s:fielderror fieldName="myAge" />
		</span>
		<BR>
	请输入你的Email:
	<s:textfield name="myEmail" />
		<span class="formFieldError"> 
			<s:fielderror fieldName="myEmail" />
		</span>
		<BR>
		<s:submit value="提交" />
	</s:form>


</body>
</html>