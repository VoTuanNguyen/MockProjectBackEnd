package com.fpt.project.service;

import java.util.List;

import com.fpt.project.entity.Trip;

public interface TripService {
	List<Trip> findTripByRouteId(int route_id);
	List<Trip> findAll();
}
