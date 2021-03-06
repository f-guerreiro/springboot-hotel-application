package com.springboot.hotel.application.springboothotelapplication;

import com.springboot.hotel.application.springboothotelapplication.data.entity.Room;
import com.springboot.hotel.application.springboothotelapplication.data.repository.RoomRepository;
import com.springboot.hotel.application.springboothotelapplication.data.entity.Guest;
import com.springboot.hotel.application.springboothotelapplication.data.repository.GuestRepository;
import com.springboot.hotel.application.springboothotelapplication.data.entity.Reservation;
import com.springboot.hotel.application.springboothotelapplication.data.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHotelApplication.class, args);
	}

/*

//first test only
	@RestController
	@RequestMapping("/rooms")
	public class RoomController {
		@Autowired
		private RoomRepository roomRepository;

		@GetMapping
		public Iterable<Room> getRooms() {
			return this.roomRepository.findAll();

		}

	}

		@RestController
		@RequestMapping("/guests")
		public class GuestController {
			@Autowired
			private GuestRepository guestRepository;

			@GetMapping
			public Iterable<Guest> getGuests() {
				return this.guestRepository.findAll();

			}

		}

		@RestController
		@RequestMapping("/reservations")
		public class ReservationController {
			@Autowired
			private ReservationRepository reservationRepository;

			@GetMapping
			public Iterable<Reservation> getReservation() {
				return this.reservationRepository.findAll();

			}

		}
*/
	}
