<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>注册</h1>
	<hr>
	<form name="registForm" method="get" action="addUser.do">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" id="userName" name="userName"></td>
			</tr>
			<tr>
				<td>密 码：</td>
				<td><input type="password" id="pwd" name="pwd"></td>
			</tr>
			<tr>
				<td><input type="submit" value="确定"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>