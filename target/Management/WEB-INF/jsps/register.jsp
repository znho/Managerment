<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv = "X-UA-Compatible" content = "IE=Edge" /> 
	<title>注册</title>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/require.min.js"
			defer async="true" data-main="${pageContext.request.contextPath}/resources/js/registerMain"></script>
</head>
<body>
	<div class="form-wrap">
		<form action=" " method="post" class="form-content" id="all-input">
			<h3 class="form-title">用户注册</h3>
			<p class="input-wrap">
				<label>教师姓名</label>
				<input type="text" class="reg-input-style" id="tname" name="t_name">
				<span class="hint"></span>
			</p>
			<p class="input-wrap">
				<label>账号</label>
				<input type="text" class="reg-input-style" id="account" name="t_account">
				<span class="hint"></span>
			</p>
			<p class="input-wrap">
				<label>密码</label>
				<input type="password" class="reg-input-style" id="password" name="t_pwd">
				<span class="hint"></span>
			</p>
			<p class="input-wrap">
				<label>确认密码</label>
				<input type="password" class="reg-input-style" id="confirmpwd">
				<span class="hint"></span>
			</p>
			<p class="input-wrap">
				<label>选择专业</label>
				<select id="department" name="t_department"></select>
				<select id="special" name="t_special"></select>
			</p>
			<p class="input-wrap">
				<label>邮箱</label>
				<input type="text" class="reg-input-style" id="mail" name="t_email">
				<span class="hint"></span>
			</p>
			<p class="input-wrap">
				<label>验证码</label>
				<input type="text" id="vtCode">
				<img src="images/fj2.jpg" id="vt-img">
				<a href="#" id="change-vt-code">换一个</a>
				<span class="hint"></span>
			</p>
			<p class="input-wrap">
				<button id="complete-reg" type="submit">注册</button>
				<a href="" class="link-login">已有账号，直接登陆</a>
			</p>
		</form>
	</div>

	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/normal.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/register.css">
</body>
</html>