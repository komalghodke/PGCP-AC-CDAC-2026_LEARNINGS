package com.practice.q11.model;

public class BollywoodMovie extends Movie {
	private String language;
	private String leadActor;

	public BollywoodMovie(int id, String name, int duration, double rating, String status, String language,
			String leadActor) {
		super(id, name, duration, rating, status);
		this.language = language;
		this.leadActor = leadActor;
	}

	@Override
	public String toString() {
		return super.toString() + ", Language: " + language + ", Lead Actor: " + leadActor;
	}
}
