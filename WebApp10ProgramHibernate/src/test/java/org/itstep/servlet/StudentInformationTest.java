package org.itstep.servlet;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.itstep.model.Person;
import org.itstep.service.RegStudentService;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

public class StudentInformationTest {

	@Ignore
	@Test
	public void testDoPostHttpServletRequestHttpServletResponse() throws ServletException, IOException {
		
		StudentInformation information = new StudentInformation();
		
		Person person1 = new Person("Alex", "dcvfd", "sfds", "sdfdsvf", 23, "sdfds", "sdfdsv", "dfs", "dvdf", "dsgvdf");
		
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
		RequestDispatcher dispatcher = Mockito.mock(RequestDispatcher.class);
		RegStudentService service = Mockito.mock(RegStudentService.class);
		HttpSession session = Mockito.mock(HttpSession.class);
		//Person person = Mockito.mock(Person.class);
		
		
		Mockito.when(request.getSession()).thenReturn(session);
		
		Mockito.when(session.getAttribute("login")).thenReturn("Alex");
		
		Mockito.when(service.getInfoStudent("Alex")).thenReturn(person1);
		
		//Mockito.when(request.setAttribute("student", person1)) посмотреть материал
		
		information.doPost(request, response);
		
		Mockito.verify(request).getRequestDispatcher("/WEB-INF/pages/student_info.jsp");
		Mockito.verify(dispatcher).forward(request, response);
		
	}

}
