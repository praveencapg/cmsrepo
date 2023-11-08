//package com.cabbooking.entity;
//
//import java.time.LocalDateTime;
//
//
//
//import com.cabbooking.util.BookingStatus;
//import com.cabbooking.util.CabType;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import jakarta.annotation.Nonnull;
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
//
//
//public class TripBooking {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer tripBookingId;
//	
//	@ManyToOne(cascade = CascadeType.REMOVE)
//	@JsonIgnore
//	private Customer customer;
//	
//	@ManyToOne
//	@JsonIgnore
//	private CabType cabType;
//	
//	@Nonnull
//	private String pickupLocation;
//	@Nonnull
//	private String dropoffLocation;
//	@Nonnull
//	private LocalDateTime startDateTime;
//	
//	private BookingStatus bookingStatus;
//	// Could be generated randomly
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Double distanceInKm;
//	@Nonnull
//	private Double bill;
//	
//	
//	public TripBooking() {}
//
//
//	public TripBooking(Integer tripBookingId, Customer customer, CabType cabType, String pickupLocation,
//			String dropoffLocation, LocalDateTime startDateTime, BookingStatus bookingStatus, Double distanceInKm,
//			Double bill) {
//		super();
//		this.tripBookingId = tripBookingId;
//		this.customer = customer;
//		this.cabType = cabType;
//		this.pickupLocation = pickupLocation;
//		this.dropoffLocation = dropoffLocation;
//		this.startDateTime = startDateTime;
//		this.bookingStatus = bookingStatus;
//		this.distanceInKm = distanceInKm;
//		this.bill = bill;
//	}
//
//
//	public Integer getTripBookingId() {
//		return tripBookingId;
//	}
//
//
//	public void setTripBookingId(Integer tripBookingId) {
//		this.tripBookingId = tripBookingId;
//	}
//
//
//	public Customer getCustomer() {
//		return customer;
//	}
//
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
//
//
//	public CabType getCabType() {
//		return cabType;
//	}
//
//
//	public void setCabType(CabType cabType) {
//		this.cabType = cabType;
//	}
//
//
//	public String getPickupLocation() {
//		return pickupLocation;
//	}
//
//
//	public void setPickupLocation(String pickupLocation) {
//		this.pickupLocation = pickupLocation;
//	}
//
//
//	public String getDropoffLocation() {
//		return dropoffLocation;
//	}
//
//
//	public void setDropoffLocation(String dropoffLocation) {
//		this.dropoffLocation = dropoffLocation;
//	}
//
//
//	public LocalDateTime getStartDateTime() {
//		return startDateTime;
//	}
//
//
//	public void setStartDateTime(LocalDateTime startDateTime) {
//		this.startDateTime = startDateTime;
//	}
//
//
//	public BookingStatus getBookingStatus() {
//		return bookingStatus;
//	}
//
//
//	public void setBookingStatus(BookingStatus bookingStatus) {
//		this.bookingStatus = bookingStatus;
//	}
//
//
//	public Double getDistanceInKm() {
//		return distanceInKm;
//	}
//
//
//	public void setDistanceInKm(Double distanceInKm) {
//		this.distanceInKm = distanceInKm;
//	}
//
//
//	public Double getBill() {
//		return bill;
//	}
//
//
//	public void setBill(Double bill) {
//		this.bill = bill;
//	}
//
//
//	@Override
//	public String toString() {
//		return "TripBooking [tripBookingId=" + tripBookingId + ", customer=" + customer + ", cabType=" + cabType
//				+ ", pickupLocation=" + pickupLocation + ", dropoffLocation=" + dropoffLocation + ", startDateTime="
//				+ startDateTime + ", bookingStatus=" + bookingStatus + ", distanceInKm=" + distanceInKm + ", bill="
//				+ bill + "]";
//	}
//	
//	
//}
