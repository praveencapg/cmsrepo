package com.cabbooking.dto;

import java.time.LocalDateTime;

import com.cabbooking.util.RideStatus;

public class RideDTO {
	private Integer rideId;
	private CustomerDTO customer;
	private CabDTO cab;
	private String pickupLocation;
	private String dropoffLocation;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private RideStatus rideStatus;

}
