package com.cabbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PatchExchange;

import com.cabbooking.entity.Cab;
import com.cabbooking.serviceimpl.CabServiceImpl;
import com.cabbooking.util.CabType;

@RestController
public class CabController {
	

	@Autowired
	CabServiceImpl iCabServiceImpl;
	
	@PostMapping("/registerCab")
	public Cab addCab(@RequestBody Cab cab)  {
		return iCabServiceImpl.addCab(cab);
	}
	
	@PutMapping("/updateCab")
	public Cab updateCab(@RequestBody Cab cab) {
		return iCabServiceImpl.updateCab(cab);
	}
	@GetMapping("/allCabs")
	public List<Cab> viewAllCabs(){
		return iCabServiceImpl.viewCabs();
	}
	@GetMapping("/byType/{cabType}")
	public List<Cab> cabsByType(@PathVariable("cabType") String cabType){
		return iCabServiceImpl.viewCabByType(cabType);
	}
	@GetMapping("/byLocation/{location}")
	public List<Cab> cabsByLocation(@PathVariable("location") String location){
		return iCabServiceImpl.viewCabByCurrentLocation(location);
	}
	@GetMapping("/byDriverId/{driverId}")
	public Cab cabsByDriverId(@PathVariable("driverId") int driverId){
		return iCabServiceImpl.viewCabByDriverId(driverId);
	}
	
	@GetMapping("/byTypeAndbyLocation/{type}/{location}")
	public List<Cab> cabsByTypeAndLocation(@PathVariable("type") String cabType,@PathVariable("location")String location){
		return iCabServiceImpl.viewCabByTypeAndLocation(cabType, location);
	}
	@GetMapping("byAvailability")
	public List<Cab> cabsByAvailabilty(){
		return iCabServiceImpl.viewCabByAvailability();
	}
	

}
