package com.cabbooking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cabbooking.entity.Cab;
@Repository
public interface CabRepo extends JpaRepository<Cab,Integer> {
	
	//Optional<Cab> findByCabNumber(String cabNumber);
	

}
