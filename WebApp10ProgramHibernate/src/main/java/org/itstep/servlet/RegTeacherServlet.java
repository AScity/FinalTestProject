package org.itstep.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.itstep.model.Person;
import org.itstep.service.RegTeacherService;

@WebServlet("/registration_as_teacher")
public class RegTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/pages/registration_teacher.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RegTeacherService service = new RegTeacherService();
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String firstName = request.getParameter("first_name");
		String secondName= request.getParameter("second_name");
		String age = request.getParameter("age");
		String sex = request.getParameter("sex");
		String address = request.getParameter("address");
		String email = request.getParameter("e_mail");
		String subject = request.getParameter("subject");
		String role = "teacher";
		if(service.regexAge(age)) {
			Person person = new Person(login, password, firstName, secondName, Integer.valueOf(age), sex, address, email, subject, role);
			if(service.regexData(person) && service.notNullData(person) && service.maleFemaleData(person)) {
				service.saveServiceTeacherData(person);
				response.sendRedirect("/WebApp10ProgramHibernate/");
			}else {
				doGet(request, response);
			}
		}else {
			doGet(request, response);
		}
		
		
	}

}
