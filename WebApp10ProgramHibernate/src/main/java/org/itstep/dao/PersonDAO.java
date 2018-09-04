package org.itstep.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.hibernate.Session;
import org.itstep.model.Person;
import org.itstep.utils.HibernateUtil;


public class PersonDAO {

	private Session session;

	public Person getRoleFromPerson(String login){

		session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		Person person = session.get(Person.class, login);
		session.getTransaction().commit();
		session.close();

		return person;
	}

	public List<Person> getAllStudentInGroup() {
		session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createNativeQuery("SELECT * FROM persons WHERE role = 'student'", Person.class);
		List<Person> students = query.getResultList();
		session.getTransaction().commit();
		session.close();
		return students;
	}

	public Person getInfoStudent(String login) {
		session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createNativeQuery("SELECT * FROM persons WHERE login = :login", Person.class);
		query.setParameter("login", login);
		Person students = (Person)query.getSingleResult();
		session.getTransaction().commit();
		session.close();
		return students;
	}
}
