package com.practice.q5;

import java.util.HashMap;
import java.util.Scanner;

public class ProductApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Product> map = new HashMap<>();

		while (true) {
			System.out.println("1 Add 2 Remove 3 Update 4 Unavailable 5 Display 6 Exit");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("1 Electronic 2 Grocery");
				int type = sc.nextInt();

				System.out.println("Enter id name price quantity status");
				int id = sc.nextInt();
				String name = sc.next();
				double price = sc.nextDouble();
				int qty = sc.nextInt();
				String status = sc.next();

				if (type == 1) {
					System.out.println("Enter warrantyPeriod and brand");
					int w = sc.nextInt();
					String b = sc.next();

					map.put(id, new ElectronicProduct(id, name, price, qty, status, w, b));

				} else {
					System.out.println("Enter expiryDate and weight");
					String e = sc.next();
					double wt = sc.nextDouble();

					map.put(id, new GroceryProduct(id, name, price, qty, status, e, wt));

				}
				break;

			case 2:
				int rid = sc.nextInt();
				map.remove(rid);
				break;

			case 3:
				int uid = sc.nextInt();
				double np = sc.nextDouble();
				int nq = sc.nextInt();

				Product p = map.get(uid);
				if (p != null) {
					p.price = np;
					p.quantity = nq;
				}
				break;

			case 4:
				int sid = sc.nextInt();

				Product p1 = map.get(sid);
				if (p1 != null) {
					p1.status = "unavailable";
				}
				break;

			case 5:
				for (Product p2 : map.values()) {
					System.out.println(p2);
				}
				break;

			case 6:
				sc.close();
				System.out.println("BYE");
				System.exit(0);
			}
		}
	}
}
