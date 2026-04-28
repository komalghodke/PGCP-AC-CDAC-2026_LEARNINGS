package com.practice.q13.Service;

import java.util.List;

import com.practice.q13.Dao.FlightDAO;
import com.practice.q13.model.Flight;

public class FlightServiceImpl implements FlightService {
	private FlightDAO flightDAO;

	public FlightServiceImpl(FlightDAO flightDAO) {
		this.flightDAO = flightDAO;
	}

	@Override
	public void addFlight(Flight flight) {
		flightDAO.addFlight(flight);
	}

	@Override
	public void updateFare(int flightId, double newFare) {
		Flight f = flightDAO.getFlightById(flightId);
		if (f != null) {
			f.setFare(newFare);
		}
	}

	@Override
	public void bookFlight(int flightId) {
		Flight f = flightDAO.getFlightById(flightId);
		if (f != null && f.getStatus().equals("Available")) {
			f.setStatus("Booked");
		}
	}

	@Override
	public void cancelBooking(int flightId) {
		Flight f = flightDAO.getFlightById(flightId);
		if (f != null && f.getStatus().equals("Booked")) {
			f.setStatus("Available");
		}
	}

	@Override
	public List<Flight> getAllFlights() {
		return flightDAO.getAllFlights();
	}
}
