package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.Student;

public class TestFetchType {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		System.out.println("Before load / find");
		//Student s2=session.find(Student.class, 11);
		Student s2=session.byId(Student.class).load( 11);
		System.out.println("After load / find");
		System.out.println("Name:"+s2.getSname());
		System.out.println(s2.getAddr().getState()+"---->"+s2.getAddr().getCity());
		tr.commit();
		session.close();
	
		sf.close();

	}

}
