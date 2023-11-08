//package com.cabbooking.entity;
//
//import java.time.LocalDateTime;
//
//import com.cabbooking.util.RideStatus;
//
//import jakarta.annotation.Nonnull;
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToOne;
//
//
//public class Ride {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer rideId;
//	
//	@ManyToOne(cascade = CascadeType.REMOVE)
//	private Customer customer;
//	
//	@OneToOne
//	private Cab cab;
//	@Nonnull
//	private String pickupLocation;
//	@Nonnull
//	private String dropoffLocation;
//	@Nonnull
//	private LocalDateTime startTime;
//	@Nonnull
//	private LocalDateTime endTime;
//	
//	private RideStatus rideStatus;
//
//}
