package org.itstep.dao;

import org.hibernate.Session;
import org.itstep.model.Person;
import org.itstep.utils.HibernateUtil;


public class StudentDAO {

	private Session session;
	
	public void saveStudent(Person person) {
		
		session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(person);
		session.getTransaction().commit();
		session.close();
		
	}
}
