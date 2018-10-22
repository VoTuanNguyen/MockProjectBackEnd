package com.fpt.project.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpt.project.entity.Seat;
import com.fpt.project.repository.SeatRepository;
import com.fpt.project.service.SeatService;

@Service
public class SeatServiceImp implements SeatService {
	@Autowired
	private SeatRepository seatRepository;
	
	@Override
	public List<Seat> getSeatNotAvailableByBusId(int bus_id) {
		return seatRepository.getSeatNotAvailableByBusId(bus_id);
	}

	@Override
	public Seat updateStatus(int status, int id) {
		Seat seat = seatRepository.findSeatById(id);
		seat.setStatus(status);
		return seatRepository.saveAndFlush(seat);
	}
	
}
