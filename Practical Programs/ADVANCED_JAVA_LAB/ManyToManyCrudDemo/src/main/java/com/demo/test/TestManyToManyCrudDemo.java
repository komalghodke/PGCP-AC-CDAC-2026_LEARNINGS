package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.model.Address;
import com.demo.model.Person;
import com.demo.service.PersonService;
import com.demo.service.PersonServiceImpl;

public class TestManyToManyCrudDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		PersonService pservice=new PersonServiceImpl();
		do {
			System.out.println("1. add new Person\n2. display Person\n3. update Perso\n4. delete Person");
			System.out.println("5. add new Address\n6. display Address\n7. update Address\n8. delete Address");
			System.out.println("9. add existing address to existing person\n10. Remove one address from a person");
			System.out.println("11. Display all  Person\n12. Find Persons by city\n 13. exit\n choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1->{
				boolean status=pservice.addNewPerson();
				if(status) {
					System.out.println("Person added successfully");
				}else {
					System.out.println("Person cannot be added");
				}
			}
			case 2->{
				System.out.println("enter pid to search");
				int pid=sc.nextInt();
				Person p=pservice.displayPerson(pid);
				if(p!=null) {
					System.out.println(p.getPname()+p.getMobile());
				}else {
					System.out.println(pid + " Person not found");
				}
			}
			case 3->{
				System.out.println("enter pid");
				int pid=sc.nextInt();
				System.out.println("Enter name");
				String pname=sc.next();
				System.out.println("Enter mobile");
				String mob=sc.next();
		
				boolean status=pservice.updatePerson(pid,pname,mob);
				if(status) {
					System.out.println("updated successfully");
				}else {
					System.out.println(pid+ "Not found");
				}
			}
			case 4->{
				System.out.println("enter pid");
				int pid=sc.nextInt();
				boolean status=pservice.deleteById(pid);
				if(status) {
					System.out.println(pid+"deleted successfully");
				}else {
					System.out.println(pid+" not found");
				}
			}
			case 5->{
				boolean status=pservice.addAddress();
				if(status) {
					System.out.println("address added successfully");
				}else {
					System.out.println("Not addedd");
				}
				
			}
		
			
			case 6->{System.out.println("enter aid to search");
			int aid=sc.nextInt();
			Address a=pservice.displayAddress(aid);
			if(a!=null) {
				System.out.println(a);
			}else {
				System.out.println(aid + " Person not found");
			}
			}
			case 7->{
				System.out.println("enter address id");
				int aid=sc.nextInt();
				System.out.println("enetr new street");
				String street=sc.next();
				System.out.println("enetr new city");
				String city=sc.next();
				boolean status=pservice.updateAddressById(aid,street,city);
				if(status) {
					System.out.println("Address updated successfully");
				}else {
					System.out.println("not found");
				}
				
			}
			case 8->{	
				System.out.println("enter address id");
			     int aid=sc.nextInt();
			      boolean status=pservice.deleteAddressById(aid);
			      if(status) {
			    	  System.out.println("address deleted successfully");
			      }else{
			    	  System.out.println(aid+ "Not found");
			      }
			}
			case 9->{
				System.out.println("enetr pid");
				int pid=sc.nextInt();
				System.out.println("enetr aid");
				int aid=sc.nextInt();
				boolean status=pservice.addAddressToPerson(pid,aid);
				if(status) {
					System.out.println("addressAssigned successfuly");
				}else {
					System.out.println("not found");
				}
				
			}
			case 10->{
				System.out.println("enetr pid");
				int pid=sc.nextInt();
				System.out.println("enetr aid");
				int aid=sc.nextInt();
				boolean status=pservice.removeAddressFromPerson(pid,aid);
				if(status) {
					System.out.println("address removed successfuly");
				}else {
					System.out.println("not found");
				}
			}
			case 11->{
				List<Person> plist=pservice.getAll();
				plist.forEach(p->System.out.println(p.getPname()+"---->"+p.getMobile()));
			}
			case 12->{
				System.out.println("enter city");
				String city=sc.next();
				List<Person> plist=pservice.getAllByCity(city);
				for(Person p : plist) {

				    System.out.println(p.getPname());

				    for(Address a : p.getAddrset()) {

				        System.out.println(a.getCity());
				    }
				}
			}
			case 13->{
				System.out.println("Thank you for visiting.........");
				sc.close();
			}
			default->{
				System.out.println("Wrong choice");
			}
			
			}
			
		}while(choice!=13);

	}

}
