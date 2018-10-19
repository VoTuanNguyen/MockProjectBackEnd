package com.fpt.project.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpt.project.entity.Route;
import com.fpt.project.repository.RouteRepository;
import com.fpt.project.service.RouteService;

@Service
public class RouteServiceImp implements RouteService{
	@Autowired
	RouteRepository routeRepository;
	
	public Iterable<Route> findAll(){
		return routeRepository.findAll();
	}

	@Override
	public Iterable<Route> findDistinct() {
		return routeRepository.findDistinct();
	}

	@Override
	public Iterable<Route> findDest(String src) {
		return routeRepository.findDest(src);
	}
}
