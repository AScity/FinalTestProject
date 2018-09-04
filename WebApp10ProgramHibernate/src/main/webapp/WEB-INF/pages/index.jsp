<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LogIn</title>
</head>
<body>
<h3>Enter your login and password for avtorization</h3>
<div class="login">
<form action="" method="post">
	<input type="text" placeholder="login" name="login"/></br>
	<input type="password" placeholder="password" name="password"/></br>
	<input type="submit" name="LogIn" value="LogIn"/></br>
</form>
<hr>
</br>
</div>

<div class="ticher">
<form action="registration_as_teacher" method="get">
	<input type="submit" name="reistration_as_ticher" value="Registration as ticher">
</form>
</br>
</div>

<div class="student">
<form action="registration_as_student" method="get">
	<input type="submit" name="reistration_as_student" value="Registration as student">
</form>
</div>
</body>
</html>