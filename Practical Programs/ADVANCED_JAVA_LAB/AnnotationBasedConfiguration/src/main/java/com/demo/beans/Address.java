package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component   //id is same as class name with 1 st alphabate small so it is address
//@Component("addr")  //this will give id as addr
//@Scope("prototype")
public class Address {
	@Value("12")
	private int aid;
	@Value("Baner")
	private String street;
	@Value("Pune")
	private String city;
	public Address() {
		super();
	}
	public Address(int aid, String street, String city) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
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
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", city=" + city + "]";
	}
	

}
