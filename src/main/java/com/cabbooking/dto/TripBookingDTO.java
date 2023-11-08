package com.cabbooking.dto;

import java.time.LocalDateTime;

import com.cabbooking.util.BookingStatus;
import com.cabbooking.util.CabType;

public class TripBookingDTO {
	private Integer tripBookingId;
	private CustomerDTO customer;
	private CabType cabType;
	private String pickupLocation;
	private String dropoffLocation;
	private LocalDateTime startDateTime;
	private BookingStatus bookingStatus; 
	//Could be generated randomly
	private Double distanceInKm;
	private Double bill;

}
