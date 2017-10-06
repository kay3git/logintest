<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン画面</title>
</head>
	<body>
	<!--POST通信*********************-->
		<form action="LoginAction">
			名前<br>
			<input type="text" name="username">
			<br>
			パスワード<br>
			<input type="password" name = "password">
			<br>
			<input type="submit" value="送信">
		</form>
	</body>
</html>