package org.itstep.service;

import org.itstep.dao.TeacherDAO;
import org.itstep.model.Person;

public class RegTeacherService {

	public boolean regexData(Person person) {
		if(Regex.regexLogin(person.getLogin()) && Regex.regexPassword(person.getPassword()) && Regex.regexEmail(person.getEmail())) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean notNullData(Person person) {
		if(person.getLogin()!=null || person.getPassword()!=null || person.getFirstName()!=null || person.getSecondName()!=null 
				|| person.getSex()!=null || person.getEmail()!=null || person.getSubject()!=null) {
			return true;
		}else {
			return false;
		}
	}
	public boolean regexAge(String age) {
		if(age.matches("[0-9]{1,2}")) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean maleFemaleData(Person person) {
		if(person.getSex().equals("male") || person.getSex().equals("female")) {
			return true;
		}else {
		return false;
		}
	}

	public void saveServiceTeacherData(Person person) {
		TeacherDAO teacherDAO = new TeacherDAO();
		teacherDAO.saveTeacher(person);
		
	}

	
	

}
