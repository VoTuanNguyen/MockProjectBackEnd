package com.fpt.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.project.entity.Trip;
import com.fpt.project.service.TripService;

@RestController
@RequestMapping("/trip")
@CrossOrigin
public class TripController {
	@Autowired
	private TripService tripService;
	
	@GetMapping("/gettrip/{route_id}")
	public List<Trip> getTripByRouteId(@PathVariable int route_id){
		return tripService.findTripByRouteId(route_id);
	}
}
