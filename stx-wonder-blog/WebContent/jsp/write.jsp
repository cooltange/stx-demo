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

<link rel="stylesheet" type="text/css" href="css/write.css" />
<link rel="stylesheet" type="text/css" href="css/all.css" />
<script language="JavaScript" src="js/homepage.js"></script>
<script type="text/javascript">
 function checkForm(){
	var string= new Array();
	string[0]= document.getElementById("title").value;
	
		  if(string[0].length==0){
			 alert("标题不能为空!");
			 return false;}

		return true;
}
  
</script>
</head>
<body>

	<div id="Layer15"
		style="position:absolute; left: 29px; top: 189px; width: 992px; height: 558px; background-color:#39C;filter:alpha(opacity=80);-moz-opacity:0.8;-khtml-opacity:0.8;opacity: 0.8;position:relative;"
		align="center">
		<form action="bloggerServlet?type=add" method="post">
			<table width="989" height="512">
				<div style=" position:absolute; background-color:#03F">
					<tr>
						<td><pre>标    题：</pre>
						</td>
						<td><input id ="title" name="title" type="text" size="30" />
						</td>
					</tr>
				</div>
				<tr>
					<td height="52"><pre>类    别：</pre>
					</td>
					<td><select name="cid">
					
							<option value=""></option>	
						
					</select><a href=categoryServlet?type=newcate />创建分类</td>
				</tr>
				<tr>
					<td height="88"><pre>公开程度：</pre>
					</td>
					<td><select name="levels">
							<option value="0">完全公开</option>
							<option value="1">仅好友</option>
					</select>
					</td>
				</tr>
				<tr>
					<td height="318" align="center" valign="top"><pre>内    容：</pre>
					</td>
					<td align="left" valign="top"><textarea cols="100" rows="14"
							name="textarea">请在这里写文章</textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="确定提交" onclick="return checkForm()" />
					</td>
				</tr>
			</table>
		</form>
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
