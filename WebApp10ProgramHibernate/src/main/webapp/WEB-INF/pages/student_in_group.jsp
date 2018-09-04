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
 <h3>Your student in group </h3>
	<c:forEach var="student" items="${requestScope.students}">
		<ul>
			<li>FirstName: <c:out value="${student.firstName}" />
			</li>
			<li>SecondName: <c:out value="${student.secondName}" />
			</li>
			<li>Age: <c:out value="${student.age}" />
			</li>
			<li>Group: <c:out value="${student.group}" />
			</li>
			</br>
		</ul>
	</c:forEach>
	<a href="home_page">home page</a>
</body>
</html>