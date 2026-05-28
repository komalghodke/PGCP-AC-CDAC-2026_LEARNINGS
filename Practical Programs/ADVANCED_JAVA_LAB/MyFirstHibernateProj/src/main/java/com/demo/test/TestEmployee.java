package com.demo.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Employee e=new Employee("Mugdha",445674.78,LocalDate.now());
		Employee e1=new Employee("Gauri",475674.78,LocalDate.now());
		session.persist(e);
		session.persist(e1);
		tr.commit();
		session.close();
		sf.close();

	}

}
