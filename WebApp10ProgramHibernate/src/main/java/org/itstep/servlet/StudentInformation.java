package org.itstep.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.itstep.model.Person;
import org.itstep.service.RegStudentService;

@WebServlet("/student_information")
public class StudentInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RegStudentService service = new RegStudentService();
		HttpSession session = request.getSession();
		String login = (String)session.getAttribute("login");
		Person person = service.getInfoStudent(login);
		request.setAttribute("student", person);
		request.getRequestDispatcher("/WEB-INF/pages/student_info.jsp").forward(request, response);
		
		
		//RequestDispatcher dispatcher = request.getRequestDispatcher("");
		//dispatcher.forward(request, response);
	}

}
