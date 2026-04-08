package com.javapractice.Entities;

import java.util.Date;

public class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle("vespa","twoWheeler", "SkyBlue", new Date());
		System.out.println(v +"\n");
		
		Vehicle v1 = new Vehicle("Royal Enfield","Two Wheeler", "Red", new Date());
		System.out.println(v1 + "\n");
		
		Vehicle v3 = new Vehicle();
		v3.setVname("Jaguar");
		v3.setVehicleType("Four Wheeler");
		v3.setColor("Black");
		v3.setMfd(new Date());
		System.out.println(v3);		
		//System.out.println(v3.dummy);
	}
}
