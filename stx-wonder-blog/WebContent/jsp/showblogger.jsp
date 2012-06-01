<%@ page language="java"
	import="java.util.*"
	pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<title>博文分类管理</title>
<link rel="stylesheet" type="text/css" href="css/all.css">
</head>

<body>

<div style="position: absolute; left: 185px; top: 242px; width: 684px; height: 448px; font-color:white">
<table width="100%" height="100%" border="0">

<tr><td height="10"><font color="white"></font><font color="white"><center></center></font></td>
<tr><td height="400" valign="top" ><font color="white"></font></td></tr>
</table>

</div>
<div style="position:absolute;left:170px;top:103px;width:793px;height:35px; z-index:4">
<span class="lay2"><font face="新宋体">是时间被煮成了雨水，还是时间将往事煮成了雨水。</font> </span></div>
<div  style="position:absolute; 
	left:110px;
	 top:76px; 
	 width:703px; 
	 height:24px; z-index:3">
<span class="lay2"><font face="新宋体">我们有必要记录下身边发生的一切，在我们忘记之前。</font></span></div>
<div id="Layer6">  </div>
<div class="lay4" style="position:absolute; left:35px; top:12px; width:499px; height:63px; z-index:2">
<font id="lay3" face="微软雅黑" size="+2" color=#ffffff>时间煮雨BLOG</font></div>
	<div class="navigation" id="Layer4">
		<div class="in" style="left: 59px; top: -3px;">
			<a href="loginServlet?type=homepage">个人主页</a>
		</div>
	</div>
	<div class="navigation" id="Layer2">
		<div class="in">
			<a href="loginServlet?type=manage">博文管理</a>
		</div>
	</div>
	<div class="navigation" id="Layer5">		<div class="in">
		<a href="infoServlet?type=check">个人信息</a>
	</div>
</body>
</html>

