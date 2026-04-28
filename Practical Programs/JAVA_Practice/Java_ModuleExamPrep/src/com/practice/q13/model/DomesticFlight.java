package com.practice.q13.model;

public class DomesticFlight extends Flight {
	private String stateName;
	private int terminalNumber;

	public DomesticFlight(int flightId, String flightName, int capacity, double fare, String status, String stateName,
			int terminalNumber) {
		super(flightId, flightName, capacity, fare, status);
		this.stateName = stateName;
		this.terminalNumber = terminalNumber;
	}

	public String getStateName() {
		return stateName;
	}

	public int getTerminalNumber() {
		return terminalNumber;
	}

	@Override
	public String toString() {
		return super.toString() + ", State: " + stateName + ", Terminal: " + terminalNumber;
	}
}
