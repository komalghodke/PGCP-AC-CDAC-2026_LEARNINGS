package com.practice.q9;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<HotelRoom> list = new ArrayList<>();
		while(true)
		{
	        System.out.println("1 Add 2 Remove 3 Update 4 Book 5 Cancel 6 Display 7 Exit");
	        int ch = sc.nextInt();

	        switch(ch) {
	        case 1:
	            System.out.println("1 AC 2 NonAC");
	            int type = sc.nextInt();

	            System.out.println("Enter id type price status");
	            int id = sc.nextInt();
	            String t = sc.next();
	            double price = sc.nextDouble();
	            String status = sc.next();

	            if(type == 1) {
	                String ac = sc.next();
	                int beds = sc.nextInt();
	                list.add(new ACRoom(id,t,price,status,ac,beds));
	            } else {
	                int fan = sc.nextInt();
	                int floor = sc.nextInt();
	                list.add(new NonACRoom(id,t,price,status,fan,floor));
	            }
	            break;
	        case 2:
	            int rid = sc.nextInt();
	            list.removeIf(r -> r.roomId == rid);
	            break;
	        case 3:
	            int uid = sc.nextInt();
	            double np = sc.nextDouble();

	            for(HotelRoom r : list) {
	                if(r.roomId == uid) {
	                    r.price = np;
	                }
	            }
	            break;
	        case 4:
	            int bid = sc.nextInt();

	            for(HotelRoom r : list) {
	                if(r.roomId == bid) {
	                    r.status = "booked";
	                }
	            }
	            break;
	        case 5:
	            int cid = sc.nextInt();

	            for(HotelRoom r : list) {
	                if(r.roomId == cid) {
	                    r.status = "available";
	                }
	            }
	            break;
	        case 6:
	            for(HotelRoom r : list) {
	                System.out.println(r);
	            }
	            break;
	        case 7:
	            System.exit(0);
	        }
		}
	}

}
