package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Person;

public class TestFindData {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Person p1=session.find(Person.class, 12);
		System.out.println("Name: "+ p1.getPname());
		System.out.println(p1.getAddrset());
        tr.commit();
        session.close();
        sf.close();
	}

}
