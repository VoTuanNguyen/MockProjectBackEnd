package com.fpt.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.project.entity.Route;
import com.fpt.project.service.RouteService;

@RestController
@RequestMapping("/route")
@CrossOrigin
public class RouteController {
	@Autowired
	private RouteService routeService;
	
	@GetMapping("/src")
	public List<Route> showSrc(){
		return routeService.findDistinct();
	}
	@GetMapping("/des/{src}")
	public List<Route> showDest(@PathVariable String src){
		return routeService.findDest(src);
	}
}
