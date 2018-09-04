package org.itstep.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.itstep.model.Person;
import org.itstep.service.RegStudentService;

@WebServlet("/student_in_group")
public class StudentInGroupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RegStudentService service = new RegStudentService();
		String group = request.getParameter("group");
		if(service.notNullGroup(group)) {
			List<Person> person = service.getStudentsInGroup(group);
			if(person!=null) {
				request.setAttribute("students", person);
				request.getRequestDispatcher("/WEB-INF/pages/student_in_group.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("WEB-INF/pages/student_not.jsp").forward(request, response);
			}
		}
	}

}
