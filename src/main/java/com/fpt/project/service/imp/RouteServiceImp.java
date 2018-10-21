package com.fpt.project.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpt.project.entity.Route;
import com.fpt.project.repository.RouteRepository;
import com.fpt.project.service.RouteService;

@Service
public class RouteServiceImp implements RouteService{
	@Autowired
	RouteRepository routeRepository;
	
	public List<Route> findAll(){
		return routeRepository.findAll();
	}

	@Override
	public List<Route> findDistinct() {
		return routeRepository.findDistinct();
	}

	@Override
	public List<Route> findDest(String src) {
		return routeRepository.findDest(src);
	}
}
