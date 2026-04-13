package com.demoCollection.EnumDemo;

public enum Coffee {

	big(300, 200), small(50,30), medium(100,150);
	private int size, cost;
	
	private Coffee(int size, int cost) {
		System.out.println("in coffee constructor... "+size+" ----- "+cost);
		this.size = size;
		this.cost = cost;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getSize() {
		return size;
	}

	public int getCost() {
		return cost;
	}

}
