package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.demo.model.Address;
import com.demo.model.Person;



public class PersonDaoImpl implements PersonDao{
	private SessionFactory sf;
	{
		sf=HibernateUtil.getMySessionFactory();
	}
	@Override
	public boolean savePerson(Person p) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.persist(p);
		tr.commit();
		session.close();
		return true;
		
		
	}
	@Override
	public Person findById(int pid) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Person p=session.find(Person.class,pid);
		tr.commit();
		session.close();
		return p;
	}
	@Override
	public boolean modifyPerson(int pid, String pname, String mob) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Person p=session.find(Person.class,pid);
		if(p!=null) {
				p.setPname(pname);
				p.setMobile(mob);
			   session.merge(p);
		}
		tr.commit();
		session.close();
		return p!=null;
	}
	@Override
	public boolean removeById(int pid) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Person p=session.find(Person.class,pid);
		if(p!=null) {
			session.remove(p);
		}
		tr.commit();
		session.close();
		return p!=null;
	}
	@Override
	public List<Person> findAllPerson() {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Query q=session.createQuery("from Person",Person.class);
		List<Person> plist=q.list();
		tr.commit();
		session.close();
		return plist;
		
	}
	@Override
	public boolean assignAddressToPerson(int pid, int aid) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		//retrieve the person
		Person p=session.find(Person.class, pid);
		boolean status=false;
		if(p!=null) {
			//retireve the address
			Address a=session.find(Address.class, aid);
			if(a!=null) {
				//add address into  set of addresses
				p.getAddrset().add(a);
				session.merge(p);
				status=true;
			}
		}
		tr.commit();
		session.close();
		return status;
	}
	@Override
	public boolean deleteAddressFromPerson(int pid, int aid) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		//retrieve the person
		Person p=session.find(Person.class, pid);
		boolean status=false;
		if(p!=null) {
			//retireve the address
			Address a=session.find(Address.class, aid);
			if(a!=null) {
				//add address into  set of addresses
				p.getAddrset().remove(a);
				session.merge(p);
				status=true;
			}
		}
		tr.commit();
		session.close();
		return status;
	}
	@Override
	public List<Person> findAllByCity(String city) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		//join fetch will do egar fetch while executing query
		String hql="select distinct P from Person P join fetch P.addrset a where a.city=:c";
		List<Person> plist=session.createQuery(hql,Person.class).setParameter("c", city).list();
		tr.commit();
		session.close();
		return plist;
	}
	@Override
	public boolean addNewAddress(Address a) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.persist(a);
		tr.commit();
		session.close();
		return true;
	}
	@Override
	public Address findAddressById(int aid) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Address a=session.find(Address.class,aid);
		tr.commit();
		session.close();
		return a;
	}
	@Override
	public boolean modifyAddressById(int aid, String street, String city) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Address a=session.find(Address.class,aid);
		if(a!=null) {
				a.setStreet(street);
				a.setCity(city);
				session.merge(a);
		}
		tr.commit();
		session.close();
		return a!=null;
	}
	@Override
	public boolean removeAddressById(int aid) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Address a=session.find(Address.class,aid);
		if(a!=null) {
				session.remove(a);
		}
		tr.commit();
		session.close();
		return a!=null;
	}
	
	

}









