package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Customer;

public class TestGetData {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Customer c=session.find(Customer.class, 13);
		System.out.println(c);
		tr.commit();
		session.close();
		sf.close();
	}

}
