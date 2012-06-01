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
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
<meta name="description" content="六出奇计微博的描述" />
<meta name="keywords" content="" />
<title>微博登陆</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>微博登陆</title>
<link rel="stylesheet" type="text/css" href="css/login1.css">
<script src="js/login-new.js"></script>
<script src="js/login1.js"></script>
<script src="js/login2.js"></script>
</head>
<body>
	<div class="login-load"></div>
	<div class="login-bg">
		<div id="logo"
			style="float:right; top:23px; width:120px; height:90px;"></div>
		<div id="explain" style=" top:90px; width:400px; height:300px;">

		</div>
	</div>
	<div class="login-content clearfix">
		<ul class="login-word clearfix">
			<li class=""><span></span>
			</li>
			<li class=""><span></span>
			</li>
		</ul>
		<div>
		<div
			style="position:absolute; left:597px; top:76px; width:332px; height:90px;&gt;
    &lt;">
			<span><font size="12" face="宋体" color=#ffffff></font><br />
			</span>
		</div><br/>
		<br/>
		<div class="login-main clearfix">
			<form name="loginForm" action="loginServlet?type=login" method="post"
				autocomplete="off">
				<div class="item email clearfix">
					<div class="item-input item-input-box">
						<input type="text" name="uname" id="email" class="input-email" />
						<label for='email'>用户名</label>
					</div>
					<p id="emailErro">请填写用户名</p>
				</div>
				<div class="item password clearfix">
					<div class="item-input">
						<input type="password" name="password" id="password"
							class="input-password" /> <label for='password'>输入密码</label> <a
							class="remember" href="javascript:;" title="自动登录">自动登录</a>
					</div>
					<p class="prompt" id="pswErro">您还没有填写密码</p>
				</div>
				<div class="item-btn clearfix">
					<input type="submit" class="input-btn" value="登 录">
					<p class="tip">
						<a href="regist.jsp">立即注册</a>
					</p>
				</div>
			</form>
		</div>
	</div>
	<script type="text/javascript" src="js/login3.js"></script>
	<script type="text/javascript">
		COMSCORE.beacon({
			c1 : 2,
			c2 : 6934070,
			c3 : "",
			c4 : "",
			c5 : "",
			c6 : "",
			c15 : ""
		});
	</script>
	<noscript></noscript>
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
