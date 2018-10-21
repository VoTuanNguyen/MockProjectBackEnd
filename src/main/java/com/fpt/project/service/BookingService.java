package com.fpt.project.service;

import java.util.Date;
import java.util.List;

import com.fpt.project.entity.Booking;

public interface BookingService {
	List<Booking> getBookingByDT(int trip_id, Date date);
}
