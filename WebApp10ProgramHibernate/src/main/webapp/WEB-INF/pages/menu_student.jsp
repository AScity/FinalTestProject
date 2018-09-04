<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu student</title>
</head>
<body>
<h4>Hello Student <c:out value="${requestScope.firstName}"/> <c:out value="${requestScope.secondName}"/></h4>
<form action="student_information" method="post">
If you want to see your information
</br>
<input type="submit" name="enter" value="ENTER"/>
</form>
</br>
<a href="log_out">Log out</a>
</body>
</html>