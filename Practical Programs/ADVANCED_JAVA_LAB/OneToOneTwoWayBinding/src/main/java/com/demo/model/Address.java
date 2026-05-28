package com.demo.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="address111")
public class Address {
	@Id
	private int aid;
	private String street;
	private String city;
	private String  state;
	@OneToOne(mappedBy = "addr",fetch=FetchType.LAZY)
	private Student s;
	public Address() {
		super();
	}
	
	public Address(int aid, String street, String city, String state, Student s) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.state = state;
		this.s = s;
	}

	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
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
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	

}
