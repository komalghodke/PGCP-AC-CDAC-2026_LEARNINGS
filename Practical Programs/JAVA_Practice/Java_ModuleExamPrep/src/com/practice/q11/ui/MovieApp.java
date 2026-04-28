package com.practice.q11.ui;

import java.util.Scanner;

import com.practice.q11.model.BollywoodMovie;
import com.practice.q11.model.HollywoodMovie;
import com.practice.q11.service.MovieService;

/*
 * Q11. Design Java application for the following 
Design Java application for the following 
Create a class Movie to store following details 
movieId, movieName, duration, rating, status 
Movies are of 2 types 
Bollywood, Hollywood 
For Bollywood store language and leadActor 
For Hollywood add studioName and budget 
Store details of movies in a TreeMap where movieId is key. 
Display following menu 
a. Add new Movie 
b. Remove movie using movieId 
c. Update movie rating 
d. Mark movie unavailable 
e. Recommend movie based on rating and type 
f. Display all movies 
g. Display movies by type 
h. Display movies with rating above given value 
i. Sort movies by duration 
j. Search movie by name 
k. Exit
 */
public class MovieApp {
	public static void main(String[] args) {
		MovieService service = new MovieService();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("a. Add new Movie");
			System.out.println("b. Remove movie using movieId");
			System.out.println("c. Update movie rating");
			System.out.println("d. Mark movie unavailable");
			System.out.println("e. Recommend movie by rating and type");
			System.out.println("f. Display all movies");
			System.out.println("g. Display movies by type");
			System.out.println("h. Display movies with rating above given value");
			System.out.println("i. Sort movies by duration");
			System.out.println("j. Search movie by name");
			System.out.println("k. Exit");
			System.out.print("Enter choice: ");
			String choice = sc.next();

			switch (choice) {
			case "a":
				System.out.print("Type (Bollywood/Hollywood): ");
				String type = sc.next();
				System.out.print("ID: ");
				int id = sc.nextInt();
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Duration (mins): ");
				int dur = sc.nextInt();
				System.out.print("Rating: ");
				double rating = sc.nextDouble();
				if (type.equalsIgnoreCase("Bollywood")) {
					System.out.print("Language: ");
					String lang = sc.next();
					System.out.print("Lead Actor: ");
					String actor = sc.next();
					service.addMovie(new BollywoodMovie(id, name, dur, rating, "Available", lang, actor));
				} else {
					System.out.print("Studio: ");
					String studio = sc.next();
					System.out.print("Budget: ");
					double budget = sc.nextDouble();
					service.addMovie(new HollywoodMovie(id, name, dur, rating, "Available", studio, budget));
				}
				break;
			case "b":
				System.out.print("ID: ");
				service.removeMovie(sc.nextInt());
				break;
			case "c":
				System.out.print("ID: ");
				int uid = sc.nextInt();
				System.out.print("New Rating: ");
				service.updateRating(uid, sc.nextDouble());
				break;
			case "d":
				System.out.print("ID: ");
				service.markUnavailable(sc.nextInt());
				break;
			case "e":
				System.out.print("Type (Bollywood/Hollywood): ");
				String t = sc.next();
				System.out.print("Min Rating: ");
				double min = sc.nextDouble();
				service.recommendMovie(t, min);
				break;
			case "f":
				service.displayAll();
				break;
			case "g":
				System.out.print("Type (Bollywood/Hollywood): ");
				service.displayByType(sc.next());
				break;
			case "h":
				System.out.print("Min Rating: ");
				service.displayByRating(sc.nextDouble());
				break;
			case "i":
				service.sortByDuration();
				break;
			case "j":
				System.out.print("Name: ");
				service.searchByName(sc.next());
				break;
			case "k":
				System.out.println("Exiting...");
				System.exit(0);
			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
