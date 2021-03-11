package com.pradeep.flightreservation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pradeep.flightreservation.entities.Reservation;
import com.pradeep.flightreservation.repos.FlightRepository;
import com.pradeep.flightreservation.repos.PassengerRepository;
import com.pradeep.flightreservation.repos.ReservationRepository;
import com.pradeep.flightreservation.util.EmailUtil;
import com.pradeep.flightreservation.util.PDFGenerator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightreservationApplicationTests {

	@Autowired
	PassengerRepository repo;

	@Autowired
	FlightRepository flightRepo;

	@Autowired
	ReservationRepository reservationRepo;

	@Autowired
	PDFGenerator pdfGenerator;

	@Autowired
	EmailUtil emailUtil;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testGenerateItenarary() {
		Reservation reservation = reservationRepo.findOne(1L);
		String filePath = "/Users/pradeepthippireddy/Documents/reservations/reservation" + reservation.getId() + ".pdf";
		pdfGenerator.generateItinerary(reservation, filePath);
	}

	@Test
	public void testEmail() {
		Reservation reservation = reservationRepo.findOne(1L);
		String filePath = "/Users/pradeepthippireddy/Documents/reservations/reservation" + reservation.getId() + ".pdf";
		emailUtil.sendItinerary("thippireddy.pradeep@gmail.com", filePath);
	}

}
