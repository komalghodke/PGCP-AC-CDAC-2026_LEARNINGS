package com.demo.service;

import java.util.List;

import com.demo.model.Address;
import com.demo.model.Person;

public interface PersonService {

	boolean addNewPerson();

	Person displayPerson(int pid);



	boolean updatePerson(int pid, String pname, String mob);

	boolean deleteById(int pid);

	List<Person> getAll();

	boolean addAddressToPerson(int pid, int aid);

	boolean removeAddressFromPerson(int pid, int aid);

	List<Person> getAllByCity(String city);

	boolean addAddress();

	Address displayAddress(int aid);

	boolean updateAddressById(int aid, String street, String city);

	boolean deleteAddressById(int aid);

}
