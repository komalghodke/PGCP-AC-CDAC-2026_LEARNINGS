package com.demo.service;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.dao.PersonDao;
import com.demo.dao.PersonDaoImpl;
import com.demo.model.Address;
import com.demo.model.Person;

public class PersonServiceImpl implements PersonService{
	private PersonDao pdao;

	public PersonServiceImpl() {
	
		this.pdao = new PersonDaoImpl();
	}

	@Override
	public boolean addNewPerson() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pid");
		int pid=sc.nextInt();
		System.out.println("enetr name");
		String pname=sc.next();
		System.out.println("Enter mobile");
		String mob=sc.next();
		Set<Address> addrset=new HashSet<>();
		String ans=null;
		do {
			System.out.println("Enetr address id");
			int aid=sc.nextInt();
			System.out.println("enter new street");
			String s=sc.next();
			System.out.println("enter new city");
			String c=sc.next();
			System.out.println("enter new state");
			String st=sc.next();
			Address a=new Address(aid,s,c,st,null);
			addrset.add(a);
			System.out.println("do you want to continue(y/n)");
			ans=sc.next();
		}while(ans.equals("y"));
		Person p=new Person(pid,pname,mob,addrset);
		return pdao.savePerson(p);
	}

	@Override
	public Person displayPerson(int pid) {
		return pdao.findById(pid);
	}

	@Override
	public boolean updatePerson(int pid, String pname, String mob) {
		return pdao.modifyPerson(pid,pname,mob);
		
	}

	@Override
	public boolean deleteById(int pid) {
	return pdao.removeById(pid);
	}

	@Override
	public List<Person> getAll() {
		return pdao.findAllPerson();
	}

	@Override
	public boolean addAddressToPerson(int pid, int aid) {
		return pdao.assignAddressToPerson(pid,aid);
	}

	@Override
	public boolean removeAddressFromPerson(int pid, int aid) {
		return pdao.deleteAddressFromPerson(pid,aid);
	}

	@Override
	public List<Person> getAllByCity(String city) {
	return pdao.findAllByCity(city);
	}

	@Override
	public boolean addAddress() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter aid");
		int aid=sc.nextInt();
		System.out.println("enter street");
		String street=sc.next();
		System.out.println("enter street");
		String c=sc.next();
		System.out.println("enter street");
		String st=sc.next();
		Address a=new Address(aid,street,c,st,null);
		return pdao.addNewAddress(a);
		
	}

	@Override
	public Address displayAddress(int aid) {
		return pdao.findAddressById(aid);
	}

	@Override
	public boolean updateAddressById(int aid, String street, String city) {
		return pdao.modifyAddressById(aid,street,city);
	}

	@Override
	public boolean deleteAddressById(int aid) {
		return pdao.removeAddressById(aid);
		
   }
	

}












