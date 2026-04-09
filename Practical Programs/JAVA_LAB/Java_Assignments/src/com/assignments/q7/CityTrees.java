package com.assignments.q7;
import java.util.*;

/*
CityTrees class
Stores city name and list of trees.
Provides methods to add/remove trees.
*/
public class CityTrees {
	String cityName;
	List<String> trees;

	public CityTrees(String cityName) {
		this.cityName = cityName;
		this.trees = new ArrayList<>();
	}

	public void addTree(String tree) {
		trees.add(tree);
	}

	public void removeTree(String tree) {
		trees.remove(tree);
	}

	public List<String> getTrees() {
		return trees;
	}

	@Override
	public String toString() {
		return "City: " + cityName + ", Trees: " + trees;
	}
}
