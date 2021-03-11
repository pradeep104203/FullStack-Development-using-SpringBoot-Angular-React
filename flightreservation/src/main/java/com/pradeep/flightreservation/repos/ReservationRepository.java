package com.pradeep.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
