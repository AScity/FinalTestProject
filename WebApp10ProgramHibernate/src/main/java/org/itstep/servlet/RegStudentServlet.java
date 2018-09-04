package org.itstep.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.itstep.model.Person;
import org.itstep.service.RegStudentService;

@WebServlet("/registration_as_student")
public class RegStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/pages/registration_student.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RegStudentService service = new RegStudentService();
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String firstName = request.getParameter("first_name");
		String secondName= request.getParameter("second_name");
		String age = request.getParameter("age");
		String email = request.getParameter("e_mail");
		String group = request.getParameter("group");
		String role = "student";
		if(service.regexAge(age)) {
			Person person = new Person(login, password, firstName, secondName, Integer.valueOf(age), email, group, role);
			if(service.regexData(person) && service.notNullData(person)) {
				service.saveServiceStudentData(person);
				response.sendRedirect("/WebApp10ProgramHibernate/");
			}else {
				doGet(request, response);
			}
		}else {
			doGet(request, response);
		}
	}

}
