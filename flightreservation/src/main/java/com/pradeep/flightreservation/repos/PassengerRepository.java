package com.pradeep.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
