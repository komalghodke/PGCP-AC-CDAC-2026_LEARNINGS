package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Customer;
import com.demo.model.Employee;



public class TestInheritanceMappedBySuperClass {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		//transient state
		Employee emp=new Employee(12,"Sayali","33333",45678.78,10);
		Customer c=new Customer(13,"Sameer","4444","pune","silver");
		//persistent state
		session.persist(emp);
		session.persist(c);
		tr.commit();
		session.close();
		sf.close();

	}

}
