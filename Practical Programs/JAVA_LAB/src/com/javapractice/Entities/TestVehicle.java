package com.javapractice.Entities;

public class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle("vespa","twoWheeler", "SkyBlue");
		System.out.println(v +"\n");
		
		Vehicle v1 = new Vehicle("Royal Enfield","Two Wheeler", "Red");
		System.out.println(v1 + "\n");
		
		Vehicle v3 = new Vehicle();
		v3.setVname("Jaguar");
		v3.setVehicleType("Four Wheeler");
		v3.setColor("Black");
		System.out.println(v3);		
		//System.out.println(v3.dummy);
	}
}
