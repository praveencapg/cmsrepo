package com.cabbooking.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cabbooking.entity.Cab;
import com.cabbooking.repository.CabRepo;
import com.cabbooking.service.ICabService;

@Service
public class CabServiceImpl implements ICabService {
	
	@Autowired
	CabRepo cabRepo;
	
	public Cab addCab(Cab cab) {
		
		cabRepo.save(cab);
		
		return cab;
	}

	@Override
	public Cab updateCab(Cab cab) {
		
		Optional<Cab> optCheckCab = cabRepo.findById(cab.getCabId());
		Cab updateCab = optCheckCab.get();
		if(optCheckCab.isPresent()) {  //using optCheckCab because isPresent() is in Optional calss
			updateCab.setCabType(cab.getCabType());
			updateCab.setRatePerKm(cab.getRatePerKm());
			updateCab.setRegistrationNo(cab.getRegistrationNo());
			updateCab.setCabAvailability(cab.getCabAvailability());
			updateCab.setCurrentLocation(cab.getCurrentLocation());
			return updateCab;
		}
		
		return null;
		
	}

	@Override
	public List<Cab> viewCabs() {
		
	List<Cab> cabsList = cabRepo.findAll();
	
		return cabsList;
	}

	@Override
	public List<Cab> viewCabByType(String cabType) {
		List<Cab> CabsListByType = new ArrayList<>();
		
		List<Cab> allCabs = cabRepo.findAll();
		for(Cab cab:allCabs) {
			if(cab.getCabType().toString().equals(cabType)) {
				CabsListByType.add(cab);
			}
		}
		
		return CabsListByType;
	}

	@Override
	public List<Cab> viewCabByCurrentLocation(String currentLocation) {
		List<Cab> CabsAtCurrentLocation = new ArrayList<>();
		List<Cab> allCabs = cabRepo.findAll();
		
		for(Cab cab:allCabs) {
			if(cab.getCurrentLocation().equals(currentLocation)) {
				CabsAtCurrentLocation.add(cab);
			}
		}
		return CabsAtCurrentLocation;
	}

	@Override
	public Cab viewCabByDriverId(int driverId) {
		Optional<Cab> cabByDriverId = cabRepo.findById(driverId);
		 Cab cab = cabByDriverId.get();
		
		return cab;
	}

	@Override
	public Cab viewCabById(int cabId) {
		Cab cab = cabRepo.findById(cabId).get();
		return cab;
	}

	@Override
	public List<Cab> viewCabByTypeAndLocation(String cabType, String currentLocation) {
		List<Cab> cabsByTypeAndLocation = new ArrayList<>();
		
		List<Cab> allCabs = cabRepo.findAll();
		
		for(Cab cab:allCabs) {
			if(cab.getCabType().toString().equals(cabType) && cab.getCurrentLocation().equals(currentLocation)) {
				cabsByTypeAndLocation.add(cab);
			}
		}
		
		return cabsByTypeAndLocation;
	}

	@Override
	public List<Cab> viewCabByAvailability() {
		List<Cab> cabsByAvailability = new ArrayList<>();
		List<Cab> allCabs = cabRepo.findAll();
		
		for(Cab cab:allCabs) {
			if(cab.getCabAvailability()) {
				cabsByAvailability.add(cab);
			}
		}
		return cabsByAvailability;
	}

	
}
