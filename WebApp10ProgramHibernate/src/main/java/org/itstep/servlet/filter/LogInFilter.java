package org.itstep.servlet.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.itstep.service.LogInService;

@WebFilter("/")
public class LogInFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		
		LogInService service = new LogInService();
		String login = req.getParameter("login");
		String password = req.getParameter("password");
		HttpSession session = req.getSession();
		if(session!=null && session.getAttribute("login")!=null && session.getAttribute("password")!=null) {
			String role = (String)session.getAttribute("role");
			if(role.equals("teacher")) {
				request.getRequestDispatcher("/WEB-INF/pages/menu_teacher.jsp").forward(request, response);
			}else if(role.equals("student")) {
				request.getRequestDispatcher("/WEB-INF/pages/menu_student.jsp").forward(request, response);
			}
		}else if(service.getAutorizationPerson(login) != null) {
			req.getSession().setAttribute("login", login);
			req.getSession().setAttribute("password", password);
			req.getSession().setAttribute("role", service.getAutorizationPerson(login));
			if(service.getAutorizationPerson(login).equals("teacher")) {
				String firstName = service.getFirstName(login, password);
				String secondName = service.getSecondName(login, password);
				req.setAttribute("firstName", firstName);
				req.setAttribute("secondName", secondName);
				request.getRequestDispatcher("/WEB-INF/pages/menu_teacher.jsp").forward(request, response);
			}else {
				String firstName = service.getFirstName(login, password);
				String secondName = service.getSecondName(login, password);
				req.setAttribute("firstName", firstName);
				req.setAttribute("secondName", secondName);
				request.getRequestDispatcher("/WEB-INF/pages/menu_student.jsp").forward(request, response);
			}
		}else {
			request.getRequestDispatcher("/WEB-INF/pages/index.jsp").forward(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

	public void destroy() {

	}
}
