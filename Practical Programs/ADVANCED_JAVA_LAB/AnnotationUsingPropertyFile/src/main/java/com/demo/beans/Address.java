package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("${addr.aid}")
       private int aid;
	@Value("${addr.street}")
       private String street;
	@Value("${addr.city}")
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
