//package com.cabbooking.repository;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.cabbooking.entity.Driver;
//
//
//
//public interface DriverRepo extends JpaRepository<Driver, Integer>{
//	
//	Optional<Driver> findByLicenceNo(String licenceNo);
//	Optional<Driver> findByEmail(String email);
//	List<Driver> findByCurrentLocationAndDriverStatus(String currLocation, String currDriverStatus);
//
//}
