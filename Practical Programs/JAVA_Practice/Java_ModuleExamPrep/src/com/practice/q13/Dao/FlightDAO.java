package com.practice.q13.Dao;

import java.util.List;

import com.practice.q13.model.Flight;

public interface FlightDAO {
 void addFlight(Flight flight);
 void removeFlight(int flightId);
 Flight getFlightById(int flightId);
 List<Flight> getAllFlights();
}

