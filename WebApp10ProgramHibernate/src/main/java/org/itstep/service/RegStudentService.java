package org.itstep.service;

import java.util.ArrayList;
import java.util.List;

import org.itstep.dao.PersonDAO;
import org.itstep.dao.StudentDAO;
import org.itstep.model.Person;

public class RegStudentService {

	public boolean regexData(Person person) {
		if (Regex.regexLogin(person.getLogin()) && Regex.regexPassword(person.getPassword())
				&& Regex.regexEmail(person.getEmail())) {
			return true;
		} else {
			return false;
		}
	}

	public boolean notNullData(Person person) {
		if (person.getLogin() != null || person.getPassword() != null || person.getFirstName() != null
				|| person.getSecondName() != null || person.getEmail() != null || person.getGroup() != null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean regexAge(String age) {
		if (age.matches("[0-9]{1,2}")) {
			return true;
		} else {
			return false;
		}
	}

	public void saveServiceStudentData(Person person) {
		StudentDAO studentDAO = new StudentDAO();
		studentDAO.saveStudent(person);

	}

	public boolean notNullGroup(String group) {
		if (group != null) {
			return true;
		} else {
			return false;
		}
	}

	public List<Person> getStudentsInGroup(String group) {
		PersonDAO personDAO = new PersonDAO();
		ArrayList<Person> list = new ArrayList<Person>();
		List<Person> persons = personDAO.getAllStudentInGroup();
		for (Person person : persons) {
			if(person.getGroup().equals(group)) {
				list.add(person);
			}
			return list;
		}
		return null;
	}

	public Person getInfoStudent(String login) {
		PersonDAO personDAO = new PersonDAO();
		Person student = personDAO.getInfoStudent(login);
		
		return student;
	}
}
