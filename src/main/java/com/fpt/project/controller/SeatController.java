package com.fpt.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.project.entity.Seat;
import com.fpt.project.service.SeatService;

@RestController
@RequestMapping("/seat")
@CrossOrigin
public class SeatController {
	@Autowired
	private SeatService seatService;
	
	@GetMapping("/getseatnotavailable/{bus_id}")
	public List<Seat> getSeatNotAvailableByBusId(@PathVariable int bus_id){
		return seatService.getSeatNotAvailableByBusId(bus_id);
	}
	@GetMapping("/update/{status}/{id}")
	public Seat update(@PathVariable int status, @PathVariable int id) {
		return seatService.updateStatus(status, id);
	}
}
