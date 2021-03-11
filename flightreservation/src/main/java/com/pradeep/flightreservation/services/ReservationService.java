package com.pradeep.flightreservation.services;

import com.pradeep.flightreservation.dto.ReservationRequest;
import com.pradeep.flightreservation.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}
