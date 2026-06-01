package com.demo.test;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Product;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class TestCriteriaQueryProduct {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		//1 select all products
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Product> cq=cb.createQuery(Product.class);
		Root<Product> root=cq.from(Product.class);
		
		
		cq.select(root);
		List<Product> plist=session.createQuery(cq).getResultList();
		plist.forEach(System.out::println);
		System.out.println("--------------------------------------------------");
		
		//retrieve all products with price>180
		cq.select(root).where(cb.gt(root.get("price"), 180));
		 plist=session.createQuery(cq).getResultList();
		plist.forEach(System.out::println);
	System.out.println("--------------------------------------------------");
		
		//retrieve all products with qty between 8 and 20
	
	cq.select(root)
	.where(cb.between(root.get("qty"), 8, 20));
	 plist=session.createQuery(cq).getResultList();
		plist.forEach(System.out::println);
	System.out.println("--------------------------------------------------");
	
	//retrieve products with price>200 or qty<25
	Predicate p1=cb.gt(root.get("price"), 200);
	Predicate p2=cb.lt(root.get("qty"), 25);
	    cq.select(root)
	    .where(cb.or(p1,p2));
		 plist=session.createQuery(cq).getResultList();
		plist.forEach(System.out::println);
		System.out.println("--------------------------------------------------");
		
		//retrieve products with price>200 and qty<25
		//Predicate p1=cb.gt(root.get("price"), 200);
		//Predicate p2=cb.lt(root.get("qty"), 25);
		    cq.select(root)
		    .where(cb.and(p1,p2));
			 plist=session.createQuery(cq).getResultList();
			plist.forEach(System.out::println);
			System.out.println("--------------------------------------------------");
			
		//price>200 or qty<20 and pname='p1'
			Predicate p11=cb.gt(root.get("price"), 200);
			Predicate p12=cb.lt(root.get("qty"), 20);
			Predicate p13=cb.equal(root.get("pname"), "p1");
			 cq.select(root)
			    .where(
			    		cb.and(
			    		cb.or(p11,p12),p13)
			    		);
				 plist=session.createQuery(cq).getResultList();
				plist.forEach(System.out::println);
				System.out.println("--------------------------------------------------");
				
				
		//list all products with price is either 100 or 150
				cq.select(root)
				  .where(
				      root.get("price")
				          .in(100,150)
				   );
				 plist=session.createQuery(cq).getResultList();
					plist.forEach(System.out::println);
					System.out.println("--------------------------------------------------");
					
		//order by
				cq.select(root)
				  .orderBy(
				      cb.desc(root.get("price"))
				  );
				
				 plist=session.createQuery(cq).getResultList();
					plist.forEach(System.out::println);
					System.out.println("--------------------------------------------------");
					
					
		//display only name and price
	CriteriaQuery<Object[]> cq1=cb.createQuery(Object[].class);

Root<Product> root1 =cq1.from(Product.class);	
		 cq1.multiselect(
				        root1.get("pname"),
				        root1.get("price")
				);

				List<Object[]> list =
				        session.createQuery(cq1)
				               .getResultList();

				for(Object[] row : list) {

				    System.out.println(
				            row[0] + " " + row[1]
				    );
				}
				
		//find product where pname starts with p  
		//and price>200 or qty<25
		//and mfgdate is after 2026-05-03
		//order by price in descending order
				Predicate p21 =
				        cb.like(root.get("pname"), "p%");

				Predicate p22 =
				        cb.gt(root.get("price"), 200);

				Predicate p3 =
				        cb.lt(root.get("qty"), 25);

				Predicate p4 =
				        cb.greaterThan(
				            root.get("mfgdate"),
				            LocalDate.of(2026,05,03)
				        );

				cq.select(root)
				  .where(
				      cb.and(
				          p21,
				          cb.or(p22, p3),
				          p4
				      )
				  )
				  .orderBy(
				      cb.desc(root.get("price"))
				  );

				 plist =
				        session.createQuery(cq)
				               .getResultList();
				 
					plist.forEach(System.out::println);
					System.out.println("--------------------------------------------------");
					
		//list products manufactured in year 2024 or 2026
				Predicate year2024 =
				        cb.equal(
				            cb.function(
				                "year",
				                Integer.class,
				                root.get("mfgdate")
				            ),
				            2024
				        );

				Predicate year2026 =
				        cb.equal(
				            cb.function(
				                "year",
				                Integer.class,
				                root.get("mfgdate")
				            ),
				            2026
				        );

				cq.select(root)
				  .where(
				      cb.or(year2024, year2026)
				  );
				 plist=session.createQuery(cq).getResultList();
					plist.forEach(System.out::println);
					System.out.println("--------------------------------------------------");
					
				
		tr.commit();
		session.close();
		sf.close();
	}

}
