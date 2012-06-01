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
<base href="<%=basePath%>">

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<title>六出奇迹博客个人主页</title>
<link rel="stylesheet" type="text/css" href="css/all.css">

</head>
<body>
	<script language="javascript">

function checkform() {
 if (document.form1.adminid.value==""){
 alert("用户名不能为空");
document.form1.adminid.focus();
 return false;
 }
 if (document.form1.passwd.value==""){
 alert("用户密码不能为空");
document.form1.passwd.focus();
 return false;
 }
 if (document.form1.passwd.value!=document.form1.passconfirm.value){
 alert("确认密码不相符！");
document.form1.passconfirm.focus();
 return false;
 }

 return true;
}

</script>
	<div
		style="position:absolute;left:20px;top:150px;width:225px;height:253px;">
		<br>
		<table width="750" border="0" cellspacing="1" cellpadding="1" >
			<tr valign="top">
				<td width="186" align="center">
					<table width="100%" border="0" cellspacing="1" cellpadding="1">
						<tr>
							<td colspan="2"><a href="admininfo.jsp"></a><a
								href="modimy.jsp"></a>
							</td>
						</tr>
					</table>
					<p>&nbsp;</p></td>
						
				<td align="center"><br><font color="white">修改我的个人信息</font><br>
                <div style="background-color:white">
					<form name="form1" method="post" action="infoServlet?type=update">
						<table width="95%" border="0" cellspacing="1" cellpadding="1"
							bordercolor="white">

							<tr>
								<td align=right width=100>用 户 名:</td>
								<td> 
								</td>
							</tr>
							<tr>
								<td align=right width=100>原 密 码:</td>
								<td><input type="password" name="password" maxlength="20"
									size="14" value="">
								</td>
							</tr>
							<tr>
								<td align=right width=100>新 密 码:</td>
								<td><input type="password" name="passwordfirm"
									maxlength="20" size="14" >
								</td>
							</tr>
							<tr>
								<td align=right width=100>确认密码:</td>
								<td><input type="password" name="passconfirm"
									maxlength="20" size="14" value="">
								</td>
							</tr>
							
							<tr>
								<td align=right width=100>邮　　箱:</td>
								<td><input type="text" name="email" 
									size="14" value="">
								</td>
							</tr>
							<tr>
						<td height="125" valign="top" align="right">自我描述:</td>
						<td><textarea name="description" cols="28" rows="5">
</textarea>
						</td>
					</tr>
							<tr>
								<td align=right width=100>&nbsp;</td>
								<td><input TYPE="hidden" name="adminid" value=""> <input
									type="submit" name="submit" value="修改"
									/> 
								</td>
							</tr>
						</table>
					</form> <br>
</div>
					<p>&nbsp;</p></td>
			</tr>
		</table>
	</div>

	<div
		style="position:absolute;left:170px;top:103px;width:793px;height:35px;">
		<span class="lay2"><font face="新宋体">是时间被煮成了雨水，还是时间将往事煮成了雨水。</font>
		</span>
	</div>
	<div
		style="position:absolute; 
	left:110px;
	 top:76px; 
	 width:703px; 
	 height:24px;">
		<span class="lay2"><font face="新宋体">我们有必要记录下身边发生的一切，在我们忘记之前。</font>
		</span>
	</div>
	<div id="Layer6"></div>
	<div class="lay4"
		style="position:absolute; left:35px; top:12px; width:499px; height:63px;">
		<font face="微软雅黑" size="+3" color=#ffffff>时间煮雨BLOG</font>
	</div>
	<div class="navigation" id="Layer1">
	<div class="in">
		<a href="loginServlet?type=homepage">个人主页</a></div>
	</div>
	<div class="navigation" id="Layer2">
	<div class="in">
		<a href="loginServlet?type=exit">退出</a></div>
	</div>
	<div class="navigation" id="Layer4">
	<div class="in">
		<a href="infoServlet?type=check">个人信息</a></div>
	</div>
	<div class="navigation" id="Layer5">
	<div class="in">
		<a href="infoServlet?type=edit">修改信息</a></div>
	</div>
</body>
</html>
