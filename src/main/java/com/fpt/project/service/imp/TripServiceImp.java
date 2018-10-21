package com.fpt.project.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpt.project.entity.Trip;
import com.fpt.project.repository.TripRepository;
import com.fpt.project.service.TripService;

@Service
public class TripServiceImp implements TripService{
	@Autowired
	private TripRepository tripRepository;
	
	@Override
	public List<Trip> findTripByRouteId(int route_id) {
		return tripRepository.findTripByRouteId(route_id);
	}

	@Override
	public List<Trip> findAll() {
		return tripRepository.findAll();
	}
}
