package org.itstep.dao;

import org.hibernate.Session;
import org.itstep.model.Person;
import org.itstep.utils.HibernateUtil;


public class TeacherDAO {

	private Session session;
	
	public void saveTeacher(Person person) {
		
		session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(person);
		session.getTransaction().commit();
		session.close();
		
	}
}
