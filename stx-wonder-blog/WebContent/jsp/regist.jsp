<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type="text/javascript">
  function checkForm(){
	var string= new Array();
	string[0]= document.getElementById("username").value;
	string[1]= document.getElementById("blogname").value;
		string[2]= document.getElementById("pwd1").value;
		string[3]= document.getElementById("pwd2").value;
		string[4]= document.getElementById("email").value;
		stringIndex=string[4].indexOf("@")
            stringLast=string[4].lastIndexOf(".")
		  if(string[0].length==0){
			 alert("用户名不能为空!");
			 return false;}
		else  if(string[1].length==0){
			 alert("博客名不能为空!");
			 return false;}
		else  if(string[2].length==0){
			 alert("密码不能为空!");
			 return false;}

		 else if(string[3].length==0){
			 alert("密码不能为空!");
			 return false;}
			 else if(string[2]!=string[3]){
				 alert("密码不一致!");
				 return false;
				 }	
		 else if(string[4].length==0){
			 alert("Email不能为空");
			 return false;}
			
             else if (stringIndex<1||stringLast<2) 
        {alert("Email格式错误");return false}	 
		return true;
}
  
  </script>
<base href="<%=basePath%>">

<title>注册</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/regist.css" />

</head>

<body>
	<div id="layer1"
		style="position:absolute; left: 13px; width: 69px; height: 27px; top: 19px;">
		<a href="index.jsp">返回首页</a>
	</div>
	<div id="layer2" class="">
		<center>
			<h1>快速注册</h1>
		</center>
		<div align="center">
			<form action="loginServlet?type=registor" method="post">
				<table width="458" height="454">
					<tr>
						<td width="95" height="53" align="right">用 户 名:</td>
						<td width="351"><input name="uname" type="text" id="username"
							size="35"/ ></td>
					</tr>
					<tr>
						<td height="53" align="right">博 客 名:</td>
						<td><input name="blogname" type="text" id="blogname"
							size="35" /></td>
					</tr>
					<tr>
						<td height="52" align="right">密 码:</td>
						<td><input name="password" type="password" id="pwd1"
							size="35" /></td>
					</tr>
					<tr>
						<td height="55" align="right">确认密码:</td>
						<td><input name="password2" type="password" id="pwd2"
							size="35" /></td>
					</tr>
					<tr>
						<td height="57" align="right">邮 箱:</td>
						<td><input name="email" type="text" id="email" size="35" />
						</td>
					</tr>
					<tr>
						<td height="125" valign="top" align="right">自我描述:</td>
						<td><textarea name="description" cols="28" rows="5">请输入自我描述。
</textarea></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="确定" onClick="return checkForm()" /></td>
				</table>
			</form>
		</div>
<% 
String error=(String)request.getAttribute("error");
 if(error!=null){
 %>
		<div align="center">
			<font color="red"><%=error %></font>
		</div>
	</div>
	<div class="" id="layer3"></div>
	<%} %>
</body>
</html>
