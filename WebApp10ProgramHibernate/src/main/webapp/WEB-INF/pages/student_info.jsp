<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Your personal information</h3>
		<ul>
			<li>Your login: <c:out value="${student.login}" />
			</li>
			<li>Your password: <c:out value="${student.password}" />
			</li>
			<li>Your first name: <c:out value="${student.firstName}" />
			</li>
			<li>Your second name: <c:out value="${student.secondName}" />
			</li>
			<li>Your age: <c:out value="${student.age}" />
			</li>
			<li>Your email: <c:out value="${student.email}" />
			</li>
			<li>Your group: <c:out value="${student.group}" />
			</li>
		</ul>
		</br>
	<a href="home_page">home page</a>
</body>
</html>