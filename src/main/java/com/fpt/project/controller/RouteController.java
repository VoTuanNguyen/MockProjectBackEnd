package com.fpt.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.project.entity.Route;
import com.fpt.project.service.RouteService;

@RestController
@RequestMapping("/")
public class RouteController {
	@Autowired
	private RouteService routeService;
	
	@GetMapping("/route")
	public Iterable<Route> showRoute(){
		return routeService.findAll();
	}
}
