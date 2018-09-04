<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Student</title>
</head>
<body>
<h3>Registration form student</h3>
<form action="registration_as_student"method="post">
	<table>
	<tr><td>Login</td> <td><input type="text" placeholder="input login" name="login" /></td><td><em>enter for example <b>alexPerederiy</b></em></td></tr> 
	<tr><td>Password</td> <td><input type="password" placeholder="input password" name="password"/></td><td><em>enter for example <b>Alex333</b></em></td></tr>
	<tr><td>First Name</td> <td><input type="text" placeholder="input first name" name="first_name"/></td><td><em>enter for example <b>Alex</b></em></td></tr>
	<tr><td>Second Name</td> <td><input type="text" placeholder="input second name" name="second_name"/><td><em>enter for example <b>Perederiy</b></em></td></td></tr>
	<tr><td>Age</td> <td><input type="text" placeholder="input age" name="age"><td><em>enter for example <b>30</b></em></td></td></tr>
	<tr><td>E-mail</td> <td><input type="text" placeholder="input e-mail" name="e_mail"/><td><em>enter for example <b>Alex333@ukr.net</b></em></td></td></tr>
	<tr><td>Group</td> <td><input type="text" placeholder="input group" name="group"/></td></tr>
	</table></br>
	<input type="submit" name="send" value="SEND">
</form>
</br>
<a href="home_page">home page</a>
</form>
</body>
</html>