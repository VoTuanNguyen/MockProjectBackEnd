package com.fpt.project.service;

import java.util.List;

import com.fpt.project.entity.Seat;

public interface SeatService {
	List<Seat> getSeatNotAvailableByBusId(int bus_id);
	Seat updateStatus(int status, int id);
}
