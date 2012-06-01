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

<link rel="stylesheet" type="text/css" href="css/category.css">
<link rel="stylesheet" type="text/css" href="css/all.css">
<link rel="stylesheet" type="text/css" href="css/homepage.css">


</head>

<body>
	<div
		style="position:absolute; left: 161px; top: 196px; width: 719px; height: 347px; background-color:#FFF"
		align="center">
		<form>
			<table width="518" height="283">
				<tr>
					<th width="102">标题</th>
					<th width="137">发表时间</th>
					<th width="110">访问次数</th>
					<th width="141">操作</th>
				</tr>
				
				<tr>
					<td colspan="4"><hr /></td>
				</tr>
				<tr>
					<td><font size="2"><a href="bloggerServlet?type=show&bid="></a></font></td>
					<td></td>
					<td>12</td>
					<td><a href="#">编辑</a>
						<a href="#">删除</a></td>
				</tr>
				<tr>
					<td height="16" colspan="4"><hr /></td>
				</tr>
			</table>
		</form>
		<span><center>
				<a href="loginServlet?type=page&pageNow=">上一页</a>
			
				<a href="loginServlet?type=page&pageNow=" ></a>
			
				<a href="loginServlet?type=page&pageNow=">下一页</a>
				
				<br />
			</center> </span>
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
			<a href="bloggerServlet?type=write">写博文</a>
		</div>
	</div>
	<div class="navigation" id="Layer5">
		<div class="in">
			<a href="loginServlet?type=manage">博文管理</a>
		</div>
	</div>
</body>
</html>
