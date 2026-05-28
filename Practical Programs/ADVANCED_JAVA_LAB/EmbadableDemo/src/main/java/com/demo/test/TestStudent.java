package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.Student;

public class TestStudent {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Address addr=new Address(121,"Aundh","Pune","Maharashtra");
		Student s=new Student(13,"Rohan","3333",addr);
		Student s1=new Student(231,"Rohit","444444",addr);
		session.persist(s1);
		session.persist(s);	
		tr.commit();
		session.close();
		Session session1=sf.openSession();
		Transaction tr1=session1.beginTransaction();
		//retrive student
		Student s2=session1.find(Student.class, 12);
		System.out.println(s2);
		tr1.commit();
		session1.close();
		sf.close();

	}

}
