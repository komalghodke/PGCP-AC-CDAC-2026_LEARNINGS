package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.Person;

public class TestManytoMany {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Person p1 = new Person(19, "Rakesh", "4444", null);
		Person p2 = new Person(20, "Bhavika", "55555", null);
		Address a1 = new Address(109, "Baner", "Pune", "Maharashtra", null);
		Address a2 = new Address(110, "Aundh", "Pune", "Maharashtra", null);
		Address a3 = new Address(111, "Wakad", "Pune", "Maharashtra", null);
		Set<Address> addrset1 = new HashSet<>();
		addrset1.add(a1);
		addrset1.add(a2);
		p1.setAddrset(addrset1);
		Set<Address> addrset2 = new HashSet<>();
		addrset2.add(a2);
		addrset2.add(a3);
		p2.setAddrset(addrset2);
		Set<Person> perset1 = new HashSet<>();
		perset1.add(p1);
		a1.setPerset(perset1);
		Set<Person> perset2 = new HashSet<>();
		perset2.add(p1);
		perset2.add(p2);
		a2.setPerset(perset2);
		Set<Person> perset3 = new HashSet<>();
		perset3.add(p2);
		a3.setPerset(perset2);
		session.persist(p1);
		session.persist(p2);
		session.persist(a1);
		session.persist(a2);
		session.persist(a3);
		tr.commit();
		session.close();
		sf.close();
	}
}
