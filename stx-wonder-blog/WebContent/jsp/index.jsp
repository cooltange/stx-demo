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
<head>
<title>首页</title>
<head>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="css/all.css">
<link rel="stylesheet" type="text/css" href="css/index.css">
</head>

<body>

	<div id="layerl"
		style="position:absolute; left:903px; top:152px; width:234px; height:497px;">
		<div>
			<font size="4" color="skyblue" face="幼圆"> <a href="login.jsp">登录</a>
				<a href="regist.jsp">注册</a> </font>
		</div>
		<div></div>
		<div>
			<h1>
				<font size="4" color="#999999" face="微软雅黑"><b>这些人正在使用博客</b>
				</font>
			</h1>
			<p>
				<img src="images/1.jpg" width="50" height="50"> <img
					src="images/2.jpg" width="50" height="50"> <img
					src="images/3.jpg" width="50" height="50">
			</p>
			<p>
				<img src="images/4.jpg" width="50" height="50"> <img
					src="images/5.jpg" width="50" height="50"> <img
					src="images/6.jpg" width="50" height="50">
			</p>
			<p>
				<img src="images/7.jpg" width="50" height="50"> <img
					src="images/8.jpg" width="50" height="50"> <img
					src="images/9.jpg" width="50" height="50">
			</p>
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
	<div class="lay4"
		style="position:absolute; left:33px; top:20px; width:499px; height:63px;">
		<font id="lay3" face="微软雅黑" size="+2" color=#ffffff>时间煮雨BLOG</font>
	</div>

	<div
		style="position: absolute; left: 132px; top: 226px; width: 242px; height: 333px; background-image:url(images/112.png); background-repeat:no-repeat; filter:alpha(opacity=80); -moz-opacity:0.8; -khtml-opacity:0.8; opacity: 0.8"">
		<div
			style="position: absolute; left: 18px; top: 15px; width: 202px; height: 294px;">
			<font color="yellow"><center></center>
			</font>
			<p>
				<font color="gray"></font>
			</p>
		</div>
	</div>
	<div
		style="position: absolute; background-image:url(images/111.png); background-repeat:no-repeat; left: 75px; top: 409px; width: 333px; height:252px; ; filter:alpha(opacity=80); -moz-opacity:0.8; -khtml-opacity:0.8; opacity: 0.8"></div>
	<div
		style="position: absolute; left: 556px; top: 230px; width: 241px; height:328px; background-image:url(images/112.png); background-repeat:no-repeat; filter:alpha(opacity=80); -moz-opacity:0.8; -khtml-opacity:0.8; opacity: 0.8">
		<div
			style="position: absolute; left: 18px; top: 15px; width: 202px; height: 294px;">
			<font color="yellow"><center></center>
			</font>
			<p>
				<font color="gray"></font>
			</p>
		</div>
	</div>
	<div
		style="position: absolute; background-image:url(images/111.png); background-repeat:no-repeat; left: 500px; top: 409px; width: 333px; height:252px; ; filter:alpha(opacity=80); -moz-opacity:0.8; -khtml-opacity:0.8; opacity: 0.8"></div>
</body>
</html>
