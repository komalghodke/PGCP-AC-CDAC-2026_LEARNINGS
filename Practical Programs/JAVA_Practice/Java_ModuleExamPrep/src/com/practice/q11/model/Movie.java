package com.practice.q11.model;

public abstract class Movie {
	protected int movieId;
	protected String movieName;
	protected int duration; // in minutes
	protected double rating; // out of 10
	protected String status; // Available / Unavailable

	public Movie(int movieId, String movieName, int duration, double rating, String status) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.duration = duration;
		this.rating = rating;
		this.status = status;
	}

	public int getMovieId() {
		return movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public int getDuration() {
		return duration;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ID: " + movieId + ", Name: " + movieName + ", Duration: " + duration + " mins, Rating: " + rating
				+ ", Status: " + status;
	}
}
