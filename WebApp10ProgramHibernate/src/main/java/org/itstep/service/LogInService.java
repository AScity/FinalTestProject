package org.itstep.service;

import java.util.List;

import org.itstep.dao.PersonDAO;
import org.itstep.model.Person;

public class LogInService {

	public String getAutorizationPerson(String login) {
		String role = null;
		PersonDAO personDAO = new PersonDAO();
		if ((login != null)) {
			Person person = personDAO.getRoleFromPerson(login);
			if(person != null) {
			role = person.getRole();
			}
		}
		return role;
	}

	public String getFirstName(String login, String password) {
		
		PersonDAO personDAO = new PersonDAO();
		Person person = personDAO.getInfoStudent(login);
		
		return person.getFirstName();
	}

	public String getSecondName(String login, String password) {
		
		PersonDAO personDAO = new PersonDAO();
		Person person = personDAO.getInfoStudent(login);
		
		return person.getSecondName();
	}
}
