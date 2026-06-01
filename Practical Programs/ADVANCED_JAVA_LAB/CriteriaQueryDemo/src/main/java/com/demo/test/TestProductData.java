package com.demo.test;

import java.time.LocalDate;

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
		Product p1=new Product(100,"p1",15,200,LocalDate.of(2026, 03, 01));
		Product p2=new Product(101,"p2",18,250,LocalDate.now());
		Product p3=new Product(102,"p3",8,100,LocalDate.of(2025, 03, 01));
		Product p4=new Product(103,"p4",25,350,LocalDate.now());
		session.persist(p1);
		session.persist(p2);
		session.persist(p3);
		session.persist(p4);
		
		
		tr.commit();
		session.close();
		sf.close();

	}

}
