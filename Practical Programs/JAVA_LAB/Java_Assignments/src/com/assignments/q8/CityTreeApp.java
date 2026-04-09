package com.assignments.q8;

/*
CityTreeApp class
Menu-driven program using TreeMap<String, CityTrees>.
Operations:
1. Find list of trees for a city
2. Delete list of a particular city
3. Add new entry in TreeMap (check if city exists)
4. Display all city names and list of trees (using Iterator and foreach)
5. Add a new tree in existing list
6. Accept tree name from user and display all cities in which the tree exists
7. Exit
*/
import java.util.*;

public class CityTreeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String, CityTrees> cityMap = new TreeMap<>();

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Find list of trees for a city");
			System.out.println("2. Delete list of a particular city");
			System.out.println("3. Add new entry in TreeMap");
			System.out.println("4. Display all city names and list of trees");
			System.out.println("5. Add a new tree in existing list");
			System.out.println("6. Display all cities containing a given tree");
			System.out.println("7. Exit");
			System.out.print("Enter choice: ");
			int ch = sc.nextInt();
			sc.nextLine();

			switch (ch) {
			case 1:
				System.out.print("Enter city name: ");
				String cname = sc.nextLine();
				CityTrees ct = cityMap.get(cname);
				if (ct != null) {
					System.out.println("Trees in " + cname + ": " + ct.getTrees());
				} else {
					System.out.println("City not found.");
				}
				break;

			case 2:
				System.out.print("Enter city name to delete: ");
				String delCity = sc.nextLine();
				cityMap.remove(delCity);
				System.out.println("City deleted if it existed.");
				break;

			case 3:
				System.out.print("Enter city name: ");
				String newCity = sc.nextLine();
				if (cityMap.containsKey(newCity)) {
					System.out.println("City already exists.");
				} else {
					CityTrees newCT = new CityTrees(newCity);
					System.out.print("Enter number of trees: ");
					int n = sc.nextInt();
					sc.nextLine();
					for (int i = 0; i < n; i++) {
						System.out.print("Enter tree name: ");
						String tree = sc.nextLine();
						newCT.addTree(tree);
					}
					cityMap.put(newCity, newCT);
				}
				break;

			case 4:
				System.out.println("All cities and their trees:");
				Iterator<Map.Entry<String, CityTrees>> it = cityMap.entrySet().iterator();
				while (it.hasNext()) {
					Map.Entry<String, CityTrees> entry = it.next();
					System.out.println(entry.getValue());
				}
				for (Map.Entry<String, CityTrees> entry : cityMap.entrySet()) {
					System.out.println(entry.getValue());
				}
				break;

			case 5:
				System.out.print("Enter city name: ");
				String cityAdd = sc.nextLine();
				if (cityMap.containsKey(cityAdd)) {
					System.out.print("Enter new tree name: ");
					String newTree = sc.nextLine();
					cityMap.get(cityAdd).addTree(newTree);
					System.out.println("Tree added.");
				} else {
					System.out.println("City not found.");
				}
				break;

			case 6:
				System.out.print("Enter tree name: ");
				String searchTree = sc.nextLine();
				System.out.println("Cities containing " + searchTree + ":");
				for (Map.Entry<String, CityTrees> entry : cityMap.entrySet()) {
					if (entry.getValue().getTrees().contains(searchTree)) {
						System.out.println(entry.getKey());
					}
				}
				break;

			case 7:
				System.out.println("Exiting...");
				return;
			}
		}
	}
}
