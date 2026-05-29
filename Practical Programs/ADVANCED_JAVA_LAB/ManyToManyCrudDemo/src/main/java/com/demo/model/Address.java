package com.demo.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="address14")
public class Address {
	@Id
     private int aid;
     private String street;
     private String city;
     private String state;
     @ManyToMany(mappedBy="addrset")
     private Set<Person> perset;
	 public Address() {
		super();
	 }
	 public Address(int aid, String street, String city, String state, Set<Person> perset) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.state = state;
		this.perset = perset;
	 }
	 public int getAid() {
		 return aid;
	 }
	 public void setAid(int aid) {
		 this.aid = aid;
	 }
	 public String getStreet() {
		 return street;
	 }
	 public void setStreet(String street) {
		 this.street = street;
	 }
	 public String getCity() {
		 return city;
	 }
	 public void setCity(String city) {
		 this.city = city;
	 }
	 public String getState() {
		 return state;
	 }
	 public void setState(String state) {
		 this.state = state;
	 }
	 public Set<Person> getPerset() {
		 return perset;
	 }
	 public void setPerset(Set<Person> perset) {
		 this.perset = perset;
	 }
	 @Override
	 public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", city=" + city + ", state=" + state  + "]";
	 }
     
}
