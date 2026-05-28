package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.MyUSer;

public class TestFindAndLoad {

	public static void main(String[] args) {
		//create connection with database by using hibernate.cfg.xml
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		//retireve the data
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		//MyUSer u11=session1.get(MyUSer.class, 2);
		System.out.println("before find");
		//early binding , egar fetchtype
		//MyUSer u11=session.find(MyUSer.class, 12);
		//getReerence is in version 7 , it is equivalent to load method in old version
		//getreference will delay the query execution till you actually try to use the object
		MyUSer u11=session.getReference(MyUSer.class,12);   //get/load
		
		System.out.println("after  find");
		if(u11!=null)
		        System.out.println(u11);
		else
			    System.out.println("not found");
		tr.commit();
		session.close(); 
		sf.close();


	}

}
