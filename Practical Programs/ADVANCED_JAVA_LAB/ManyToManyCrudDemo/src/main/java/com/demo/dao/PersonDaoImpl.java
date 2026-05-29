package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.model.Person;

public class PersonDaoImpl implements PersonDao{
	private SessionFactory sf;
	{
		sf=HibernateUtil.getMySessionFactory();
	}
	@Override
	public boolean savePerson(Person p) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.persist(p);
		tr.commit();
		session.close();
		return true;
		
		
	}
	@Override
	public Person findById(int pid) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Person p=session.find(Person.class,pid);
		tr.commit();
		session.close();
		return p;
	}

}
