package com.demo.dao;

import com.demo.model.Person;

public interface PersonDao {

	boolean  savePerson(Person p);

	Person findById(int pid);

}
