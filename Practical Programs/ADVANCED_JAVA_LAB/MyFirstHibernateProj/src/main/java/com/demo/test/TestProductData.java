package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Product;

public class TestProductData {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Product p=new Product(10,"chair",34);
		Product p1=new Product(11,"shelf",44);
		session.persist(p);
		session.persist(p1);
		tr.commit();
		session.close();
		sf.close();
		
		

	}

}
