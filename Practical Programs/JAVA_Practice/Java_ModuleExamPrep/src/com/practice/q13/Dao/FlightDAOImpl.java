package com.practice.q13.Dao;

import java.util.ArrayList;
import java.util.List;

import com.practice.q13.model.Flight;

public class FlightDAOImpl implements FlightDAO {
	private List<Flight> flights = new ArrayList<>();

	@Override
	public void addFlight(Flight flight) {
		flights.add(flight);
	}

	@Override
	public void removeFlight(int flightId) {
		flights.removeIf(f -> f.getFlightId() == flightId);
	}

	@Override
	public Flight getFlightById(int flightId) {
		return flights.stream().filter(f -> f.getFlightId() == flightId).findFirst().orElse(null);
	}

	@Override
	public List<Flight> getAllFlights() {
		return flights;
	}
}
