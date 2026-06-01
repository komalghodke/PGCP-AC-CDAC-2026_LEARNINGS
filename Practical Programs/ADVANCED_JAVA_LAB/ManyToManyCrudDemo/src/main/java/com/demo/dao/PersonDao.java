package com.demo.dao;

import java.util.List;

import com.demo.model.Address;
import com.demo.model.Person;

public interface PersonDao {

	boolean  savePerson(Person p);

	Person findById(int pid);

	boolean modifyPerson(int pid, String pname, String mob);

	boolean removeById(int pid);

	List<Person> findAllPerson();

	boolean assignAddressToPerson(int pid, int aid);

	boolean deleteAddressFromPerson(int pid, int aid);

	List<Person> findAllByCity(String city);

	boolean addNewAddress(Address a);

	Address findAddressById(int aid);

	boolean modifyAddressById(int aid, String street, String city);

	boolean removeAddressById(int aid);

}
