package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="address13")
public class Address {
	@Id
	@GeneratedValue
	private int aid;
	private String street;
	private String city;
	private String state;
	@ManyToOne
	@JoinColumn(name="perid")
	private Person per;
	public Address() {
		super();
	}
	public Address(String street, String city, String state, Person per) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.per = per;
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
	public Person getPer() {
		return per;
	}
	public void setPer(Person per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", city=" + city + ", state=" + state + ", per=" + per
				+ "]";
	}

}
