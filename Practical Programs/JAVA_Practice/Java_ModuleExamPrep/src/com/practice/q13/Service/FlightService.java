package com.practice.q13.Service;

//FlightService.java
import java.util.List;

import com.practice.q13.model.Flight;

public interface FlightService {
	void addFlight(Flight flight);

	void updateFare(int flightId, double newFare);

	void bookFlight(int flightId);

	void cancelBooking(int flightId);

	List<Flight> getAllFlights();
}
