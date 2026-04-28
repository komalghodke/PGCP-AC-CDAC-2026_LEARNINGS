package com.practice.q11.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

import com.practice.q11.model.BollywoodMovie;
import com.practice.q11.model.HollywoodMovie;
import com.practice.q11.model.Movie;

public class MovieService {
	private TreeMap<Integer, Movie> movies = new TreeMap<>();

	public void addMovie(Movie m) {
		movies.put(m.getMovieId(), m);
	}

	public void removeMovie(int id) {
		movies.remove(id);
	}

	public void updateRating(int id, double newRating) {
		Movie m = movies.get(id);
		if (m != null)
			m.setRating(newRating);
	}

	public void markUnavailable(int id) {
		Movie m = movies.get(id);
		if (m != null)
			m.setStatus("Unavailable");
	}

	public void recommendMovie(String type, double minRating) {
		for (Movie m : movies.values()) {
			if (type.equalsIgnoreCase("Bollywood") && m instanceof BollywoodMovie && m.getRating() >= minRating) {
				System.out.println("Recommended: " + m);
			} else if (type.equalsIgnoreCase("Hollywood") && m instanceof HollywoodMovie
					&& m.getRating() >= minRating) {
				System.out.println("Recommended: " + m);
			}
		}
	}

	public void displayAll() {
		for (Movie m : movies.values())
			System.out.println(m);
	}

	public void displayByType(String type) {
		for (Movie m : movies.values()) {
			if (type.equalsIgnoreCase("Bollywood") && m instanceof BollywoodMovie)
				System.out.println(m);
			else if (type.equalsIgnoreCase("Hollywood") && m instanceof HollywoodMovie)
				System.out.println(m);
		}
	}

	public void displayByRating(double minRating) {
		for (Movie m : movies.values()) {
			if (m.getRating() > minRating)
				System.out.println(m);
		}
	}

	public void sortByDuration() {
		List<Movie> list = new ArrayList<>(movies.values());
		list.sort(Comparator.comparingInt(Movie::getDuration));
		for (Movie m : list)
			System.out.println(m);
	}

	public void searchByName(String name) {
		for (Movie m : movies.values()) {
			if (m.getMovieName().equalsIgnoreCase(name))
				System.out.println(m);
		}
	}
}
