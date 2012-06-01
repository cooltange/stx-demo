<%@ page language="java"
	import="java.util.*"
	pageEncoding="utf-8"%>
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
<link rel="stylesheet" type="text/css" href="css/homepage.css" />
<link rel="stylesheet" type="text/css" href="css/all.css">


</head>

<body>
	

	<div class="word" id="layer7">
		<p style="text-align:center;">
			<font color="gray"><b></b> </font> <br />
		</p>
		<div class="little">
			<p class="text"></p>
		</div>
	</div>
	<div class="word" id="layer9">
		<p style="text-align:center;">
			<font color="gray"><b></b> </font> <br />

		</p>

		<div class="little">
			<p class="text">
				
			</p>
		</div>
	</div>
	<div class="word" id="layer8">
		<p style="text-align:center;">
			<font color="gray"><b></b> </font> <br />
		</p>
		<div class="little">
			<p class="text"></p>
		</div>
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
			<a href="loginServlet?type=homepage">个人主页</a>
		</div>
	</div>
	<div class="navigation" id="Layer2">
		<div class="in">
			<a href="loginServlet?type=exit">退出</a>
		</div>
	</div>
	<div class="navigation" id="Layer4">
		<div class="in">
			<a href="infoServlet?type=check">个人信息</a>
		</div>
	</div>
	<div class="navigation" id="Layer5">
		<div class="in">
			<a href="loginServlet?type=manage">博文管理</a>
		</div>
	</div>
</body>
</html>
