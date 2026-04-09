package com.assignments.q2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/*	Q2. Write a java program to store information of your friends 
	id,name,lastname,hobbies,mobno,email,bdate,address 
	note: hobbies- a friend may have multiple hobbies 
	Accept all friends details and store it in an array 
	And do the following. 
	1. Display All Friend 
	2. Search by id 
	3. Search by name 
	4. Display all friend with a particular hobby     
	5. Exit
*/
public class FriendMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of friends: ");
        int n = sc.nextInt();
        sc.nextLine();

        Friends[] friends = new Friends[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for friend " + (i+1));
            System.out.print("ID: ");
            int id = sc.nextInt(); sc.nextLine();
            System.out.print("First name: ");
            String name = sc.nextLine();
            System.out.print("Last name: ");
            String lastname = sc.nextLine();
            System.out.print("Enter hobbies (comma separated): ");
            List<String> hobbies = Arrays.asList(sc.nextLine().split(","));
            System.out.print("Mobile no: ");
            String mobno = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Birthdate: ");
            String bdate = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();

            friends[i] = new Friends(id, name, lastname, hobbies, mobno, email, bdate, address);
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display All Friends");
            System.out.println("2. Search by ID");
            System.out.println("3. Search by Name");
            System.out.println("4. Display All Friends with a Hobby");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1:
                    for (Friends f : friends) f.display();
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    for (Friends f : friends) if (f.id == id) f.display();
                    break;
                case 3:
                    System.out.print("Enter Name: ");
                    String nm = sc.nextLine();
                    for (Friends f : friends) if (f.name.equalsIgnoreCase(nm)) f.display();
                    break;
                case 4:
                    System.out.print("Enter Hobby: ");
                    String hobby = sc.nextLine();
                    for (Friends f : friends) if (f.hobbies.contains(hobby)) f.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

