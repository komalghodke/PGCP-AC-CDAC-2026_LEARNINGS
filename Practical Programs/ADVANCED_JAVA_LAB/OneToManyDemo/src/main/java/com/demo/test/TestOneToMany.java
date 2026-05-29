package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.Person;

public class TestOneToMany {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Set<Address> aset = new HashSet<>();
		Person p1 = new Person(3, "Sameer", "33333", null);
		Person p2 = new Person(4, "Sanket", "44444", null);
		Address a1 = new Address("baner", "Pune", "Maharashtra", p1);
		Address a2 = new Address("aundh", "Pune", "Maharashtra", p1);
		aset.add(a1);
		aset.add(a2);
		p1.setAddrset(aset);
		Address a3 = new Address("Kothrud", "Pune", "Maharashtra", p2);
		Address a4 = new Address("wakad", "Pune", "Maharashtra", p2);
		Set<Address> aset1 = new HashSet<>();
		aset1.add(a3);
		aset1.add(a4);
		p2.setAddrset(aset1);
		session.persist(p1);
		session.persist(p2);
		session.persist(a1);
		session.persist(a2);
		session.persist(a3);
		session.persist(a4);
		tr.commit();
		session.close();
		sf.close();
	}

}
